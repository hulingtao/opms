package com.opms.mappers;

import com.opms.entity.PmsProjectsVersion;
import com.opms.entity.PmsProjectsVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProjectsVersionMapper {
    int countByExample(PmsProjectsVersionExample example);

    int deleteByExample(PmsProjectsVersionExample example);

    int deleteByPrimaryKey(Long versionid);

    int insert(PmsProjectsVersion record);

    int insertSelective(PmsProjectsVersion record);

    List<PmsProjectsVersion> selectByExampleWithBLOBs(PmsProjectsVersionExample example);

    List<PmsProjectsVersion> selectByExample(PmsProjectsVersionExample example);

    PmsProjectsVersion selectByPrimaryKey(Long versionid);

    int updateByExampleSelective(@Param("record") PmsProjectsVersion record, @Param("example") PmsProjectsVersionExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProjectsVersion record, @Param("example") PmsProjectsVersionExample example);

    int updateByExample(@Param("record") PmsProjectsVersion record, @Param("example") PmsProjectsVersionExample example);

    int updateByPrimaryKeySelective(PmsProjectsVersion record);

    int updateByPrimaryKeyWithBLOBs(PmsProjectsVersion record);

    int updateByPrimaryKey(PmsProjectsVersion record);
}