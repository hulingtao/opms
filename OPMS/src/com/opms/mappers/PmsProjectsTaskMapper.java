package com.opms.mappers;

import com.opms.entity.PmsProjectsTask;
import com.opms.entity.PmsProjectsTaskExample;
import com.opms.entity.PmsProjectsTaskWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProjectsTaskMapper {
    int countByExample(PmsProjectsTaskExample example);

    int deleteByExample(PmsProjectsTaskExample example);

    int deleteByPrimaryKey(Long taskid);

    int insert(PmsProjectsTaskWithBLOBs record);

    int insertSelective(PmsProjectsTaskWithBLOBs record);

    List<PmsProjectsTaskWithBLOBs> selectByExampleWithBLOBs(PmsProjectsTaskExample example);

    List<PmsProjectsTask> selectByExample(PmsProjectsTaskExample example);

    PmsProjectsTaskWithBLOBs selectByPrimaryKey(Long taskid);

    int updateByExampleSelective(@Param("record") PmsProjectsTaskWithBLOBs record, @Param("example") PmsProjectsTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProjectsTaskWithBLOBs record, @Param("example") PmsProjectsTaskExample example);

    int updateByExample(@Param("record") PmsProjectsTask record, @Param("example") PmsProjectsTaskExample example);

    int updateByPrimaryKeySelective(PmsProjectsTaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PmsProjectsTaskWithBLOBs record);

    int updateByPrimaryKey(PmsProjectsTask record);
}