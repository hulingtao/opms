package com.opms.mappers;

import com.opms.entity.PmsOvertimes;
import com.opms.entity.PmsOvertimesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsOvertimesMapper {
    int countByExample(PmsOvertimesExample example);

    int deleteByExample(PmsOvertimesExample example);

    int deleteByPrimaryKey(Long overtimeid);

    int insert(PmsOvertimes record);

    int insertSelective(PmsOvertimes record);

    List<PmsOvertimes> selectByExample(PmsOvertimesExample example);

    PmsOvertimes selectByPrimaryKey(Long overtimeid);

    int updateByExampleSelective(@Param("record") PmsOvertimes record, @Param("example") PmsOvertimesExample example);

    int updateByExample(@Param("record") PmsOvertimes record, @Param("example") PmsOvertimesExample example);

    int updateByPrimaryKeySelective(PmsOvertimes record);

    int updateByPrimaryKey(PmsOvertimes record);
}