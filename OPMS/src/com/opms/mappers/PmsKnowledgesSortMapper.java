package com.opms.mappers;

import com.opms.entity.PmsKnowledgesSort;
import com.opms.entity.PmsKnowledgesSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsKnowledgesSortMapper {
    int countByExample(PmsKnowledgesSortExample example);

    int deleteByExample(PmsKnowledgesSortExample example);

    int deleteByPrimaryKey(Long sortid);

    int insert(PmsKnowledgesSort record);

    int insertSelective(PmsKnowledgesSort record);

    List<PmsKnowledgesSort> selectByExample(PmsKnowledgesSortExample example);

    PmsKnowledgesSort selectByPrimaryKey(Long sortid);

    int updateByExampleSelective(@Param("record") PmsKnowledgesSort record, @Param("example") PmsKnowledgesSortExample example);

    int updateByExample(@Param("record") PmsKnowledgesSort record, @Param("example") PmsKnowledgesSortExample example);

    int updateByPrimaryKeySelective(PmsKnowledgesSort record);

    int updateByPrimaryKey(PmsKnowledgesSort record);
}