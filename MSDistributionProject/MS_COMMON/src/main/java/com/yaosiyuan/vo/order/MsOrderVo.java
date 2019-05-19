/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午8:30:20
*/
package com.yaosiyuan.vo.order;

import java.io.Serializable;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午8:30:20
 */
public class MsOrderVo implements Serializable {
	private ConstomOrder constomOrder;

	/**
	 * constomOrder
	 * 
	 * @return the constomOrder
	 */
	public ConstomOrder getConstomOrder() {
		return constomOrder;
	}

	/**
	 * @param constomOrder
	 *            the constomOrder to set
	 */
	public void setConstomOrder(ConstomOrder constomOrder) {
		this.constomOrder = constomOrder;
	}

}
