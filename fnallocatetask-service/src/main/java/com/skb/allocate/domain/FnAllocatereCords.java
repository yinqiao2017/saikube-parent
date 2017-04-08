package com.skb.allocate.domain;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/8.
 */
public class FnAllocatereCords {
    private Long FnAllocateRecordId;
    private String BatchCode;
    private String FnCode;
    private String ProductCode;
    private String PropertyCode;
    private Long ProductId;
    private Long PropertyId;
    private Long Quantity;
    private Long OperatorId;
    private Timestamp CreatedDate;
    private String DeliveryProductCode;
    private Long StorageId;
    private String GUID;

    public Long getFnAllocateRecordId() {
        return FnAllocateRecordId;
    }

    public void setFnAllocateRecordId(Long fnAllocateRecordId) {
        FnAllocateRecordId = fnAllocateRecordId;
    }

    public String getBatchCode() {
        return BatchCode;
    }

    public void setBatchCode(String batchCode) {
        BatchCode = batchCode;
    }

    public String getFnCode() {
        return FnCode;
    }

    public void setFnCode(String fnCode) {
        FnCode = fnCode;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getPropertyCode() {
        return PropertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        PropertyCode = propertyCode;
    }

    public Long getProductId() {
        return ProductId;
    }

    public void setProductId(Long productId) {
        ProductId = productId;
    }

    public Long getPropertyId() {
        return PropertyId;
    }

    public void setPropertyId(Long propertyId) {
        PropertyId = propertyId;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        Quantity = quantity;
    }

    public Long getOperatorId() {
        return OperatorId;
    }

    public void setOperatorId(Long operatorId) {
        OperatorId = operatorId;
    }

    public Timestamp getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        CreatedDate = createdDate;
    }

    public String getDeliveryProductCode() {
        return DeliveryProductCode;
    }

    public void setDeliveryProductCode(String deliveryProductCode) {
        DeliveryProductCode = deliveryProductCode;
    }

    public Long getStorageId() {
        return StorageId;
    }

    public void setStorageId(Long storageId) {
        StorageId = storageId;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }
}
