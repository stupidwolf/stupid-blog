<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html lang="en">
<head>
    <title>Title</title>
    <link href="${path}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${path}/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${path}/css/responsive-nav.css" rel="stylesheet">
    <link rel="stylesheet" href="${path}/css/summernote.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
    <div role="navigation" id="nav" class="closed" aria-hidden="false" style="position: relative;">
        <ul>
            <li ><a href="#">首页</a></li>
            <li><a href="#">浏览博文</a></li>
            <li class="active"><a href="#">创建博客</a></li>
        </ul>
    </div>
    <div role="main" class="main">
        <a href="#nav" id="toggle" aria-hidden="true">Menu</a>
            <form>
                <div class="form-group">
                    <label class="label label-default" for="title">博客标题</label>
                    <div class="input-group">
                        <input class="form-control" type="text" id="title" aria-describedby="basic-addon2">
                        <span class="input-group-addon" id="basic-addon2">
                            <select class="selectpicker">
                                <option value ="1">目录1</option>
                                <option value ="2">目录</option>
                                <option value="3">目录</option>
                                <option value="4">目录</option>
                            </select>

                    </span>

                    </div>
                </div>
                <div class="form-group">
                    <label class="label label-default">博客摘要</label><br>
                    <textarea class="form-control"></textarea>
                </div>


                <div class="form-group">
                    <label class="label label-default" for="summernote">博客内容</label>
                    <div id="summernote"><p>开始书写我的博客</p></div>
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
<script type="text/javascript" src="${path}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${path}/js/summernote.min.js"></script>
<script src="${path}/js/responsive-nav.js"></script>
<script>
    $(document).ready(function() {
        $('#summernote').summernote({
            height:300
        });
    });
</script>
<script>
    var navigation = responsiveNav("#nav", {customToggle: "#toggle"});
</script>
</html>
