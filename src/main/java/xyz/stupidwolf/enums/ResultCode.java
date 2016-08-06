package xyz.stupidwolf.enums;

/**
 * 定义各个操作的返回状态码
 * Created by stupidwolf on 2016/8/4.
 */
public enum ResultCode {
    DELETE_SUCCESS("40"),
    DELETE_FAIL("41"),
    WRITE_SUCCESS("50"),
    WRITE_FAIL("51")
    ;

    private String code;

    ResultCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
