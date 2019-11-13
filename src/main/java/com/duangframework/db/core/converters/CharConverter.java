package com.duangframework.db.core.converters;

import com.duangframework.db.core.DbException;
import com.duangframework.db.core.TypeConverter;

import java.lang.reflect.Field;
import java.util.List;


/**
 * Double类型转换器
 *
 * @author Laotang
 */
public class CharConverter extends TypeConverter {

    public CharConverter() {
        super(char.class, Character.class, Character[].class);
    }

    @Override
    public Converter decode(Field field, Object value) throws DbException {
        if (null == value) {
            return null;
        }
        return new Converter(field, getName(field), (Character)value);
    }

    @Override
    public Converter encode(Field field, Object value) throws DbException {

        if(null == value) {
            return null;
        }

        if(value instanceof List) {
            return new Converter(field, getName(field), (List)value);
        }

        return new Converter(field, getName(field),Character.valueOf((char)value));
    }


}
