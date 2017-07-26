package com.opms.entity;

public class PmsResumes {
    private Long resumeid;

    private String realname;

    private Boolean sex;

    private Integer birth;

    private Boolean edu;

    private Boolean work;

    private String attachment;

    private Integer created;

    private Boolean status;

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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
    }

    public Boolean getEdu() {
        return edu;
    }

    public void setEdu(Boolean edu) {
        this.edu = edu;
    }

    public Boolean getWork() {
        return work;
    }

    public void setWork(Boolean work) {
        this.work = work;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
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