/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 下午6:49:05
*/
package com.yaosiyuan.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 下午6:49:05
 */
@Controller
@RequestMapping("userPageAction")
public class UserPageAction {

	@RequestMapping(value = "/toHome", method = RequestMethod.GET)
	public String index() {
		return "userHome/userIndex";
	}

}
