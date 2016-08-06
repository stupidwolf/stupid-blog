package xyz.stupidwolf.exception;

/**
 * Created by stupidwolf on 2016/8/6.
 */
public class CanNotGetBlogListException extends RuntimeException{
    public CanNotGetBlogListException() {
    }

    public CanNotGetBlogListException(String message) {
        super(message);
    }
}
