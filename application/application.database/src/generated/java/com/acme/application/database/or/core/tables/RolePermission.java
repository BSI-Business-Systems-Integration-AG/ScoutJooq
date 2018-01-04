/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.core.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import com.acme.application.database.or.core.Core;
import com.acme.application.database.or.core.Keys;
import com.acme.application.database.or.core.tables.records.RolePermissionRecord;


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
public class RolePermission extends TableImpl<RolePermissionRecord> {

    private static final long serialVersionUID = -2128290794;

    /**
     * The reference instance of <code>core.ROLE_PERMISSION</code>
     */
    public static final RolePermission ROLE_PERMISSION = new RolePermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolePermissionRecord> getRecordType() {
        return RolePermissionRecord.class;
    }

    /**
     * The column <code>core.ROLE_PERMISSION.ROLE_NAME</code>.
     */
    public final TableField<RolePermissionRecord, String> ROLE_NAME = createField("ROLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>core.ROLE_PERMISSION.PERMISSION</code>.
     */
    public final TableField<RolePermissionRecord, String> PERMISSION = createField("PERMISSION", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * Create a <code>core.ROLE_PERMISSION</code> table reference
     */
    public RolePermission() {
        this(DSL.name("ROLE_PERMISSION"), null);
    }

    /**
     * Create an aliased <code>core.ROLE_PERMISSION</code> table reference
     */
    public RolePermission(String alias) {
        this(DSL.name(alias), ROLE_PERMISSION);
    }

    /**
     * Create an aliased <code>core.ROLE_PERMISSION</code> table reference
     */
    public RolePermission(Name alias) {
        this(alias, ROLE_PERMISSION);
    }

    private RolePermission(Name alias, Table<RolePermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private RolePermission(Name alias, Table<RolePermissionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Core.CORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RolePermissionRecord> getPrimaryKey() {
        return Keys.PK_ROLE_PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RolePermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<RolePermissionRecord>>asList(Keys.PK_ROLE_PERMISSION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolePermission as(String alias) {
        return new RolePermission(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolePermission as(Name alias) {
        return new RolePermission(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RolePermission rename(String name) {
        return new RolePermission(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RolePermission rename(Name name) {
        return new RolePermission(name, null);
    }
}
