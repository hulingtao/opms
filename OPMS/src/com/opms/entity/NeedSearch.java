package com.opms.entity;

public class NeedSearch {

	private Integer stage;
	private Long acceptid;
	private String keyword;
<<<<<<< HEAD
	private Long project;
	public Long getProject(){
	      return project;
	}
  	public void setProject(String project ){
	      this.project=project;
	}	
=======
	private String project;
>>>>>>> de78c9bc00b1fd797bf7cbd6e82d3ec20a0fa627
	public Integer getStage() {
		return stage;
	}
	public void setStage(Integer stage) {
		this.stage = stage;
	}
	public Long getAcceptid() {
		return acceptid;
	}
	public void setProject(String project){
		this.project=project
	}
	public String getProject(){
	  return project;	
	}
	public void setAcceptid(Long acceptid) {
		this.acceptid = acceptid;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "NeedSearch [status=" + status + ", stage=" + stage
				+ ", acceptid=" + acceptid + ", keywords=" + keywords + "]";
	}
}
