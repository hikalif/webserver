<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Log in</title>
</head>
<body>
		<form id="form1" name="form1" method="get" action="../LoginServlet">
			<div>User:<input type="text" name="userid"/></div>
			<div>Password:<input type ="password" name="password"></div>
				<input type="submit" name="submit" value="登录"/>
		</form>
		<form action="signup.jsp">
			<input type="submit" name="submit" value="注册"/>
		</form>
</body>
</html>