package com.opms.mappers;

import com.opms.entity.PmsOagoods;
import com.opms.entity.PmsOagoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsOagoodsMapper {
    int countByExample(PmsOagoodsExample example);

    int deleteByExample(PmsOagoodsExample example);

    int deleteByPrimaryKey(Long oagoodid);

    int insert(PmsOagoods record);

    int insertSelective(PmsOagoods record);

    List<PmsOagoods> selectByExample(PmsOagoodsExample example);

    PmsOagoods selectByPrimaryKey(Long oagoodid);

    int updateByExampleSelective(@Param("record") PmsOagoods record, @Param("example") PmsOagoodsExample example);

    int updateByExample(@Param("record") PmsOagoods record, @Param("example") PmsOagoodsExample example);

    int updateByPrimaryKeySelective(PmsOagoods record);

    int updateByPrimaryKey(PmsOagoods record);
}