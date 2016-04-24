<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welkom in de Brainstormapplicatie</title>
    </head>
    
    <body>
        <h1>Details van persoon</h1>
        <b>Id:</b>
        <c:out value="${contactpersoon.id}" /><br/>
        <b>Achternaam:</b>
        <c:out value="${contactpersoon.achternaam}" /><br/>
        <b>Voornaam:</b>
        <c:out value="${contactpersoon.voornaam}" /><br/>
        <b>E-mailadres:</b>
        <c:out value="${contactpersoon.email}" /><br/>
        <b>Telefoon:</b>
        <c:out value="${contactpersoon.telefoonnummer}" /><br/>
        <b>Status:</b>
        <c:out value="${contactpersoon.status}" /><br/>
        <br/>
        <c:url var="home" value="/home.html" />
        <a href='<c:out value="${home}"/>'>Home</a>
    </body>
</html>
