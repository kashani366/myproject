<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sara
  Date: 8/26/2020
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table  border="1" >
    <tr>
        <th > ID</th>
        <th>cardNumber</th>
        <th> cvv2</th>
        <th>secendPasword </th>
        <th> math</th>
        <th> sal</th>
    </tr>
    <c:forEach items="${pays}" var="pay">
    <tr>
        <td> ${pay.id}</td>
        <td> ${pay.cardNumber}</td>
        <td> ${pay.cvv2}</td>
        <td> ${pay.secendPasword}</td>
        <td> ${pay.month}</td>
        <td> ${pay.year}</td>
    </tr>
    </c:forEach>

</table>
</table>


</body>
</html>
