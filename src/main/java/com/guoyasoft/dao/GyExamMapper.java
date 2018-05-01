package com.guoyasoft.dao;

import com.guoyasoft.bean.db.GyExam;
import com.guoyasoft.bean.db.GyExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyExamMapper {
    long countByExample(GyExamExample example);

    int deleteByExample(GyExamExample example);

    int deleteByPrimaryKey(Integer eno);

    int insert(GyExam record);

    int insertSelective(GyExam record);

    List<GyExam> selectByExample(GyExamExample example);

    GyExam selectByPrimaryKey(Integer eno);

    int updateByExampleSelective(@Param("record") GyExam record, @Param("example") GyExamExample example);

    int updateByExample(@Param("record") GyExam record, @Param("example") GyExamExample example);

    int updateByPrimaryKeySelective(GyExam record);

    int updateByPrimaryKey(GyExam record);
}