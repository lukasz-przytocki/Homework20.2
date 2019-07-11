<%--
  Created by IntelliJ IDEA.
  User: szupi
  Date: 10.07.2019
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Przelicznik</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div style="width: 90%; margin:auto">
  <h1>Przelicznik tekstu</h1>

  <form method="post" action="/convert">
    <div class="form-group" style=margin-top:1%;>
      <textarea rows="10" cols="86" name="textSent"></textarea> <br/>
      <input type="submit" value="Przelicz">
    </div>
  </form>
</div>
</body>
</html>
