package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.VInterviewSummary;
import com.guoyasoft.bean.db.interview.VInterviewSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VInterviewSummaryMapper {
    long countByExample(VInterviewSummaryExample example);

    int deleteByExample(VInterviewSummaryExample example);

    int insert(VInterviewSummary record);

    int insertSelective(VInterviewSummary record);

    List<VInterviewSummary> selectByExample(VInterviewSummaryExample example);

    int updateByExampleSelective(@Param("record") VInterviewSummary record, @Param("example") VInterviewSummaryExample example);

    int updateByExample(@Param("record") VInterviewSummary record, @Param("example") VInterviewSummaryExample example);
}