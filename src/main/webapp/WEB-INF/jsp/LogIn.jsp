<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TM-Check Scheduling</title>

<!-- <link rel="stylesheet" type="text/css" href="./cssFiles/MyStyle.css"> -->
<link type="text/css" rel="stylesheet" href="<c:url value='resources/cssFiles/MyStyle.css'/>"/>
<link type="text/css" rel="stylesheet" href="<c:url value='resources/cssFiles/style.css'/>"/>

</head>
<body>
<div class="logInContext">
	<form action="check" method="post">
		<div class="form-group">
			<label for="UserName">User Name</label> 
			<input type="text" class="form-control" name="userName" placeholder="Prabin Adhikari" required="required">
		
			<label  for="password"> Password</label> 
			<input	type="password" class="form-control" name="password" placeholder="Password" required="required">
		</div>
	
		<div class="checkbox">
			<label> <input type="checkbox"> Remember me </label>
		</div>
		<button type="submit" class="btn btn-default" value="Login">Sign in</button>
	</form>
	</div>
</body>
</html>