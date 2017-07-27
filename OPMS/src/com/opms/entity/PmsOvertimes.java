package com.opms.entity;

import java.util.Date;

public class PmsOvertimes {
    private Long overtimeid;

    private Long userid;

    private Date started;

    private Date ended;

    private Integer longtime;

    private Integer holiday;

    private Integer way;

    private String reason;

    private Integer result;

    private Integer status;

    private String approverids;

    private Date created;

    private Date changed;

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

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getEnded() {
        return ended;
    }

    public void setEnded(Date ended) {
        this.ended = ended;
    }

    public Integer getLongtime() {
        return longtime;
    }

    public void setLongtime(Integer longtime) {
        this.longtime = longtime;
    }

    public Integer getHoliday() {
        return holiday;
    }

    public void setHoliday(Integer holiday) {
        this.holiday = holiday;
    }

    public Integer getWay() {
        return way;
    }

    public void setWay(Integer way) {
        this.way = way;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApproverids() {
        return approverids;
    }

    public void setApproverids(String approverids) {
        this.approverids = approverids;
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