<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Create</title>
</head>
<body>
	<h2>Create Lead</h2>
	<hr>
	<form action="saveOneLead" method="post">
		<pre>
			First Name:   <input type="text" name="firstName" required />
			Last Name:    <input type="text" name="lastName" required />
			Lead Source:  <select name="leadSource">
						     <option value="radio_channel">Radio Channel</option>
						     <option value="news_paper">News Paper</option>
						     <option value="tv">TV</option>
						     <option value="online">Online</option>
						  </select> 
			Email:        <input type="email" name="email" required />
			Mobile Number:<input type="number" name="mobile" max="10" min="10" required/>
			<input type="submit" value="SAVE"/>
		</pre>
	</form>
	<div>
		${errorMsg}
	</div>
</body>
</html>