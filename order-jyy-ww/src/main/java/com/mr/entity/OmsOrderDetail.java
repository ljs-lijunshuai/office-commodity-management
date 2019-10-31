package com.mr.entity;

import java.util.List;
import com.mr.entity.OmsOrderItem;
import com.mr.entity.OmsOrderOperateHistory;
/**
 * 订单详情信息
 * Created by macro on 2019/10/29.
 */
public class OmsOrderDetail extends OmsOrder {

    private List<OmsOrderItem> orderItemList;

    private List<OmsOrderOperateHistory> historyList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<OmsOrderOperateHistory> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(List<OmsOrderOperateHistory> historyList) {
        this.historyList = historyList;
    }

}
