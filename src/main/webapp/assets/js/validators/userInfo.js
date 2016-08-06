$(document).ready(function() {
	$('#user-info-form').bootstrapValidator({
    message: 'This value is not valid',
    feedbackIcons: {
        valid: 'glyphicon glyphicon-ok',
        invalid: 'glyphicon glyphicon-remove',
        validating: 'glyphicon glyphicon-refresh'
    },
	fields: {
		 'username':{
                message: '请填写用户名',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空'
                    }
                }
            },
            'password':{
            	message: 'fsdfs',
	            validators: {
	            	notEmpty: {
	            		message: '密码不能为空'
	            	}
	            }
			}
		}
	});
});