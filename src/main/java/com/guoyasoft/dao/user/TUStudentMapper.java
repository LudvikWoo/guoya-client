package com.guoyasoft.dao.user;

import com.guoyasoft.bean.db.user.TUStudent;
import com.guoyasoft.bean.db.user.TUStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUStudentMapper {
    long countByExample(TUStudentExample example);

    int deleteByExample(TUStudentExample example);

    int deleteByPrimaryKey(Integer sno);

    int insert(TUStudent record);

    int insertSelective(TUStudent record);

    List<TUStudent> selectByExample(TUStudentExample example);

    TUStudent selectByPrimaryKey(Integer sno);

    int updateByExampleSelective(@Param("record") TUStudent record, @Param("example") TUStudentExample example);

    int updateByExample(@Param("record") TUStudent record, @Param("example") TUStudentExample example);

    int updateByPrimaryKeySelective(TUStudent record);

    int updateByPrimaryKey(TUStudent record);
}