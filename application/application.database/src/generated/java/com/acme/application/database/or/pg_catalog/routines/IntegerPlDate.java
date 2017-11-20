/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.routines;


import com.acme.application.database.generator.converter.DateConverter;
import com.acme.application.database.or.pg_catalog.PgCatalog;

import java.util.Date;

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
public class IntegerPlDate extends AbstractRoutine<Date> {

    private static final long serialVersionUID = 1242260111;

    /**
     * The parameter <code>pg_catalog.integer_pl_date.RETURN_VALUE</code>.
     */
    public static final Parameter<Date> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DATE, false, false, new DateConverter());

    /**
     * The parameter <code>pg_catalog.integer_pl_date._1</code>.
     */
    public static final Parameter<Integer> _1 = createParameter("_1", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * The parameter <code>pg_catalog.integer_pl_date._2</code>.
     */
    public static final Parameter<Date> _2 = createParameter("_2", org.jooq.impl.SQLDataType.DATE, false, true, new DateConverter());

    /**
     * Create a new routine call instance
     */
    public IntegerPlDate() {
        super("integer_pl_date", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.DATE, new DateConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Integer value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Integer> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Date value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Date> field) {
        setField(_2, field);
    }
}