package com.guoyasoft.dao.taskCheck;

import com.guoyasoft.bean.db.taskCheck.VClassLessonCheck;
import com.guoyasoft.bean.db.taskCheck.VClassLessonCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VClassLessonCheckMapper {
    long countByExample(VClassLessonCheckExample example);

    int deleteByExample(VClassLessonCheckExample example);

    int insert(VClassLessonCheck record);

    int insertSelective(VClassLessonCheck record);

    List<VClassLessonCheck> selectByExample(VClassLessonCheckExample example);

    int updateByExampleSelective(@Param("record") VClassLessonCheck record, @Param("example") VClassLessonCheckExample example);

    int updateByExample(@Param("record") VClassLessonCheck record, @Param("example") VClassLessonCheckExample example);
}