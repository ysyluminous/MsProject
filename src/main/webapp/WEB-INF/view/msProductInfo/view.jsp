<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add">
	秒杀商品的id: ${msProductInfo.productId }</br>
		秒杀商品的标题: ${msProductInfo.productTitle }</br>
		秒杀商品的图片地址: ${msProductInfo.productPic }</br>
		秒杀商品价格: ${msProductInfo.miaoshaPrice }</br>
		商家的id: ${msProductInfo.merchant }</br>
		商品原价: ${msProductInfo.productOgPrice }</br>
		秒杀商品的申请时间: ${msProductInfo.applayDate }</br>
		秒杀商品的审核时间: ${msProductInfo.aidotStatus }</br>
		秒杀的开始时间: ${msProductInfo.startTime }</br>
		秒杀的结束时间: ${msProductInfo.endTime }</br>
		秒杀数量: ${msProductInfo.productCount }</br>
		秒杀的库存: ${msProductInfo.stockCount }</br>
		秒杀的描述: ${msProductInfo.description }</br>
</form>
</body>
</html>