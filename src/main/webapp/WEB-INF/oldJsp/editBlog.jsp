<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>Title</title>
    <link href="${path}/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="${path}/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
    <%--<link rel="stylesheet" href="${path}/font-awesome/css/font-awesome.min.css">--%>
    <link rel="stylesheet" href="${path}/css/responsive-nav.css" rel="stylesheet">
    <link rel="stylesheet" href="${path}/css/summernote.css">
    <%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>

</head>
<body>
<div role="navigation" id="nav" class="closed" aria-hidden="false" style="position: relative;">
    <ul>
        <li ><a href="${path}/index.jsp">首页</a></li>
        <li><a href="${path}/listBlog.jsp">浏览博文</a></li>
        <li><a href="${paht}/addBlog.jsp">创建博客</a></li>
        <li class="active"><a href="${path}/editBlog.jsp">编辑博客</a> </li>
    </ul>
</div>
<div role="main" class="main">
    <a href="#nav" id="toggle" aria-hidden="true">Menu</a>
    <form>
        <div class="form-group">
            <label class="label label-default" for="title">博客标题</label>
            <div class="input-group">
                <input class="form-control" type="text" id="title" aria-describedby="basic-addon2">
                <span class="input-group-addon" id="basic-addon2">选择保存的目录</span>
            </div>
        </div>
        <div class="form-group">
            <label class="label label-default">博客摘要</label><br>
            <textarea class="form-control"></textarea>
        </div>
        <div class="form-group">
            <label class="label label-default" for="summernote">博客内容</label>
            <div id="summernote" class="form-control"><p>开始书写我的博客</p></div>
        </div>
        <div class="form-group">
            <label class="label label-default">类型</label>
            <input class="form-control" type="text"><br>
        </div>
        <div class="form-group">
            <input class="form-group btn" type="submit" value="发表">
        </div>
    </form>
</div>

</body>
<script type="text/javascript" language="javascript" src="${path}/js/jquery.min.js"></script>
<script type="text/javascript" src="${path}/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${path}/js/summernote.min.js"></script>
<script src="${path}/js/responsive-nav.js"></script>
<script>
//    var navigation = responsiveNav("#nav", {customToggle: "#toggle"});
var navigation = responsiveNav("#nav", { // Selector: The ID of the wrapper
    animate: true, // Boolean: 是否启动CSS过渡效果（transitions）， true 或 false
    transition: 400, // Integer: 过渡效果的执行速度，以毫秒（millisecond）为单位
    label: "Menu", // String: Label for the navigation toggle
    insert: "after", // String: Insert the toggle before or after the navigation
    customToggle: "#toggle", // Selector: Specify the ID of a custom toggle
    openPos: "relative", // String: Position of the opened nav, relative or static
    jsClass: "js", // String: 'JS enabled' class which is added to <html> el
    debug: true, // Boolean: Log debug messages to console, true 或 false
    init: function(){}, // Function: Init callback
    open: function(){}, // Function: Open callback
    close: function(){} // Function: Close callback
});
</script>
<script>
    $(document).ready(function() {
        $('#summernote').summernote({
            height:300
        });
    });
</script>
</html>
