package com.mr.util;


import com.mr.entity.OmsOrderReturnApply;
import org.apache.poi.ss.formula.functions.T;

public class JyyClassData {

    private long code=200;
    private String message;
    private OmsOrderReturnApply data;


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

    public OmsOrderReturnApply getData() {
        return data;
    }

    public void setData(OmsOrderReturnApply data) {
        this.data = data;
    }
}
