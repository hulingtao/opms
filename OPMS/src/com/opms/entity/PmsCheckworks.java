package com.opms.entity;

import java.util.Date;

public class PmsCheckworks {
    private Long checkid;

    private Long userid;

    private Date clock;

    private Integer type;

    private String ip;

    private Date created;

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

    public Date getClock() {
        return clock;
    }

    public void setClock(Date clock) {
        this.clock = clock;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}