package xyz.stupidwolf.exception;

/**
 * 用户身份认证未通过
 * Created by stupidwolf on 2016/8/4.
 */
public class UserCheckFailException extends RuntimeException {
    public UserCheckFailException() {
    }

    public UserCheckFailException(String message) {
        super(message);
    }
}
