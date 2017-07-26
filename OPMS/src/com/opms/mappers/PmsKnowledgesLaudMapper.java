package com.opms.mappers;

import com.opms.entity.PmsKnowledgesLaud;
import com.opms.entity.PmsKnowledgesLaudExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsKnowledgesLaudMapper {
    int countByExample(PmsKnowledgesLaudExample example);

    int deleteByExample(PmsKnowledgesLaudExample example);

    int deleteByPrimaryKey(Long laudid);

    int insert(PmsKnowledgesLaud record);

    int insertSelective(PmsKnowledgesLaud record);

    List<PmsKnowledgesLaud> selectByExample(PmsKnowledgesLaudExample example);

    PmsKnowledgesLaud selectByPrimaryKey(Long laudid);

    int updateByExampleSelective(@Param("record") PmsKnowledgesLaud record, @Param("example") PmsKnowledgesLaudExample example);

    int updateByExample(@Param("record") PmsKnowledgesLaud record, @Param("example") PmsKnowledgesLaudExample example);

    int updateByPrimaryKeySelective(PmsKnowledgesLaud record);

    int updateByPrimaryKey(PmsKnowledgesLaud record);
}