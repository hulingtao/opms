package com.opms.mappers;

import com.opms.entity.PmsExpenses;
import com.opms.entity.PmsExpensesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsExpensesMapper {
    int countByExample(PmsExpensesExample example);

    int deleteByExample(PmsExpensesExample example);

    int deleteByPrimaryKey(Long expenseid);

    int insert(PmsExpenses record);

    int insertSelective(PmsExpenses record);

    List<PmsExpenses> selectByExample(PmsExpensesExample example);

    PmsExpenses selectByPrimaryKey(Long expenseid);

    int updateByExampleSelective(@Param("record") PmsExpenses record, @Param("example") PmsExpensesExample example);

    int updateByExample(@Param("record") PmsExpenses record, @Param("example") PmsExpensesExample example);

    int updateByPrimaryKeySelective(PmsExpenses record);

    int updateByPrimaryKey(PmsExpenses record);
}