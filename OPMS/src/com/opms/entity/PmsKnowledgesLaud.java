package com.opms.entity;

public class PmsKnowledgesLaud {
    private Long laudid;

    private Long userid;

    private Long knowid;

    private Integer created;

    private Boolean status;

    public Long getLaudid() {
        return laudid;
    }

    public void setLaudid(Long laudid) {
        this.laudid = laudid;
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