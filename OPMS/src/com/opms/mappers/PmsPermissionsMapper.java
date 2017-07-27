package com.opms.mappers;

import com.opms.entity.PmsPermissions;
import com.opms.entity.PmsPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPermissionsMapper {
    int countByExample(PmsPermissionsExample example);

    int deleteByExample(PmsPermissionsExample example);

    int deleteByPrimaryKey(Long permissionid);

    int insert(PmsPermissions record);

    int insertSelective(PmsPermissions record);

    List<PmsPermissions> selectByExample(PmsPermissionsExample example);

    PmsPermissions selectByPrimaryKey(Long permissionid);

    int updateByExampleSelective(@Param("record") PmsPermissions record, @Param("example") PmsPermissionsExample example);

    int updateByExample(@Param("record") PmsPermissions record, @Param("example") PmsPermissionsExample example);

    int updateByPrimaryKeySelective(PmsPermissions record);

    int updateByPrimaryKey(PmsPermissions record);
}