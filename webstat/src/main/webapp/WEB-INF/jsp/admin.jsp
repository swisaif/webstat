<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Spring Security Example </title>
</head>
<body>

<h1 style="color:blue"> Hello! This is Admin Page!</h1>

<a style="color:blue" href="/">Go to Home Page</a>

<br/>

<form action="/logout" method="post">
    <input type="submit" value="Sign Out"/>
</form>



</body>
</html>