<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<title>Spring MVC dropdown box</title>
</head>

<body>
<h2>choooooose</h2>




<form:form method="POST" commandName="find">
    <table>
        <tr>
            <td>Please select:</td>
            <td><form:select path="periode">
                <form:option value="" label="...." />
                <form:options items="${colours}" />
            </form:select>
            </td>
            <td><form:errors path="periode" cssStyle="color: #ff0000;" /></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Submit"></td>
        </tr>
        <tr>
    </table>
</form:form>

</body>
</html>