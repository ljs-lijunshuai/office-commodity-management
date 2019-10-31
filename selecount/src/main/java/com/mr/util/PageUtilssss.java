package com.mr.util;

public class PageUtilssss {

    //当前页
    private Integer page=1;

    //每页条数
    private Integer rows=5;

    //开始条数
    private Integer startPos;

    //排序查询会用到的
    private String sort;
    private String order;

    //计算开始条数
    public void calculate() {
        this.startPos = (page-1)*rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getStartPos() {
        return startPos;
    }

    public void setStartPos(Integer startPos) {
        this.startPos = startPos;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }


}
