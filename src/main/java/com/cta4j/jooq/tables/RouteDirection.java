/*
 * This file is generated by jOOQ.
 */
package com.cta4j.jooq.tables;


import com.cta4j.jooq.Keys;
import com.cta4j.jooq.Public;
import com.cta4j.jooq.enums.Direction;
import com.cta4j.jooq.tables.records.RouteDirectionRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RouteDirection extends TableImpl<RouteDirectionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.route_direction</code>
     */
    public static final RouteDirection ROUTE_DIRECTION = new RouteDirection();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RouteDirectionRecord> getRecordType() {
        return RouteDirectionRecord.class;
    }

    /**
     * The column <code>public.route_direction.route_id</code>.
     */
    public final TableField<RouteDirectionRecord, String> ROUTE_ID = createField(DSL.name("route_id"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.route_direction.direction</code>.
     */
    public final TableField<RouteDirectionRecord, Direction> DIRECTION = createField(DSL.name("direction"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(Direction.class), this, "");

    private RouteDirection(Name alias, Table<RouteDirectionRecord> aliased) {
        this(alias, aliased, null);
    }

    private RouteDirection(Name alias, Table<RouteDirectionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.route_direction</code> table reference
     */
    public RouteDirection(String alias) {
        this(DSL.name(alias), ROUTE_DIRECTION);
    }

    /**
     * Create an aliased <code>public.route_direction</code> table reference
     */
    public RouteDirection(Name alias) {
        this(alias, ROUTE_DIRECTION);
    }

    /**
     * Create a <code>public.route_direction</code> table reference
     */
    public RouteDirection() {
        this(DSL.name("route_direction"), null);
    }

    public <O extends Record> RouteDirection(Table<O> child, ForeignKey<O, RouteDirectionRecord> key) {
        super(child, key, ROUTE_DIRECTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<RouteDirectionRecord> getPrimaryKey() {
        return Keys.ROUTE_DIRECTION_PKEY;
    }

    @Override
    public RouteDirection as(String alias) {
        return new RouteDirection(DSL.name(alias), this);
    }

    @Override
    public RouteDirection as(Name alias) {
        return new RouteDirection(alias, this);
    }

    @Override
    public RouteDirection as(Table<?> alias) {
        return new RouteDirection(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RouteDirection rename(String name) {
        return new RouteDirection(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RouteDirection rename(Name name) {
        return new RouteDirection(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RouteDirection rename(Table<?> name) {
        return new RouteDirection(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Direction> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super Direction, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super Direction, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}