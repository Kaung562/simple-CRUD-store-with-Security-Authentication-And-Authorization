<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/styles/store.css">
<title>Insert title here</title>
</head>
<body>

 <div class="content">

  <h1>ADD YOUR CAR INFORMATION</h1><br>
  <form:form action="/saveData" method="Post" modelAttribute="storeData">
        <p>ID</p> <form:input path="storeId"/><br>
        <p>Store Name</p> <form:input path="storeName" /><br>
        <p>Store Number </p> <form:input path="storeNumber" /><br>
        <p>Location</p> <form:input path="location" /><br>
        <input type=submit value="Submit">
        
    </form:form>

    </div>
   
</body>
</html>