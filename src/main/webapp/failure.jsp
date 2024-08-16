<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failure</title>
</head>
<body>
<h1>Failed to Registered</h1>
<% String name=(String)session.getAttribute("name"); %>
<h2> hey! <%= name%> you have failed to registered this page</h2>
</body>
</html>