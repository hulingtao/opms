package com.opms.mappers;

import com.opms.entity.PmsProjects;
import com.opms.entity.PmsProjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProjectsMapper {
    int countByExample(PmsProjectsExample example);

    int deleteByExample(PmsProjectsExample example);

    int deleteByPrimaryKey(Long projectid);

    int insert(PmsProjects record);

    int insertSelective(PmsProjects record);

    List<PmsProjects> selectByExampleWithBLOBs(PmsProjectsExample example);

    List<PmsProjects> selectByExample(PmsProjectsExample example);

    PmsProjects selectByPrimaryKey(Long projectid);

    int updateByExampleSelective(@Param("record") PmsProjects record, @Param("example") PmsProjectsExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProjects record, @Param("example") PmsProjectsExample example);

    int updateByExample(@Param("record") PmsProjects record, @Param("example") PmsProjectsExample example);

    int updateByPrimaryKeySelective(PmsProjects record);

    int updateByPrimaryKeyWithBLOBs(PmsProjects record);

    int updateByPrimaryKey(PmsProjects record);
}