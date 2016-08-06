package xyz.stupidwolf.exception;

/**
 * 未找到用户异常
 * Created by stupidwolf on 2016/8/4.
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
