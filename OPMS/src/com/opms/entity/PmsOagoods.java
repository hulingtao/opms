package com.opms.entity;

import java.util.Date;

public class PmsOagoods {
    private Long oagoodid;

    private Long userid;

    private String purpose;

    private String names;

    private String quantitys;

    private String content;

    private String picture;

    private Integer result;

    private Integer status;

    private String approverids;

    private Date created;

    private Date changed;

    public Long getOagoodid() {
        return oagoodid;
    }

    public void setOagoodid(Long oagoodid) {
        this.oagoodid = oagoodid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getQuantitys() {
        return quantitys;
    }

    public void setQuantitys(String quantitys) {
        this.quantitys = quantitys;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApproverids() {
        return approverids;
    }

    public void setApproverids(String approverids) {
        this.approverids = approverids;
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
}