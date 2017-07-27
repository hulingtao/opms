package com.opms.mappers;

import com.opms.entity.PmsAlbums;
import com.opms.entity.PmsAlbumsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumsMapper {
    int countByExample(PmsAlbumsExample example);

    int deleteByExample(PmsAlbumsExample example);

    int deleteByPrimaryKey(Long albumid);

    int insert(PmsAlbums record);

    int insertSelective(PmsAlbums record);

    List<PmsAlbums> selectByExample(PmsAlbumsExample example);

    PmsAlbums selectByPrimaryKey(Long albumid);

    int updateByExampleSelective(@Param("record") PmsAlbums record, @Param("example") PmsAlbumsExample example);

    int updateByExample(@Param("record") PmsAlbums record, @Param("example") PmsAlbumsExample example);

    int updateByPrimaryKeySelective(PmsAlbums record);

    int updateByPrimaryKey(PmsAlbums record);
}