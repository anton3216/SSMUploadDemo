<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action="add" method="post" enctype="multipart/form-data">
            <input type="text" name="username"/>
            <input type="text" name="password"/>
            <input type="file" name="uploadfile">
            <input type="submit" value="提交">
        </form>
    </body>
</html>
