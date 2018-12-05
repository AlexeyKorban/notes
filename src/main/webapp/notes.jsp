<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alexey.Korban
  Date: 15.11.2018
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Notes</title>
</head>
<body>
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>Content</th>
        <th>Created</th>
        <th>Done</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <c:forEach items="${notes}" var="note">
        <jsp:useBean id="note" scope="page" type="ru.ldwx.notes.model.Note"/>
        <tr>
            <td>${note.content}</td>
            <td>
                    ${note.created.toLocalDate()} ${note.created.toLocalTime()}
            </td>
            <td>${note.done}</td>
            <td></td>
            <td></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
