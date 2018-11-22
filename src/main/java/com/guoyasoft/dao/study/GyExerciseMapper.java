package com.guoyasoft.dao.study;

import com.guoyasoft.bean.db.study.GyExercise;
import com.guoyasoft.bean.db.study.GyExerciseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyExerciseMapper {
    long countByExample(GyExerciseExample example);

    int deleteByExample(GyExerciseExample example);

    int deleteByPrimaryKey(Integer sno);

    int insert(GyExercise record);

    int insertSelective(GyExercise record);

    List<GyExercise> selectByExample(GyExerciseExample example);

    GyExercise selectByPrimaryKey(Integer sno);

    int updateByExampleSelective(@Param("record") GyExercise record,
        @Param("example") GyExerciseExample example);

    int updateByExample(@Param("record") GyExercise record,
        @Param("example") GyExerciseExample example);

    int updateByPrimaryKeySelective(GyExercise record);

    int updateByPrimaryKey(GyExercise record);
}
