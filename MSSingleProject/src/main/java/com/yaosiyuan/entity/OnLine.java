/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月6日 下午4:44:36
*/
package com.yaosiyuan.entity;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月6日 下午4:44:36
 */
public class OnLine {

	/* 状态 0 未登录， 1 登陆user 2 登陆 mer */
	private String status;
	private MsUser msUser;
	private MsMerchant msMerchant;

	/**
	 * status
	 * 
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * msUser
	 * 
	 * @return the msUser
	 */
	public MsUser getMsUser() {
		return msUser;
	}

	/**
	 * @param msUser
	 *            the msUser to set
	 */
	public void setMsUser(MsUser msUser) {
		this.msUser = msUser;
	}

	/**
	 * msMerchant
	 * 
	 * @return the msMerchant
	 */
	public MsMerchant getMsMerchant() {
		return msMerchant;
	}

	/**
	 * @param msMerchant
	 *            the msMerchant to set
	 */
	public void setMsMerchant(MsMerchant msMerchant) {
		this.msMerchant = msMerchant;
	}

}
