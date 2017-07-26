package com.opms.entity;

public class PmsBusinesstrips {
    private Long businesstripid;

    private Long userid;

    private String destinations;

    private String starteds;

    private String endeds;

    private Byte days;

    private String reason;

    private String picture;

    private Boolean result;

    private Boolean status;

    private String approverids;

    private Integer created;

    private Integer changed;

    public Long getBusinesstripid() {
        return businesstripid;
    }

    public void setBusinesstripid(Long businesstripid) {
        this.businesstripid = businesstripid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getDestinations() {
        return destinations;
    }

    public void setDestinations(String destinations) {
        this.destinations = destinations;
    }

    public String getStarteds() {
        return starteds;
    }

    public void setStarteds(String starteds) {
        this.starteds = starteds;
    }

    public String getEndeds() {
        return endeds;
    }

    public void setEndeds(String endeds) {
        this.endeds = endeds;
    }

    public Byte getDays() {
        return days;
    }

    public void setDays(Byte days) {
        this.days = days;
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