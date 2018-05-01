package com.guoyasoft.dao;

import com.guoyasoft.bean.db.GyStudent;
import com.guoyasoft.bean.db.GyStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyStudentMapper {
    long countByExample(GyStudentExample example);

    int deleteByExample(GyStudentExample example);

    int deleteByPrimaryKey(Integer sno);

    int insert(GyStudent record);

    int insertSelective(GyStudent record);

    List<GyStudent> selectByExample(GyStudentExample example);

    GyStudent selectByPrimaryKey(Integer sno);

    int updateByExampleSelective(@Param("record") GyStudent record, @Param("example") GyStudentExample example);

    int updateByExample(@Param("record") GyStudent record, @Param("example") GyStudentExample example);

    int updateByPrimaryKeySelective(GyStudent record);

    int updateByPrimaryKey(GyStudent record);
}