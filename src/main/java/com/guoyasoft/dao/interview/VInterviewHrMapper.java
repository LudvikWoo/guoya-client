package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.VInterviewHr;
import com.guoyasoft.bean.db.interview.VInterviewHrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VInterviewHrMapper {
    long countByExample(VInterviewHrExample example);

    int deleteByExample(VInterviewHrExample example);

    int insert(VInterviewHr record);

    int insertSelective(VInterviewHr record);

    List<VInterviewHr> selectByExample(VInterviewHrExample example);

    int updateByExampleSelective(@Param("record") VInterviewHr record, @Param("example") VInterviewHrExample example);

    int updateByExample(@Param("record") VInterviewHr record, @Param("example") VInterviewHrExample example);
}