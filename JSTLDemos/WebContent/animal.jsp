<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="animal_name" value="${param.animal }"> </c:set>
<c:choose>
	<c:when test="${animal_name == 'tiger'}">
		its a tiger roaaaaarrrr
		
	</c:when>
	<c:when test="${animal_name == 'cat'}">
		its a tiger meowrr
		</c:when>
<c:when test="${animal_name == 'lion'}">
		its a lion
		
	
	</c:when>
	<c:when test="${animal_name eq 'elephant'} ">
		it is an elephant
		
	</c:when>
	<c:otherwise>
	invalid choice
	</c:otherwise>
</c:choose>



</body>
</html>