package com.opms.entity;

public class PmsKnowledgesComment {
    private Long comtid;

    private Long userid;

    private Long knowid;

    private String content;

    private Integer created;

    private Boolean status;

    public Long getComtid() {
        return comtid;
    }

    public void setComtid(Long comtid) {
        this.comtid = comtid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getKnowid() {
        return knowid;
    }

    public void setKnowid(Long knowid) {
        this.knowid = knowid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
}