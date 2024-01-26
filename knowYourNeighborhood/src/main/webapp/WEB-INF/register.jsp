<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/styles/register.css">
<title>Insert title here</title>
</head>
<body>
 <div class="content">

  <h1>Register Now</h1><br>
  <form:form action="/saveUser" method="Post" modelAttribute="userData">
        <p>Name</p> <form:input path="userName" /><br>
        <p>Password</p> <form:input path="password" /><br>
        <p>E-mail</p> <form:input path="userMail" /><br>
        <input type=submit value="Submit">
     
    </form:form>

    </div>
</body>
</html>