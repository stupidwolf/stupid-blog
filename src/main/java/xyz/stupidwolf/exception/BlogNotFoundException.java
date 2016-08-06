package xyz.stupidwolf.exception;

/**
 * Created by stupidwolf on 2016/8/6.
 */
public class BlogNotFoundException extends RuntimeException {
    public BlogNotFoundException() {
    }

    public BlogNotFoundException(String message) {
        super(message);
    }
}
