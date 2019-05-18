/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月6日 上午12:01:10
*/
package com.yaosiyuan.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yaosiyuan.entity.MsUser;
import com.yaosiyuan.entity.OnLine;
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

	@Reference
	MsUserService msUserService;

	@RequestMapping(value = "toRegiter")
	public String toRegiter(MsUser msUser) {
		return "/user/register";
	}

	@RequestMapping(value = "regiter", method = RequestMethod.POST)
	public String regiter(HttpServletRequest request, MsUser msUser) {
		int insert = msUserService.insert(msUser);
		System.out.println(insert + "" + msUser);
		HttpSession session = request.getSession();
		session.setAttribute("msUser", msUser);

		OnLine onLine = new OnLine();
		onLine.setStatus("1");
		onLine.setMsUser(msUser);
		session.setAttribute("onLine", onLine);
		return "redirect:/";
	}

	@RequestMapping(value = "toLogin")
	public String toLogin(MsUser msUser) {
		return "user/login";
	}

	/**
	 * 
	 * @description: 功能描述： (登陆方法)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月6日 上午8:44:40
	 * @param msUser
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, MsUser msUser) {
		String userAccount = msUser.getUserAccount();
		String userPassword = msUser.getUserPassword();
		MsUser selectByUserAccount = msUserService.selectByUserAccount(userAccount);
		if (selectByUserAccount == null) {
			System.out.println("没有这个账号");
			return "redirect:/";
		} else if (!selectByUserAccount.getUserPassword().equals(userPassword)) {
			System.out.println("密码不对");

		} else {
			/*
			 * 
			 * session.setAttribute("msUser", selectByUserAccount);
			 */
			HttpSession session = request.getSession();
			OnLine onLine = new OnLine();
			onLine.setStatus("1");
			onLine.setMsUser(selectByUserAccount);
			session.setAttribute("onLine", onLine);
			return "redirect:/";
		}
		return "redirect:/";

	}

	@RequestMapping(value = "signOut")
	public String signOut(HttpServletRequest request) {
		HttpSession session = request.getSession();
		// session.removeAttribute("msUser");
		session.removeAttribute("onLine");
		return "redirect:/";
	}

}
