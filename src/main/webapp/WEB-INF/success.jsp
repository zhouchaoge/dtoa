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
<table border="1"  width="1000px" height="500px">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>real_name</td>
			<td>pass</td>
			<td>real_pass</td>
		</tr>
<c:forEach items="${list}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.realName }</td>
			<td>${user.pass}</td>
			<td>${user.realPass }</td>
		</tr>            
</c:forEach>

	</table>
	
</body>
</html>