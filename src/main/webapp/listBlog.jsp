<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <title>浏览博客</title>

    <link rel="stylesheet" type="text/css" href="${path}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${path}/css/dataTables.bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${path}/css/shCore.css">
    <link rel="stylesheet" href="${path}/css/responsive-nav.css">

    <style type="text/css" class="init">

    </style>

    <script type="text/javascript" language="javascript" src="${path}/js/jquery-1.11.1.min.js">
    </script>
    <script type="text/javascript" language="javascript" src="${path}/js/jquery.dataTables.min.js">
    </script>
    <script type="text/javascript" language="javascript" src="${path}/js/dataTables.bootstrap.min.js">
    </script>
    <script type="text/javascript" language="javascript" src="${path}/js/shCore.js">
    </script>
    <script type="text/javascript" language="javascript" src="${path}/js/demo.js">
    </script>
    <script type="text/javascript" language="javascript" class="init">

        $(document).ready(function() {
            $('#blogs').DataTable();
        } );

    </script>
    <script src="${path}/js/responsive-nav.js"></script>
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

    <section id='content'>
            <h1>博文列表</h1>
        <div class='box-content box-no-padding'>
            <div class='responsive-table'>
                <div class='scrollable-area'>
            <table id="blogs" class="dataTable table table-striped table-bordered table-condensed">
                <thead>
                <tr>
                    <th>标题</th>
                    <th>概要</th>
                    <th>热度</th>
                    <th>创建日期</th>
                    <th>最后修改日期</th>
                </tr>
                </thead>

                <tbody>
                <tr>
                    <td>Spring 入门基本</td>
                    <td>基本的Spring知识介绍</td>
                    <td>2000浏览</td>
                    <td>2016/7/22</td>
                    <td>2016/7/25</td>
                </tr>
                <tr>
                    <td>Spring 入门基本</td>
                    <td>基本的Spring知识介绍</td>
       td           <td>2000浏览</td>
                    <td>2016/7/22</td>
                    <td>2016/7/25</td>
                </tr>
                <tr>
                    <td>Spring 入门基本</td>
                    <td>基本的Spring知识介绍</td>
                    <td>2000浏览</td>
                    <td>2016/7/22</td>
                    <td>2016/7/25</td>
                </tr>
                <tr>
                    <td>Spring 入门基本</td>
                    <td>基本的Spring知识介绍</td>
                    <td>2000浏览</td>
                    <td>2016/7/22</td>
                    <td>2016/7/25</td>
                </tr>
                <tr>
                    <td>Spring 入门基本</td>
                    <td>基本的Spring知识介绍</td>
                    <td>2000浏览</td>
                    <td>2016/7/22</td>
                    <td>2016/7/25</td>
                </tr>
                </tbody>
                </table>
            </div>
                </div>
            </div>
    </section>
</div>

<script>
    var navigation = responsiveNav("#nav", {customToggle: "#toggle"});
</script>

</body>
</html>
