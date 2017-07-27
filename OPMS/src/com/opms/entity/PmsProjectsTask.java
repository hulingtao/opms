package com.opms.entity;

public class PmsProjectsTask {
    private Long taskid;

    private Long needsid;

    private Long userid;

    private Long projectid;

    private Long acceptid;

    private String ccid;

    private Long completeid;

    private String name;

    private Integer type;

    private Integer level;

    private Integer tasktime;

    private Integer ended;

    private Integer started;

    private String attachment;

    private Integer created;

    private Integer changed;

    private Integer status;

    private Long closeid;

    private Long cancelid;

    public Long getTaskid() {
        return taskid;
    }

    public void setTaskid(Long taskid) {
        this.taskid = taskid;
    }

    public Long getNeedsid() {
        return needsid;
    }

    public void setNeedsid(Long needsid) {
        this.needsid = needsid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getProjectid() {
        return projectid;
    }

    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }

    public Long getAcceptid() {
        return acceptid;
    }

    public void setAcceptid(Long acceptid) {
        this.acceptid = acceptid;
    }

    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
    }

    public Long getCompleteid() {
        return completeid;
    }

    public void setCompleteid(Long completeid) {
        this.completeid = completeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getTasktime() {
        return tasktime;
    }

    public void setTasktime(Integer tasktime) {
        this.tasktime = tasktime;
    }

    public Integer getEnded() {
        return ended;
    }

    public void setEnded(Integer ended) {
        this.ended = ended;
    }

    public Integer getStarted() {
        return started;
    }

    public void setStarted(Integer started) {
        this.started = started;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCloseid() {
        return closeid;
    }

    public void setCloseid(Long closeid) {
        this.closeid = closeid;
    }

    public Long getCancelid() {
        return cancelid;
    }

    public void setCancelid(Long cancelid) {
        this.cancelid = cancelid;
    }
}