<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sara
  Date: 8/18/2020
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <c:if test="${message ne null}"
  > ${message}</c:if>
  <form action="/pay/insert" method="post">
    cardNumber:<input type="text" name="cardNumber"><br>
    secendPasword:<input type="text" name="secendPasword"><br>
    cvv2:<input type="text" name="cvv2"><br>
    month:<input type="text" name="month"><br>
    year:<input type="text" name="year"><br>
    <input type="submit" value="pay"><br>
  </form>
  <form action="/pay/showPay" method="post">
    <input type="submit" value="showPay">

  </form>
  </body>
</html>
