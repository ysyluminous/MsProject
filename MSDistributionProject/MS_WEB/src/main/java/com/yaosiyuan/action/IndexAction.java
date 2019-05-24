/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月5日 下午6:49:05
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

import com.yaosiyuan.entity.MsProductDetail;
import com.yaosiyuan.entity.MsProductInfo;
import com.yaosiyuan.service.MsOrderService;
import com.yaosiyuan.service.MsProductDetailService;
import com.yaosiyuan.service.MsProductInfoService;
import com.yaosiyuan.service.redis.MsProductDetailRedisService;
import com.yaosiyuan.service.redis.MsProductInfoRedisService;
import com.yaosiyuan.vo.ConstomProduct;
import com.yaosiyuan.vo.MsProductVo;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月5日 下午6:49:05
 */
@Controller
public class IndexAction {

	@Autowired(required = false)
	MsProductInfoService msProductInfoService;

	@Autowired(required = false)
	MsProductDetailService msProductDetailService;

	@Autowired(required = false)
	MsOrderService msOrderService;

	@Autowired
	MsProductInfoRedisService msProductInfoRedisService;

	@Autowired
	MsProductDetailRedisService msProductDetailRedisService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpServletRequest request) {
		// HttpSession session = request.getSession();
		// OnLine onLine = (OnLine) session.getAttribute("onLine");
		// if (onLine != null) {
		// MsMerchant msMerchant = onLine.getMsMerchant();
		// if (msMerchant != null) {
		//
		// }
		// MsUser msUser = onLine.getMsUser();
		// if (msUser != null) {
		//
		// }
		// }

		MsProductVo msProductVo = new MsProductVo();
		ConstomProduct constomProduct = new ConstomProduct();
		Date now = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowstring = dateFormat.format(now);
		constomProduct.setStartendtime(nowstring);
		constomProduct.setAidotStatus(2);
		msProductVo.setConstomProduct(constomProduct);
		// private Date startstarttime;//秒杀开始时间查询范围开始时间
		// private Date endstarttime;//秒杀开始时间查询范围结束时间
		msProductVo.setConstomProduct(constomProduct);
		List<MsProductInfo> listMsProduct = msProductInfoService.listMsProduct(msProductVo);
		request.setAttribute("listMsProduct", listMsProduct);
		return "index";
	}

	@RequestMapping(value = "/black", method = RequestMethod.GET)
	public String black() {
		return "black";
	}

	@RequestMapping(value = "/viewProductDetail", method = RequestMethod.GET)
	public String viewProductDetail(HttpServletRequest request, int id) {
		MsProductInfo queryProductById = msProductInfoRedisService.queryProductById(id);
		MsProductDetail selectProductDetailByPrimaryKey = msProductDetailRedisService.selectByPrimaryKey(id);
		request.setAttribute("msproduct", queryProductById);
		request.setAttribute("msproductDetail", selectProductDetailByPrimaryKey);
		return "/order/sellDetail";
	}

}
