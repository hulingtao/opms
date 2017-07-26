package com.opms.entity;

public class PmsOvertimes {
    private Long overtimeid;

    private Long userid;

    private Integer started;

    private Integer ended;

    private Byte longtime;

    private Boolean holiday;

    private Boolean way;

    private String reason;

    private Boolean result;

    private Boolean status;

    private String approverids;

    private Integer created;

    private Integer changed;

    public Long getOvertimeid() {
        return overtimeid;
    }

    public void setOvertimeid(Long overtimeid) {
        this.overtimeid = overtimeid;
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

    public Byte getLongtime() {
        return longtime;
    }

    public void setLongtime(Byte longtime) {
        this.longtime = longtime;
    }

    public Boolean getHoliday() {
        return holiday;
    }

    public void setHoliday(Boolean holiday) {
        this.holiday = holiday;
    }

    public Boolean getWay() {
        return way;
    }

    public void setWay(Boolean way) {
        this.way = way;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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