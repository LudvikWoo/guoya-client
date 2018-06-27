package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.TInterviewExam;
import com.guoyasoft.bean.db.interview.TInterviewExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInterviewExamMapper {
    long countByExample(TInterviewExamExample example);

    int deleteByExample(TInterviewExamExample example);

    int deleteByPrimaryKey(Integer examId);

    int insert(TInterviewExam record);

    int insertSelective(TInterviewExam record);

    List<TInterviewExam> selectByExample(TInterviewExamExample example);

    TInterviewExam selectByPrimaryKey(Integer examId);

    int updateByExampleSelective(@Param("record") TInterviewExam record, @Param("example") TInterviewExamExample example);

    int updateByExample(@Param("record") TInterviewExam record, @Param("example") TInterviewExamExample example);

    int updateByPrimaryKeySelective(TInterviewExam record);

    int updateByPrimaryKey(TInterviewExam record);
}