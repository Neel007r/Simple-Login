<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //works for HTTP 1.1 refer telusko video
		if(session.getAttribute("username") == null){
			response.sendRedirect("index.jsp");  
		}
	
	%>
	Welcome ${username}
	
	<a href="video.jsp">Videos here</a>
	
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
	
</body>
</html>