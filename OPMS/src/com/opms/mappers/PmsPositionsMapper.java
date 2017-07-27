package com.opms.mappers;

import com.opms.entity.PmsPositions;
import com.opms.entity.PmsPositionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPositionsMapper {
    int countByExample(PmsPositionsExample example);

    int deleteByExample(PmsPositionsExample example);

    int deleteByPrimaryKey(Long positionid);

    int insert(PmsPositions record);

    int insertSelective(PmsPositions record);

    List<PmsPositions> selectByExample(PmsPositionsExample example);

    PmsPositions selectByPrimaryKey(Long positionid);

    int updateByExampleSelective(@Param("record") PmsPositions record, @Param("example") PmsPositionsExample example);

    int updateByExample(@Param("record") PmsPositions record, @Param("example") PmsPositionsExample example);

    int updateByPrimaryKeySelective(PmsPositions record);

    int updateByPrimaryKey(PmsPositions record);
}