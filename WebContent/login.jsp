<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/day30/user_login" method="post">
		name: <input name="admin.userName" type="text" /><br />
		pwd: <input name="admin.pwd" type="password" /><br />
		<!-- age: <input name="age" type="text" /><br />
		birth: <input name="birth" type="text" /><br /> -->
		<input type="submit" />
	</form>
</body>
</html>