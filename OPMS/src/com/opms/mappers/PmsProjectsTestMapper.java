package com.opms.mappers;

import com.opms.entity.PmsProjectsTest;
import com.opms.entity.PmsProjectsTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProjectsTestMapper {
    int countByExample(PmsProjectsTestExample example);

    int deleteByExample(PmsProjectsTestExample example);

    int deleteByPrimaryKey(Long testid);

    int insert(PmsProjectsTest record);

    int insertSelective(PmsProjectsTest record);

    List<PmsProjectsTest> selectByExampleWithBLOBs(PmsProjectsTestExample example);

    List<PmsProjectsTest> selectByExample(PmsProjectsTestExample example);

    PmsProjectsTest selectByPrimaryKey(Long testid);

    int updateByExampleSelective(@Param("record") PmsProjectsTest record, @Param("example") PmsProjectsTestExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProjectsTest record, @Param("example") PmsProjectsTestExample example);

    int updateByExample(@Param("record") PmsProjectsTest record, @Param("example") PmsProjectsTestExample example);

    int updateByPrimaryKeySelective(PmsProjectsTest record);

    int updateByPrimaryKeyWithBLOBs(PmsProjectsTest record);

    int updateByPrimaryKey(PmsProjectsTest record);
}