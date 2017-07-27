package com.opms.mappers;

import com.opms.entity.PmsNotices;
import com.opms.entity.PmsNoticesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsNoticesMapper {
    int countByExample(PmsNoticesExample example);

    int deleteByExample(PmsNoticesExample example);

    int deleteByPrimaryKey(Long noticeid);

    int insert(PmsNotices record);

    int insertSelective(PmsNotices record);

    List<PmsNotices> selectByExampleWithBLOBs(PmsNoticesExample example);

    List<PmsNotices> selectByExample(PmsNoticesExample example);

    PmsNotices selectByPrimaryKey(Long noticeid);

    int updateByExampleSelective(@Param("record") PmsNotices record, @Param("example") PmsNoticesExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsNotices record, @Param("example") PmsNoticesExample example);

    int updateByExample(@Param("record") PmsNotices record, @Param("example") PmsNoticesExample example);

    int updateByPrimaryKeySelective(PmsNotices record);

    int updateByPrimaryKeyWithBLOBs(PmsNotices record);

    int updateByPrimaryKey(PmsNotices record);
}