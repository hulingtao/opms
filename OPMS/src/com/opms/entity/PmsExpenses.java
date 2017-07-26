package com.opms.entity;

public class PmsExpenses {
    private Long expenseid;

    private Long userid;

    private String amounts;

    private String types;

    private String contents;

    private String total;

    private String picture;

    private Boolean result;

    private Boolean status;

    private String approverids;

    private Integer created;

    private Integer changed;

    public Long getExpenseid() {
        return expenseid;
    }

    public void setExpenseid(Long expenseid) {
        this.expenseid = expenseid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getAmounts() {
        return amounts;
    }

    public void setAmounts(String amounts) {
        this.amounts = amounts;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getApproverids() {
        return approverids;
    }

    public void setApproverids(String approverids) {
        this.approverids = approverids;
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
}