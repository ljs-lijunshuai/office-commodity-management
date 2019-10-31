package com.mr.util;

import com.mr.entity.OmsOrder;

import java.util.List;

public class WwPage {

    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<OmsOrder> list;


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

    public List<OmsOrder> getList() {
        return list;
    }

    public void setList(List<OmsOrder> list) {
        this.list = list;
    }
}
