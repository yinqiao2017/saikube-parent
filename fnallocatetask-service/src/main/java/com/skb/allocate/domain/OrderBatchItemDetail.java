package com.skb.allocate.domain;

/**
 * Created by Administrator on 2017/4/8.
 */
public class OrderBatchItemDetail {
    private Long OrderBatchItemDetailId;
    private Long OrderBatchItemId;
    private String ProductCode;
    private String PropertyCode;
    private Long Quantity;
    private String GUID;

    public Long getOrderBatchItemDetailId() {
        return OrderBatchItemDetailId;
    }

    public void setOrderBatchItemDetailId(Long orderBatchItemDetailId) {
        OrderBatchItemDetailId = orderBatchItemDetailId;
    }

    public Long getOrderBatchItemId() {
        return OrderBatchItemId;
    }

    public void setOrderBatchItemId(Long orderBatchItemId) {
        OrderBatchItemId = orderBatchItemId;
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

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        Quantity = quantity;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }
}
