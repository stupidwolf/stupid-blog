<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <title>博客标题</title>
    <link rel="stylesheet" type="text/css" href="${path}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/css/responsive-nav.css">
</head>
<body>
<div role="navigation" id="nav" class="closed" aria-hidden="false" style="position: relative;">
    <ul>
        <li ><a href="#">首页</a></li>
        <li class="active"><a href="#">浏览博文</a></li>
    </ul>
</div>

<div role="main" class="main">
    <a href="#nav" id="toggle" aria-hidden="true">Menu</a>

    <section class='main'>
        <h1>Spring 入门基本</h1>
        <p>发布时间:2016/07/25 15:44 阅读:2001 收藏: 50 <a href="#">评论: 20</a></p>
        <h4>摘要: 基本的Spring知识介绍</h4>
        <div class="content">
            <p>段落1</p>
            <p>段落2</p>
            <p>段落3</p>
        </div>
    </section>
</div>

<script type="text/javascript" language="javascript" src="${path}/js/jquery-1.11.1.min.js">
</script>
<script src="${path}/js/responsive-nav.js"></script>
<script>
    var navigation = responsiveNav("#nav", {customToggle: "#toggle"});
</script>

</body>
</html>
