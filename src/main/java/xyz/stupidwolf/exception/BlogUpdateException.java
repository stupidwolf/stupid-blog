package xyz.stupidwolf.exception;

/**
 * 更新博客时发生异常
 * Created by stupidwolf on 2016/8/8.
 */
public class BlogUpdateException extends RuntimeException{
    public BlogUpdateException() {
    }

    public BlogUpdateException(String message) {
        super(message);
    }
}
