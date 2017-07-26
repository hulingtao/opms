package com.opms.mappers;

import com.opms.entity.PmsProjectsTaskLog;
import com.opms.entity.PmsProjectsTaskLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProjectsTaskLogMapper {
    int countByExample(PmsProjectsTaskLogExample example);

    int deleteByExample(PmsProjectsTaskLogExample example);

    int insert(PmsProjectsTaskLog record);

    int insertSelective(PmsProjectsTaskLog record);

    List<PmsProjectsTaskLog> selectByExampleWithBLOBs(PmsProjectsTaskLogExample example);

    List<PmsProjectsTaskLog> selectByExample(PmsProjectsTaskLogExample example);

    int updateByExampleSelective(@Param("record") PmsProjectsTaskLog record, @Param("example") PmsProjectsTaskLogExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProjectsTaskLog record, @Param("example") PmsProjectsTaskLogExample example);

    int updateByExample(@Param("record") PmsProjectsTaskLog record, @Param("example") PmsProjectsTaskLogExample example);
}