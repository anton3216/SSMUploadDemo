<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <table>
            <tr>
                <td>编号</td>
                <td>头像</td>
                <td>姓名</td>
                <td>密码</td>
                <td>
                    <a href="add.jsp">添加</a>
                </td>
            </tr>
            <c:forEach items="${list}" var="u">
                <tr>
                    <td>${u.id}</td>
                    <td>
                        <img src="${u.imgurl}" width="50px" alt="图片加载失败"/>
                    </td>
                    <td>${u.username}</td>
                    <td>${u.password}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
