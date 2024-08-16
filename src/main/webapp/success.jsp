<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<h1><marquee>You have Registered Successfully</marquee></h1>
<% String name=(String)session.getAttribute("name"); %>
<h2> hey! <%= name%> you have registered to this page successfully</h2>
</body>
</html>