package com.guoyasoft.dao.classes;

import com.guoyasoft.bean.db.classes.TClassClass;
import com.guoyasoft.bean.db.classes.TClassClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TClassClassMapper {
    long countByExample(TClassClassExample example);

    int deleteByExample(TClassClassExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(TClassClass record);

    int insertSelective(TClassClass record);

    List<TClassClass> selectByExample(TClassClassExample example);

    TClassClass selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") TClassClass record, @Param("example") TClassClassExample example);

    int updateByExample(@Param("record") TClassClass record, @Param("example") TClassClassExample example);

    int updateByPrimaryKeySelective(TClassClass record);

    int updateByPrimaryKey(TClassClass record);
}