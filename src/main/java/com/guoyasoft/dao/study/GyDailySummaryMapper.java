package com.guoyasoft.dao.study;

import com.guoyasoft.bean.db.study.GyDailySummary;
import com.guoyasoft.bean.db.study.GyDailySummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyDailySummaryMapper {
    long countByExample(GyDailySummaryExample example);

    int deleteByExample(GyDailySummaryExample example);

    int insert(GyDailySummary record);

    int insertSelective(GyDailySummary record);

    List<GyDailySummary> selectByExample(GyDailySummaryExample example);

    int updateByExampleSelective(@Param("record") GyDailySummary record,
        @Param("example") GyDailySummaryExample example);

    int updateByExample(@Param("record") GyDailySummary record,
        @Param("example") GyDailySummaryExample example);
}
