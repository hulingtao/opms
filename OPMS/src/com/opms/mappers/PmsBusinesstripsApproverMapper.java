package com.opms.mappers;

import com.opms.entity.PmsBusinesstripsApprover;
import com.opms.entity.PmsBusinesstripsApproverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBusinesstripsApproverMapper {
    int countByExample(PmsBusinesstripsApproverExample example);

    int deleteByExample(PmsBusinesstripsApproverExample example);

    int deleteByPrimaryKey(Long approverid);

    int insert(PmsBusinesstripsApprover record);

    int insertSelective(PmsBusinesstripsApprover record);

    List<PmsBusinesstripsApprover> selectByExample(PmsBusinesstripsApproverExample example);

    PmsBusinesstripsApprover selectByPrimaryKey(Long approverid);

    int updateByExampleSelective(@Param("record") PmsBusinesstripsApprover record, @Param("example") PmsBusinesstripsApproverExample example);

    int updateByExample(@Param("record") PmsBusinesstripsApprover record, @Param("example") PmsBusinesstripsApproverExample example);

    int updateByPrimaryKeySelective(PmsBusinesstripsApprover record);

    int updateByPrimaryKey(PmsBusinesstripsApprover record);
}