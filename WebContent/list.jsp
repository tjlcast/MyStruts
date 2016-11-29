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
	<table border="1">
		<tr>
			<td>序号</td>
			<td>文件名</td>
			<td>操作</td>
		</tr>

		<c:forEach items="${requestScope.files }" var="file" varStatus="vs">
			<tr>
				<td>${vs.count }</td>
				<td>${file }</td>
				<td><a href="${pageContext.request.contextPath }/study/down_downFile?fileName=${file}">下载</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>