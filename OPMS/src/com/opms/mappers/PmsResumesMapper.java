package com.opms.mappers;

import com.opms.entity.PmsResumes;
import com.opms.entity.PmsResumesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsResumesMapper {
    int countByExample(PmsResumesExample example);

    int deleteByExample(PmsResumesExample example);

    int deleteByPrimaryKey(Long resumeid);

    int insert(PmsResumes record);

    int insertSelective(PmsResumes record);

    List<PmsResumes> selectByExample(PmsResumesExample example);

    PmsResumes selectByPrimaryKey(Long resumeid);

    int updateByExampleSelective(@Param("record") PmsResumes record, @Param("example") PmsResumesExample example);

    int updateByExample(@Param("record") PmsResumes record, @Param("example") PmsResumesExample example);

    int updateByPrimaryKeySelective(PmsResumes record);

    int updateByPrimaryKey(PmsResumes record);
}