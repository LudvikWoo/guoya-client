package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.TInterviewHr;
import com.guoyasoft.bean.db.interview.TInterviewHrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInterviewHrMapper {
    long countByExample(TInterviewHrExample example);

    int deleteByExample(TInterviewHrExample example);

    int deleteByPrimaryKey(Integer hrId);

    int insert(TInterviewHr record);

    int insertSelective(TInterviewHr record);

    List<TInterviewHr> selectByExample(TInterviewHrExample example);

    TInterviewHr selectByPrimaryKey(Integer hrId);

    int updateByExampleSelective(@Param("record") TInterviewHr record, @Param("example") TInterviewHrExample example);

    int updateByExample(@Param("record") TInterviewHr record, @Param("example") TInterviewHrExample example);

    int updateByPrimaryKeySelective(TInterviewHr record);

    int updateByPrimaryKey(TInterviewHr record);
}