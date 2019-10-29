package com.mr.util;

import com.mr.entity.OmsOrder;
import java.io.Serializable;
import java.util.List;

/**
 * Created by WW on 2019/10/28.
 */
public class DataGridWw  implements Serializable{

    private Integer total;
    private List rows;

    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public List getRows() {
        return rows;
    }
    public void setRows(List rows) {
        this.rows = rows;
    }
    @Override
    public String toString() {
        return "DataGrid [total=" + total + ", rows=" + rows + "]";
    }

}
