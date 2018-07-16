package com.opms.entity;

public class NeedSearch {

	private Integer stage;
	private Long acceptid;
	private int age;
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

	@Override
	public String toString() {
		return "NeedSearch [status=" + status + ", stage=" + stage
				+ ", acceptid=" + acceptid +"]";
	}
}
