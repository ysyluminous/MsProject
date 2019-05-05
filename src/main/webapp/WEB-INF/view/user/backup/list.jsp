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

<center><a href="toAdd">添加</a></center>

<table border="2">
	<tr>
		<td>用户姓名:</td>
		<td>用户账号:</td>
		<td>用户密码:</td>
		<td>用户性别:</td>
		<td>用户年龄</td>
		<td>用户地址</td>
		<td>用户邮箱</td>
		<td>操作</td>
	</tr>
	<c:forEach items = "${msUserlist }" var ="item">
		<tr>
			<td>${item.userName}</td>
			<td>${item.userAccount}</td>
			<td>${item.userPassword}</td>
			<td>${item.userSex}</td>
			<td>${item.userAge}</td>
			<td>${item.userAddress}</td>
			<td>${item.userEmail}</td>
			<td><a href="queryById?id=${item.id}">查看</a>||<a href="toUpDate?id=${item.id}">修改</a>||<a href="del?id=${item.id}">删除</a></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>