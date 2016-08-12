
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
    <link rel="stylesheet" type="text/css" href="${path}/assets/css/markdown.css">

    <link rel="stylesheet" type="text/css" href="${path}/assets/css/style.css">

    <script type="text/javascript" src="${path}/assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="${path}/assets/js/bootstrap-markdown.js"></script>
    <script type="text/javascript" src="${path}/assets/js/markdown.js"></script>
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

        <div class="col-xs-8 col-sm-10 col-md-9 contents" id="blog-editor">
            <div class="row">
                <div <%--class="col-md-8"--%>>
                    <form action="/u/blog/update" method="post">
                        <input value="${blog.id}" name="id" style="display: none">
                        <div class="input-group">
                            <span class="input-group-addon">标题:</span>
                            <input type="text" class="form-control" name="title" placeholder="title" aria-describedby="basic-addon1"
                            value="${blog.title}">
                        </div>
                        <div class="form-group">
                            <label for="blog-summary">摘要:</label>
                            <textarea name="summary" class="form-control summary" placeholder="请输入摘要内容 200字以内哦~"
                                      id="blog-summary" maxlength="200">${blog.summary}</textarea>
                        </div>

                        <textarea name="content" data-provide="markdown" rows="25"
                                  id="target-editor" >${blog.content}</textarea>
                        <hr>
                        <div class="form-group article-type-form">
                            <label>选择博客类型:</label>
                            <select name="type.id" class="article-type">
                            </select>
                        </div>

                        <hr/>
                        <button type="submit" class="btn">Submit</button>
                    </form>
                </div>
                <%--          <div class="col-md-4">
                              <div id="preview"></div>
                          </div>--%>
            </div>
        </div>
    </div>
    <footer>
        <p align="center">页尾</p>
    </footer>
</div>

<script type="text/javascript">
    $("#target-editor").markdown({autofocus:false,resize:'both'})
</script>

<script>
    $('document').ready(function() {

        //绑定编辑区input事件
        $('#target-editor').on('input', function(e) {
            $('#preview').html(markdown.toHTML($('#target-editor').val()));
        });

        $('form').on('click', function(e){
            $('#preview').html(markdown.toHTML($('#target-editor').val()));
        });
    });

</script>

<!-- 引入导航栏缩小script -->
<script type="text/javascript" src='${path}/assets/js/zoom-out-in.js'></script>
<script type="text/javascript" src="${path}/assets/js/menu.js"></script>
<script>
    MENU.init(1);
</script>

<script>
    $(document).ready(function () {
        var type = $('#blog-editor .article-type');
        $.get("/blog/type/list", function (data) {
            for (var i = 0; i < data.length; i ++) {
                var option = $('<option ></option>').html(data[i].name);
                if(data[i].id == ${blog.type.id}) {
                    option.attr("selected", "selected");
                }
                console.log(data[i])
                option.attr('value', data[i].id).appendTo(type);
            }
        }, "json");
    });
</script>
</body>
</html>