/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:58:18
*/
package com.yaosiyuan.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yaosiyuan.entity.MsProductInfo;
import com.yaosiyuan.service.MsProductInfoService;
import com.yaosiyuan.vo.MsProductVo;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 上午8:58:18
 */
@Controller
@RequestMapping("msProductAction")
public class MsProductAction {

	@Autowired
	MsProductInfoService MsProductInfoService;

	@RequestMapping(value = "toApplyMsProduct")
	public String toApplyMsProduct() {
		return "msProductInfo/applyMsProduct";
	}

	@RequestMapping(value = "applyMsProduct", method = RequestMethod.POST)
	public String applyMsProduct(MsProductInfo MsProductInfo) {

		MsProductInfoService.applyMsProduct(MsProductInfo);
		return "redirect:listMsProduct";
	}

	@RequestMapping(value = "listMsProduct")
	public String listMsProduct(HttpServletRequest request, MsProductVo msProductVo) {

		List<MsProductInfo> listMsProduct = MsProductInfoService.listMsProduct(msProductVo);
		request.setAttribute("listMsProduct", listMsProduct);
		return "msProductInfo/list";
	}

	@RequestMapping(value = "queryMsProductByid")
	public String queryMsProductByid(HttpServletRequest req, int id) {
		MsProductInfo msProductInfo = MsProductInfoService.queryProductById(id);
		req.setAttribute("msProductInfo", msProductInfo);
		return "msProductInfo/view";
	}

	@RequestMapping(value = "deletemsproductByid")
	public String deletemsproductByid(HttpServletRequest req, int id) {
		MsProductInfoService.deleteProductById(id);
		return "redirect:listMsProduct";
	}

	@RequestMapping(value = "toUpdateMsProduct")
	public String toUpdateMsProduct(HttpServletRequest req, int id) {
		MsProductInfo msProductInfo = MsProductInfoService.queryProductById(id);
		Date starttime = msProductInfo.getStartTime();
		Date endtime = msProductInfo.getEndTime();
		String starttimestring = "";
		String endtimestring = "";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		if (starttime != null) {
			starttimestring = dateFormat.format(starttime);
		}
		if (endtime != null) {
			endtimestring = dateFormat.format(endtime);
		}

		req.setAttribute("msProductInfo", msProductInfo);
		req.setAttribute("starttimestring", starttimestring);
		req.setAttribute("endtimestring", endtimestring);
		return "msProductInfo/updatemsproduct";
	}

	@RequestMapping(value = "updateMsProduct", method = RequestMethod.POST)
	public String updatemsproduct(HttpServletRequest req, MsProductInfo MsProductInfo) {
		MsProductInfoService.updateMsProductInfo(MsProductInfo);
		return "redirect:listMsProduct";
	}

	@RequestMapping(value = "toupdatemsproductstate")
	public String toupdatemsproductstate(HttpServletRequest req, int id) {
		MsProductInfo MsProductInfo = MsProductInfoService.queryProductById(id);
		Date starttime = MsProductInfo.getStartTime();
		Date endtime = MsProductInfo.getEndTime();
		String starttimestring = "";
		String endtimestring = "";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		if (starttime != null) {
			starttimestring = dateFormat.format(starttime);
		}
		if (endtime != null) {
			endtimestring = dateFormat.format(endtime);
		}

		req.setAttribute("msProductInfo", MsProductInfo);
		req.setAttribute("starttimestring", starttimestring);
		req.setAttribute("endtimestring", endtimestring);
		return "msProductInfo/auditmsproduct";
	}

	@RequestMapping(value = "updateMsProductState", method = RequestMethod.POST)
	public String updateMsProductState(HttpServletRequest req, int id, int state) {
		MsProductInfoService.updateProductState(id, state);
		return "redirect:listMsProduct";
	}
}
