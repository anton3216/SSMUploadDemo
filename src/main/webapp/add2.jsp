<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script>
            $(function (){
                $(":button").click(function (){
                    $.ajax({
                        url : "add2",
                        data: new FormData($("#form")[0]),
                        type : "POST",
                        // 告诉jQuery不要去处理发送的数据，用于对data参数进行序列化处理 这里必须false
                        processData : false,
                        // 告诉jQuery不要去设置Content-Type请求头
                        contentType : false,
                        success : function(json) {
                            if(json){
                                location = "list";
                            }
                        }
                    });
                });
            });
        </script>
    </head>
    <body>
        <form id="form">
            <input type="text" name="username"/>
            <input type="text" name="password"/>
            <input type="file" name="uploadfile">
            <input type="button" value="提交">
        </form>
    </body>
</html>
