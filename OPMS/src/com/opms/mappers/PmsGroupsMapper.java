package com.opms.mappers;

import com.opms.entity.PmsGroups;
import com.opms.entity.PmsGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsGroupsMapper {
    int countByExample(PmsGroupsExample example);

    int deleteByExample(PmsGroupsExample example);

    int deleteByPrimaryKey(Long groupid);

    int insert(PmsGroups record);

    int insertSelective(PmsGroups record);

    List<PmsGroups> selectByExample(PmsGroupsExample example);

    PmsGroups selectByPrimaryKey(Long groupid);

    int updateByExampleSelective(@Param("record") PmsGroups record, @Param("example") PmsGroupsExample example);

    int updateByExample(@Param("record") PmsGroups record, @Param("example") PmsGroupsExample example);

    int updateByPrimaryKeySelective(PmsGroups record);

    int updateByPrimaryKey(PmsGroups record);
}