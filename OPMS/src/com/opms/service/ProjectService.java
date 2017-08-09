package com.opms.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.opms.entity.NeedSearch;
import com.opms.entity.PmsProjects;
import com.opms.entity.PmsProjectsNeeds;
import com.opms.entity.PmsProjectsTask;
import com.opms.entity.PmsProjectsTeam;
import com.opms.entity.PmsProjectsTest;
import com.opms.entity.TaskSearch;

public interface ProjectService {
    List<PmsProjectsTeam> listTeamMesg(Long projectid);
    void deleteMember(Long userid);
    List<PmsProjectsNeeds> listProjectNeed(Long projectid);
    PmsProjectsNeeds getProjectNeed(Long needsid);
    void updateNeed(PmsProjectsNeeds needs);
    void insertNeed(PmsProjectsNeeds needs);
    List<PmsProjectsNeeds> searchNeed(NeedSearch search);
    int updateStatus(PmsProjectsNeeds need);
    List<PmsProjectsTask> listProjectTask(Long projectid);
    PmsProjectsTask getTask(Long taskid);
    List<PmsProjectsTask> listProjectTaskByUserid(Long userid);
    List<PmsProjectsTask> listProjectTaskByUserid2(Long userid);
    List<PmsProjectsTask> listProjectTaskBySolve(Long userid);
    List<PmsProjectsTask> listProjectTaskByClose(Long userid);
    List<PmsProjectsTask> listProjectTaskByDisplay(Long userid);
    List<PmsProjectsTask> listTaskBySearch(TaskSearch search);
    int updateTaskStatus(PmsProjectsTask task);
    int updateAcceptid(PmsProjectsTask task);
    String getPosition(Long userid);
    int getPmsNeedByName(String name);
    void insertTask(PmsProjectsTask task);
    // 项目
    int checkedProjectname(String name);
 	
    List<PmsProjects> searchProject(PmsProjects pmsProjects);
 	
 	PmsProjects getPmsProjects(Long projectid);

 	List<PmsProjects> listPmsProjects();

 	void insertPmsProjects(PmsProjects pmsProjects);

 	void updatePmsProjects(PmsProjects pmsProjects);

 	public void updatePmsProjectsState(PmsProjects pmsProjects);

 	// Bug
 	
 	public List<PmsProjectsTest> searchByAppoint(Long acceptid, Long projectid);//由我指派的bug
 	public List<PmsProjectsTest> searchByMyCreate(Long userid,Long projectid);//由我创建的bug
 	public List<PmsProjectsTest> searchByMySolve(Long completeid,Long projectid);//由我指派的bug
 	
 	public void insertPmsProjectsTest(PmsProjectsTest pmsProjectsTest,MultipartFile filename);
 	
 	public List<PmsProjectsTest> listPmsProjectsTest(long projectid);

 	public PmsProjectsTest getPmsProjectsTest(long testid);

 	public void dispatchPeople(PmsProjectsTest pmsProjectsTest);

 	public void resolvent(PmsProjectsTest pmsProjectsTest);

 	public List<PmsProjectsTest> searchBug(PmsProjectsTest pmsProjectsTest);

 	public void updateBug(PmsProjectsTest pmsProjectsTest, MultipartFile filename);

 	// 查询所有需求

 	public List<PmsProjectsNeeds> listPmsProjectsNeeds(long projectid);

 	// 查询需求相关任务
 	public List<PmsProjectsTask> listPmsProjectsTask(long needsid);
}
