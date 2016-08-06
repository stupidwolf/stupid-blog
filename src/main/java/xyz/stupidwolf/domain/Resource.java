package xyz.stupidwolf.domain;

import java.io.Serializable;

public class Resource implements Serializable {
    private static final long serialVersionUID = 6655456604150170097L;
    private int id;
    private String content;
    private String url;

    public Resource() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
