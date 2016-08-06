<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1" charset="UTF-8">

    <link rel="stylesheet" type="text/css" href="${path}/assets/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" type="text/css" href="${path}/assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${path}/assets/css/bootstrap-theme.min.css">

    <link rel="stylesheet" type="text/css" href="${path}/assets/css/style.css">

    <script type="text/javascript" src="${path}/assets/js/jquery.min.js"></script>
</head>
<body>
<div class="container-fluid container-box">
    <header class="page-header">
        <h3>Example page header <small>Subtext for header</small></h3>

    </header>

    <div class="row">
        <div class="col-xs-4 col-sm-2 col-md-2 left" id="nav">
            <span id="left-nav-bt" class="glyphicon glyphicon-menu-left"></span>
            <ul class="nav">
                <li><a href="#">nav 1</a></li>
                <li><a href="#">nav 2</a></li>
                <li><a href="#">nav 3</a></li>
            </ul>
        </div>

        <div class="col-xs-8 col-sm-10 col-md-10 contents">
            <section class='main'>
                <form>
                    <div class="form-group">
                        <label for="username">用户名</label>
                        <input type="text" class="form-control" id="username" placeholder="用户名">
                    </div>
                    <div class="form-group">
                        <label for="email">邮箱地址</label>
                        <input type="email" class="form-control" id="email" placeholder="邮箱">
                    </div>
                    <div class="form-group">
                        <label for="old-passord">原密码</label>
                        <input type="password" class="form-control" id="old-passord" placeholder="原密码">
                    </div>
                    <div class="form-group">
                        <label for="new-password1">新密码</label>
                        <input type="password" class="form-control" id="new-password1" placeholder="新密码">
                    </div>
                    <div class="form-group">
                        <label for="new-password2">确认密码</label>
                        <input type="password" class="form-control" id="new-password2" placeholder="确认密码">
                    </div>

                    <button type="submit" class="btn btn-default">确认修改</button>
                </form>
            </section>
        </div>
    </div>
    <footer>
        <p align="center">页尾</p>
    </footer>
</div>

<script type="text/javascript" src="${path}/assets/js/zoom-out-in.js"></script>
</body>
</html>