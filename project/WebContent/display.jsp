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
<table border="5px solid black">
<tr>
<th>ID</th>
<th>Sessions name</th>
<th>Duration</th>
<th>Faculty</th>
<th>mode</th>
</tr>
<a:forEach items="${Schedules}" var="schedule" >
<tr>
<td>${schedule.id}</td>
<td>${schedule.sessionsName}</td>
<td>${schedule.duration}</td>
<td>${schedule.faculty}</td>
<td>${schedule.mode}</td>
<td><a href="Enrollme/${schedule.id}">Enroll Me</a></td>
</tr>
</a:forEach>
</table>

</body>
</html>