/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午8:30:20
*/
package com.yaosiyuan.vo;

import java.io.Serializable;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午8:30:20
 */
public class MsUserVo implements Serializable {
	private ConstomUser constomUser;

	/**
	 * constomUser
	 * 
	 * @return the constomUser
	 */
	public ConstomUser getConstomUser() {
		return constomUser;
	}

	/**
	 * @param constomUser
	 *            the constomUser to set
	 */
	public void setConstomUser(ConstomUser constomUser) {
		this.constomUser = constomUser;
	}

}
