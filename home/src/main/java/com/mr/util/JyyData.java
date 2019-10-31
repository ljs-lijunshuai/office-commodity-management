package com.mr.util;

public class JyyData {

    private long code=200;
    private String message;

    private JyyPage data;

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

    public JyyPage getData() {
        return data;
    }

    public void setData(JyyPage data) {
        this.data = data;
    }


}
