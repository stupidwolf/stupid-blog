<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path=request.getContextPath();%>
<!DOCTYPE html>
<html>`
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
<div class="container-fluid container-box">
    <header class="page-header">
        <h3>Example page header <small>Subtext for header</small></h3>
    </header>

    <div class="row">
        <div class="col-xs-4 col-sm-2 col-md-2 left" id="nav">
            <span id="left-nav-bt" class="glyphicon glyphicon-menu-left"></span>
        </div>

        <div class="col-xs-8 col-sm-10 col-md-10 contents">
            <p>Hello world.</p>
        </div>
    </div>
    <footer>
        <p align="center">页尾</p>
    </footer>
</div>

<script type="text/javascript" src="${path}/assets/js/zoom-out-in.js"></script>
<script type="text/javascript" src="${path}/assets/js/menu.js"></script>
<script>
    $(document).ready(function() {
        MENU.init(1);
    });
</script>
</body>
</html>
