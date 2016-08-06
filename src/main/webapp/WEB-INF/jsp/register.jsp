<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1" charset="UTF-8">

    <link rel="stylesheet" type="text/css" href="${path}/assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${path}/assets/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="${path}/assets/css/bootstrapValidator.css">

    <script type="text/javascript" src="${path}/assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/assets/js/bootstrapValidator.js"></script>
    <script type="text/javascript" src="${path}/assets/js/validators/userInfo.js"></script>
</head>

<body>
<div class="container">
    <form id="user-info-form" method="POST">
        <div class="form-group">
            <label for="username">用户名</label>
            <input type="text" class="form-control" name="username" placeholder="用户名">
        </div>
        <div class="form-group">
            <label for="email">邮箱地址</label>
            <input type="email" class="form-control" name="email" placeholder="邮箱">
        </div>
        <div class="form-group">
            <label for="new-password1">新密码</label>
            <input type="password" class="form-control" name="password" placeholder="新密码">
        </div>
        <div class="form-group">
            <label for="new-password2">确认密码</label>
            <input type="password" class="form-control" name="password-repeat" placeholder="确认密码">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-default">注册</button>
        </div>
    </form>
</div>
</body>

</html>
