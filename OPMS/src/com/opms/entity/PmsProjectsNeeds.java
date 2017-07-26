package com.opms.entity;

public class PmsProjectsNeeds {
    private Long needsid;

    private Long projectid;

    private Long userid;

    private String name;

    private Long acceptid;

    private Byte source;

    private Boolean level;

    private Byte tasktime;

    private String attachment;

    private Integer created;

    private Integer changed;

    private Boolean stage;

    private Boolean status;

    public Long getNeedsid() {
        return needsid;
    }

    public void setNeedsid(Long needsid) {
        this.needsid = needsid;
    }

    public Long getProjectid() {
        return projectid;
    }

    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAcceptid() {
        return acceptid;
    }

    public void setAcceptid(Long acceptid) {
        this.acceptid = acceptid;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public Byte getTasktime() {
        return tasktime;
    }

    public void setTasktime(Byte tasktime) {
        this.tasktime = tasktime;
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

    public Boolean getStage() {
        return stage;
    }

    public void setStage(Boolean stage) {
        this.stage = stage;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}