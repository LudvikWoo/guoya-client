package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.TempInterviewInfo;
import com.guoyasoft.bean.db.interview.TempInterviewInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempInterviewInfoMapper {
    long countByExample(TempInterviewInfoExample example);

    int deleteByExample(TempInterviewInfoExample example);

    int deleteByPrimaryKey(Integer interviewId);

    int insert(TempInterviewInfo record);

    int insertSelective(TempInterviewInfo record);

    List<TempInterviewInfo> selectByExample(TempInterviewInfoExample example);

    TempInterviewInfo selectByPrimaryKey(Integer interviewId);

    int updateByExampleSelective(@Param("record") TempInterviewInfo record, @Param("example") TempInterviewInfoExample example);

    int updateByExample(@Param("record") TempInterviewInfo record, @Param("example") TempInterviewInfoExample example);

    int updateByPrimaryKeySelective(TempInterviewInfo record);

    int updateByPrimaryKey(TempInterviewInfo record);
}