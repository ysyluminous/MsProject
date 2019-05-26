/**
 * @description: 功能描述：()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author: 
 * @version: 2.0
 * @date: 2019 2019年5月9日 上午10:25:52
*/
package com.yaosiyuan.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yaosiyuan.entity.MsOrder;
import com.yaosiyuan.entity.MsProductInfo;
import com.yaosiyuan.entity.OnLine;
import com.yaosiyuan.service.MsOrderService;
import com.yaosiyuan.service.MsProductInfoService;
import com.yaosiyuan.service.pay.AliPay;
import com.yaosiyuan.service.pay.WxPay;
import com.yaosiyuan.service.pay.YlPay;
import com.yaosiyuan.service.redis.MsProductDetailRedisService;
import com.yaosiyuan.service.redis.MsProductInfoRedisService;
import com.yaosiyuan.service.redis.OrderRedisService;
import com.yaosiyuan.vo.order.ConstomOrder;

/**
 * @description: 功能描述 ()
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月9日 上午10:25:52
 */
@Controller
@RequestMapping("orderAction")
public class OrderAction {

	@Autowired
	MsOrderService msOrderService;

	@Autowired
	MsProductInfoService msProductInfoService;

	@Autowired
	AliPay aliPay;

	@Autowired
	WxPay wxPay;

	@Autowired
	YlPay ylPay;

	@Autowired
	MsProductInfoRedisService msProductInfoRedisService;

	@Autowired
	MsProductDetailRedisService msProductDetailRedisService;

	@Autowired
	OrderRedisService orderRedisService;

	/**
	 * 
	 * @description: 功能描述： (用户退款)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月9日 下午2:29:38
	 * @return
	 */
	@RequestMapping(value = "applyRefund")
	public String applyRefund(HttpServletRequest request, Integer orderId, Integer payType) {

		HttpSession session = request.getSession();
		OnLine onLine = (OnLine) session.getAttribute("onLine");
		if (onLine == null) {
			return "redirect:/";
		}

		//数据库退款
//		msOrderService.updateOrderStatusById(4, orderId, payType);
		return "redirect:queryOrderByUserId";

	}

	/**
	 * 
	 * @description: 功能描述： (商户审核退款)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月9日 下午2:29:38
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "auditRefund")
	public String auditRefund(HttpServletRequest request, String tradeId, Integer payAmount, Integer orderId,
			Integer payType, Integer payStatus) {

		HttpSession session = request.getSession();
		OnLine onLine = (OnLine) session.getAttribute("onLine");
		if (onLine == null) {
			return "redirect:/";
		}

		if (payStatus == 3) {
			int payStatusTemp = 2;
			// 支付宝
			if (payType == 1) {
				payStatusTemp = aliPay.refundOrder(tradeId, payAmount);
				// 微信
			} else if (payType == 2) {
				payStatusTemp = wxPay.refundOrder(tradeId, payAmount);
				// 银联
			} else if (payType == 3) {
				payStatusTemp = ylPay.refundOrder(tradeId, payAmount);
			}

			// 如果退款成功
			if (payStatusTemp == 1) {
				msOrderService.updateOrderStatusById(payStatus, orderId, payType);
			}

		} else if (payStatus == 5) {
			msOrderService.updateOrderStatusById(payStatus, orderId, payType);
		}

		return "order/orderListByMer";

	}

	/**
	 *
	 * @description: 功能描述： (通过用户id查询订单)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月9日 下午2:29:38
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "orderListByMerId")
	public String orderListByMerId(HttpServletRequest request) {

		HttpSession session = request.getSession();
		OnLine onLine = (OnLine) session.getAttribute("onLine");
		if (onLine == null) {
			return "redirect:/";
		}
		Integer merchantId = onLine.getMsMerchant().getId();

		List<MsOrder> orderList = msOrderService.queryOrderListByMerId(merchantId);
		request.setAttribute("orderList", orderList);
		return "order/orderListByMer";

	}

	/**
	 * 
	 * @description: 功能描述： ()
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月9日 下午8:13:05
	 * @param request
	 * @param payType
	 *            1，代表支付宝 2,代表微信，3,代表银联
	 * @param tradeId
	 * @param payAmount
	 * @return
	 */
	@RequestMapping(value = "orderPay", method = RequestMethod.POST)
	public String orderPay(HttpServletRequest request, Integer payType, Integer userId, Integer productId,
			Integer merchantId, String tradeId, Integer payAmount) {
		Integer payStatus = 2;
		// 支付宝
		if (payStatus == 1) {
			payStatus = aliPay.payOrder(tradeId, payAmount);
			// 微信
		} else if (payStatus == 2) {
			payStatus = wxPay.payOrder(tradeId, payAmount);
			// 银联
		} else if (payStatus == 3) {
			payStatus = ylPay.payOrder(tradeId, payAmount);
		}

		// 如果支付成功
		if (payStatus == 1) {
			// msOrderService.updateOrderStatusById(2, userId, payType);
			boolean isSuccess = orderRedisService.payOrder(payType, userId, productId, merchantId, tradeId, payAmount);
			if (isSuccess) {
				System.out.println("保存成功");
			} else {
				System.out.println("保存失败");
			}

		}
		return "redirect:queryOrderByUserId";

	}

	/**
	 * 
	 * @description: 功能描述： (通过用户id查询订单)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月9日 下午2:29:38
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "queryOrderByUserId")
	public String queryOrderByUserId(HttpServletRequest request) {

		HttpSession session = request.getSession();
		OnLine onLine = (OnLine) session.getAttribute("onLine");
		if (onLine == null) {
			return "redirect:/userRegAndLogAction/toLogin";
		}

		Integer userId = onLine.getMsUser().getId();

		List<MsOrder> orderList = orderRedisService.queryOrderByUserId(userId);
		// List<MsOrder> orderList = msOrderService.queryOrderByUserId(userId);
		request.setAttribute("orderList", orderList);
		return "order/orderList";

	}

	@RequestMapping(value = "payOrder", method = RequestMethod.POST)
	public String payOrder(HttpServletRequest request, ConstomOrder msOrder) {
		// Date now = new Date();
		// msOrder.setCreateTime(now);
		// int payStatus = 1;
		// msOrder.setPayStatus(payStatus);
		// String tradeId = UUID.randomUUID().toString();
		// msOrder.setTradeId(tradeId);
		//
		// msOrderService.insert(msOrder);

		HttpSession session = request.getSession();
		OnLine onLine = (OnLine) session.getAttribute("onLine");
		if (onLine == null) {
			return "redirect:/userRegAndLogAction/toLogin";
		}
		Map<String, Object> resultMap = orderRedisService.secKill(msOrder.getUserId(), msOrder.getProductId(), msOrder);
		boolean isSuccess = (boolean) resultMap.get("success");

		if (isSuccess) {
			System.out.println("秒杀成功");

			// Integer id, String tradeId, Integer payAmount
			Map<String, String> dataMap = (Map<String, String>) resultMap.get("dateMap");
			String merchantId = dataMap.get("merchantId");
			String productId = dataMap.get("productId");
			String payAmount = dataMap.get("payAmount");
			String tradeId = dataMap.get("tradeId");
			String userId = dataMap.get("userId");
			return "redirect:toPayWithOrder?userId=" + userId + "&&productId=" + productId + "&&tradeId=" + tradeId
					+ "&&payAmount=" + payAmount + "&&merchantId=" + merchantId;
		} else {
			System.out.println("秒杀失败");
		}
		return "redirect:/";

	}

	/**
	 * 
	 * @description: 功能描述： (跳转到支付页面)
	 * @author: yaosiyuan
	 * @version: 2.0
	 * @date: 2019 2019年5月9日 下午8:13:05
	 * @param request
	 * @param payType
	 *            1，代表支付宝 2,代表微信，3,代表银联
	 * @param tradeId
	 * @param payAmount
	 * @return
	 */
	@RequestMapping(value = "toPayWithOrder")
	public String toPayWithOrder(HttpServletRequest request, Integer userId, Integer productId, Integer merchantId,
			String tradeId, Integer payAmount) {

		request.setAttribute("userId", userId);
		request.setAttribute("productId", productId);
		request.setAttribute("merchantId", merchantId);
		request.setAttribute("tradeId", tradeId);
		request.setAttribute("payAmount", payAmount);
		return "order/payReal";

	}

	@RequestMapping("toPayOrder")
	public String toPayOrder(HttpServletRequest request, MsOrder msOrder, int id, int num) {
		HttpSession session = request.getSession();
		OnLine onLine = (OnLine) session.getAttribute("onLine");
		if (onLine == null) {
			return "redirect:/userRegAndLogAction/toLogin";
		}
		// 数据库查询商品详情
		// MsProductInfo msProductInfo =
		// msProductInfoRedisService.queryProductById(id);

		// 缓存查询商品详情
		MsProductInfo msProductInfo = msProductInfoRedisService.queryProductById(id);
		request.setAttribute("msProductInfo", msProductInfo);
		request.setAttribute("num", num);

		int payamount = num * msProductInfo.getMiaoshaPrice();
		request.setAttribute("payAmount", payamount);
		request.setAttribute("msUserId", onLine.getMsUser().getId());

		int payAmount = msProductInfo.getMiaoshaPrice() * num;

		return "order/payOrder";

	}
}
