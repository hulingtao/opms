package com.opms.mappers;

import com.opms.entity.PmsAlbumsLaud;
import com.opms.entity.PmsAlbumsLaudExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumsLaudMapper {
    int countByExample(PmsAlbumsLaudExample example);

    int deleteByExample(PmsAlbumsLaudExample example);

    int deleteByPrimaryKey(Long laudid);

    int insert(PmsAlbumsLaud record);

    int insertSelective(PmsAlbumsLaud record);

    List<PmsAlbumsLaud> selectByExample(PmsAlbumsLaudExample example);

    PmsAlbumsLaud selectByPrimaryKey(Long laudid);

    int updateByExampleSelective(@Param("record") PmsAlbumsLaud record, @Param("example") PmsAlbumsLaudExample example);

    int updateByExample(@Param("record") PmsAlbumsLaud record, @Param("example") PmsAlbumsLaudExample example);

    int updateByPrimaryKeySelective(PmsAlbumsLaud record);

    int updateByPrimaryKey(PmsAlbumsLaud record);
}