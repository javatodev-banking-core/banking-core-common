package com.javatodev.finance.exception;

public class BankingCoreGlobalException extends RuntimeException {
    private Long code;

    public BankingCoreGlobalException(String message, Long code){
        super(message);
        this.code = code;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }
}
