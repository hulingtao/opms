package com.opms.entity;

import java.util.Date;

public class PmsProjectsNeeds {
    private Long needsid;

    private Long projectid;

    private Long userid;

    private String name;

    private Long acceptid;

    private Integer source;

    private Integer level;

    private Integer tasktime;

    private String attachment;

    private Date created;

    private Date changed;

    private Integer stage;

    private Integer status;

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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
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

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
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

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}