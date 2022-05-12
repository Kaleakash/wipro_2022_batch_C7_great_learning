<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Simple HTML Page</h1>
<%!int a,b,sum; %>
<%
	//int a;
	//int b;
	//int sum = a+b;
	a=10;
	b=20;
	sum = a+b;
	out.println("Welcome to JSP Page");
	out.println("Sum of two number is "+sum);
%>

<b>Sum of two number is <%=sum %> </b>
<font color="red">Sum of <%=a %> and <%=b %> is <%=sum %></font>
</body>
</html>