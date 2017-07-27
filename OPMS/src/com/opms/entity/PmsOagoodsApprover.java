package com.opms.entity;

import java.util.Date;

public class PmsOagoodsApprover {
    private Long approverid;

    private Long oagoodid;

    private Long userid;

    private String summary;

    private Integer status;

    private Date created;

    private Date changed;

    public Long getApproverid() {
        return approverid;
    }

    public void setApproverid(Long approverid) {
        this.approverid = approverid;
    }

    public Long getOagoodid() {
        return oagoodid;
    }

    public void setOagoodid(Long oagoodid) {
        this.oagoodid = oagoodid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getChanged() {
        return changed;
    }

    public void setChanged(Date changed) {
        this.changed = changed;
    }
}