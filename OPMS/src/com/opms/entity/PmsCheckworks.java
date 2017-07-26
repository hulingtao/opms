package com.opms.entity;

public class PmsCheckworks {
    private Long checkid;

    private Long userid;

    private String clock;

    private Boolean type;

    private String ip;

    private Integer created;

    public Long getCheckid() {
        return checkid;
    }

    public void setCheckid(Long checkid) {
        this.checkid = checkid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}