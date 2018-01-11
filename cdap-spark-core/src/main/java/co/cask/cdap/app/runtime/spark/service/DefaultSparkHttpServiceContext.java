/*
 * Copyright © 2017 Cask Data, Inc.
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

package co.cask.cdap.app.runtime.spark.service;

import co.cask.cdap.api.spark.SparkExecutionContext;
import co.cask.cdap.api.spark.SparkHttpServiceContext;
import org.apache.spark.SparkContext;

/**
 * Default implementation of {@link SparkHttpServiceContext}.
 */
public class DefaultSparkHttpServiceContext implements SparkHttpServiceContext {

  private final SparkExecutionContext sec;
  private final SparkContext sc;

  public DefaultSparkHttpServiceContext(SparkExecutionContext sec, SparkContext sc) {
    this.sec = sec;
    this.sc = sc;
  }

  @Override
  public SparkContext getSparkContext() {
    return sc;
  }

  @Override
  public SparkExecutionContext getSparkExecutionContext() {
    return sec;
  }
}