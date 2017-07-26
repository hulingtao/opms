package com.opms.mappers;

import com.opms.entity.PmsProjectsDoc;
import com.opms.entity.PmsProjectsDocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProjectsDocMapper {
    int countByExample(PmsProjectsDocExample example);

    int deleteByExample(PmsProjectsDocExample example);

    int deleteByPrimaryKey(Long docid);

    int insert(PmsProjectsDoc record);

    int insertSelective(PmsProjectsDoc record);

    List<PmsProjectsDoc> selectByExampleWithBLOBs(PmsProjectsDocExample example);

    List<PmsProjectsDoc> selectByExample(PmsProjectsDocExample example);

    PmsProjectsDoc selectByPrimaryKey(Long docid);

    int updateByExampleSelective(@Param("record") PmsProjectsDoc record, @Param("example") PmsProjectsDocExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProjectsDoc record, @Param("example") PmsProjectsDocExample example);

    int updateByExample(@Param("record") PmsProjectsDoc record, @Param("example") PmsProjectsDocExample example);

    int updateByPrimaryKeySelective(PmsProjectsDoc record);

    int updateByPrimaryKeyWithBLOBs(PmsProjectsDoc record);

    int updateByPrimaryKey(PmsProjectsDoc record);
}