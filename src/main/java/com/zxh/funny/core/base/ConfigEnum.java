package com.zxh.funny.core.base;
/**
 * @program: plugs
 *
 * @description: 全局配置常量
 *
 * @author: Mr.Zhang
 *
 * @create: 2019-02-01 22:22
 **/
public enum  ConfigEnum {
    /**
     * 密码输错超过次数后锁定用户 [<= 0 则不锁定用户]
     */
    PASSWORD_ERROR_TIME_TO_LOCK_USER,
    /**
     * 面膜输错超过次数后启用验证码 [<= 0 则不启用验证码]
     */
    PASSWORD_ERROR_TIME_TO_ENABLE_CAPTCHA,
}
