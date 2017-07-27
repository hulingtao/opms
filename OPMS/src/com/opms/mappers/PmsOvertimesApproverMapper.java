package com.opms.mappers;

import com.opms.entity.PmsOvertimesApprover;
import com.opms.entity.PmsOvertimesApproverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsOvertimesApproverMapper {
    int countByExample(PmsOvertimesApproverExample example);

    int deleteByExample(PmsOvertimesApproverExample example);

    int deleteByPrimaryKey(Long approverid);

    int insert(PmsOvertimesApprover record);

    int insertSelective(PmsOvertimesApprover record);

    List<PmsOvertimesApprover> selectByExample(PmsOvertimesApproverExample example);

    PmsOvertimesApprover selectByPrimaryKey(Long approverid);

    int updateByExampleSelective(@Param("record") PmsOvertimesApprover record, @Param("example") PmsOvertimesApproverExample example);

    int updateByExample(@Param("record") PmsOvertimesApprover record, @Param("example") PmsOvertimesApproverExample example);

    int updateByPrimaryKeySelective(PmsOvertimesApprover record);

    int updateByPrimaryKey(PmsOvertimesApprover record);
}