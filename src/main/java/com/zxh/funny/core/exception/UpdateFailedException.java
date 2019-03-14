package com.zxh.funny.core.exception;

import com.zxh.funny.core.constants.BaseResultEnums;

/**
 * 更新失败
 *
 * @author bojiangzhou 2018-02-10
 */
public class UpdateFailedException extends RuntimeException {
    private static final long serialVersionUID = 4815346170234649606L;

    public UpdateFailedException() {
        super(BaseResultEnums.UPDATE_FAILED.code());
    }

}
