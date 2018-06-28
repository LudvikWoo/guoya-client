package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.VInterviewInterview;
import com.guoyasoft.bean.db.interview.VInterviewInterviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VInterviewInterviewMapper {
    long countByExample(VInterviewInterviewExample example);

    int deleteByExample(VInterviewInterviewExample example);

    int insert(VInterviewInterview record);

    int insertSelective(VInterviewInterview record);

    List<VInterviewInterview> selectByExample(VInterviewInterviewExample example);

    int updateByExampleSelective(@Param("record") VInterviewInterview record, @Param("example") VInterviewInterviewExample example);

    int updateByExample(@Param("record") VInterviewInterview record, @Param("example") VInterviewInterviewExample example);
}