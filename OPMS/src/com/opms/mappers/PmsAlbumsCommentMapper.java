package com.opms.mappers;

import com.opms.entity.PmsAlbumsComment;
import com.opms.entity.PmsAlbumsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumsCommentMapper {
    int countByExample(PmsAlbumsCommentExample example);

    int deleteByExample(PmsAlbumsCommentExample example);

    int deleteByPrimaryKey(Long comtid);

    int insert(PmsAlbumsComment record);

    int insertSelective(PmsAlbumsComment record);

    List<PmsAlbumsComment> selectByExample(PmsAlbumsCommentExample example);

    PmsAlbumsComment selectByPrimaryKey(Long comtid);

    int updateByExampleSelective(@Param("record") PmsAlbumsComment record, @Param("example") PmsAlbumsCommentExample example);

    int updateByExample(@Param("record") PmsAlbumsComment record, @Param("example") PmsAlbumsCommentExample example);

    int updateByPrimaryKeySelective(PmsAlbumsComment record);

    int updateByPrimaryKey(PmsAlbumsComment record);
}