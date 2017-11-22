/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.sys.tables.records;


import ${package}.database.or.sys.tables.Sysstatistics;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysstatisticsRecord extends TableRecordImpl<SysstatisticsRecord> implements Record8<String, String, String, Timestamp, String, Boolean, Integer, Object> {

    private static final long serialVersionUID = 1205234847;

    /**
     * Setter for <code>SYS.SYSSTATISTICS.STATID</code>.
     */
    public void setStatid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>SYS.SYSSTATISTICS.STATID</code>.
     */
    public String getStatid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>SYS.SYSSTATISTICS.REFERENCEID</code>.
     */
    public void setReferenceid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>SYS.SYSSTATISTICS.REFERENCEID</code>.
     */
    public String getReferenceid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>SYS.SYSSTATISTICS.TABLEID</code>.
     */
    public void setTableid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>SYS.SYSSTATISTICS.TABLEID</code>.
     */
    public String getTableid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>SYS.SYSSTATISTICS.CREATIONTIMESTAMP</code>.
     */
    public void setCreationtimestamp(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>SYS.SYSSTATISTICS.CREATIONTIMESTAMP</code>.
     */
    public Timestamp getCreationtimestamp() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>SYS.SYSSTATISTICS.TYPE</code>.
     */
    public void setType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SYS.SYSSTATISTICS.TYPE</code>.
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SYS.SYSSTATISTICS.VALID</code>.
     */
    public void setValid(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>SYS.SYSSTATISTICS.VALID</code>.
     */
    public Boolean getValid() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>SYS.SYSSTATISTICS.COLCOUNT</code>.
     */
    public void setColcount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>SYS.SYSSTATISTICS.COLCOUNT</code>.
     */
    public Integer getColcount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>SYS.SYSSTATISTICS.STATISTICS</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setStatistics(Object value) {
        set(7, value);
    }

    /**
     * Getter for <code>SYS.SYSSTATISTICS.STATISTICS</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getStatistics() {
        return (Object) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Timestamp, String, Boolean, Integer, Object> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Timestamp, String, Boolean, Integer, Object> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Sysstatistics.SYSSTATISTICS.STATID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Sysstatistics.SYSSTATISTICS.REFERENCEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Sysstatistics.SYSSTATISTICS.TABLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Sysstatistics.SYSSTATISTICS.CREATIONTIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Sysstatistics.SYSSTATISTICS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Sysstatistics.SYSSTATISTICS.VALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Sysstatistics.SYSSTATISTICS.COLCOUNT;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field8() {
        return Sysstatistics.SYSSTATISTICS.STATISTICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getStatid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getReferenceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreationtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getColcount();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component8() {
        return getStatistics();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getStatid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getReferenceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreationtimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getColcount();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value8() {
        return getStatistics();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysstatisticsRecord value1(String value) {
        setStatid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysstatisticsRecord value2(String value) {
        setReferenceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysstatisticsRecord value3(String value) {
        setTableid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysstatisticsRecord value4(Timestamp value) {
        setCreationtimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysstatisticsRecord value5(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysstatisticsRecord value6(Boolean value) {
        setValid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysstatisticsRecord value7(Integer value) {
        setColcount(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public SysstatisticsRecord value8(Object value) {
        setStatistics(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysstatisticsRecord values(String value1, String value2, String value3, Timestamp value4, String value5, Boolean value6, Integer value7, Object value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysstatisticsRecord
     */
    public SysstatisticsRecord() {
        super(Sysstatistics.SYSSTATISTICS);
    }

    /**
     * Create a detached, initialised SysstatisticsRecord
     */
    public SysstatisticsRecord(String statid, String referenceid, String tableid, Timestamp creationtimestamp, String type, Boolean valid, Integer colcount, Object statistics) {
        super(Sysstatistics.SYSSTATISTICS);

        set(0, statid);
        set(1, referenceid);
        set(2, tableid);
        set(3, creationtimestamp);
        set(4, type);
        set(5, valid);
        set(6, colcount);
        set(7, statistics);
    }
}
