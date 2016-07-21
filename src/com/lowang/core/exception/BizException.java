package com.lowang.core.exception;
/**
 * 异常类.
 * @author Lo&Wang
 */
public class BizException extends RuntimeException {
    /**
     * 字段属性.
     */
    private static final long serialVersionUID = -331488162634650326L;
    public BizException(String exception) {
        super(exception);
    }
    public BizException(String LoWangException, Throwable throwable) {
        super(LoWangException, throwable);
    }
    public BizException(Throwable throwable) {
        super(throwable);
    }
}
