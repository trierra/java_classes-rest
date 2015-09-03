<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="${pageContext.request.contextPath}/login" method="post">

  Login: <input type="text" name="loginParam"/>
  Password: <input type="password" name="passwd"/>
  <input type="submit" value="submit"/>

</form>


</body>
</html>
