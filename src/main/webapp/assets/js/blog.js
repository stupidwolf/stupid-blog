/**
 * 使用方法，
 *
 * @type {{userId: number, currentPage: number, nextPage: number, pageSize: number, count: number, totalPage: number, init: BLOG.init, load: BLOG.load, scrollLoadBlogList: BLOG.scrollLoadBlogList, transferJsonToHtml: BLOG.transferJsonToHtml, dateFomat: BLOG.dateFomat, URL: {getList: BLOG.URL.getList}}}
 */

var BLOG =  {
    userId : undefined,//用户id
    currentPage : 1,//当前页
    nextPage: 2, //下一页
    pageSize: 4, //每页显示数据大小
    count: 0, //总记录条数
    totalPage: 0,
    //初始化时加载数据
    init:function (userId, currentPage, pageSize) {
        console.log('正在初始化数据..');
        BLOG.userId = userId;
        BLOG.currentPage = currentPage;
        BLOG.pageSize = pageSize;
        BLOG.nextPage = BLOG.currentPage;
        BLOG.load();
        //注册滚动监听器
        $(window).on('scroll', BLOG.scrollLoadBlogList);
    },
    load:function() {
        $.get(BLOG.URL.getList(BLOG.userId, BLOG.nextPage, BLOG.pageSize), function (data) {
            console.log("正在动态加载数据~")
            $(window).off("scroll");

            BLOG.transferJsonToHtml(data);

            $(window).on('scroll', BLOG.scrollLoadBlogList);
            console.log('加载数据完成~');
        }, 'json');

        BLOG.nextPage ++;
    },
    scrollLoadBlogList:function () {
        var viewHeight = $(this).height();
        var contentHeight = $(document).height();
        var scrollTop = $(this).scrollTop();

        if (scrollTop / (contentHeight -viewHeight)>=0.95) {
            if (BLOG.nextPage <= BLOG.totalPage) {
                BLOG.load(BLOG.userId, BLOG.nextPage, BLOG.pageSize);
            } else {
                console.log('没有数据啦~');
            }
        }
    },
    transferJsonToHtml: function(data) {
        BLOG.count = data.count;
        BLOG.totalPage = data.total;
        BLOG.pageSize = data.size;
        BLOG.currentPage = data.current;

        var blogs = data.blogs;
        var blogList = $('#blog-list');

        for (var i = 0; i < blogs.length; i ++) {
            var panel = $('<div class="card-blog panel panel-default"></div>');
            var headPanel = $('<div class="panel-body"></div>').html(blogs[i].title);
            var panelBody = $('<div class="panel-body summary"></div>').html('简要信息: ' + blogs[i].summary);
            var ul = $('<ul class="panel-footer"></ul>');
            $('<li class="blog-id" style="display:none;"></li>').html(blogs[i].id).appendTo(ul);
            $('<li></li>').html('访问信息: ' + blogs[i].viewCount).appendTo(ul);
            $('<li></li>').html('创建时间: ' + BLOG.dateFomat(blogs[i].createTime)).appendTo(ul);
            $('<li></li>').html('最后修改时间: ' + BLOG.dateFomat(blogs[i].lastModifyTime)).appendTo(ul);
            panel.append(headPanel);
            panel.append(panelBody);
            panel.append(ul);
            blogList.append(panel);

        }
    },
    dateFomat : function(date) {
    var fDate = new Date(date);
    return (fDate.getYear() + 1900) +  '/'
        + fDate.getMonth() +  '/'+
        + fDate.getDay() +  '/' +
        + fDate.getHours() + ':' +
        + fDate.getMinutes() + ':' +
        + fDate.getSeconds();

},
    URL: {
        getList:function (userId, current, size) {
            return "/u/" + userId + "/blog/getList" + "?"
                + "current=" + (current ? current : "1")
                + "&size=" + (size ? size : "4");
        }
    }
}