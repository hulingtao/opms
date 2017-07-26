package com.opms.mappers;

import com.opms.entity.PmsCheckworks;
import com.opms.entity.PmsCheckworksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCheckworksMapper {
    int countByExample(PmsCheckworksExample example);

    int deleteByExample(PmsCheckworksExample example);

    int deleteByPrimaryKey(Long checkid);

    int insert(PmsCheckworks record);

    int insertSelective(PmsCheckworks record);

    List<PmsCheckworks> selectByExample(PmsCheckworksExample example);

    PmsCheckworks selectByPrimaryKey(Long checkid);

    int updateByExampleSelective(@Param("record") PmsCheckworks record, @Param("example") PmsCheckworksExample example);

    int updateByExample(@Param("record") PmsCheckworks record, @Param("example") PmsCheckworksExample example);

    int updateByPrimaryKeySelective(PmsCheckworks record);

    int updateByPrimaryKey(PmsCheckworks record);
}