<%--
  Created by IntelliJ IDEA.
  User: Kasun Chinthaka
  Date: 12/20/2016
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="servlet/Register" method="post">

    Name:<input type="text" name="userName"/><br/><br/>
    Password:<input type="password" name="userPass"/><br/><br/>
    Email Id:<input type="text" name="userEmail"/><br/><br/>
    Country:
    <select name="userCountry">
        <option>India</option>
        <option>Pakistan</option>
        <option>other</option>
    </select>

    <br/><br/>
    <input type="submit" value="register"/>

</form>
</body>
</html>
