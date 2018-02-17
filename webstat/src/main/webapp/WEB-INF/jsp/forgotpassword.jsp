<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/result" method="post">
    <input name="fieldName" type="text" placeholder="contrat"/>
    <input name="fieldName2" type="text" placeholder="origine"/>
    <select name="dropDown">
        <option></option>
        <option>Aujourd'hui</option>
        <option>Hier</option>
        <option>3 derniers jours</option>
        <option>Mois en cour</option>
        <option>Mois précédent</option>
        <option>Personnalisée</option>
    </select>

    <select name="dropDown2">
        <option></option>
        <option>3383 (GPRS SPDH PROD)</option>
        <option>3384 (IP SPDH PROD)</option>
        <option>81101111 (RTC CB2A UBCI)</option>
        <option>81101101 (RTC SPDH SMT PROD)</option>
        <option>81101104 (TMS GEMALTO)</option>
    </select>

    <select name="dropDown3">
        <option></option>
        <option>Autorisation</option>
        <option>Telec/p</option>
        <option>Echec</option>
    </select>




    <input type="submit" value="Submit">
</form:form>

</body>
</html>
