<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
<!DOCTYPE html>
<html>
<head>
<%@page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2> Register </h2>

<form:form action="registerUser" method="POST" modelAttribute="registerModel">

	<form:errors path="userName" style="color:red"/>
	<label> User Name: </label> <form:input path="userName" /><br/>
	

	<form:errors path="userPassword" style="color:red"/>
	<label> User Password: </label> <form:password path="userPassword"/><br/>
	
	
	<form:errors path="userEmail" style="color:red"/>
	<label> User Email: </label> <form:input path="userEmail"/> <br/>
	
	
	<label> User Address: </label> <form:input path="userAddress"/><br/>
	
	<form:errors path="userPhone" style="color:red"/>
	<label> User Phone: </label> <form:input path="userPhone"/><br/>
	
	
	<label> User Role: </label> <form:input path="userRole"/> <br/>
	
	<form:button value="Register"> RegisterUser </form:button>

</form:form>


</body>
</html>