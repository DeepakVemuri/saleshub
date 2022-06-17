<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View | Contact</title>
</head>
<body>
	<h2>Contact Saved!</h2>
	<hr>
	Id: ${contact.id}<br/>
	First Name: ${contact.firstName}<br/>
	Last Name: ${contact.lastName}<br/>
	Lead Source: ${contact.leadSource}<br/>
	Email: ${contact.email}<br/>
	Mobile Number: ${contact.mobile}<br/>
	<form action="composeEmail" method="post">
	<input type="hidden" name="email" value ="${contact.email}"/>
	<input type="submit" value = "Send Email"/>
	</form>
</body>
</html>