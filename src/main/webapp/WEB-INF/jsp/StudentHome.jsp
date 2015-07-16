<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p align="center">
	
			${counter.count}<br>
			Your Group TM check is ${countGroup}<br>
			Your Individual TM check is ${countIndividual}<br>

			Your next appointment is ${appointmentDate} and time is	${start} to ${end}<br>
				Status of Your next appointment is ${status}<br>
</p>			

</body>
</html>