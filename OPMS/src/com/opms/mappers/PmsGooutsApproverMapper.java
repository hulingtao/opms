package com.opms.mappers;

import com.opms.entity.PmsGooutsApprover;
import com.opms.entity.PmsGooutsApproverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsGooutsApproverMapper {
    int countByExample(PmsGooutsApproverExample example);

    int deleteByExample(PmsGooutsApproverExample example);

    int deleteByPrimaryKey(Long approverid);

    int insert(PmsGooutsApprover record);

    int insertSelective(PmsGooutsApprover record);

    List<PmsGooutsApprover> selectByExample(PmsGooutsApproverExample example);

    PmsGooutsApprover selectByPrimaryKey(Long approverid);

    int updateByExampleSelective(@Param("record") PmsGooutsApprover record, @Param("example") PmsGooutsApproverExample example);

    int updateByExample(@Param("record") PmsGooutsApprover record, @Param("example") PmsGooutsApproverExample example);

    int updateByPrimaryKeySelective(PmsGooutsApprover record);

    int updateByPrimaryKey(PmsGooutsApprover record);
}