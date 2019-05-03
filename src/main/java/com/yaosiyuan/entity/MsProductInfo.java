package com.yaosiyuan.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ms_product_info
 * @author 
 */
public class MsProductInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 商品标题
     */
    private String productTitle;

    /**
     * 图片
     */
    private String productPic;

    /**
     * 商品原始价格
     */
    private Integer productOgPrice;

    /**
     * 秒杀价格
     */
    private Integer miaoshaPrice;

    /**
     * 商家
     */
    private Integer merchant;

    /**
     * 申请日期
     */
    private Date applayDate;

    /**
     * 审核日期
     */
    private Date aidotDate;

    /**
     * 审核状态
     */
    private Integer aidotStatus;

    /**
     * 秒杀开始时间
     */
    private Date startTime;

    /**
     * 秒杀结束时间
     */
    private Date endTime;

    /**
     * 秒杀商品数
     */
    private Integer productCount;

    /**
     * 库存
     */
    private Integer stockCount;

    /**
     * 描述
     */
    private String desc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public Integer getProductOgPrice() {
        return productOgPrice;
    }

    public void setProductOgPrice(Integer productOgPrice) {
        this.productOgPrice = productOgPrice;
    }

    public Integer getMiaoshaPrice() {
        return miaoshaPrice;
    }

    public void setMiaoshaPrice(Integer miaoshaPrice) {
        this.miaoshaPrice = miaoshaPrice;
    }

    public Integer getMerchant() {
        return merchant;
    }

    public void setMerchant(Integer merchant) {
        this.merchant = merchant;
    }

    public Date getApplayDate() {
        return applayDate;
    }

    public void setApplayDate(Date applayDate) {
        this.applayDate = applayDate;
    }

    public Date getAidotDate() {
        return aidotDate;
    }

    public void setAidotDate(Date aidotDate) {
        this.aidotDate = aidotDate;
    }

    public Integer getAidotStatus() {
        return aidotStatus;
    }

    public void setAidotStatus(Integer aidotStatus) {
        this.aidotStatus = aidotStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MsProductInfo other = (MsProductInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductTitle() == null ? other.getProductTitle() == null : this.getProductTitle().equals(other.getProductTitle()))
            && (this.getProductPic() == null ? other.getProductPic() == null : this.getProductPic().equals(other.getProductPic()))
            && (this.getProductOgPrice() == null ? other.getProductOgPrice() == null : this.getProductOgPrice().equals(other.getProductOgPrice()))
            && (this.getMiaoshaPrice() == null ? other.getMiaoshaPrice() == null : this.getMiaoshaPrice().equals(other.getMiaoshaPrice()))
            && (this.getMerchant() == null ? other.getMerchant() == null : this.getMerchant().equals(other.getMerchant()))
            && (this.getApplayDate() == null ? other.getApplayDate() == null : this.getApplayDate().equals(other.getApplayDate()))
            && (this.getAidotDate() == null ? other.getAidotDate() == null : this.getAidotDate().equals(other.getAidotDate()))
            && (this.getAidotStatus() == null ? other.getAidotStatus() == null : this.getAidotStatus().equals(other.getAidotStatus()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getProductCount() == null ? other.getProductCount() == null : this.getProductCount().equals(other.getProductCount()))
            && (this.getStockCount() == null ? other.getStockCount() == null : this.getStockCount().equals(other.getStockCount()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductTitle() == null) ? 0 : getProductTitle().hashCode());
        result = prime * result + ((getProductPic() == null) ? 0 : getProductPic().hashCode());
        result = prime * result + ((getProductOgPrice() == null) ? 0 : getProductOgPrice().hashCode());
        result = prime * result + ((getMiaoshaPrice() == null) ? 0 : getMiaoshaPrice().hashCode());
        result = prime * result + ((getMerchant() == null) ? 0 : getMerchant().hashCode());
        result = prime * result + ((getApplayDate() == null) ? 0 : getApplayDate().hashCode());
        result = prime * result + ((getAidotDate() == null) ? 0 : getAidotDate().hashCode());
        result = prime * result + ((getAidotStatus() == null) ? 0 : getAidotStatus().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getProductCount() == null) ? 0 : getProductCount().hashCode());
        result = prime * result + ((getStockCount() == null) ? 0 : getStockCount().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", productTitle=").append(productTitle);
        sb.append(", productPic=").append(productPic);
        sb.append(", productOgPrice=").append(productOgPrice);
        sb.append(", miaoshaPrice=").append(miaoshaPrice);
        sb.append(", merchant=").append(merchant);
        sb.append(", applayDate=").append(applayDate);
        sb.append(", aidotDate=").append(aidotDate);
        sb.append(", aidotStatus=").append(aidotStatus);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", productCount=").append(productCount);
        sb.append(", stockCount=").append(stockCount);
        sb.append(", desc=").append(desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}