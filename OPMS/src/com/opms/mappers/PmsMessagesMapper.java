package com.opms.mappers;

import com.opms.entity.PmsMessages;
import com.opms.entity.PmsMessagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMessagesMapper {
    int countByExample(PmsMessagesExample example);

    int deleteByExample(PmsMessagesExample example);

    int deleteByPrimaryKey(Long msgid);

    int insert(PmsMessages record);

    int insertSelective(PmsMessages record);

    List<PmsMessages> selectByExample(PmsMessagesExample example);

    PmsMessages selectByPrimaryKey(Long msgid);

    int updateByExampleSelective(@Param("record") PmsMessages record, @Param("example") PmsMessagesExample example);

    int updateByExample(@Param("record") PmsMessages record, @Param("example") PmsMessagesExample example);

    int updateByPrimaryKeySelective(PmsMessages record);

    int updateByPrimaryKey(PmsMessages record);
}