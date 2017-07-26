package com.opms.mappers;

import com.opms.entity.PmsDeparts;
import com.opms.entity.PmsDepartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsDepartsMapper {
    int countByExample(PmsDepartsExample example);

    int deleteByExample(PmsDepartsExample example);

    int deleteByPrimaryKey(Long departid);

    int insert(PmsDeparts record);

    int insertSelective(PmsDeparts record);

    List<PmsDeparts> selectByExample(PmsDepartsExample example);

    PmsDeparts selectByPrimaryKey(Long departid);

    int updateByExampleSelective(@Param("record") PmsDeparts record, @Param("example") PmsDepartsExample example);

    int updateByExample(@Param("record") PmsDeparts record, @Param("example") PmsDepartsExample example);

    int updateByPrimaryKeySelective(PmsDeparts record);

    int updateByPrimaryKey(PmsDeparts record);
}