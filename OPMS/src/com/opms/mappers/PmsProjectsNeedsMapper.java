package com.opms.mappers;

import com.opms.entity.PmsProjectsNeeds;
import com.opms.entity.PmsProjectsNeedsExample;
import com.opms.entity.PmsProjectsNeedsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProjectsNeedsMapper {
    int countByExample(PmsProjectsNeedsExample example);

    int deleteByExample(PmsProjectsNeedsExample example);

    int deleteByPrimaryKey(Long needsid);

    int insert(PmsProjectsNeedsWithBLOBs record);

    int insertSelective(PmsProjectsNeedsWithBLOBs record);

    List<PmsProjectsNeedsWithBLOBs> selectByExampleWithBLOBs(PmsProjectsNeedsExample example);

    List<PmsProjectsNeeds> selectByExample(PmsProjectsNeedsExample example);

    PmsProjectsNeedsWithBLOBs selectByPrimaryKey(Long needsid);

    int updateByExampleSelective(@Param("record") PmsProjectsNeedsWithBLOBs record, @Param("example") PmsProjectsNeedsExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProjectsNeedsWithBLOBs record, @Param("example") PmsProjectsNeedsExample example);

    int updateByExample(@Param("record") PmsProjectsNeeds record, @Param("example") PmsProjectsNeedsExample example);

    int updateByPrimaryKeySelective(PmsProjectsNeedsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PmsProjectsNeedsWithBLOBs record);

    int updateByPrimaryKey(PmsProjectsNeeds record);
}