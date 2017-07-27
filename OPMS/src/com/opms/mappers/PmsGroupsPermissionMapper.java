package com.opms.mappers;

import com.opms.entity.PmsGroupsPermission;
import com.opms.entity.PmsGroupsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsGroupsPermissionMapper {
    int countByExample(PmsGroupsPermissionExample example);

    int deleteByExample(PmsGroupsPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsGroupsPermission record);

    int insertSelective(PmsGroupsPermission record);

    List<PmsGroupsPermission> selectByExample(PmsGroupsPermissionExample example);

    PmsGroupsPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsGroupsPermission record, @Param("example") PmsGroupsPermissionExample example);

    int updateByExample(@Param("record") PmsGroupsPermission record, @Param("example") PmsGroupsPermissionExample example);

    int updateByPrimaryKeySelective(PmsGroupsPermission record);

    int updateByPrimaryKey(PmsGroupsPermission record);
}