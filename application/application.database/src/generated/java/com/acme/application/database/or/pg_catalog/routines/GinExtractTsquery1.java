/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.routines;


import com.acme.application.database.or.pg_catalog.PgCatalog;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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

/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
 */
@java.lang.Deprecated
public class GinExtractTsquery1 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1006634652;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("tsquery"), false, true);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _2 = createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.gin_extract_tsquery._3</code>.
     */
    public static final Parameter<Short> _3 = createParameter("_3", org.jooq.impl.SQLDataType.SMALLINT, false, true);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _4 = createParameter("_4", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _5 = createParameter("_5", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * Create a new routine call instance
     */
    public GinExtractTsquery1() {
        super("gin_extract_tsquery", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("internal"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Object value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Object> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Short value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Short> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Object value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__4(Field<Object> field) {
        setField(_4, field);
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    public void set__5(Object value) {
        setValue(_5, value);
    }

    /**
     * Set the <code>_5</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__5(Field<Object> field) {
        setField(_5, field);
    }
}