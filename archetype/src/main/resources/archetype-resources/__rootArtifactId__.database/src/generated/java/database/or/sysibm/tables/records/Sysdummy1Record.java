/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.sysibm.tables.records;


import ${package}.database.or.sysibm.tables.Sysdummy1;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class Sysdummy1Record extends TableRecordImpl<Sysdummy1Record> implements Record1<String> {

    private static final long serialVersionUID = 1099650126;

    /**
     * Setter for <code>SYSIBM.SYSDUMMY1.IBMREQD</code>.
     */
    public void setIbmreqd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>SYSIBM.SYSDUMMY1.IBMREQD</code>.
     */
    public String getIbmreqd() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Sysdummy1.SYSDUMMY1.IBMREQD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getIbmreqd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getIbmreqd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysdummy1Record value1(String value) {
        setIbmreqd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysdummy1Record values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Sysdummy1Record
     */
    public Sysdummy1Record() {
        super(Sysdummy1.SYSDUMMY1);
    }

    /**
     * Create a detached, initialised Sysdummy1Record
     */
    public Sysdummy1Record(String ibmreqd) {
        super(Sysdummy1.SYSDUMMY1);

        set(0, ibmreqd);
    }
}
