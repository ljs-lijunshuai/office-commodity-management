package com.mr.util;

import com.mr.entity.OmsOrderReturnApply;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public class JyyPage<T> {

    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private T list;


    public void calculate() {
        this.totalPage = (pageNum)*pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public T getList() {
        return list;
    }

    public void setList(T list) {
        this.list = list;
    }
}
