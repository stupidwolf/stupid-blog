<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>管理个人信息</title>
    <link rel="stylesheet" type="text/css" href="${path}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="${path}/css/responsive-nav.css">
    <style>
        ul li a:hover {
            text-decoration: none;
        }
    </style>
</head>
<body>
<div role="navigation" id="nav" class="closed" aria-hidden="false" style="position: relative;">
<nav>
    <ul>
        <li ><a href="${path}/index.jsp">首页</a></li>
        <li><a href="${path}/listBlog.jsp">浏览博文</a></li>
        <li><a href="${paht}/addBlog.jsp">创建博客</a></li>
        <li><a href="${path}/editBlog.jsp">编辑博客</a> </li>
        <li class="active"><a href="${path}/managerUserInfo.jsp">管理个人信息</a></li>
    </ul>
</nav>
</div>

    <div role="main" class="main">
        <a href="#nav" id="toggle" aria-hidden="true">Menu</a>

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
</body>
<script type="text/javascript" language="javascript" src="${path}/js/jquery-1.11.1.min.js">
</script>
<script src="${path}/js/responsive-nav.js"></script>
<script>
    var navigation = responsiveNav("#nav", {customToggle: "#toggle"});
</script>
</html>
