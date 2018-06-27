package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.TInterviewExamAnswer;
import com.guoyasoft.bean.db.interview.TInterviewExamAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInterviewExamAnswerMapper {
    long countByExample(TInterviewExamAnswerExample example);

    int deleteByExample(TInterviewExamAnswerExample example);

    int deleteByPrimaryKey(Integer answerId);

    int insert(TInterviewExamAnswer record);

    int insertSelective(TInterviewExamAnswer record);

    List<TInterviewExamAnswer> selectByExample(TInterviewExamAnswerExample example);

    TInterviewExamAnswer selectByPrimaryKey(Integer answerId);

    int updateByExampleSelective(@Param("record") TInterviewExamAnswer record, @Param("example") TInterviewExamAnswerExample example);

    int updateByExample(@Param("record") TInterviewExamAnswer record, @Param("example") TInterviewExamAnswerExample example);

    int updateByPrimaryKeySelective(TInterviewExamAnswer record);

    int updateByPrimaryKey(TInterviewExamAnswer record);
}