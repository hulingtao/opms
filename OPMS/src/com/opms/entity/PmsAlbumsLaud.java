package com.opms.entity;

public class PmsAlbumsLaud {
    private Long laudid;

    private Long userid;

    private Long albumid;

    private Integer created;

    private Boolean status;

    public Long getLaudid() {
        return laudid;
    }

    public void setLaudid(Long laudid) {
        this.laudid = laudid;
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