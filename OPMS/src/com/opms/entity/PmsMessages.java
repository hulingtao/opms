package com.opms.entity;

public class PmsMessages {
    private Long msgid;

    private Long userid;

    private Long touserid;

    private Byte type;

    private Byte subtype;

    private String title;

    private String url;

    private Boolean view;

    private Integer created;

    public Long getMsgid() {
        return msgid;
    }

    public void setMsgid(Long msgid) {
        this.msgid = msgid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getTouserid() {
        return touserid;
    }

    public void setTouserid(Long touserid) {
        this.touserid = touserid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getSubtype() {
        return subtype;
    }

    public void setSubtype(Byte subtype) {
        this.subtype = subtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getView() {
        return view;
    }

    public void setView(Boolean view) {
        this.view = view;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
}