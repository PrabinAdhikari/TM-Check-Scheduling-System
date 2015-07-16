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
	hello
	<table>
		<c:forEach items="${appointmentList}" var="applist">
			<tr>
				<td>${applist.uid}</td>
				<td>${applist.appointmentDate}</td>
				<td>${applist.session.location.address}</td>
				<td>${applist.session.start}to ${applist.session.end}</td>
				<td>${applist.teacher.user.name}</td>
				<td>${applist.status}</td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>