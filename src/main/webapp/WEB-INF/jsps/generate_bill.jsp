<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View | Bill</title>
</head>
<body>
	<h2>Billing Details</h2>
	<hr>
	Customer Id: ${bill.bid}<br/>
	First Name: ${bill.firstName}<br/>
	Last Name: ${bill.lastName}<br/>
	Email: ${bill.email}<br/>
	Mobile Number: ${bill.mobile}<br/>
	Product Name: ${bill.productName}<br/>
	Amount: ${bill.amount}<br/>
	<form action="composeEmail" method="post">
	<input type="hidden" name="email" value ="${bill.email}"/>
	<input type="submit" value = "Send Email"/>
	</form>
</body>
</html>