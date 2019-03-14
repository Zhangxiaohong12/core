package com.zxh.funny.core.util;

import com.zxh.funny.core.userdetails.CustomUserDetails;
import com.zxh.funny.core.userdetails.DetailsHelper;
import org.apache.commons.lang3.LocaleUtils;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

/**
 * @program: plugs
 *
 * @description: 根据当前登陆用户获取语言信息
 *
 * @author: Mr.Zhang
 *
 * @create: 2019-01-29 17:29
 **/
public class LanguageHelper {
    public  LanguageHelper(){}
    public static String language() {
        CustomUserDetails details = DetailsHelper.getUserDetails();
        if (details != null) {
            return details.getLanguage();
        } else {
            return LocaleContextHolder.getLocale().getLanguage();
        }
    }

    /**
     * 根据当前登陆用户获取 Locale
     *
     * @return Locale
     */
    public static Locale locale() {
        CustomUserDetails details = DetailsHelper.getUserDetails();
        if (details != null) {
            return LocaleUtils.toLocale(details.getLanguage());
        } else {
            return LocaleContextHolder.getLocale();
        }
    }
}
