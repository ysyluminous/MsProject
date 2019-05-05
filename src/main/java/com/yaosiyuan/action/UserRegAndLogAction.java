/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月6日 上午12:01:10
*/
package com.yaosiyuan.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yaosiyuan.entity.MsUser;
import com.yaosiyuan.service.MsUserService;

/**
 * @description: 功能描述 (用户登陆注册控制器)
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月6日 上午12:01:10
 */

@Controller
@RequestMapping("userRegAndLogAction")
public class UserRegAndLogAction {

	@Autowired
	MsUserService msUserService;

	@RequestMapping(value = "toRegiter")
	public String toRegiter(MsUser msUser) {
		return "/user/toRegiter";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String regiter(MsUser msUser) {
		int insert = msUserService.insert(msUser);
		System.out.println(insert + "" + msUser);
		return "redirect:queryByVo";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(MsUser msUser) {
		int insert = msUserService.insert(msUser);
		System.out.println(insert + "" + msUser);
		return "redirect:queryByVo";
	}

}
