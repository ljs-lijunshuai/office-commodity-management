package com.mr.page;

import java.util.List;
public class PageUtils<T> {
    /*开始页数*/
    private Integer pageNum;
    /*每页最大条数*/
    private Integer pageSize;
    /*总页数*/
    private Integer totalPage;
    /*总条数*/
    private Integer total;
    /*开始条数*/
    private Integer startNum;
    /*数据*/
    private List<T> list;

    public PageUtils() {
    }

    @Override
    public String toString() {
        return "PageUtils{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", total=" + total +
                ", startNum=" + startNum +
                ", list=" + list +
                '}';
    }

    public PageUtils(Integer pageNum, Integer pageSize, Integer totalPage, Integer total, Integer startNum, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.total = total;
        this.startNum = startNum;
        this.list = list;
    }

    public PageUtils(Integer pageNum, Integer pageSize, Integer totalPage, Integer total, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.total = total;
        this.list = list;
    }

    public Integer getStartNum() {
        return (pageNum-1)*pageSize;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
