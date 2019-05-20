/*
 * Copyright © 2014-2018 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.cdap.cdap.app.services;

import io.cdap.cdap.api.ServiceDiscoverer;
import io.cdap.cdap.common.conf.Constants;
import io.cdap.cdap.common.discovery.RandomEndpointStrategy;
import io.cdap.cdap.proto.id.ProgramId;
import org.apache.twill.discovery.Discoverable;
import org.apache.twill.discovery.DiscoveryServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/**
 * An abstract implementation of {@link ServiceDiscoverer}.
 * It provides definition for {@link ServiceDiscoverer#getServiceURL}  and expects the sub-classes to give definition
 * for {@link AbstractServiceDiscoverer#getDiscoveryServiceClient}.
 */
public abstract class AbstractServiceDiscoverer implements ServiceDiscoverer {

  private static final Logger LOG = LoggerFactory.getLogger(AbstractServiceDiscoverer.class);

  private final String namespaceId;
  private final String applicationId;

  public AbstractServiceDiscoverer(ProgramId programId) {
    this.namespaceId = programId.getNamespace();
    this.applicationId = programId.getApplication();
  }

  @Override
  public URL getServiceURL(String namespaceId, String applicationId, String serviceId) {
    String discoveryName = String.format("service.%s.%s.%s", namespaceId, applicationId, serviceId);
    return createURL(new RandomEndpointStrategy(() -> getDiscoveryServiceClient().discover(discoveryName))
                       .pick(1, TimeUnit.SECONDS), namespaceId, applicationId, serviceId);
  }

  @Override
  public URL getServiceURL(String applicationId, String serviceId) {
    return getServiceURL(namespaceId, applicationId, serviceId);
  }

  @Override
  public URL getServiceURL(String serviceId) {
    return getServiceURL(applicationId, serviceId);
  }

  /**
   * @return the {@link DiscoveryServiceClient} for Service Discovery
   */
  protected abstract DiscoveryServiceClient getDiscoveryServiceClient();

  @Nullable
  private URL createURL(@Nullable Discoverable discoverable, String namespaceId, String applicationId, String serviceId) {
    if (discoverable == null) {
      return null;
    }
    InetSocketAddress address = discoverable.getSocketAddress();
    String scheme = Arrays.equals(Constants.Security.SSL_URI_SCHEME.getBytes(), discoverable.getPayload()) ?
      Constants.Security.SSL_URI_SCHEME : Constants.Security.URI_SCHEME;

    String path = String.format("%s%s:%d%s/namespaces/%s/apps/%s/services/%s/methods/", scheme,
                                address.getHostName(), address.getPort(),
                                Constants.Gateway.API_VERSION_3, namespaceId, applicationId, serviceId);
    try {
      return new URL(path);
    } catch (MalformedURLException e) {
      LOG.error("Got exception while creating serviceURL", e);
      return null;
    }
  }
}
