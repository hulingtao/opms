package com.opms.mappers;

import com.opms.entity.PmsBusinesstrips;
import com.opms.entity.PmsBusinesstripsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBusinesstripsMapper {
    int countByExample(PmsBusinesstripsExample example);

    int deleteByExample(PmsBusinesstripsExample example);

    int deleteByPrimaryKey(Long businesstripid);

    int insert(PmsBusinesstrips record);

    int insertSelective(PmsBusinesstrips record);

    List<PmsBusinesstrips> selectByExample(PmsBusinesstripsExample example);

    PmsBusinesstrips selectByPrimaryKey(Long businesstripid);

    int updateByExampleSelective(@Param("record") PmsBusinesstrips record, @Param("example") PmsBusinesstripsExample example);

    int updateByExample(@Param("record") PmsBusinesstrips record, @Param("example") PmsBusinesstripsExample example);

    int updateByPrimaryKeySelective(PmsBusinesstrips record);

    int updateByPrimaryKey(PmsBusinesstrips record);
}