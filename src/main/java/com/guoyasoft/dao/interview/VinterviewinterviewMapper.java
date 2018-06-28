package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.VinterviewInterview;
import com.guoyasoft.bean.db.interview.VinterviewInterviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VinterviewInterviewMapper {
    long countByExample(VinterviewInterviewExample example);

    int deleteByExample(VinterviewInterviewExample example);

    int insert(VinterviewInterview record);

    int insertSelective(VinterviewInterview record);

    List<VinterviewInterview> selectByExample(VinterviewInterviewExample example);

    int updateByExampleSelective(@Param("record") VinterviewInterview record, @Param("example") VinterviewInterviewExample example);

    int updateByExample(@Param("record") VinterviewInterview record, @Param("example") VinterviewInterviewExample example);
}