package xyz.stupidwolf.exception;

/**
 * 没有权限删除资源时抛出该异常
 * Created by stupidwolf on 2016/8/4.
 */
public class DeletePermissionDenyException extends RuntimeException {
    public DeletePermissionDenyException() {
    }

    public DeletePermissionDenyException(String message) {
        super(message);
    }
}
