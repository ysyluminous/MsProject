package com.yaosiyuan.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ms_product_info
 * 
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
	 * 审核状态1.未审核，2，审核通过，3，审核不通过
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
	 * 秒杀开始时间
	 */
	private String startTimeString;

	/**
	 * 秒杀结束时间
	 */
	private String endTimeString;

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
	private String description;

	/**
	 * startTimeString
	 * 
	 * @return the startTimeString
	 */
	public String getStartTimeString() {
		return startTimeString;
	}

	/**
	 * @param startTimeString
	 *            the startTimeString to set
	 */
	public void setStartTimeString(String startTimeString) {
		this.startTimeString = startTimeString;
	}

	/**
	 * endTimeString
	 * 
	 * @return the endTimeString
	 */
	public String getEndTimeString() {
		return endTimeString;
	}

	/**
	 * @param endTimeString
	 *            the endTimeString to set
	 */
	public void setEndTimeString(String endTimeString) {
		this.endTimeString = endTimeString;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * (非 Javadoc) Title: toString Description:
	 * 
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MsProductInfo [id=" + id + ", productId=" + productId + ", productTitle=" + productTitle
				+ ", productPic=" + productPic + ", productOgPrice=" + productOgPrice + ", miaoshaPrice=" + miaoshaPrice
				+ ", merchant=" + merchant + ", applayDate=" + applayDate + ", aidotDate=" + aidotDate
				+ ", aidotStatus=" + aidotStatus + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", startTimeString=" + startTimeString + ", endTimeString=" + endTimeString + ", productCount="
				+ productCount + ", stockCount=" + stockCount + ", description=" + description + "]";
	}

}