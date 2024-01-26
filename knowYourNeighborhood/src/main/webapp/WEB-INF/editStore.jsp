<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

  <link rel="stylesheet" href="/styles/store.css">
<title>Insert title here</title>
</head>
<body>
 <div class="content">
<form:form action="/saveData" method="Post">
        <input type="hidden" name="storeId" value="${shpE.storeId}">

        <label for="storeName">Brand:</label>
        <input type="text" id="storeName" name="storeName" value="${shpE.storeName}"><br>

        <label for="storeNumber">Year:</label>
        <input type="text" id="storeNumber" name="storeNumber" value="${shpE.storeNumber}"><br>

        <label for="location">Price:</label>
        <input type="text" id="location" name="location" value="${shpE.location}"><br>

        <input type="submit" value="Update">
    </form:form>

    </div>
</body>
</html>