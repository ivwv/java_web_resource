<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NEUSOFT
  Date: 2020/4/13
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        function updatePerson(pid) {
            alert(pid);
            var pname=$("#pname"+pid).val();
            var pwd=$("#pwd"+pid).val();
            $.ajax({
                url:"updatePerson.action",
                data:{"pid":pid,"pname":pname,"pwd":pwd},
                success:function () {
                    alert("ok");
                }
            });
        }
    </script>
</head>
<body>
<h2>person</h2>
<%--${list}--%>
<table border="1">
    <tr>
        <th>pid</th>
        <th>pname</th>
        <th>pwe</th>
        <th>update</th>
        <th>delete</th>
    </tr>
    <c:forEach items="${list}" var="per">
        <tr>
            <td>${per.pid}</td>
            <td><input type="text" value="${per.pname}" id="pname${per.pid}"></td>
            <td><input type="text" value="${per.pwd}" id="pwd${per.pid}"></td>
            <td><input type="button" value="update" onclick="updatePerson(${per.pid})"></td>
            <td><input type="button" value="delete"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
