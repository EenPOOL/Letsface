<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welkom in de Brainstormapplicatie</title>
    </head>
    
    <body>
        <h1>Lijst van de contactpersonen</h1>
        <ul>
            <c:forEach items="${personen}" var="persoon">
                <c:url var="persoonUrl" value="/contactpersoon.html">
                    <c:param name="id" value="${persoon.id}" />
                </c:url>
                <li>
                    <a href='<c:out value="${persoonUrl}"/>'>
                        <c:out value="${persoon.achternaam}" />
                        <c:out value="${persoon.voornaam}" />
                    </a>
                    
                </li>
            </c:forEach>
        </ul>
        <c:url var="nieuweContactpersoonUrl" value="/nieuweContactpersoon.html" />
        <a href='<c:out value="${nieuweContactpersoonUrl}"/>'>Contactpersoon toevoegen</a>
    </body>
</html>
