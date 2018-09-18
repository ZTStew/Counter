<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visit Counter</title>
</head>
<body>
	<div id = "main">
		<h1>Visit Count: <c:out value="${count}"></c:out></h1>
		
		<form action="/count5" method = "post">
			<input type="submit" value="Count + 5">
		</form>
		<form action="/count10" method = "post">
			<input type="submit" value="Count + 10">
		</form>
		<form action="/clear" method = "post">
			<input type="submit" value="Reset Count">
		</form>
	</div>
</body>
</html>