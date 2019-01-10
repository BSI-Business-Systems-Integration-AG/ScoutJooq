/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.core;


import com.acme.application.database.or.core.tables.Bookmark;
import com.acme.application.database.or.core.tables.Code;
import com.acme.application.database.or.core.tables.Document;
import com.acme.application.database.or.core.tables.Payment;
import com.acme.application.database.or.core.tables.PaymentDocument;
import com.acme.application.database.or.core.tables.Person;
import com.acme.application.database.or.core.tables.Role;
import com.acme.application.database.or.core.tables.RolePermission;
import com.acme.application.database.or.core.tables.Text;
import com.acme.application.database.or.core.tables.Type;
import com.acme.application.database.or.core.tables.User;
import com.acme.application.database.or.core.tables.UserPreference;
import com.acme.application.database.or.core.tables.UserRole;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in core
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>core.CODE</code>.
     */
    public static final Code CODE = com.acme.application.database.or.core.tables.Code.CODE;

    /**
     * The table <code>core.DOCUMENT</code>.
     */
    public static final Document DOCUMENT = com.acme.application.database.or.core.tables.Document.DOCUMENT;

    /**
     * The table <code>core.PAYMENT</code>.
     */
    public static final Payment PAYMENT = com.acme.application.database.or.core.tables.Payment.PAYMENT;

    /**
     * The table <code>core.PAYMENT_DOCUMENT</code>.
     */
    public static final PaymentDocument PAYMENT_DOCUMENT = com.acme.application.database.or.core.tables.PaymentDocument.PAYMENT_DOCUMENT;

    /**
     * The table <code>core.PERSON</code>.
     */
    public static final Person PERSON = com.acme.application.database.or.core.tables.Person.PERSON;

    /**
     * The table <code>core.ROLE</code>.
     */
    public static final Role ROLE = com.acme.application.database.or.core.tables.Role.ROLE;

    /**
     * The table <code>core.ROLE_PERMISSION</code>.
     */
    public static final RolePermission ROLE_PERMISSION = com.acme.application.database.or.core.tables.RolePermission.ROLE_PERMISSION;

    /**
     * The table <code>core.TEXT</code>.
     */
    public static final Text TEXT = com.acme.application.database.or.core.tables.Text.TEXT;

    /**
     * The table <code>core.TYPE</code>.
     */
    public static final Type TYPE = com.acme.application.database.or.core.tables.Type.TYPE;

    /**
     * The table <code>core.USER</code>.
     */
    public static final User USER = com.acme.application.database.or.core.tables.User.USER;

    /**
     * The table <code>core.USER_ROLE</code>.
     */
    public static final UserRole USER_ROLE = com.acme.application.database.or.core.tables.UserRole.USER_ROLE;

    /**
     * The table <code>core.bookmark</code>.
     */
    public static final Bookmark BOOKMARK = com.acme.application.database.or.core.tables.Bookmark.BOOKMARK;

    /**
     * The table <code>core.user_preference</code>.
     */
    public static final UserPreference USER_PREFERENCE = com.acme.application.database.or.core.tables.UserPreference.USER_PREFERENCE;
}
