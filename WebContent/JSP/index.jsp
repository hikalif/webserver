<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="../css/style.css" rel='stylesheet' type='text/css'/>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<!--webfonts-->
<link href='http://fonts.googleapis.com/css?family=Oxygen:400,300,700|Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'/>
<!--//webfonts-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>同城游后台管理系统</title>
</head>
		
<body>
	<div class="main">
		<div class="user">
			<img src="../images/user.png" alt="">
		</div>
		<div class="login">
			<div class="inset">
				<!-----start-main---->
				<form id="login_form" name="login_form" method="get" action="../LoginServlet">
			         <div>
						<span><label>Username</label></span>
						<span><input type="text" class="textbox" id="active" name="userid_input"></span>
					 </div>
					 <div>
						<span><label>Password</label></span>
					    <span><input type="password" class="password" name="password_input"></span>
					 </div>
					<div class="sign">
						<div class="submit">
						  <input type="submit" value="LOGIN" >
						</div>
						<span class="forget-pass">
							<a href="#">Forgot Password?</a>
						</span>
							<div class="clear"> </div>
					</div>
				</form>
			</div>
		</div>
		<!-----//end-main---->
		</div>
		 <!-----start-copyright---->
   					<div class="copy-right">
						<p>Create by <a href="http://w3layouts.com">our web group</a></p> 
					</div>
		<!-----//end-copyright---->
	 
</body>
</html>