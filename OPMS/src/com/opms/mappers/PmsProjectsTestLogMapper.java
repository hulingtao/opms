package com.opms.mappers;

import com.opms.entity.PmsProjectsTestLog;
import com.opms.entity.PmsProjectsTestLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProjectsTestLogMapper {
    int countByExample(PmsProjectsTestLogExample example);

    int deleteByExample(PmsProjectsTestLogExample example);

    int insert(PmsProjectsTestLog record);

    int insertSelective(PmsProjectsTestLog record);

    List<PmsProjectsTestLog> selectByExampleWithBLOBs(PmsProjectsTestLogExample example);

    List<PmsProjectsTestLog> selectByExample(PmsProjectsTestLogExample example);

    int updateByExampleSelective(@Param("record") PmsProjectsTestLog record, @Param("example") PmsProjectsTestLogExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProjectsTestLog record, @Param("example") PmsProjectsTestLogExample example);

    int updateByExample(@Param("record") PmsProjectsTestLog record, @Param("example") PmsProjectsTestLogExample example);
}