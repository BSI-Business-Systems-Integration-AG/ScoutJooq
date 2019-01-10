#set( $symbol_dollar = '$' )
#set( $symbol_pound = '#' )
#set( $symbol_escape = '\' )
/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.core.tables.records;


import ${package}.database.or.core.tables.PaymentDocument;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class PaymentDocumentRecord extends UpdatableRecordImpl<PaymentDocumentRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -977268744;

    /**
     * Setter for <code>core.PAYMENT_DOCUMENT.PAYMENT_ID</code>.
     */
    public void setPaymentId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>core.PAYMENT_DOCUMENT.PAYMENT_ID</code>.
     */
    public String getPaymentId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>core.PAYMENT_DOCUMENT.DOCUMENT_ID</code>.
     */
    public void setDocumentId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>core.PAYMENT_DOCUMENT.DOCUMENT_ID</code>.
     */
    public String getDocumentId() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PaymentDocument.PAYMENT_DOCUMENT.PAYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PaymentDocument.PAYMENT_DOCUMENT.DOCUMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDocumentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDocumentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentDocumentRecord value1(String value) {
        setPaymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentDocumentRecord value2(String value) {
        setDocumentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentDocumentRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentDocumentRecord
     */
    public PaymentDocumentRecord() {
        super(PaymentDocument.PAYMENT_DOCUMENT);
    }

    /**
     * Create a detached, initialised PaymentDocumentRecord
     */
    public PaymentDocumentRecord(String paymentId, String documentId) {
        super(PaymentDocument.PAYMENT_DOCUMENT);

        set(0, paymentId);
        set(1, documentId);
    }
}