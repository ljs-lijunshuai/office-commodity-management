package com.mr.util;

public class WwData {

    private long code=200;
    private String message;
    private WwPage data;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public WwPage getData() {
        return data;
    }

    public void setData(WwPage data) {
        this.data = data;
    }
}
