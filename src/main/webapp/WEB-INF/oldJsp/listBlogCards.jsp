<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <title>浏览博客</title>

    <link rel="stylesheet" type="text/css" href="${path}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/css/responsive-nav.css">
    <link href="${path}/css/card.css" rel="stylesheet">

    <style type="text/css" class="init">
        .sort-type li {
            list-style-type: none;
            font-size: 14px;
            font-weight: bold;
            float: left;
            margin:8px 5px;
            padding: 6px 15px;
            text-align: center;
        }
        .sort-type li:hover {
            color: white;
            background-color: #444444;
            cursor: pointer;
            border-radius: 4px;
        }
        /*使分页选择区居中*/
        nav .pagination {
            text-align: center;
            display:table;
             margin:0 auto;
        }

        /*消除浮动的影响*/
        .clearfix:after{
            content: "020";
            display: block;
            height: 0;
            clear: both;
            visibility: hidden;
        }
        .clearfix {
            zoom: 1;
        }
    </style>
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

    <section id='main'>
        <h1>博文列表</h1>
        <div class="row clearfix">
            <ul class="sort-type ">
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
                <div class='scrollable-area clearfix'>
                    <div class="card-blog panel panel-default">
                        <div class="panel-heading">Spring 入门</div>
                        <div class="panel-body summary">概要</div>

                        <ul class="panel-footer">
                            <li>作者</li>
                            <li>热度</li>
                            <li>创建日期</li>
                            <li>最后修改日期</li>
                        </ul>
                    </div>
                    <div class="card-blog panel panel-default">
                        <div class="panel-heading">Spring 入门</div>
                        <div class="panel-body summary">概要</div>

                        <ul class="panel-footer">
                            <li>作者</li>
                            <li>热度</li>
                            <li>创建日期</li>
                            <li>最后修改日期</li>
                        </ul>
                    </div>
                    <div class="card-blog panel panel-default">
                        <div class="panel-heading">Spring 入门</div>
                        <div class="panel-body summary">概要</div>

                        <ul class="panel-footer">
                            <li>作者</li>
                            <li>热度</li>
                            <li>创建日期</li>
                            <li>最后修改日期</li>
                        </ul>
                    </div>
            </div>
            <nav>
                <ul class="pagination clearfix">

                    <li>
                        <a href="#" aria-label="Previous" class="glyphicon glyphicon-chevron-left"></a>
                    </li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next" class="glyphicon glyphicon-chevron-right"></a>
                    </li>
                </ul>
            </nav>
        </div>
    <</section>
</div>

<script type="text/javascript" language="javascript" src="${path}/js/jquery-1.11.1.min.js">
</script>
<script src="${path}/js/responsive-nav.js"></script>
<script>
    var navigation = responsiveNav("#nav", {customToggle: "#toggle"});
</script>

</body>
</html>
