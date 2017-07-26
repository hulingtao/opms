package com.opms.entity;

public class PmsLeavesApprover {
    private Long approverid;

    private Long leaveid;

    private Long userid;

    private String summary;

    private Boolean status;

    private Integer created;

    private Integer changed;

    public Long getApproverid() {
        return approverid;
    }

    public void setApproverid(Long approverid) {
        this.approverid = approverid;
    }

    public Long getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(Long leaveid) {
        this.leaveid = leaveid;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getChanged() {
        return changed;
    }

    public void setChanged(Integer changed) {
        this.changed = changed;
    }
}