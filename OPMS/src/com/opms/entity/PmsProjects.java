package com.opms.entity;

import java.util.Date;

public class PmsProjects {
    private Long projectid;

    private Long userid;

    private String name;

    private String aliasname;

    private Date started;

    private Date ended;

    private Date created;

    private Integer status;

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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