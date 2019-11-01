package com.mr.util;


import com.mr.entity.OmsOrderReturnApply;
import org.apache.poi.ss.formula.functions.T;

public class JyyClassData<T> {

    private long code=200;
    private String message;
    private T data;


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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
