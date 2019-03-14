package com.zxh.funny.core.base;

import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

/**
 * @program: plugs
 *
 * @description: 基类控制器
 *
 * @author: Mr.Zhang
 *
 * @create: 2019-01-21 14:25
 **/
public class BaseController {
    /**
     * 获取校验的错误信息
     *
     * @param errors 包含错误的对象
     *
     * @return 默认的错误信息. 没有的话返回错误编码
     */
    protected String getErrorMessage(Errors errors) {
        String errorMessage = null;
        for (ObjectError error : errors.getAllErrors()) {
            if (StringUtils.isNotBlank(error.getDefaultMessage())) {
                errorMessage = ((FieldError) error).getField()+error.getDefaultMessage();
                break;
            } else {
                errorMessage = error.getCode();
            }
        }
        return errorMessage;
    }
}
