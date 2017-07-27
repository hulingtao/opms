package com.opms.mappers;

import com.opms.entity.PmsGroupsUser;
import com.opms.entity.PmsGroupsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsGroupsUserMapper {
    int countByExample(PmsGroupsUserExample example);

    int deleteByExample(PmsGroupsUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsGroupsUser record);

    int insertSelective(PmsGroupsUser record);

    List<PmsGroupsUser> selectByExample(PmsGroupsUserExample example);

    PmsGroupsUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsGroupsUser record, @Param("example") PmsGroupsUserExample example);

    int updateByExample(@Param("record") PmsGroupsUser record, @Param("example") PmsGroupsUserExample example);

    int updateByPrimaryKeySelective(PmsGroupsUser record);

    int updateByPrimaryKey(PmsGroupsUser record);
}