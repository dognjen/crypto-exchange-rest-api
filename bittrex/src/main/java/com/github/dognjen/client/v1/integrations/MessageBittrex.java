package com.github.dognjen.client.v1.integrations;

/**
 * Created by Dejan Ognjenović on 26/11/2017.
 */
public abstract class MessageBittrex {

    private boolean success;

    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
