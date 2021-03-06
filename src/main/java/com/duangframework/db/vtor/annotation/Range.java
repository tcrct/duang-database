package com.duangframework.db.vtor.annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * 范围验证注解
 * @author Created by laotang
 * @date createed in 2018/6/30.
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Range {

    double[] value() default {-1d, -1d};

    double min() default Double.MIN_VALUE;

    double max() default Double.MAX_VALUE;

    String message() default "不能小于[${min}]或大于[${max}]";

    String defaultValue() default "";

    boolean isEmpty() default true;

}
