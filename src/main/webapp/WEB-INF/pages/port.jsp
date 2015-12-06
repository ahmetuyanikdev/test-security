<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form>
        This is private port page
    <br>
    <c:url value="/logout" var="logoutUrl" />
    <a href="${logoutUrl}">Log Out</a>
    </form>
</body>
</html>
