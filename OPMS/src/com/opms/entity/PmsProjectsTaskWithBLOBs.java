package com.opms.entity;

public class PmsProjectsTaskWithBLOBs extends PmsProjectsTask {
    private String desc;

    private String note;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}