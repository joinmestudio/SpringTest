<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Welcome to Movie Ticket Booking </center></h1>
	<sf:form action="calculateCost" modelAttribute="ticket" method="post">
	<table>
	<tr>
	<td><sf:label path="movieName">Movie Name</sf:label></td>
	<td><sf:input path="movieName" id="movieName"/></td>
	</tr>
	<tr>
	<td><sf:label path="circleType">Circle Type</sf:label></td>
	<td><sf:select path="circleType" id="circleType" items="${circleList}"/></td>
	</tr>
	<tr>
	<td><sf:label path="noOfTickets">Number of Tickets</sf:label></td>
	<td><sf:input path="noOfTickets" id="noOfTickets"/></td>
		</tr>
	<tr>
	<td><input type="submit" value="CalculateCost" id="submit" name="submit"></td>
	</tr>
	</table>
</sf:form>
            


</body>
</html>	 	  	    	    	     	      	 	
