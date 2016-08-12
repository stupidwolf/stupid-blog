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
    <link rel="stylesheet" type="text/css" href="${path}/assets/css/card.css">

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
        </div>

        <div class="col-xs-8 col-sm-10 col-md-10 contents">
            <section id='main'>
                <h1>博文列表</h1>
                <div class="row">
                    <ul class="sort-type">
                        <li>最新</li>
                        <li>最热</li>
                        <li>分类</li>
                    </ul>
                    <div class="input-group col-lg-6">
                        <input type="text" class="form-control" placeholder="输入您要搜索的博文...">
                        <span class="input-group-btn">
                     <button class="btn btn-default" type="button">开始!</button>
                 </span>
                    </div>

                </div>
                <hr>
                <div class='box-content box-no-padding'>
                    <div class='scrollable-area clearfix' id="blog-list">

                    </div>
                </div>
            </section>
        </div>
    </div>
    <footer>
        <p align="center">页尾</p>
    </footer>
</div>

<!-- 	<script type="text/javascript">
	var navigation = responsiveNav("#nav");
</script> -->

<script type="text/javascript" src="${path}/assets/js/zoom-out-in.js"></script>
<script type="text/javascript" src="${path}/assets/js/menu.js"></script>
<script type="text/javascript" src="${path}/assets/js/blog.js"></script>
<script>
    $(document).ready(function() {

        //加载左侧菜单栏
        MENU.init(1);
        //加载博客初始列表(userId, currentPage,pageSize)
        console.log(${user.id});
        BLOG.init(${user.id}, 1, 2);

        //
    });
</script>
</body>
</html>
