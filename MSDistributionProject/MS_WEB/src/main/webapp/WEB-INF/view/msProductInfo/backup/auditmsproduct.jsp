<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateMsProductState" method="post">
<input name="id" value="${msProductInfo.id }" type="hidden">
	商品id:${msProductInfo.productId }"</br>
	商家id:${msProductInfo.merchant }"</br>
	商品标题:${msProductInfo.productTitle }</br>
	商品图片地址:${msProductInfo.productPic }</br>
	秒杀价格:${msProductInfo.miaoshaPrice }</br>
	商品原价:${msProductInfo.productOgPrice }</br>
	秒杀开始时间:${starttimestring }</br>
	秒杀结束时间:${endtimestring}</br>
	秒杀商品数量:${msProductInfo.productCount }</br>
	库存:${msProductInfo.stockCount }</br>
	描述:${msProductInfo.description }</br>
	审核通过:<input type="radio" name="state" value="2">
	审核不通过:<input type="radio" name="state" value="3">
	<input type="button" value="提交" onclick="submit(this)">
</form>
</body>
<script type="text/javascript">
	function submit(obj){
		obj.parent.sumbit();
	}
</script>
</html>