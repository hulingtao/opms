package com.opms.mappers;

import com.opms.entity.PmsGoouts;
import com.opms.entity.PmsGooutsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsGooutsMapper {
    int countByExample(PmsGooutsExample example);

    int deleteByExample(PmsGooutsExample example);

    int deleteByPrimaryKey(Long gooutid);

    int insert(PmsGoouts record);

    int insertSelective(PmsGoouts record);

    List<PmsGoouts> selectByExample(PmsGooutsExample example);

    PmsGoouts selectByPrimaryKey(Long gooutid);

    int updateByExampleSelective(@Param("record") PmsGoouts record, @Param("example") PmsGooutsExample example);

    int updateByExample(@Param("record") PmsGoouts record, @Param("example") PmsGooutsExample example);

    int updateByPrimaryKeySelective(PmsGoouts record);

    int updateByPrimaryKey(PmsGoouts record);
}