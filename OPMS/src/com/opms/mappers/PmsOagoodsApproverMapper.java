package com.opms.mappers;

import com.opms.entity.PmsOagoodsApprover;
import com.opms.entity.PmsOagoodsApproverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsOagoodsApproverMapper {
    int countByExample(PmsOagoodsApproverExample example);

    int deleteByExample(PmsOagoodsApproverExample example);

    int deleteByPrimaryKey(Long approverid);

    int insert(PmsOagoodsApprover record);

    int insertSelective(PmsOagoodsApprover record);

    List<PmsOagoodsApprover> selectByExample(PmsOagoodsApproverExample example);

    PmsOagoodsApprover selectByPrimaryKey(Long approverid);

    int updateByExampleSelective(@Param("record") PmsOagoodsApprover record, @Param("example") PmsOagoodsApproverExample example);

    int updateByExample(@Param("record") PmsOagoodsApprover record, @Param("example") PmsOagoodsApproverExample example);

    int updateByPrimaryKeySelective(PmsOagoodsApprover record);

    int updateByPrimaryKey(PmsOagoodsApprover record);
}