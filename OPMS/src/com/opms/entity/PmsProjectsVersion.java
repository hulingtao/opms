package com.opms.entity;

public class PmsProjectsVersion {
    private Long versionid;

    private Long projectid;

    private Long userid;

    private String title;

    private Integer versioned;

    private String sourceurl;

    private String downurl;

    private String attachment;

    private Integer created;

    private Integer changed;

    private String content;

    public Long getVersionid() {
        return versionid;
    }

    public void setVersionid(Long versionid) {
        this.versionid = versionid;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getVersioned() {
        return versioned;
    }

    public void setVersioned(Integer versioned) {
        this.versioned = versioned;
    }

    public String getSourceurl() {
        return sourceurl;
    }

    public void setSourceurl(String sourceurl) {
        this.sourceurl = sourceurl;
    }

    public String getDownurl() {
        return downurl;
    }

    public void setDownurl(String downurl) {
        this.downurl = downurl;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}