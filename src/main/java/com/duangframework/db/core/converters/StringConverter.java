package com.duangframework.db.core.converters;

import com.duangframework.db.core.DbException;
import com.duangframework.db.core.TypeConverter;
import com.duangframework.db.utils.DataType;

import java.lang.reflect.Field;
import java.util.List;


/**
 * String类型转换器
 *
 * @author Laotang
 */
public class StringConverter extends TypeConverter {

    public StringConverter() {
        super(String.class, String[].class);
    }

    @Override
    public Converter decode(Field field, Object value) throws DbException {

        if (null == value) {
            return null;
        }

        Class<?> type = field.getType();

        if(DataType.isLong(type) || DataType.isLongObject(type)) {
            return new Converter(field, getName(field), (String)value);
        } else {
            return converterDecodeDataType(field, value);
        }

    }

    @Override
    public Converter encode(Field field, Object value) throws DbException {

        if(null == value) {
            return null;
        }

        Class<?> type = field.getType();

        if(DataType.isString(type)) {
            return new Converter(field, getName(field), String.valueOf(value));
        } else {
            return  converterEncodeDataSetType(field, value);
        }
    }

}
