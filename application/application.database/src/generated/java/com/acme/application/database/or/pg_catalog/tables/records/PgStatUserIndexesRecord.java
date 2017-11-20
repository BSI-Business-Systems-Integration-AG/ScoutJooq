/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables.records;


import com.acme.application.database.or.pg_catalog.tables.PgStatUserIndexes;

import java.math.BigDecimal;

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
public class PgStatUserIndexesRecord extends TableRecordImpl<PgStatUserIndexesRecord> implements Record8<Long, Long, String, String, String, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 1001812763;

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.indexrelid</code>.
     */
    public void setIndexrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.indexrelid</code>.
     */
    public Long getIndexrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.relname</code>.
     */
    public void setRelname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.relname</code>.
     */
    public String getRelname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.indexrelname</code>.
     */
    public void setIndexrelname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.indexrelname</code>.
     */
    public String getIndexrelname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.idx_scan</code>.
     */
    public void setIdxScan(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.idx_scan</code>.
     */
    public BigDecimal getIdxScan() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_read</code>.
     */
    public void setIdxTupRead(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_read</code>.
     */
    public BigDecimal getIdxTupRead() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_user_indexes.idx_tup_fetch</code>.
     */
    public BigDecimal getIdxTupFetch() {
        return (BigDecimal) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, String, String, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, String, String, String, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.RELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.INDEXRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.RELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.INDEXRELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.IDX_SCAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.IDX_TUP_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return PgStatUserIndexes.PG_STAT_USER_INDEXES.IDX_TUP_FETCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getIndexrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIndexrelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getIdxScan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getIdxTupRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getIdxTupFetch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getIndexrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIndexrelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getIdxScan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getIdxTupRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getIdxTupFetch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserIndexesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserIndexesRecord value2(Long value) {
        setIndexrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserIndexesRecord value3(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserIndexesRecord value4(String value) {
        setRelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserIndexesRecord value5(String value) {
        setIndexrelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserIndexesRecord value6(BigDecimal value) {
        setIdxScan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserIndexesRecord value7(BigDecimal value) {
        setIdxTupRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserIndexesRecord value8(BigDecimal value) {
        setIdxTupFetch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatUserIndexesRecord values(Long value1, Long value2, String value3, String value4, String value5, BigDecimal value6, BigDecimal value7, BigDecimal value8) {
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
     * Create a detached PgStatUserIndexesRecord
     */
    public PgStatUserIndexesRecord() {
        super(PgStatUserIndexes.PG_STAT_USER_INDEXES);
    }

    /**
     * Create a detached, initialised PgStatUserIndexesRecord
     */
    public PgStatUserIndexesRecord(Long relid, Long indexrelid, String schemaname, String relname, String indexrelname, BigDecimal idxScan, BigDecimal idxTupRead, BigDecimal idxTupFetch) {
        super(PgStatUserIndexes.PG_STAT_USER_INDEXES);

        set(0, relid);
        set(1, indexrelid);
        set(2, schemaname);
        set(3, relname);
        set(4, indexrelname);
        set(5, idxScan);
        set(6, idxTupRead);
        set(7, idxTupFetch);
    }
}