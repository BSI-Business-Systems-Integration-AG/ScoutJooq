/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.core.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import com.acme.application.database.or.core.tables.User;


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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record5<String, String, String, String, Boolean> {

    private static final long serialVersionUID = -448700091;

    /**
     * Setter for <code>core.USER.USERNAME</code>.
     */
    public void setUsername(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>core.USER.USERNAME</code>.
     */
    public String getUsername() {
        return (String) get(0);
    }

    /**
     * Setter for <code>core.USER.PERSON_ID</code>.
     */
    public void setPersonId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>core.USER.PERSON_ID</code>.
     */
    public String getPersonId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>core.USER.LOCALE</code>.
     */
    public void setLocale(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>core.USER.LOCALE</code>.
     */
    public String getLocale() {
        return (String) get(2);
    }

    /**
     * Setter for <code>core.USER.PASSWORD_ENCRYPTED</code>.
     */
    public void setPasswordEncrypted(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>core.USER.PASSWORD_ENCRYPTED</code>.
     */
    public String getPasswordEncrypted() {
        return (String) get(3);
    }

    /**
     * Setter for <code>core.USER.ACTIVE</code>.
     */
    public void setActive(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>core.USER.ACTIVE</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return User.USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.PERSON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return User.USER.LOCALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return User.USER.PASSWORD_ENCRYPTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return User.USER.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPersonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLocale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPasswordEncrypted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPersonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLocale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPasswordEncrypted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setPersonId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setLocale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(String value) {
        setPasswordEncrypted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(String value1, String value2, String value3, String value4, Boolean value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(String username, String personId, String locale, String passwordEncrypted, Boolean active) {
        super(User.USER);

        set(0, username);
        set(1, personId);
        set(2, locale);
        set(3, passwordEncrypted);
        set(4, active);
    }
}
