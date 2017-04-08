package com.skb.allocate.domain;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/8.
 */
public class FnAllocateTask {
    private Long AllocateTaskId;
    private String OrderBatchCode;
    private Long ProcessCenterId;
    private String FNCode;
    private Long SKUTotal;
    private Long Quantity;
    private Long Status;
    private Long OperatorId;
    private Timestamp CreateTime;
    private Timestamp LastUpdateTime;
    private String OrderCode;

    public Long getAllocateTaskId() {
        return AllocateTaskId;
    }

    public void setAllocateTaskId(Long allocateTaskId) {
        AllocateTaskId = allocateTaskId;
    }

    public String getOrderBatchCode() {
        return OrderBatchCode;
    }

    public void setOrderBatchCode(String orderBatchCode) {
        OrderBatchCode = orderBatchCode;
    }

    public Long getProcessCenterId() {
        return ProcessCenterId;
    }

    public void setProcessCenterId(Long processCenterId) {
        ProcessCenterId = processCenterId;
    }

    public String getFNCode() {
        return FNCode;
    }

    public void setFNCode(String FNCode) {
        this.FNCode = FNCode;
    }

    public Long getSKUTotal() {
        return SKUTotal;
    }

    public void setSKUTotal(Long SKUTotal) {
        this.SKUTotal = SKUTotal;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        Quantity = quantity;
    }

    public Long getStatus() {
        return Status;
    }

    public void setStatus(Long status) {
        Status = status;
    }

    public Long getOperatorId() {
        return OperatorId;
    }

    public void setOperatorId(Long operatorId) {
        OperatorId = operatorId;
    }

    public Timestamp getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Timestamp createTime) {
        CreateTime = createTime;
    }

    public Timestamp getLastUpdateTime() {
        return LastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        LastUpdateTime = lastUpdateTime;
    }

    public String getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(String orderCode) {
        OrderCode = orderCode;
    }
}
