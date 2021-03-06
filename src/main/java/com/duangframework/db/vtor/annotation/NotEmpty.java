package com.duangframework.db.vtor.annotation;

import java.lang.annotation.*;

/**
 * 不能为空验证注解
 * @author Created by laotang
 * @date createed in 2018/6/30.
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NotEmpty {

    String message() default "不能为空";

    String defaultValue() default "";

}
