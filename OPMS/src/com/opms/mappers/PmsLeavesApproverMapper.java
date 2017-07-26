package com.opms.mappers;

import com.opms.entity.PmsLeavesApprover;
import com.opms.entity.PmsLeavesApproverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsLeavesApproverMapper {
    int countByExample(PmsLeavesApproverExample example);

    int deleteByExample(PmsLeavesApproverExample example);

    int deleteByPrimaryKey(Long approverid);

    int insert(PmsLeavesApprover record);

    int insertSelective(PmsLeavesApprover record);

    List<PmsLeavesApprover> selectByExample(PmsLeavesApproverExample example);

    PmsLeavesApprover selectByPrimaryKey(Long approverid);

    int updateByExampleSelective(@Param("record") PmsLeavesApprover record, @Param("example") PmsLeavesApproverExample example);

    int updateByExample(@Param("record") PmsLeavesApprover record, @Param("example") PmsLeavesApproverExample example);

    int updateByPrimaryKeySelective(PmsLeavesApprover record);

    int updateByPrimaryKey(PmsLeavesApprover record);
}