<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <%String path = request.getContextPath();%>
    <link rel="stylesheet" href="${path}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/css/form-elements.css">
    <link rel="stylesheet" href="${path}/css/style.css">
    <link rel="stylesheet" href="${path}/css/green.css">

    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="${path}/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${path}/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${path}/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${path}/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="${path}/ico/apple-touch-icon-57-precomposed.png">

</head>
<body>

<!-- Top content -->
<div class="top-content">

    <div class="inner-bg">
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
                            <p>需要你的账户和密码登录哦...<p>
                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-key"></i>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <form role="form" action="" method="post" class="login-form">
                            <div class="form-group">
                                <label class="sr-only" for="form-username">用户名</label>
                                <input type="text" name="form-username" placeholder="用户名或注册的邮箱" class="form-username form-control" id="form-username">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="form-password">密码</label>
                                <input type="password" name="form-password" placeholder="密码" class="form-password form-control" id="form-password">
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

</div>


</body>
<script src="${path}/js/jquery-1.11.1.min.js" type="text/javascript"></script>
<script src="${path}/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${path}/js/bootstrapValidator.js" type="text/javascript"></script>
<script src="${path}/js/jquery.backstretch.min.js"></script>
<script src="${path}/js/scripts.js"></script>
<script src="${path}/js/icheck.min.js"></script>

<script type="text/javascript">
    $(document).ready(function(){
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-green',

            increaseArea: '20%' // optional
        });
    });
</script>
</html>
