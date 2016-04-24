<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welkom in de LetsFaceapplicatie</title>
    </head>
    
    <body>
        <h1>Contactersoon toevoegen</h1>
        <c:url var="url" value="/nieuweContactpersoon.html" />
        <form:form action="${url}" commandName="decontactpersoon">   <%-- Spring form tags --%>
            <fieldset>
                <div><label>Achternaam:</label><form:input path="achternaam"/></div>
                <div><label>Voornaam:</label><form:input path="voornaam"/></div>
                <div><label>E-mailadres:</label><form:input path="email"/></div>
                <div><label>Telefoon:</label><form:input path="telefoon"/></div>
                <div><label>Status:</label><form:input path="status"/></div>
                <div><input name="submit" type="submit" value="save"/></div>
            </fieldset>
        </form:form>
    </body>
</html>
