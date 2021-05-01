package com.javatodev.finance.exception;

public class BankingCoreGlobalException extends RuntimeException {
    private String code;
    private String message;

    public BankingCoreGlobalException() {
    }

    public BankingCoreGlobalException(String code) {
        this.code = code;
    }

    public BankingCoreGlobalException(String message, String code) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
