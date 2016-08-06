package xyz.stupidwolf.dto;

import xyz.stupidwolf.domain.Blog;

import java.util.List;

public class BlogPage {
    private int count;//总记录条数
    private int total;//总页条数
    private int size = 20;//每页大小

    private List<Blog> blogs;//博客列表
    private int current = 1;//当前页
    private int start;//开始索引位置

    /**
     * 默认分页参数取
     * 当前页: 1
     * 每页数据大小: 20
     */
    public BlogPage() {
    }

    /**
     *
     * @param current 当前页
     */
    public BlogPage(int current) {
        this.current = current;
        this.start = (current - 1) * this.size;
    }

    /**
     *
     * @param current 当前页
     * @param size 每页数据量
     */
    public BlogPage( int current, int size) {
        this.current = current;
        this.size = size;

        this.start = (current - 1) * this.size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        this.total = (count / this.size) + ((count % this.size) > 0 ? 1 : 0);
    }

    public int getTotal() {
        return total;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getStart() {
        return start;
    }

}
