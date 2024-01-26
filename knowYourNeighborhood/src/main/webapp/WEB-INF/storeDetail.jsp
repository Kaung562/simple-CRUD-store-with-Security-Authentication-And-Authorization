<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<link rel="stylesheet" href="/styles/storedetail.css">
</head>
<body>
<h1>STORE INFORMATION</h1><br>
<table>
  
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Number</th> 
    <th>Location</th>
    <th></th>
    <th></th>
  </tr>
<c:forEach var="shp" items="${storeD}">
  <tr> 
 <td>${shp.storeId}</td>
 <td>${shp.storeName}</td>
 <td>${shp.storeNumber}</td> 
 <td>${shp.location}</td>
 <td><a href="<c:url value='/edit/${shp.storeId}' />">Edit</a></td>
 <td><a href="/deletedata/?shpid=${shp.storeId}">DELETE</a></td>
</tr>
</c:forEach>
</table>
<a href='/addStore'>ADD MORE Store</a>
</body>
</html>