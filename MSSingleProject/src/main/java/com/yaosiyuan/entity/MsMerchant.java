package com.yaosiyuan.entity;

import java.io.Serializable;

/**
 * ms_merchant
 * @author 
 */
public class MsMerchant extends MsMerchantKey implements Serializable {
    /**
     * 商家店铺名
     */
    private String merchantShopName;

    /**
     * 商家账号
     */
    private String merchantAccount;

    /**
     * 商家密码
     */
    private String merchantPassword;

    /**
     * 商家经营范围
     */
    private String merchantScope;

    private static final long serialVersionUID = 1L;

    public String getMerchantShopName() {
        return merchantShopName;
    }

    public void setMerchantShopName(String merchantShopName) {
        this.merchantShopName = merchantShopName;
    }

    public String getMerchantAccount() {
        return merchantAccount;
    }

    public void setMerchantAccount(String merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public String getMerchantPassword() {
        return merchantPassword;
    }

    public void setMerchantPassword(String merchantPassword) {
        this.merchantPassword = merchantPassword;
    }

    public String getMerchantScope() {
        return merchantScope;
    }

    public void setMerchantScope(String merchantScope) {
        this.merchantScope = merchantScope;
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
        MsMerchant other = (MsMerchant) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchantName() == null ? other.getMerchantName() == null : this.getMerchantName().equals(other.getMerchantName()))
            && (this.getMerchantShopName() == null ? other.getMerchantShopName() == null : this.getMerchantShopName().equals(other.getMerchantShopName()))
            && (this.getMerchantAccount() == null ? other.getMerchantAccount() == null : this.getMerchantAccount().equals(other.getMerchantAccount()))
            && (this.getMerchantPassword() == null ? other.getMerchantPassword() == null : this.getMerchantPassword().equals(other.getMerchantPassword()))
            && (this.getMerchantScope() == null ? other.getMerchantScope() == null : this.getMerchantScope().equals(other.getMerchantScope()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchantName() == null) ? 0 : getMerchantName().hashCode());
        result = prime * result + ((getMerchantShopName() == null) ? 0 : getMerchantShopName().hashCode());
        result = prime * result + ((getMerchantAccount() == null) ? 0 : getMerchantAccount().hashCode());
        result = prime * result + ((getMerchantPassword() == null) ? 0 : getMerchantPassword().hashCode());
        result = prime * result + ((getMerchantScope() == null) ? 0 : getMerchantScope().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", merchantShopName=").append(merchantShopName);
        sb.append(", merchantAccount=").append(merchantAccount);
        sb.append(", merchantPassword=").append(merchantPassword);
        sb.append(", merchantScope=").append(merchantScope);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}