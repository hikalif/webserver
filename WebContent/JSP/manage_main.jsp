<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main page</title>
</head>
<body>
	<form method="get" action="">
	<table>
		<tr>
			<td>个人信息</td>
		</tr>
		<tr>
			<td>账号:</td>
			<td><input type="text" name="personal_id"/></td>
		</tr>
		<tr>
			<td>名称:</td>
			<td><input type="text" name="personal_name"/></td>
		</tr>
	</table>
	</form>
	<br/>
	<form method="get" action="">
		<div>处理用户信息</div>
		<div>账号:<input type="text" name="query_id"/></div>
		<div><input type="submit" name="delete" value="删除"></div>
	</form>
</body>
</html>