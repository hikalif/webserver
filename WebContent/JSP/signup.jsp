<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign up</title>
</head>
<body>
	<div>注册</div>
	<form method="get" action="../SignupServlet">
		<div>用户:<input type="text" name="id"/></div>
		<div>密码:<input type="password" name="password"/></div>
		<div>姓名:<input type="text" name="name"/> </div>
		<div>邮箱:<input type="text" name="email"/> </div>
		<div>电话:<input type="text" name="phone"/> </div>
		<div><input type="submit" name="re_submit" value="提交"/></div>
	</form>
</body>
</html>