<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color:lavender">
<table>
<h1><center> Welcome to Online Help Services </center></h1>
<sf:form action="register" modelAttribute="register" method="post">
<tr>
<td>UserName:</td>
<td> <sf:input path="userName"/></td>
<td><sf:errors path="userName"/></td><br>
</tr>
<tr>
<td>Contact Number</td>
<td><sf:input path="contactNumber"/></td>
<td><sf:errors path="contactNumber"/></td><br>
</tr>
<tr>
<td>Email Id</td>
<td><sf:input path="emailId"/></td>
<td><sf:errors path="emailId"/></td><br>
</tr>
<tr>
<td>Confirm Email Id</td>
<td><sf:input path="confirmEmailId"/></td>
<td><sf:errors path="confirmEmailId"/></td><br>
</tr>
<tr>
<td><sf:checkbox path="status"/></td>
<td> I agree</td>
<td><sf:errors path="status"/></td><br>
</tr>
<tr>
<td><input type="submit" value="Register"></td>
<td><input type="reset" value="Cancel"></td>
</tr>
</sf:form>
</table>

</body>
</html>	 	  	    	    	     	      	 	
