package xyz.stupidwolf.exception;

/**
 * 用户未登录异常，在用户需要权限访问相关资源，执行访问，但未登录时抛出
 * Created by stupidwolf on 2016/8/4.
 */
public class NoLoginException extends RuntimeException {
    public NoLoginException() {
    }

    public NoLoginException(String message) {
        super(message);
    }
}
