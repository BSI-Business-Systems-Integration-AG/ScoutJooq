/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.core.tables.records;


import com.acme.application.database.or.core.tables.Payment;

import java.util.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> implements Record8<String, String, String, Boolean, Date, String, String, Boolean> {

    private static final long serialVersionUID = -1044481747;

    /**
     * Setter for <code>core.PAYMENT.ID</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>core.PAYMENT.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>core.PAYMENT.AMOUNT</code>.
     */
    public void setAmount(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>core.PAYMENT.AMOUNT</code>.
     */
    public String getAmount() {
        return (String) get(1);
    }

    /**
     * Setter for <code>core.PAYMENT.USAGE</code>.
     */
    public void setUsage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>core.PAYMENT.USAGE</code>.
     */
    public String getUsage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>core.PAYMENT.SHARED</code>.
     */
    public void setShared(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>core.PAYMENT.SHARED</code>.
     */
    public Boolean getShared() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>core.PAYMENT.DATE</code>.
     */
    public void setDate(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>core.PAYMENT.DATE</code>.
     */
    public Date getDate() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>core.PAYMENT.NOTE</code>.
     */
    public void setNote(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>core.PAYMENT.NOTE</code>.
     */
    public String getNote() {
        return (String) get(5);
    }

    /**
     * Setter for <code>core.PAYMENT.USER_ID</code>.
     */
    public void setUserId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>core.PAYMENT.USER_ID</code>.
     */
    public String getUserId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>core.PAYMENT.ACTIVE</code>.
     */
    public void setActive(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>core.PAYMENT.ACTIVE</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Boolean, Date, String, String, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Boolean, Date, String, String, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Payment.PAYMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Payment.PAYMENT.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Payment.PAYMENT.USAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Payment.PAYMENT.SHARED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return Payment.PAYMENT.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Payment.PAYMENT.NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Payment.PAYMENT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Payment.PAYMENT.ACTIVE;
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
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUsage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getShared();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component5() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
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
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getShared();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value2(String value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value3(String value) {
        setUsage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value4(Boolean value) {
        setShared(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value5(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value6(String value) {
        setNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value7(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value8(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord values(String value1, String value2, String value3, Boolean value4, Date value5, String value6, String value7, Boolean value8) {
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
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(Payment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(String id, String amount, String usage, Boolean shared, Date date, String note, String userId, Boolean active) {
        super(Payment.PAYMENT);

        set(0, id);
        set(1, amount);
        set(2, usage);
        set(3, shared);
        set(4, date);
        set(5, note);
        set(6, userId);
        set(7, active);
    }
}