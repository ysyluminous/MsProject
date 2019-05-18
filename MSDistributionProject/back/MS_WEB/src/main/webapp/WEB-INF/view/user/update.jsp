<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="upDate" method="post">
<input name="id" value="${msUser.id }" type="hidden"/>
             用户姓名:<input name="userName" value="${msUser.userName }"></br>
	用户账号:<input name="userAccount" value="${msUser.userAccount }"></br>
	用户密码:<input name="userPassword" value="${msUser.userPassword }"></br>
	用户性别:<input name="userSex" value="${msUser.userSex }"></br>
	用户年龄:<input name="userAge" value="${msUser.userAge }"></br>
	用户的地址:<input name="userAddress" value="${msUser.userAddress}" ></br>
	用户的邮箱:<input name="userEmail" value="${msUser.userEmail }"></br>
	<input type="button" value="提交" onclick="submit(this)">
</form>
</body>
<script type="text/javascript">
	function submit(obj){
		obj.parent.sumbit();
	}
</script>
</html>