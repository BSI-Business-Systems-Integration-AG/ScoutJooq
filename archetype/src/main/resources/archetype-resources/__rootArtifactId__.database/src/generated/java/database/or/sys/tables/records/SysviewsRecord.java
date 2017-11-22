/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.sys.tables.records;


import ${package}.database.or.sys.tables.Sysviews;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class SysviewsRecord extends TableRecordImpl<SysviewsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -2061047221;

    /**
     * Setter for <code>SYS.SYSVIEWS.TABLEID</code>.
     */
    public void setTableid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>SYS.SYSVIEWS.TABLEID</code>.
     */
    public String getTableid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>SYS.SYSVIEWS.VIEWDEFINITION</code>.
     */
    public void setViewdefinition(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>SYS.SYSVIEWS.VIEWDEFINITION</code>.
     */
    public String getViewdefinition() {
        return (String) get(1);
    }

    /**
     * Setter for <code>SYS.SYSVIEWS.CHECKOPTION</code>.
     */
    public void setCheckoption(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>SYS.SYSVIEWS.CHECKOPTION</code>.
     */
    public String getCheckoption() {
        return (String) get(2);
    }

    /**
     * Setter for <code>SYS.SYSVIEWS.COMPILATIONSCHEMAID</code>.
     */
    public void setCompilationschemaid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SYS.SYSVIEWS.COMPILATIONSCHEMAID</code>.
     */
    public String getCompilationschemaid() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Sysviews.SYSVIEWS.TABLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Sysviews.SYSVIEWS.VIEWDEFINITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Sysviews.SYSVIEWS.CHECKOPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Sysviews.SYSVIEWS.COMPILATIONSCHEMAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getViewdefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCheckoption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCompilationschemaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getViewdefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCheckoption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCompilationschemaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysviewsRecord value1(String value) {
        setTableid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysviewsRecord value2(String value) {
        setViewdefinition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysviewsRecord value3(String value) {
        setCheckoption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysviewsRecord value4(String value) {
        setCompilationschemaid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysviewsRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysviewsRecord
     */
    public SysviewsRecord() {
        super(Sysviews.SYSVIEWS);
    }

    /**
     * Create a detached, initialised SysviewsRecord
     */
    public SysviewsRecord(String tableid, String viewdefinition, String checkoption, String compilationschemaid) {
        super(Sysviews.SYSVIEWS);

        set(0, tableid);
        set(1, viewdefinition);
        set(2, checkoption);
        set(3, compilationschemaid);
    }
}
