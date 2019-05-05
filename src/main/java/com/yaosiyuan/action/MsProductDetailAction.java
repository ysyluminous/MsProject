/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 下午4:36:40
*/
package com.yaosiyuan.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yaosiyuan.entity.MsProductDetail;
import com.yaosiyuan.service.MsProductDetailService;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 下午4:36:40
 */
@Controller
@RequestMapping("msProductDetailAction")
public class MsProductDetailAction {
	@Autowired
	private MsProductDetailService msProductDetailService;

	@RequestMapping(value = "toInsertMsProductDetail")
	public String toinsertMsproductdetail(HttpServletRequest req, int productId, int merchant) {

		// 新增前先查询是否存在，如果存在跳转到更新页面
		MsProductDetail msProductDetail = msProductDetailService.selectByPrimaryKey(productId);
		if (msProductDetail != null) {
			Integer existproductId = msProductDetail.getProductId();
			req.setAttribute("msProductDetail", msProductDetail);
			return "msProductDetail/toupdateMsproductdetail";
		}
		req.setAttribute("productId", productId);
		req.setAttribute("merchant", merchant);

		return "msProductDetail/toinsertMsproductdetail";
	}

	@RequestMapping(value = "insertMsproductdetail", method = RequestMethod.POST)
	public String insertMsproductdetail(MsProductDetail msproductdetail) {
		msProductDetailService.insert(msproductdetail);
		return "redirect:/msProductAction/listMsProduct";
	}

	@RequestMapping(value = "queryMsproductdetailByid")
	public String queryMsproductdetailByid(HttpServletRequest req, int productId) {
		MsProductDetail msProductDetail = msProductDetailService.selectByPrimaryKey(productId);
		req.setAttribute("msProductDetail", msProductDetail);
		return "msProductDetail/msproductdetailview";
	}

	@RequestMapping(value = "toupdateMsproductdetail")
	public String toupdateMsproductdetail(HttpServletRequest req, int productId) {
		MsProductDetail msProductDetail = msProductDetailService.selectByPrimaryKey(productId);
		req.setAttribute("msProductDetail", msProductDetail);
		return "msProductDetail/toupdateMsproductdetail";
	}

	@RequestMapping(value = "updateMsproductdetail", method = RequestMethod.POST)
	public String updateMsproductdetail(HttpServletRequest req, MsProductDetail msProductDetail) {
		msProductDetailService.updateByPrimaryKey(msProductDetail);
		return "redirect:/msProductAction/listMsProduct";
	}
}
