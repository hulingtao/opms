package com.opms.entity;

public class PmsKnowledgesSort {
    private Long sortid;

    private String name;

    private String desc;

    private Boolean status;

    public Long getSortid() {
        return sortid;
    }

    public void setSortid(Long sortid) {
        this.sortid = sortid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}