package com.mr.util;

public class Apple {
    private Integer aid;
    private String aname;

    @Override
    public String toString() {
        return "Apple{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}
