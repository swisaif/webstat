<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body>
<br>
<form class="form-inline" action="/save" method="post">
    <div class="form-group">
        <input type="hidden" name="oper_id" value="${lists.oper_id}"/><br/>

    </div>

    <div class="form-group mx-sm-3">
        <input type="text" class="form-control" name="oper_name" value="${lists.oper_name}"/>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

</form>


</body>
</html>
