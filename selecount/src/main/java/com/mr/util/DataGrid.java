package com.mr.util;

import com.mr.entity.SmsFlashPromotion;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public class DataGrid {

    private Integer total;//总条数

    private Integer totalPage;//第几页
    private Integer pageSize;//一页几条
    private List list;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Datagrid{");
        sb.append("total=").append(total);
        sb.append(", totalPage=").append(totalPage);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
