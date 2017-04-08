package com.skb.allocate.domain;

/**
 * Created by Administrator on 2017/4/8.
 */
public class OrderBatchItem {
    private Long OrderBatchItemId;
    private Long OrderBatchId;
    private String OrderCode;
    private Long Sort;
    private Long Status;
    private Long DeliveryStatus;
    private String GUID;

    public Long getOrderBatchItemId() {
        return OrderBatchItemId;
    }

    public void setOrderBatchItemId(Long orderBatchItemId) {
        OrderBatchItemId = orderBatchItemId;
    }

    public Long getOrderBatchId() {
        return OrderBatchId;
    }

    public void setOrderBatchId(Long orderBatchId) {
        OrderBatchId = orderBatchId;
    }

    public String getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(String orderCode) {
        OrderCode = orderCode;
    }

    public Long getSort() {
        return Sort;
    }

    public void setSort(Long sort) {
        Sort = sort;
    }

    public Long getStatus() {
        return Status;
    }

    public void setStatus(Long status) {
        Status = status;
    }

    public Long getDeliveryStatus() {
        return DeliveryStatus;
    }

    public void setDeliveryStatus(Long deliveryStatus) {
        DeliveryStatus = deliveryStatus;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }
}
