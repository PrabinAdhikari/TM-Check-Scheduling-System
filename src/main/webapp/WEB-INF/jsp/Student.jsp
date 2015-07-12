<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>

<c:url  var="sendingPage" value="/student"/>
<p> today's date is: ${date}</p>
<form:form modelAttribute="student" method="POST" action="${sendingPage}" >
<!-- enctype="multipart/form-data" -->
	<table>
		<tr>
			<td><form:input path="name" /> 
			<form:errors path="name" cssStyle="color : red;" /></td>
		</tr>
		<tr>
			<td><form:input path="age" /> 
			<form:errors path="age"	cssStyle="color : red;" /></td>
		</tr>
		<tr>
		<td>
		<button type="Submit">Add</button>
		</td>
		</tr>
		
		

	</table>
</form:form>

