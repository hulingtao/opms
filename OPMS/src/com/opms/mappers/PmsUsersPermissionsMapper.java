package com.opms.mappers;

import com.opms.entity.PmsUsersPermissions;
import com.opms.entity.PmsUsersPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsUsersPermissionsMapper {
    int countByExample(PmsUsersPermissionsExample example);

    int deleteByExample(PmsUsersPermissionsExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(PmsUsersPermissions record);

    int insertSelective(PmsUsersPermissions record);

    List<PmsUsersPermissions> selectByExample(PmsUsersPermissionsExample example);

    PmsUsersPermissions selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") PmsUsersPermissions record, @Param("example") PmsUsersPermissionsExample example);

    int updateByExample(@Param("record") PmsUsersPermissions record, @Param("example") PmsUsersPermissionsExample example);

    int updateByPrimaryKeySelective(PmsUsersPermissions record);

    int updateByPrimaryKey(PmsUsersPermissions record);
}