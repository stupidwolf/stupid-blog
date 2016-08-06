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
    <!-- <link rel="stylesheet" type="text/css" href="css/responsive-nav.css"> -->

    <link rel="stylesheet" type="text/css" href="${path}/assets/css/style.css">

    <script type="text/javascript" src="${path}/assets/js/jquery.min.js"></script>
    <!-- <script type="text/javascript" src="js/responsive-nav.js"></script> -->
</head>
<body>
<div class="top-content">

    <div class="container">
        <div class="row">
            <div class="col-sm-8 col-sm-offset-2 text">
                <h1><strong>Stupidwolf-Blog系统</strong> 登录</h1>
                <div class="description">
                    <p>
                        这是一个开源的java写的博客系统，可到github下载具体的代码
                        <a href="#"><strong>github</strong></a>根据个人喜好自定义使用哦！
                    </p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 form-box">
                <div class="form-top">
                    <div class="form-top-left">
                        <h3>登录到我的博客</h3>
                    </div>
                    <div class="form-top-right">
                        <i class="fa fa-key"></i>
                    </div>
                </div>
                <div class="form-bottom">
                    <form role="form" action="/login" method="post" class="login-form">
                        <div class="form-group">
                            <label class="sr-only" for="name">用户名</label>
                            <input type="text" name="loginName" placeholder="用户名或注册的邮箱" class="form-username form-control" id="name">
                        </div>
                        <div class="form-group">
                            <label class="sr-only" for="password">密码</label>
                            <input type="password" name="password" placeholder="密码" class="form-password form-control" id="password">
                        </div>
                        <div class="form-group">
                            <input type="checkbox" class="icheckbox_square-green" id="state-check" checked>
                            <label for="state-check">记住我的登录状态</label>
                        </div>
                        <button type="submit" class="btn">登 录!</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 social-login">
                <h4>或者:</h4>
                <div class="social-login-buttons">
                    <a class="btn btn-link-1" href="#">
                        <i class="fa"></i> 注册新用户
                    </a>
                    <a class="btn btn-link-1" href="#">
                        <i class="fa"></i> QQ登录
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>