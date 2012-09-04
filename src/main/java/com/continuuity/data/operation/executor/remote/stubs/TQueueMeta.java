/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.continuuity.data.operation.executor.remote.stubs;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TQueueMeta implements org.apache.thrift.TBase<TQueueMeta, TQueueMeta._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TQueueMeta");

  private static final org.apache.thrift.protocol.TField EMPTY_FIELD_DESC = new org.apache.thrift.protocol.TField("empty", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField GLOBAL_HEAD_POINTER_FIELD_DESC = new org.apache.thrift.protocol.TField("globalHeadPointer", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CURRENT_WRITE_POINTER_FIELD_DESC = new org.apache.thrift.protocol.TField("currentWritePointer", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField GROUPS_FIELD_DESC = new org.apache.thrift.protocol.TField("groups", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TQueueMetaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TQueueMetaTupleSchemeFactory());
  }

  public boolean empty; // required
  public long globalHeadPointer; // optional
  public long currentWritePointer; // optional
  public List<TGroupState> groups; // optional
  public int status; // optional
  public String message; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EMPTY((short)1, "empty"),
    GLOBAL_HEAD_POINTER((short)2, "globalHeadPointer"),
    CURRENT_WRITE_POINTER((short)3, "currentWritePointer"),
    GROUPS((short)4, "groups"),
    STATUS((short)5, "status"),
    MESSAGE((short)6, "message");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EMPTY
          return EMPTY;
        case 2: // GLOBAL_HEAD_POINTER
          return GLOBAL_HEAD_POINTER;
        case 3: // CURRENT_WRITE_POINTER
          return CURRENT_WRITE_POINTER;
        case 4: // GROUPS
          return GROUPS;
        case 5: // STATUS
          return STATUS;
        case 6: // MESSAGE
          return MESSAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __EMPTY_ISSET_ID = 0;
  private static final int __GLOBALHEADPOINTER_ISSET_ID = 1;
  private static final int __CURRENTWRITEPOINTER_ISSET_ID = 2;
  private static final int __STATUS_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);
  private _Fields optionals[] = {_Fields.GLOBAL_HEAD_POINTER,_Fields.CURRENT_WRITE_POINTER,_Fields.GROUPS,_Fields.STATUS,_Fields.MESSAGE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EMPTY, new org.apache.thrift.meta_data.FieldMetaData("empty", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.GLOBAL_HEAD_POINTER, new org.apache.thrift.meta_data.FieldMetaData("globalHeadPointer", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CURRENT_WRITE_POINTER, new org.apache.thrift.meta_data.FieldMetaData("currentWritePointer", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.GROUPS, new org.apache.thrift.meta_data.FieldMetaData("groups", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TGroupState.class))));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TQueueMeta.class, metaDataMap);
  }

  public TQueueMeta() {
  }

  public TQueueMeta(
    boolean empty)
  {
    this();
    this.empty = empty;
    setEmptyIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TQueueMeta(TQueueMeta other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.empty = other.empty;
    this.globalHeadPointer = other.globalHeadPointer;
    this.currentWritePointer = other.currentWritePointer;
    if (other.isSetGroups()) {
      List<TGroupState> __this__groups = new ArrayList<TGroupState>();
      for (TGroupState other_element : other.groups) {
        __this__groups.add(new TGroupState(other_element));
      }
      this.groups = __this__groups;
    }
    this.status = other.status;
    if (other.isSetMessage()) {
      this.message = other.message;
    }
  }

  public TQueueMeta deepCopy() {
    return new TQueueMeta(this);
  }

  @Override
  public void clear() {
    setEmptyIsSet(false);
    this.empty = false;
    setGlobalHeadPointerIsSet(false);
    this.globalHeadPointer = 0;
    setCurrentWritePointerIsSet(false);
    this.currentWritePointer = 0;
    this.groups = null;
    setStatusIsSet(false);
    this.status = 0;
    this.message = null;
  }

  public boolean isEmpty() {
    return this.empty;
  }

  public TQueueMeta setEmpty(boolean empty) {
    this.empty = empty;
    setEmptyIsSet(true);
    return this;
  }

  public void unsetEmpty() {
    __isset_bit_vector.clear(__EMPTY_ISSET_ID);
  }

  /** Returns true if field empty is set (has been assigned a value) and false otherwise */
  public boolean isSetEmpty() {
    return __isset_bit_vector.get(__EMPTY_ISSET_ID);
  }

  public void setEmptyIsSet(boolean value) {
    __isset_bit_vector.set(__EMPTY_ISSET_ID, value);
  }

  public long getGlobalHeadPointer() {
    return this.globalHeadPointer;
  }

  public TQueueMeta setGlobalHeadPointer(long globalHeadPointer) {
    this.globalHeadPointer = globalHeadPointer;
    setGlobalHeadPointerIsSet(true);
    return this;
  }

  public void unsetGlobalHeadPointer() {
    __isset_bit_vector.clear(__GLOBALHEADPOINTER_ISSET_ID);
  }

  /** Returns true if field globalHeadPointer is set (has been assigned a value) and false otherwise */
  public boolean isSetGlobalHeadPointer() {
    return __isset_bit_vector.get(__GLOBALHEADPOINTER_ISSET_ID);
  }

  public void setGlobalHeadPointerIsSet(boolean value) {
    __isset_bit_vector.set(__GLOBALHEADPOINTER_ISSET_ID, value);
  }

  public long getCurrentWritePointer() {
    return this.currentWritePointer;
  }

  public TQueueMeta setCurrentWritePointer(long currentWritePointer) {
    this.currentWritePointer = currentWritePointer;
    setCurrentWritePointerIsSet(true);
    return this;
  }

  public void unsetCurrentWritePointer() {
    __isset_bit_vector.clear(__CURRENTWRITEPOINTER_ISSET_ID);
  }

  /** Returns true if field currentWritePointer is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrentWritePointer() {
    return __isset_bit_vector.get(__CURRENTWRITEPOINTER_ISSET_ID);
  }

  public void setCurrentWritePointerIsSet(boolean value) {
    __isset_bit_vector.set(__CURRENTWRITEPOINTER_ISSET_ID, value);
  }

  public int getGroupsSize() {
    return (this.groups == null) ? 0 : this.groups.size();
  }

  public java.util.Iterator<TGroupState> getGroupsIterator() {
    return (this.groups == null) ? null : this.groups.iterator();
  }

  public void addToGroups(TGroupState elem) {
    if (this.groups == null) {
      this.groups = new ArrayList<TGroupState>();
    }
    this.groups.add(elem);
  }

  public List<TGroupState> getGroups() {
    return this.groups;
  }

  public TQueueMeta setGroups(List<TGroupState> groups) {
    this.groups = groups;
    return this;
  }

  public void unsetGroups() {
    this.groups = null;
  }

  /** Returns true if field groups is set (has been assigned a value) and false otherwise */
  public boolean isSetGroups() {
    return this.groups != null;
  }

  public void setGroupsIsSet(boolean value) {
    if (!value) {
      this.groups = null;
    }
  }

  public int getStatus() {
    return this.status;
  }

  public TQueueMeta setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bit_vector.clear(__STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return __isset_bit_vector.get(__STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bit_vector.set(__STATUS_ISSET_ID, value);
  }

  public String getMessage() {
    return this.message;
  }

  public TQueueMeta setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EMPTY:
      if (value == null) {
        unsetEmpty();
      } else {
        setEmpty((Boolean)value);
      }
      break;

    case GLOBAL_HEAD_POINTER:
      if (value == null) {
        unsetGlobalHeadPointer();
      } else {
        setGlobalHeadPointer((Long)value);
      }
      break;

    case CURRENT_WRITE_POINTER:
      if (value == null) {
        unsetCurrentWritePointer();
      } else {
        setCurrentWritePointer((Long)value);
      }
      break;

    case GROUPS:
      if (value == null) {
        unsetGroups();
      } else {
        setGroups((List<TGroupState>)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Integer)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EMPTY:
      return Boolean.valueOf(isEmpty());

    case GLOBAL_HEAD_POINTER:
      return Long.valueOf(getGlobalHeadPointer());

    case CURRENT_WRITE_POINTER:
      return Long.valueOf(getCurrentWritePointer());

    case GROUPS:
      return getGroups();

    case STATUS:
      return Integer.valueOf(getStatus());

    case MESSAGE:
      return getMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EMPTY:
      return isSetEmpty();
    case GLOBAL_HEAD_POINTER:
      return isSetGlobalHeadPointer();
    case CURRENT_WRITE_POINTER:
      return isSetCurrentWritePointer();
    case GROUPS:
      return isSetGroups();
    case STATUS:
      return isSetStatus();
    case MESSAGE:
      return isSetMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TQueueMeta)
      return this.equals((TQueueMeta)that);
    return false;
  }

  public boolean equals(TQueueMeta that) {
    if (that == null)
      return false;

    boolean this_present_empty = true;
    boolean that_present_empty = true;
    if (this_present_empty || that_present_empty) {
      if (!(this_present_empty && that_present_empty))
        return false;
      if (this.empty != that.empty)
        return false;
    }

    boolean this_present_globalHeadPointer = true && this.isSetGlobalHeadPointer();
    boolean that_present_globalHeadPointer = true && that.isSetGlobalHeadPointer();
    if (this_present_globalHeadPointer || that_present_globalHeadPointer) {
      if (!(this_present_globalHeadPointer && that_present_globalHeadPointer))
        return false;
      if (this.globalHeadPointer != that.globalHeadPointer)
        return false;
    }

    boolean this_present_currentWritePointer = true && this.isSetCurrentWritePointer();
    boolean that_present_currentWritePointer = true && that.isSetCurrentWritePointer();
    if (this_present_currentWritePointer || that_present_currentWritePointer) {
      if (!(this_present_currentWritePointer && that_present_currentWritePointer))
        return false;
      if (this.currentWritePointer != that.currentWritePointer)
        return false;
    }

    boolean this_present_groups = true && this.isSetGroups();
    boolean that_present_groups = true && that.isSetGroups();
    if (this_present_groups || that_present_groups) {
      if (!(this_present_groups && that_present_groups))
        return false;
      if (!this.groups.equals(that.groups))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TQueueMeta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TQueueMeta typedOther = (TQueueMeta)other;

    lastComparison = Boolean.valueOf(isSetEmpty()).compareTo(typedOther.isSetEmpty());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmpty()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.empty, typedOther.empty);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGlobalHeadPointer()).compareTo(typedOther.isSetGlobalHeadPointer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGlobalHeadPointer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.globalHeadPointer, typedOther.globalHeadPointer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurrentWritePointer()).compareTo(typedOther.isSetCurrentWritePointer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrentWritePointer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currentWritePointer, typedOther.currentWritePointer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroups()).compareTo(typedOther.isSetGroups());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroups()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groups, typedOther.groups);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(typedOther.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, typedOther.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TQueueMeta(");
    boolean first = true;

    sb.append("empty:");
    sb.append(this.empty);
    first = false;
    if (isSetGlobalHeadPointer()) {
      if (!first) sb.append(", ");
      sb.append("globalHeadPointer:");
      sb.append(this.globalHeadPointer);
      first = false;
    }
    if (isSetCurrentWritePointer()) {
      if (!first) sb.append(", ");
      sb.append("currentWritePointer:");
      sb.append(this.currentWritePointer);
      first = false;
    }
    if (isSetGroups()) {
      if (!first) sb.append(", ");
      sb.append("groups:");
      if (this.groups == null) {
        sb.append("null");
      } else {
        sb.append(this.groups);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      sb.append(this.status);
      first = false;
    }
    if (isSetMessage()) {
      if (!first) sb.append(", ");
      sb.append("message:");
      if (this.message == null) {
        sb.append("null");
      } else {
        sb.append(this.message);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TQueueMetaStandardSchemeFactory implements SchemeFactory {
    public TQueueMetaStandardScheme getScheme() {
      return new TQueueMetaStandardScheme();
    }
  }

  private static class TQueueMetaStandardScheme extends StandardScheme<TQueueMeta> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TQueueMeta struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EMPTY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.empty = iprot.readBool();
              struct.setEmptyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GLOBAL_HEAD_POINTER
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.globalHeadPointer = iprot.readI64();
              struct.setGlobalHeadPointerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CURRENT_WRITE_POINTER
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.currentWritePointer = iprot.readI64();
              struct.setCurrentWritePointerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GROUPS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list48 = iprot.readListBegin();
                struct.groups = new ArrayList<TGroupState>(_list48.size);
                for (int _i49 = 0; _i49 < _list48.size; ++_i49)
                {
                  TGroupState _elem50; // required
                  _elem50 = new TGroupState();
                  _elem50.read(iprot);
                  struct.groups.add(_elem50);
                }
                iprot.readListEnd();
              }
              struct.setGroupsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = iprot.readI32();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TQueueMeta struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(EMPTY_FIELD_DESC);
      oprot.writeBool(struct.empty);
      oprot.writeFieldEnd();
      if (struct.isSetGlobalHeadPointer()) {
        oprot.writeFieldBegin(GLOBAL_HEAD_POINTER_FIELD_DESC);
        oprot.writeI64(struct.globalHeadPointer);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCurrentWritePointer()) {
        oprot.writeFieldBegin(CURRENT_WRITE_POINTER_FIELD_DESC);
        oprot.writeI64(struct.currentWritePointer);
        oprot.writeFieldEnd();
      }
      if (struct.groups != null) {
        if (struct.isSetGroups()) {
          oprot.writeFieldBegin(GROUPS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.groups.size()));
            for (TGroupState _iter51 : struct.groups)
            {
              _iter51.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStatus()) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status);
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        if (struct.isSetMessage()) {
          oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
          oprot.writeString(struct.message);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TQueueMetaTupleSchemeFactory implements SchemeFactory {
    public TQueueMetaTupleScheme getScheme() {
      return new TQueueMetaTupleScheme();
    }
  }

  private static class TQueueMetaTupleScheme extends TupleScheme<TQueueMeta> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TQueueMeta struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEmpty()) {
        optionals.set(0);
      }
      if (struct.isSetGlobalHeadPointer()) {
        optionals.set(1);
      }
      if (struct.isSetCurrentWritePointer()) {
        optionals.set(2);
      }
      if (struct.isSetGroups()) {
        optionals.set(3);
      }
      if (struct.isSetStatus()) {
        optionals.set(4);
      }
      if (struct.isSetMessage()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetEmpty()) {
        oprot.writeBool(struct.empty);
      }
      if (struct.isSetGlobalHeadPointer()) {
        oprot.writeI64(struct.globalHeadPointer);
      }
      if (struct.isSetCurrentWritePointer()) {
        oprot.writeI64(struct.currentWritePointer);
      }
      if (struct.isSetGroups()) {
        {
          oprot.writeI32(struct.groups.size());
          for (TGroupState _iter52 : struct.groups)
          {
            _iter52.write(oprot);
          }
        }
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TQueueMeta struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.empty = iprot.readBool();
        struct.setEmptyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.globalHeadPointer = iprot.readI64();
        struct.setGlobalHeadPointerIsSet(true);
      }
      if (incoming.get(2)) {
        struct.currentWritePointer = iprot.readI64();
        struct.setCurrentWritePointerIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list53 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.groups = new ArrayList<TGroupState>(_list53.size);
          for (int _i54 = 0; _i54 < _list53.size; ++_i54)
          {
            TGroupState _elem55; // required
            _elem55 = new TGroupState();
            _elem55.read(iprot);
            struct.groups.add(_elem55);
          }
        }
        struct.setGroupsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.status = iprot.readI32();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(5)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
    }
  }

}

