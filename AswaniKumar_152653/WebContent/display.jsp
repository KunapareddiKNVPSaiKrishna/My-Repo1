<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>ID</th>

<th>duration</th>
<th>faculty</th>
<th>mode</th>
<th>Sessions name</th>
</tr>
<a:forEach items="${sessions}" var="session" >
<tr>
<td>${session.id}</td>
<td>${session.duration}</td>
<td>${session.faculty}</td>
<td>${session.mode}</td>
<td>${session.sessionsName}</td>
<td><a href="Enrollme/${session.id}">Enroll Me</a></td>
</tr>
</a:forEach>
</table>
</body>
</html>