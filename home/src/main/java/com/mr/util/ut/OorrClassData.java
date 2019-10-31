package com.mr.util.ut;


import com.mr.entity.OmsOrderReturnReason;

public class OorrClassData {

    private long code=200;
    private String message;
    private OmsOrderReturnReason data;


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

    public OmsOrderReturnReason getData() {
        return data;
    }

    public void setData(OmsOrderReturnReason data) {
        this.data = data;
    }
}
