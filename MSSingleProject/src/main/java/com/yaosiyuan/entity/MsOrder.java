package com.yaosiyuan.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ms_order
 * 
 * @author
 */
public class MsOrder implements Serializable {
	private Integer id;

	/**
	 * 秒杀商品id
	 */
	private Integer productId;

	/**
	 * 支付金额
	 */
	private Integer payAmount;

	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 商家id
	 */
	private Integer merchantId;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 支付时间
	 */
	private Date payTime;

	/**
	 * 支付状态1,未支付，2，已支付，3，退款成功,4,退款
	 */
	private Integer payStatus;

	/**
	 * 收货人地址
	 */
	private String receiveAddress;

	/**
	 * 收货人电话
	 */
	private Integer receivePhone;

	/**
	 * 收货人名称
	 */
	private String receiveName;

	/**
	 * 交易流水号
	 */
	private String tradeId;

	private Integer num;

	/**
	 * 1，代表支付宝 2,代表微信，3,代表银联
	 */
	private Integer payType;

	/**
	 * payType
	 * 
	 * @return the payType
	 */
	public Integer getPayType() {
		return payType;
	}

	/**
	 * @param payType
	 *            the payType to set
	 */
	public void setPayType(Integer payType) {
		this.payType = payType;
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

	public Integer getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Integer payAmount) {
		this.payAmount = payAmount;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public String getReceiveAddress() {
		return receiveAddress;
	}

	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}

	public Integer getReceivePhone() {
		return receivePhone;
	}

	public void setReceivePhone(Integer receivePhone) {
		this.receivePhone = receivePhone;
	}

	public String getReceiveName() {
		return receiveName;
	}

	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
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
		MsOrder other = (MsOrder) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getProductId() == null ? other.getProductId() == null
						: this.getProductId().equals(other.getProductId()))
				&& (this.getPayAmount() == null ? other.getPayAmount() == null
						: this.getPayAmount().equals(other.getPayAmount()))
				&& (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
				&& (this.getMerchantId() == null ? other.getMerchantId() == null
						: this.getMerchantId().equals(other.getMerchantId()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getPayTime() == null ? other.getPayTime() == null
						: this.getPayTime().equals(other.getPayTime()))
				&& (this.getPayStatus() == null ? other.getPayStatus() == null
						: this.getPayStatus().equals(other.getPayStatus()))
				&& (this.getReceiveAddress() == null ? other.getReceiveAddress() == null
						: this.getReceiveAddress().equals(other.getReceiveAddress()))
				&& (this.getReceivePhone() == null ? other.getReceivePhone() == null
						: this.getReceivePhone().equals(other.getReceivePhone()))
				&& (this.getReceiveName() == null ? other.getReceiveName() == null
						: this.getReceiveName().equals(other.getReceiveName()))
				&& (this.getTradeId() == null ? other.getTradeId() == null
						: this.getTradeId().equals(other.getTradeId()))
				&& (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
		result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
		result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
		result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
		result = prime * result + ((getReceiveAddress() == null) ? 0 : getReceiveAddress().hashCode());
		result = prime * result + ((getReceivePhone() == null) ? 0 : getReceivePhone().hashCode());
		result = prime * result + ((getReceiveName() == null) ? 0 : getReceiveName().hashCode());
		result = prime * result + ((getTradeId() == null) ? 0 : getTradeId().hashCode());
		result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
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
		sb.append(", payAmount=").append(payAmount);
		sb.append(", userId=").append(userId);
		sb.append(", merchantId=").append(merchantId);
		sb.append(", createTime=").append(createTime);
		sb.append(", payTime=").append(payTime);
		sb.append(", payStatus=").append(payStatus);
		sb.append(", receiveAddress=").append(receiveAddress);
		sb.append(", receivePhone=").append(receivePhone);
		sb.append(", receiveName=").append(receiveName);
		sb.append(", tradeId=").append(tradeId);
		sb.append(", num=").append(num);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}