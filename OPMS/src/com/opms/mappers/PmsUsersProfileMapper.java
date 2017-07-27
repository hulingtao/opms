package com.opms.mappers;

import com.opms.entity.PmsUsersProfile;
import com.opms.entity.PmsUsersProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsUsersProfileMapper {
    int countByExample(PmsUsersProfileExample example);

    int deleteByExample(PmsUsersProfileExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(PmsUsersProfile record);

    int insertSelective(PmsUsersProfile record);

    List<PmsUsersProfile> selectByExample(PmsUsersProfileExample example);

    PmsUsersProfile selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") PmsUsersProfile record, @Param("example") PmsUsersProfileExample example);

    int updateByExample(@Param("record") PmsUsersProfile record, @Param("example") PmsUsersProfileExample example);

    int updateByPrimaryKeySelective(PmsUsersProfile record);

    int updateByPrimaryKey(PmsUsersProfile record);
}