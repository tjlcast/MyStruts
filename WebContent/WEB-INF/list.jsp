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
	<h1>online people</h1>
	<hr>
	<table border="1" align="center">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>pwd</td>
		</tr>
		<c:forEach items="${requestScope.listAdmin }" var="admin" varStatus="vs">
			<tr>
				<td>${admin.id }</td>
				<td>${admin.userName }</td>
				<td>${admin.pwd }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>