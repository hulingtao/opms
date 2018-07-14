package com.opms.entity;

public class NeedSearch {

	private Integer stage;
	private Long acceptid;
	private String keywords;
	private Long projectid;
	
	public Long getProjectid() {
		return projectid;
	}
	public void setProjectid(Long projectid) {
		this.projectid = projectid;
	}
	public Integer getStage() {
		return stage;
	}
	public void setStage(Integer stage) {
		this.stage = stage;
	}
	public Long getAcceptid() {
		return acceptid;
	}
	public void setAcceptid(Long acceptid) {
		this.acceptid = acceptid;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	@Override
	public String toString() {
		return "NeedSearch [status=" + status + ", stage=" + stage
				+ ", acceptid=" + acceptid + ", keywords=" + keywords + "]";
	}
}
