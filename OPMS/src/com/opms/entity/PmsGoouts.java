package com.opms.entity;

public class PmsGoouts {
    private Long gooutid;

    private Long userid;

    private Integer started;

    private Integer ended;

    private Float hours;

    private String reason;

    private String picture;

    private Boolean result;

    private Boolean status;

    private String approverids;

    private Integer created;

    private Integer changed;

    public Long getGooutid() {
        return gooutid;
    }

    public void setGooutid(Long gooutid) {
        this.gooutid = gooutid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getStarted() {
        return started;
    }

    public void setStarted(Integer started) {
        this.started = started;
    }

    public Integer getEnded() {
        return ended;
    }

    public void setEnded(Integer ended) {
        this.ended = ended;
    }

    public Float getHours() {
        return hours;
    }

    public void setHours(Float hours) {
        this.hours = hours;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getApproverids() {
        return approverids;
    }

    public void setApproverids(String approverids) {
        this.approverids = approverids;
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