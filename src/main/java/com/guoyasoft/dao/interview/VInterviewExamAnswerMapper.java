package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.VInterviewExamAnswer;
import com.guoyasoft.bean.db.interview.VInterviewExamAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VInterviewExamAnswerMapper {
    long countByExample(VInterviewExamAnswerExample example);

    int deleteByExample(VInterviewExamAnswerExample example);

    int insert(VInterviewExamAnswer record);

    int insertSelective(VInterviewExamAnswer record);

    List<VInterviewExamAnswer> selectByExample(VInterviewExamAnswerExample example);

    int updateByExampleSelective(@Param("record") VInterviewExamAnswer record, @Param("example") VInterviewExamAnswerExample example);

    int updateByExample(@Param("record") VInterviewExamAnswer record, @Param("example") VInterviewExamAnswerExample example);
}