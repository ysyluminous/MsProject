package com.yaosiyuan.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yaosiyuan.entity.MsUser;
import com.yaosiyuan.service.MsUserService;
import com.yaosiyuan.vo.MsUserVo;

@Controller
@RequestMapping("msUserAction")
public class MsUserAction {

	@Autowired
	MsUserService msUserService;

	@RequestMapping("toAdd")
	public String toadd() {
		return "user/add";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(MsUser msUser) {
		msUserService.insert(msUser);
		System.out.println(msUser);
		return "redirect:queryByVo";
	}

	@RequestMapping("toUpDate")
	public String toupdate(HttpServletRequest request, int id) {
		MsUser user = msUserService.selectByPrimaryKey(id);
		request.setAttribute("msUser", user);
		return "user/update";
	}

	@RequestMapping(value = "upDate", method = RequestMethod.POST)
	public String update(HttpServletRequest request, MsUser msUser) {
		msUserService.updateByPrimaryKey(msUser);
		System.out.println(msUser);
		return "redirect:queryByVo";
	}

	@RequestMapping("del")
	public String del(HttpServletRequest request, int id) {
		msUserService.deleteByPrimaryKey(id);
		return "redirect:queryByVo";
	}

	@RequestMapping("queryById")
	public String querybyid(HttpServletRequest request, int id) {
		MsUser msUser = msUserService.selectByPrimaryKey(id);
		request.setAttribute("msUser", msUser);
		return "user/view";
	}

	@RequestMapping("queryByVo")
	public String querybyvo(HttpServletRequest request, MsUserVo msUserVo) {
		List<MsUser> list = msUserService.queryMsUserByVo(msUserVo);
		request.setAttribute("msUserlist", list);
		return "user/list";
	}

}
