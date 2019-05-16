/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午1:31:24
*/
package com.yaosiyuan.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yaosiyuan.entity.MsMerchant;
import com.yaosiyuan.service.MsMerchantService;
import com.yaosiyuan.vo.MsMerchantVo;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月3日 下午1:31:24
 */
@Controller
@RequestMapping("msMerchantAction")
public class MsMerchantAction {
	@Autowired
	MsMerchantService msMerchantService;

	@RequestMapping("toAdd")
	public String toAdd() {
		return "merchant/add";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String Add(MsMerchant merchant) {
		int insert = msMerchantService.insert(merchant);

		System.out.println(insert);
		return "redirect:queryByVo";
	}

	@RequestMapping("toUpdate")
	public String toUpdate(HttpServletRequest request, int id) {
		MsMerchant selectByPrimaryKey = msMerchantService.selectByPrimaryKey(id);
		request.setAttribute("merchant", selectByPrimaryKey);

		return "merchant/update";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(HttpServletRequest request, MsMerchant merchant) {
		System.out.println(merchant);
		int updateByPrimaryKey = msMerchantService.updateByPrimaryKey(merchant);

		System.out.println(updateByPrimaryKey);
		return "redirect:queryByVo";
	}

	@RequestMapping("del")
	public String del(HttpServletRequest request, int id) {
		int deleteByPrimaryKey = msMerchantService.deleteByPrimaryKey(id);

		System.out.println(deleteByPrimaryKey);
		return "redirect:queryByVo";
	}

	@RequestMapping("queryById")
	public String query(HttpServletRequest request, int id) {
		MsMerchant selectByPrimaryKey = msMerchantService.selectByPrimaryKey(id);
		request.setAttribute("merchant", selectByPrimaryKey);
		System.out.println(selectByPrimaryKey);
		return "merchant/view";
	}

	@RequestMapping("queryByVo")
	public String queryMsMerchantByVo(HttpServletRequest request, MsMerchantVo msMerchantVo) {
		List<MsMerchant> msMerchantList = msMerchantService.queryMsMerchantByVo(msMerchantVo);
		request.setAttribute("msMerchantList", msMerchantList);
		return "merchant/list";

	}
}
