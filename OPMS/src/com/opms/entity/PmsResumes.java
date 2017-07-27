package com.opms.entity;

import java.util.Date;

public class PmsResumes {
    private Long resumeid;

    private String realname;

    private Integer sex;

    private Date birth;

    private Integer edu;

    private Integer work;

    private String attachment;

    private Date created;

    private Integer status;

    private String note;

    private String phone;

    public Long getResumeid() {
        return resumeid;
    }

    public void setResumeid(Long resumeid) {
        this.resumeid = resumeid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getEdu() {
        return edu;
    }

    public void setEdu(Integer edu) {
        this.edu = edu;
    }

    public Integer getWork() {
        return work;
    }

    public void setWork(Integer work) {
        this.work = work;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}