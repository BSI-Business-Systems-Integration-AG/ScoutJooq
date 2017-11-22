/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.sys.tables;


import ${package}.database.generator.converter.LongConverter;
import ${package}.database.or.sys.Sys;
import ${package}.database.or.sys.tables.records.SysconglomeratesRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Sysconglomerates extends TableImpl<SysconglomeratesRecord> {

    private static final long serialVersionUID = -251311332;

    /**
     * The reference instance of <code>SYS.SYSCONGLOMERATES</code>
     */
    public static final Sysconglomerates SYSCONGLOMERATES = new Sysconglomerates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysconglomeratesRecord> getRecordType() {
        return SysconglomeratesRecord.class;
    }

    /**
     * The column <code>SYS.SYSCONGLOMERATES.SCHEMAID</code>.
     */
    public final TableField<SysconglomeratesRecord, String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSCONGLOMERATES.TABLEID</code>.
     */
    public final TableField<SysconglomeratesRecord, String> TABLEID = createField("TABLEID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSCONGLOMERATES.CONGLOMERATENUMBER</code>.
     */
    public final TableField<SysconglomeratesRecord, BigDecimal> CONGLOMERATENUMBER = createField("CONGLOMERATENUMBER", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "", new LongConverter());

    /**
     * The column <code>SYS.SYSCONGLOMERATES.CONGLOMERATENAME</code>.
     */
    public final TableField<SysconglomeratesRecord, String> CONGLOMERATENAME = createField("CONGLOMERATENAME", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>SYS.SYSCONGLOMERATES.ISINDEX</code>.
     */
    public final TableField<SysconglomeratesRecord, Boolean> ISINDEX = createField("ISINDEX", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>SYS.SYSCONGLOMERATES.DESCRIPTOR</code>.
     */
    public final TableField<SysconglomeratesRecord, String> DESCRIPTOR = createField("DESCRIPTOR", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>SYS.SYSCONGLOMERATES.ISCONSTRAINT</code>.
     */
    public final TableField<SysconglomeratesRecord, Boolean> ISCONSTRAINT = createField("ISCONSTRAINT", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>SYS.SYSCONGLOMERATES.CONGLOMERATEID</code>.
     */
    public final TableField<SysconglomeratesRecord, String> CONGLOMERATEID = createField("CONGLOMERATEID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * Create a <code>SYS.SYSCONGLOMERATES</code> table reference
     */
    public Sysconglomerates() {
        this(DSL.name("SYSCONGLOMERATES"), null);
    }

    /**
     * Create an aliased <code>SYS.SYSCONGLOMERATES</code> table reference
     */
    public Sysconglomerates(String alias) {
        this(DSL.name(alias), SYSCONGLOMERATES);
    }

    /**
     * Create an aliased <code>SYS.SYSCONGLOMERATES</code> table reference
     */
    public Sysconglomerates(Name alias) {
        this(alias, SYSCONGLOMERATES);
    }

    private Sysconglomerates(Name alias, Table<SysconglomeratesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sysconglomerates(Name alias, Table<SysconglomeratesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysconglomerates as(String alias) {
        return new Sysconglomerates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysconglomerates as(Name alias) {
        return new Sysconglomerates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sysconglomerates rename(String name) {
        return new Sysconglomerates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sysconglomerates rename(Name name) {
        return new Sysconglomerates(name, null);
    }
}
