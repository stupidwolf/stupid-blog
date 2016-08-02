<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <title>Title</title>
    <link href="${path}/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${path}/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${path}/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${path}/css/responsive-nav.css">
    <link rel="stylesheet" href="${path}/css/summernote.css">

</head>
<body>
<%--<div role="navigation" id="nav" class="closed" aria-hidden="false" style="position: relative;">--%>
    <%--<ul>--%>
        <%--<li ><a href="${path}/index.jsp">首页</a></li>--%>
        <%--<li><a href="${path}/listBlog.jsp">浏览博文</a></li>--%>
        <%--<li><a href="${paht}/addBlog.jsp">创建博客</a></li>--%>
        <%--<li class="active"><a href="${path}/editBlog.jsp">编辑博客</a> </li>--%>
    <%--</ul>--%>
<%--</div>--%>
<div role="main" class="main">
    <a href="#nav" id="toggle" aria-hidden="true">Menu</a>
    <form>
        <div class="form-group">
            <label class="label label-default" for="summernote">博客内容</label>
            <div id="summernote"><p>开始书写我的博客</p></div>
        </div>
    </form>
    </div>
</body>
<script type="text/javascript" language="javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${path}/js/summernote.min.js"></script>
<script>
    $(document).ready(function() {
        $('#summernote').summernote({
            height:300
        });
    });
</script>
</html>
