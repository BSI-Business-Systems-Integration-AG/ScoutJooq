/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.core.tables.records;


import com.acme.application.database.or.core.tables.Booking;

import java.util.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookingRecord extends UpdatableRecordImpl<BookingRecord> implements Record7<String, String, Date, Date, String, String, Boolean> {

    private static final long serialVersionUID = 350621231;

    /**
     * Setter for <code>core.BOOKING.ID</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>core.BOOKING.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>core.BOOKING.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>core.BOOKING.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>core.BOOKING.DATE_FROM</code>.
     */
    public void setDateFrom(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>core.BOOKING.DATE_FROM</code>.
     */
    public Date getDateFrom() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>core.BOOKING.DATE_TO</code>.
     */
    public void setDateTo(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>core.BOOKING.DATE_TO</code>.
     */
    public Date getDateTo() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>core.BOOKING.NOTE</code>.
     */
    public void setNote(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>core.BOOKING.NOTE</code>.
     */
    public String getNote() {
        return (String) get(4);
    }

    /**
     * Setter for <code>core.BOOKING.USER_ID</code>.
     */
    public void setUserId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>core.BOOKING.USER_ID</code>.
     */
    public String getUserId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>core.BOOKING.ACTIVE</code>.
     */
    public void setActive(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>core.BOOKING.ACTIVE</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Date, Date, String, String, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Date, Date, String, String, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Booking.BOOKING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Booking.BOOKING.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return Booking.BOOKING.DATE_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Booking.BOOKING.DATE_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Booking.BOOKING.NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Booking.BOOKING.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Booking.BOOKING.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component3() {
        return getDateFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getDateTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getDateFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getDateTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingRecord value3(Date value) {
        setDateFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingRecord value4(Date value) {
        setDateTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingRecord value5(String value) {
        setNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingRecord value6(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookingRecord values(String value1, String value2, Date value3, Date value4, String value5, String value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookingRecord
     */
    public BookingRecord() {
        super(Booking.BOOKING);
    }

    /**
     * Create a detached, initialised BookingRecord
     */
    public BookingRecord(String id, String description, Date dateFrom, Date dateTo, String note, String userId, Boolean active) {
        super(Booking.BOOKING);

        set(0, id);
        set(1, description);
        set(2, dateFrom);
        set(3, dateTo);
        set(4, note);
        set(5, userId);
        set(6, active);
    }
}