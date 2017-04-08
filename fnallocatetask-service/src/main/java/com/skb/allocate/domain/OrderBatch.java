package com.skb.allocate.domain;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/8.
 */
public class OrderBatch {
    private Long OrderBatchId;
    private String OrderBatchCode;
    private Timestamp CreatedDate;
    private Integer ComputeStatus;
    private Timestamp ComputedDate;
    private Long StorageId;
    private Long ProcesscenterId;
    private Long Sign;
    private Integer OrderBatchType;

    public Long getOrderBatchId() {
        return OrderBatchId;
    }

    public void setOrderBatchId(Long orderBatchId) {
        OrderBatchId = orderBatchId;
    }

    public String getOrderBatchCode() {
        return OrderBatchCode;
    }

    public void setOrderBatchCode(String orderBatchCode) {
        OrderBatchCode = orderBatchCode;
    }

    public Timestamp getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        CreatedDate = createdDate;
    }

    public Integer getComputeStatus() {
        return ComputeStatus;
    }

    public void setComputeStatus(Integer computeStatus) {
        ComputeStatus = computeStatus;
    }

    public Timestamp getComputedDate() {
        return ComputedDate;
    }

    public void setComputedDate(Timestamp computedDate) {
        ComputedDate = computedDate;
    }

    public Long getStorageId() {
        return StorageId;
    }

    public void setStorageId(Long storageId) {
        StorageId = storageId;
    }

    public Long getProcesscenterId() {
        return ProcesscenterId;
    }

    public void setProcesscenterId(Long processcenterId) {
        ProcesscenterId = processcenterId;
    }

    public Long getSign() {
        return Sign;
    }

    public void setSign(Long sign) {
        Sign = sign;
    }

    public Integer getOrderBatchType() {
        return OrderBatchType;
    }

    public void setOrderBatchType(Integer orderBatchType) {
        OrderBatchType = orderBatchType;
    }
}
