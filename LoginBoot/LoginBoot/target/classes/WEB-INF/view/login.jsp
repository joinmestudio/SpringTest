<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><br><br>
<form:form action="validate" modelAttribute="loginBean" method="post">
Username<form:input path="username"/>
<b style="color:red"><form:errors path="username"/></b><br><br>
Password<form:input path="password"/>
<b style="color:red"><form:errors path="password"/></b><br><br>
<input type="submit" value="Login">
</form:form>
</body>
</html>