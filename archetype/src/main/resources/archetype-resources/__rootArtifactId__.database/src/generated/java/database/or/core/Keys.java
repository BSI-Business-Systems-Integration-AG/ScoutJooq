#set( $symbol_dollar = '$' )
#set( $symbol_pound = '#' )
#set( $symbol_escape = '\' )
/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.core;


import ${package}.database.or.core.tables.Booking;
import ${package}.database.or.core.tables.BookingDocument;
import ${package}.database.or.core.tables.Bookmark;
import ${package}.database.or.core.tables.Code;
import ${package}.database.or.core.tables.Document;
import ${package}.database.or.core.tables.Person;
import ${package}.database.or.core.tables.Role;
import ${package}.database.or.core.tables.RolePermission;
import ${package}.database.or.core.tables.Text;
import ${package}.database.or.core.tables.Type;
import ${package}.database.or.core.tables.User;
import ${package}.database.or.core.tables.UserPreference;
import ${package}.database.or.core.tables.UserRole;
import ${package}.database.or.core.tables.records.BookingDocumentRecord;
import ${package}.database.or.core.tables.records.BookingRecord;
import ${package}.database.or.core.tables.records.BookmarkRecord;
import ${package}.database.or.core.tables.records.CodeRecord;
import ${package}.database.or.core.tables.records.DocumentRecord;
import ${package}.database.or.core.tables.records.PersonRecord;
import ${package}.database.or.core.tables.records.RolePermissionRecord;
import ${package}.database.or.core.tables.records.RoleRecord;
import ${package}.database.or.core.tables.records.TextRecord;
import ${package}.database.or.core.tables.records.TypeRecord;
import ${package}.database.or.core.tables.records.UserPreferenceRecord;
import ${package}.database.or.core.tables.records.UserRecord;
import ${package}.database.or.core.tables.records.UserRoleRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>core</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BookingRecord> PK_BOOKING = UniqueKeys0.PK_BOOKING;
    public static final UniqueKey<BookingDocumentRecord> PK_BOOKING_DOCUMENT = UniqueKeys0.PK_BOOKING_DOCUMENT;
    public static final UniqueKey<CodeRecord> PK_CODE = UniqueKeys0.PK_CODE;
    public static final UniqueKey<DocumentRecord> PK_DOCUMENT = UniqueKeys0.PK_DOCUMENT;
    public static final UniqueKey<PersonRecord> PK_PERSON = UniqueKeys0.PK_PERSON;
    public static final UniqueKey<RoleRecord> PK_ROLE = UniqueKeys0.PK_ROLE;
    public static final UniqueKey<RolePermissionRecord> PK_ROLE_PERMISSION = UniqueKeys0.PK_ROLE_PERMISSION;
    public static final UniqueKey<TextRecord> PK_TEXT = UniqueKeys0.PK_TEXT;
    public static final UniqueKey<TypeRecord> PK_TYPE = UniqueKeys0.PK_TYPE;
    public static final UniqueKey<UserRecord> PK_USER = UniqueKeys0.PK_USER;
    public static final UniqueKey<UserRoleRecord> PK_USER_ROLE = UniqueKeys0.PK_USER_ROLE;
    public static final UniqueKey<BookmarkRecord> PK_BOOKMARK = UniqueKeys0.PK_BOOKMARK;
    public static final UniqueKey<UserPreferenceRecord> PK_USER_PREFERENCE = UniqueKeys0.PK_USER_PREFERENCE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [${symbol_pound}1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<BookingRecord> PK_BOOKING = Internal.createUniqueKey(Booking.BOOKING, "PK_BOOKING", Booking.BOOKING.ID);
        public static final UniqueKey<BookingDocumentRecord> PK_BOOKING_DOCUMENT = Internal.createUniqueKey(BookingDocument.BOOKING_DOCUMENT, "PK_BOOKING_DOCUMENT", BookingDocument.BOOKING_DOCUMENT.BOOKING_DOCUMENT_ID);
        public static final UniqueKey<CodeRecord> PK_CODE = Internal.createUniqueKey(Code.CODE, "PK_CODE", Code.CODE.ID, Code.CODE.TYPE_ID);
        public static final UniqueKey<DocumentRecord> PK_DOCUMENT = Internal.createUniqueKey(Document.DOCUMENT, "PK_DOCUMENT", Document.DOCUMENT.ID);
        public static final UniqueKey<PersonRecord> PK_PERSON = Internal.createUniqueKey(Person.PERSON, "PK_PERSON", Person.PERSON.ID);
        public static final UniqueKey<RoleRecord> PK_ROLE = Internal.createUniqueKey(Role.ROLE, "PK_ROLE", Role.ROLE.NAME);
        public static final UniqueKey<RolePermissionRecord> PK_ROLE_PERMISSION = Internal.createUniqueKey(RolePermission.ROLE_PERMISSION, "PK_ROLE_PERMISSION", RolePermission.ROLE_PERMISSION.ROLE_NAME, RolePermission.ROLE_PERMISSION.PERMISSION);
        public static final UniqueKey<TextRecord> PK_TEXT = Internal.createUniqueKey(Text.TEXT, "PK_TEXT", Text.TEXT.KEY, Text.TEXT.LOCALE);
        public static final UniqueKey<TypeRecord> PK_TYPE = Internal.createUniqueKey(Type.TYPE, "PK_TYPE", Type.TYPE.ID);
        public static final UniqueKey<UserRecord> PK_USER = Internal.createUniqueKey(User.USER, "PK_USER", User.USER.USERNAME);
        public static final UniqueKey<UserRoleRecord> PK_USER_ROLE = Internal.createUniqueKey(UserRole.USER_ROLE, "PK_USER_ROLE", UserRole.USER_ROLE.USERNAME, UserRole.USER_ROLE.ROLE_NAME);
        public static final UniqueKey<BookmarkRecord> PK_BOOKMARK = Internal.createUniqueKey(Bookmark.BOOKMARK, "PK_bookmark", Bookmark.BOOKMARK.USER);
        public static final UniqueKey<UserPreferenceRecord> PK_USER_PREFERENCE = Internal.createUniqueKey(UserPreference.USER_PREFERENCE, "PK_user_preference", UserPreference.USER_PREFERENCE.USER, UserPreference.USER_PREFERENCE.NODE);
    }
}
