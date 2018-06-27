package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.TInterviewInterview;
import com.guoyasoft.bean.db.interview.TInterviewInterviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInterviewInterviewMapper {
    long countByExample(TInterviewInterviewExample example);

    int deleteByExample(TInterviewInterviewExample example);

    int deleteByPrimaryKey(Integer interviewId);

    int insert(TInterviewInterview record);

    int insertSelective(TInterviewInterview record);

    List<TInterviewInterview> selectByExample(TInterviewInterviewExample example);

    TInterviewInterview selectByPrimaryKey(Integer interviewId);

    int updateByExampleSelective(@Param("record") TInterviewInterview record, @Param("example") TInterviewInterviewExample example);

    int updateByExample(@Param("record") TInterviewInterview record, @Param("example") TInterviewInterviewExample example);

    int updateByPrimaryKeySelective(TInterviewInterview record);

    int updateByPrimaryKey(TInterviewInterview record);
}