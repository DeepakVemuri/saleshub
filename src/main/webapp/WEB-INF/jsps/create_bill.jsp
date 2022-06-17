<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill | Create</title>
</head>
<body>
	<h2>Generate Bill</h2>
	<hr>
	<form action="saveBill" method="post">
		<pre>
			Customer Id:  <input type="text" name="bid" value="${contact.id}" readonly/>
			First Name:   <input type="text" name="firstName" value="${contact.firstName}" readonly/>
			Last Name:    <input type="text" name="lastName" value="${contact.lastName}" readonly />
			Email:        <input type="email" name="email" value="${contact.email}" readonly />
			Mobile Number:<input type="number" name="mobile" value="${contact.mobile}" readonly/>
			Product Name: <input type="text" name="productName" required/>
			Amount:       <input type="text" name="amount" required/>			
			<input type="submit" value="Generate Bill"/>
		</pre>
	</form>
</body>
</html>