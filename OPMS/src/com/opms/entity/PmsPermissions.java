package com.opms.entity;

public class PmsPermissions {
    private Long permissionid;

    private Long parentid;

    private String name;

    private String ename;

    private String icon;

    private Boolean nav;

    private Boolean type;

    private Byte weight;

    public Long getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Long permissionid) {
        this.permissionid = permissionid;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getNav() {
        return nav;
    }

    public void setNav(Boolean nav) {
        this.nav = nav;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Byte getWeight() {
        return weight;
    }

    public void setWeight(Byte weight) {
        this.weight = weight;
    }
}