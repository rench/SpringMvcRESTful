package com.lowang.core.exception;
/**
 * 异常类.
 * @author Lo&Wang
 */
public class AppException extends RuntimeException {
    /**
     * 字段属性.
     */
    private static final long serialVersionUID = -331488162634650326L;
    public AppException(String exception) {
        super(exception);
    }
    public AppException(String LoWangException, Throwable throwable) {
        super(LoWangException, throwable);
    }
    public AppException(Throwable throwable) {
        super(throwable);
    }
}
