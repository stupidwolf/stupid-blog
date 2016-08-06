var MENU = {
    //根据用户角色初始化菜单
    init:function(roleId) {
        $.get(MENU.URL.getMainMenu(roleId),function (data) {
            var ul = $('<ul class="nav clearfix"></ul>');
            for (var i = 0; i < data.length; i ++) {
                // console.log(data[i]);
                var li = $('<li></li>');
                var a = $("<a></a>").html(data[i].content).attr("href", data[i].url);

                li.append(a);
                ul.append(li);
            }
            $('#nav').append(ul);
        }, 'json');
    },
    load:function() {
    },
    URL:{
        getMainMenu:function(roleId) {
            return "/rs/"+roleId+"/menu";
        }
    }
}