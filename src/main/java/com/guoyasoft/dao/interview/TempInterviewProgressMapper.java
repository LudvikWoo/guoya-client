package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.TempInterviewProgress;
import com.guoyasoft.bean.db.interview.TempInterviewProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempInterviewProgressMapper {
    long countByExample(TempInterviewProgressExample example);

    int deleteByExample(TempInterviewProgressExample example);

    int deleteByPrimaryKey(Integer pNo);

    int insert(TempInterviewProgress record);

    int insertSelective(TempInterviewProgress record);

    List<TempInterviewProgress> selectByExample(TempInterviewProgressExample example);

    TempInterviewProgress selectByPrimaryKey(Integer pNo);

    int updateByExampleSelective(@Param("record") TempInterviewProgress record, @Param("example") TempInterviewProgressExample example);

    int updateByExample(@Param("record") TempInterviewProgress record, @Param("example") TempInterviewProgressExample example);

    int updateByPrimaryKeySelective(TempInterviewProgress record);

    int updateByPrimaryKey(TempInterviewProgress record);
}