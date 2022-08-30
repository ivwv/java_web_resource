<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NEUSOFT
  Date: 2020/5/16
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        function updateWorker(wid) {
            // alert(wid);
            var username=$("#name"+wid).val();
            var password=$("#pwd"+wid).val();
            $.ajax({
                url:"updateWorker.action",
                data:{"wid":wid,"username":username,"password":password},
                success:function () {
                    // location.reload();
                    // alert("ok");
                }
            });
        }

        function deleteWorker(wid) {
            alert(wid);
            $.ajax({
                url:"deleteWorker.action",
                data:{"wid":wid},
                success:function () {
                    location.reload();
                }
            });
        }
    </script>
</head>
<body>
<h2>worker</h2>
<%--${list}--%>
<table>
    <tr>
        <th>wid</th>
        <th>username</th>
        <th>password</th>
        <th>update</th>
        <th>delete</th>
    </tr>
    <c:forEach items="${list}" var="worker">
        <tr>
            <td>${worker.wid}</td>
            <td><input type="text" value="${worker.username}" id="name${worker.wid}"></td>
            <td><input type="text" value="${worker.password}" id="pwd${worker.wid}"></td>
            <td><input type="button" value="update" onclick="updateWorker(${worker.wid})"></td>
            <td><input type="button" value="delete" onclick="deleteWorker(${worker.wid})"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
