package xyz.stupidwolf.exception;

/**
 * 添加博客异常
 * Created by stupidwolf on 2016/8/6.
 */
public class BlogInsertFailException extends RuntimeException{
    public BlogInsertFailException() {
    }

    public BlogInsertFailException(String message) {
        super(message);
    }
}
