<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateMsProduct" method="post">
<input name="id" value="${msProductInfo.id }" type="hidden">
	商品id:<input name="productId" value="${msProductInfo.productId }"></br>
	商品标题:<input name="productTitle" value="${msProductInfo.productTitle }"></br>
	商品图片地址:<input name="productPic" value="${msProductInfo.productPic }"></br>
	秒杀价格:<input name="miaoshaPrice" value="${msProductInfo.miaoshaPrice }"></br>
	商品原价:<input name="productOgPrice" value="${msProductInfo.productOgPrice }"></br>
	秒杀开始时间:<input name="startTimeString" value="${starttimestring }"></br>
	秒杀结束时间:<input name="endTimeString" value="${endtimestring}"></br>
	秒杀商品数量:<input name="productCount" value="${msProductInfo.productCount }"></br>
	库存:<input name="stockCount" value="${msProductInfo.stockCount }"></br>
	描述:<input name="description" value="${msProductInfo.description }"></br>
	<input type="button" value="提交" onclick="submit(this)">
</form>
</body>
<script type="text/javascript">
	function submit(obj){
		obj.parent.sumbit();
	}
</script>
</html>