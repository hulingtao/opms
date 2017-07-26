package com.opms.mappers;

import com.opms.entity.PmsKnowledgesComment;
import com.opms.entity.PmsKnowledgesCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsKnowledgesCommentMapper {
    int countByExample(PmsKnowledgesCommentExample example);

    int deleteByExample(PmsKnowledgesCommentExample example);

    int deleteByPrimaryKey(Long comtid);

    int insert(PmsKnowledgesComment record);

    int insertSelective(PmsKnowledgesComment record);

    List<PmsKnowledgesComment> selectByExample(PmsKnowledgesCommentExample example);

    PmsKnowledgesComment selectByPrimaryKey(Long comtid);

    int updateByExampleSelective(@Param("record") PmsKnowledgesComment record, @Param("example") PmsKnowledgesCommentExample example);

    int updateByExample(@Param("record") PmsKnowledgesComment record, @Param("example") PmsKnowledgesCommentExample example);

    int updateByPrimaryKeySelective(PmsKnowledgesComment record);

    int updateByPrimaryKey(PmsKnowledgesComment record);
}