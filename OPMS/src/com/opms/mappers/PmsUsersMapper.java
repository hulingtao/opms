package com.opms.mappers;

import com.opms.entity.PmsUsers;
import com.opms.entity.PmsUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsUsersMapper {
    int countByExample(PmsUsersExample example);

    int deleteByExample(PmsUsersExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(PmsUsers record);

    int insertSelective(PmsUsers record);

    List<PmsUsers> selectByExample(PmsUsersExample example);

    PmsUsers selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") PmsUsers record, @Param("example") PmsUsersExample example);

    int updateByExample(@Param("record") PmsUsers record, @Param("example") PmsUsersExample example);

    int updateByPrimaryKeySelective(PmsUsers record);

    int updateByPrimaryKey(PmsUsers record);
}