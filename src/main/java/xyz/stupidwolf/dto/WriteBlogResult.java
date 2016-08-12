package xyz.stupidwolf.dto;

import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * 用于存储执行保存博客操作所返回结果
 * Created by stupidwolf on 2016/8/6.
 */
public class WriteBlogResult {
    private String code;//操作返回的状态码
    private long blogId;//若储存成功，则返回该博客的id
    private List<ObjectError> errors ;//若操作失败则返回失败的具体原因

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getBlogId() {
        return blogId;
    }

    public void setBlogId(long blogId) {
        this.blogId = blogId;
    }

    public List<ObjectError> getErrors() {
        return errors;
    }

    public void setErrors(List<ObjectError> errors) {
        this.errors = errors;
    }
}
