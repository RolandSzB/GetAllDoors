<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.Doors" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Doors</h1>
<% ArrayList<Doors> door =(ArrayList<Doors>) request.getAttribute("door");  %>
<p> Number of doors: <%=door.size() %> </p>
<table border="2">
	<tr>
		<th> ID </th> 
		<th> Brand </th>
		<th> Price </th>
	</tr> 
	<% for(Doors w:door){ %>
	<tr>
		<td><a href="doors/<%= w.getId() %>"><%= w.getId() %></td>
		<td><%= w.getMaterial() %></td>
		<td><%= w.getHeight() %></td>
		<td><%= w.getWidth() %></td>
		<td><%= w.getInstallationDate() %></td>
	</tr>
<%} %>	
</table>
</body>
</html>
