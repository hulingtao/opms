package com.opms.entity;

public class PmsProjects {
    private Long projectid;

    private Long userid;

    private String name;

    private String aliasname;

    private Integer started;

    private Integer ended;

    private Integer created;

    private Boolean status;

    private Long projuserid;

    private Long produserid;

    private Long testuserid;

    private Long publuserid;

    private String desc;

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

    public String getAliasname() {
        return aliasname;
    }

    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
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

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getProjuserid() {
        return projuserid;
    }

    public void setProjuserid(Long projuserid) {
        this.projuserid = projuserid;
    }

    public Long getProduserid() {
        return produserid;
    }

    public void setProduserid(Long produserid) {
        this.produserid = produserid;
    }

    public Long getTestuserid() {
        return testuserid;
    }

    public void setTestuserid(Long testuserid) {
        this.testuserid = testuserid;
    }

    public Long getPubluserid() {
        return publuserid;
    }

    public void setPubluserid(Long publuserid) {
        this.publuserid = publuserid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}