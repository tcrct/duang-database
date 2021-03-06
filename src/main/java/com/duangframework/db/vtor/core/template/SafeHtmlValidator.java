package com.duangframework.db.vtor.core.template;

import com.duangframework.db.utils.ToolsKit;
import com.duangframework.db.vtor.common.ValidatorException;
import com.duangframework.db.vtor.annotation.SafeHtml;

import java.lang.annotation.Annotation;

/**
 * html转义验证处理器 ???
 * @author Created by laotang
 * @date createed in 2018/6/30.
 */
public class SafeHtmlValidator extends AbstractValidatorTemplate<SafeHtml> {

    @Override
    public Class<? extends Annotation> annotationClass() {
        return SafeHtml.class;
    }

    @Override
    public void handle(SafeHtml annonation, Class<?> parameterType, String paramName, Object paramValue) throws ValidatorException {


        if(ToolsKit.isEmpty(paramValue)) {
            throw new ValidatorException(paramName + "不能为空");
        }
        // 这里不做处理，直接传入到controller层，在dao层保存时处理
//        if(ToolsKit.isNotEmpty(paramValue)) {
//            paramValue = ToolsKit.toHTMLChar(paramValue.toString());
//        }
    }
}
