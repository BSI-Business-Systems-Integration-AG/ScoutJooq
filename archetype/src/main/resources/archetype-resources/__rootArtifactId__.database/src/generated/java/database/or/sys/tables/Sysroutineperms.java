/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.sys.tables;


import ${package}.database.or.sys.Sys;
import ${package}.database.or.sys.tables.records.SysroutinepermsRecord;

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
public class Sysroutineperms extends TableImpl<SysroutinepermsRecord> {

    private static final long serialVersionUID = -1458132908;

    /**
     * The reference instance of <code>SYS.SYSROUTINEPERMS</code>
     */
    public static final Sysroutineperms SYSROUTINEPERMS = new Sysroutineperms();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysroutinepermsRecord> getRecordType() {
        return SysroutinepermsRecord.class;
    }

    /**
     * The column <code>SYS.SYSROUTINEPERMS.ROUTINEPERMSID</code>.
     */
    public final TableField<SysroutinepermsRecord, String> ROUTINEPERMSID = createField("ROUTINEPERMSID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSROUTINEPERMS.GRANTEE</code>.
     */
    public final TableField<SysroutinepermsRecord, String> GRANTEE = createField("GRANTEE", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSROUTINEPERMS.GRANTOR</code>.
     */
    public final TableField<SysroutinepermsRecord, String> GRANTOR = createField("GRANTOR", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSROUTINEPERMS.ALIASID</code>.
     */
    public final TableField<SysroutinepermsRecord, String> ALIASID = createField("ALIASID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSROUTINEPERMS.GRANTOPTION</code>.
     */
    public final TableField<SysroutinepermsRecord, String> GRANTOPTION = createField("GRANTOPTION", org.jooq.impl.SQLDataType.CHAR(1).nullable(false), this, "");

    /**
     * Create a <code>SYS.SYSROUTINEPERMS</code> table reference
     */
    public Sysroutineperms() {
        this(DSL.name("SYSROUTINEPERMS"), null);
    }

    /**
     * Create an aliased <code>SYS.SYSROUTINEPERMS</code> table reference
     */
    public Sysroutineperms(String alias) {
        this(DSL.name(alias), SYSROUTINEPERMS);
    }

    /**
     * Create an aliased <code>SYS.SYSROUTINEPERMS</code> table reference
     */
    public Sysroutineperms(Name alias) {
        this(alias, SYSROUTINEPERMS);
    }

    private Sysroutineperms(Name alias, Table<SysroutinepermsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sysroutineperms(Name alias, Table<SysroutinepermsRecord> aliased, Field<?>[] parameters) {
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
    public Sysroutineperms as(String alias) {
        return new Sysroutineperms(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysroutineperms as(Name alias) {
        return new Sysroutineperms(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sysroutineperms rename(String name) {
        return new Sysroutineperms(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sysroutineperms rename(Name name) {
        return new Sysroutineperms(name, null);
    }
}
