package com.opms.mappers;

import com.opms.entity.PmsKnowledges;
import com.opms.entity.PmsKnowledgesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsKnowledgesMapper {
    int countByExample(PmsKnowledgesExample example);

    int deleteByExample(PmsKnowledgesExample example);

    int deleteByPrimaryKey(Long knowid);

    int insert(PmsKnowledges record);

    int insertSelective(PmsKnowledges record);

    List<PmsKnowledges> selectByExampleWithBLOBs(PmsKnowledgesExample example);

    List<PmsKnowledges> selectByExample(PmsKnowledgesExample example);

    PmsKnowledges selectByPrimaryKey(Long knowid);

    int updateByExampleSelective(@Param("record") PmsKnowledges record, @Param("example") PmsKnowledgesExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsKnowledges record, @Param("example") PmsKnowledgesExample example);

    int updateByExample(@Param("record") PmsKnowledges record, @Param("example") PmsKnowledgesExample example);

    int updateByPrimaryKeySelective(PmsKnowledges record);

    int updateByPrimaryKeyWithBLOBs(PmsKnowledges record);

    int updateByPrimaryKey(PmsKnowledges record);
}