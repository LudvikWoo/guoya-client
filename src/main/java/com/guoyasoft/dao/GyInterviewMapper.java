package com.guoyasoft.dao;

import com.guoyasoft.bean.db.GyInterview;
import com.guoyasoft.bean.db.GyInterviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyInterviewMapper {
    long countByExample(GyInterviewExample example);

    int deleteByExample(GyInterviewExample example);

    int deleteByPrimaryKey(Integer ino);

    int insert(GyInterview record);

    int insertSelective(GyInterview record);

    List<GyInterview> selectByExample(GyInterviewExample example);

    GyInterview selectByPrimaryKey(Integer ino);

    int updateByExampleSelective(@Param("record") GyInterview record, @Param("example") GyInterviewExample example);

    int updateByExample(@Param("record") GyInterview record, @Param("example") GyInterviewExample example);

    int updateByPrimaryKeySelective(GyInterview record);

    int updateByPrimaryKey(GyInterview record);
}