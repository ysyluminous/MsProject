<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="update"> 
			id:${merchant.id}" 
	商家的姓名:${merchant.merchantName}">
	商家的店铺名称:	${merchant.merchantShopName}
	商家账号:		${merchant.merchantAccount}
	商家密码:		${merchant.merchantPassword}
	商家经营范围:	${merchant.merchantScope}
</form>

</body>
<script type="text/javascript">
		function submit(obj){
			 obj.parent.submit();
		}

</script>
</html>