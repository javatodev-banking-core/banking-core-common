package com.javatodev.finance.model.dto;

public class NotificationRequest {
    private String message;
    private MessageType type;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public NotificationRequest() {
    }

    public NotificationRequest(String message, MessageType type) {
        this.message = message;
        this.type = type;
    }
}
