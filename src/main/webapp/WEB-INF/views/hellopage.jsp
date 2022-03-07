<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Spring MVC Example</title>
</head>
<body>


<h3> ${helloworld.message}</h3>
<h4> Server Date and time is : ${helloworld.dateTime}</h4>

<h2> <a href="showRegisterPage"> Click Here </a> To Register </h2>.



</body>
</html>