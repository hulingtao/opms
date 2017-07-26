package com.opms.mappers;

import com.opms.entity.PmsLeaves;
import com.opms.entity.PmsLeavesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsLeavesMapper {
    int countByExample(PmsLeavesExample example);

    int deleteByExample(PmsLeavesExample example);

    int deleteByPrimaryKey(Long leaveid);

    int insert(PmsLeaves record);

    int insertSelective(PmsLeaves record);

    List<PmsLeaves> selectByExample(PmsLeavesExample example);

    PmsLeaves selectByPrimaryKey(Long leaveid);

    int updateByExampleSelective(@Param("record") PmsLeaves record, @Param("example") PmsLeavesExample example);

    int updateByExample(@Param("record") PmsLeaves record, @Param("example") PmsLeavesExample example);

    int updateByPrimaryKeySelective(PmsLeaves record);

    int updateByPrimaryKey(PmsLeaves record);
}