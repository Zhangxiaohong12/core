package com.zxh.funny.core.constants;

import com.google.common.base.Charsets;

import java.nio.charset.Charset;

/**
 * @program: plugs
 *
 * @description: 系统常量类
 *
 * @author: Mr.Zhang
 *
 * @create: 2019-01-21 14:15
 **/
public class Constants {

    /**
     * 标识：是/否、启用/禁用等
     */
    public interface Flag {

        Integer YES = 1;

        Integer NO = 0;
    }

    /**
     * 性别
     */
    public interface Sex {
        /**
         * 男
         */
        Integer MALE = 1;
        /**
         * 女
         */
        Integer FEMALE = 0;
    }

}
