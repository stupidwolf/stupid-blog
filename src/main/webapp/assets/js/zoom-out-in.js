$('document').ready(function() {
	//隐藏显示导航栏
$('#left-nav-bt').on("click", function(e) {

	//若已被缩小，则恢复
	if ($('#nav').hasClass('zoom-out')) {
		$('#nav').removeClass('zoom-out');
		$('#nav ul li').show();

	 //显示缩小图标
		$(this)
		.removeClass('show')
		.removeClass('glyphicon glyphicon-menu-right')
		.addClass('glyphicon glyphicon-menu-left')
		;

		$('.contents').
		removeClass('col-md-11')
		.addClass('col-md-9');
		return;
	}


	//执行缩小的相关操作
		$('#nav').addClass('zoom-out')
		$('#nav ul li').hide();

	//显示展开图标
		$(this)
		.addClass('show')
		.removeClass('glyphicon glyphicon-menu-left')
		.addClass('glyphicon glyphicon-menu-right');
		
		$('.contents').
		removeClass('col-md-9')
		.addClass('col-md-11');

})

})
