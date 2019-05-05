package com.yaosiyuan.entity;

import java.io.Serializable;

/**
 * ms_product_detail 商品详情
 * 
 * @author yaosiyuan
 */
public class MsProductDetail implements Serializable {
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 商品id
	 */
	private Integer productId;

	/**
	 * 商家id
	 */
	private Integer merchantId;

	/**
	 * 商品产地
	 */
	private String productPalce;

	/**
	 * 商品名称
	 */
	private String productName;

	/**
	 * 品牌信息
	 */
	private String brandName;

	/**
	 * 商品重量
	 */
	private String productWeight;

	/**
	 * 规格和包装
	 */
	private String specification;

	/**
	 * 详情图片
	 */
	private String imageSrc;

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

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public String getProductPalce() {
		return productPalce;
	}

	public void setProductPalce(String productPalce) {
		this.productPalce = productPalce;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
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
		MsProductDetail other = (MsProductDetail) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getProductId() == null ? other.getProductId() == null
						: this.getProductId().equals(other.getProductId()))
				&& (this.getMerchantId() == null ? other.getMerchantId() == null
						: this.getMerchantId().equals(other.getMerchantId()))
				&& (this.getProductPalce() == null ? other.getProductPalce() == null
						: this.getProductPalce().equals(other.getProductPalce()))
				&& (this.getProductName() == null ? other.getProductName() == null
						: this.getProductName().equals(other.getProductName()))
				&& (this.getBrandName() == null ? other.getBrandName() == null
						: this.getBrandName().equals(other.getBrandName()))
				&& (this.getProductWeight() == null ? other.getProductWeight() == null
						: this.getProductWeight().equals(other.getProductWeight()))
				&& (this.getSpecification() == null ? other.getSpecification() == null
						: this.getSpecification().equals(other.getSpecification()))
				&& (this.getImageSrc() == null ? other.getImageSrc() == null
						: this.getImageSrc().equals(other.getImageSrc()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
		result = prime * result + ((getMerchantId() == null) ? 0 : getMerchantId().hashCode());
		result = prime * result + ((getProductPalce() == null) ? 0 : getProductPalce().hashCode());
		result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
		result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
		result = prime * result + ((getProductWeight() == null) ? 0 : getProductWeight().hashCode());
		result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
		result = prime * result + ((getImageSrc() == null) ? 0 : getImageSrc().hashCode());
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
		sb.append(", merchantId=").append(merchantId);
		sb.append(", productPalce=").append(productPalce);
		sb.append(", productName=").append(productName);
		sb.append(", brandName=").append(brandName);
		sb.append(", productWeight=").append(productWeight);
		sb.append(", specification=").append(specification);
		sb.append(", imageSrc=").append(imageSrc);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}