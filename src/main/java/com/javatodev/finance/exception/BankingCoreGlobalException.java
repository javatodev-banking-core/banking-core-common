package com.javatodev.finance.exception;

public class BankingCoreGlobalException extends RuntimeException {
    private String code;

    public BankingCoreGlobalException(String message, String code){
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
