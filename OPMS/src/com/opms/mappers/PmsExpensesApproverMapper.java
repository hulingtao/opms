package com.opms.mappers;

import com.opms.entity.PmsExpensesApprover;
import com.opms.entity.PmsExpensesApproverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsExpensesApproverMapper {
    int countByExample(PmsExpensesApproverExample example);

    int deleteByExample(PmsExpensesApproverExample example);

    int deleteByPrimaryKey(Long approverid);

    int insert(PmsExpensesApprover record);

    int insertSelective(PmsExpensesApprover record);

    List<PmsExpensesApprover> selectByExample(PmsExpensesApproverExample example);

    PmsExpensesApprover selectByPrimaryKey(Long approverid);

    int updateByExampleSelective(@Param("record") PmsExpensesApprover record, @Param("example") PmsExpensesApproverExample example);

    int updateByExample(@Param("record") PmsExpensesApprover record, @Param("example") PmsExpensesApproverExample example);

    int updateByPrimaryKeySelective(PmsExpensesApprover record);

    int updateByPrimaryKey(PmsExpensesApprover record);
}