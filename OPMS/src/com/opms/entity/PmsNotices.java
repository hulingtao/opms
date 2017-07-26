package com.opms.entity;

public class PmsNotices {
    private Long noticeid;

    private String title;

    private Integer created;

    private Boolean status;

    private String content;

    public Long getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Long noticeid) {
        this.noticeid = noticeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}