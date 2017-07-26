package com.opms.entity;

public class PmsAlbumsComment {
    private Long comtid;

    private Long userid;

    private Long albumid;

    private String content;

    private Integer created;

    private Boolean status;

    public Long getComtid() {
        return comtid;
    }

    public void setComtid(Long comtid) {
        this.comtid = comtid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Long albumid) {
        this.albumid = albumid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
}