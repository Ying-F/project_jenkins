<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Qui suis-je ?</title>
</head>
<body>

 <% 
  String name = "tata";
  String repons =fr.isika.andre.WhoIam.whoAreYou(name);
  out.println("<h2>"+repons+"<h2>");
  %>
</body>
</html>