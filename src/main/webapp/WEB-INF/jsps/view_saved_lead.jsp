<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View | Lead</title>
</head>
<body>
	<h2>Lead Saved!</h2>
	<hr>
	Id: ${lead.id}<br/>
	First Name: ${lead.firstName}<br/>
	Last Name: ${lead.lastName}<br/>
	Lead Source: ${lead.leadSource}<br/>
	Email: ${lead.email}<br/>
	Mobile Number: ${lead.mobile}<br/>
	<form action="composeEmail" method="post">
	<input type="hidden" name="email" value ="${lead.email}"/>
	<input type="submit" value = "Send Email"/>
	</form>
	<form action="convertLead" method="post">
	<input type="hidden" name="id" value="${lead.id}"/>
	<input type="submit" value="Convert"/>
	</form>	
	${msg}
</body>
</html>