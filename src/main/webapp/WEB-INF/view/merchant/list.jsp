<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach items = "${msMerchantList }" var ="item">
	商家的id:${item.id }
	商家的姓名:${item.merchantName}"
	商家的店铺名称:	${item.merchantShopName}
	商家账号:		${item.merchantAccount}
	商家密码:		${item.merchantPassword}
	商家经营范围:	${item.merchantScope}<br/>

</c:forEach>

</body>
<script type="text/javascript">
		function submit(obj){
			 obj.parent.submit();
		}

</script>
</html>