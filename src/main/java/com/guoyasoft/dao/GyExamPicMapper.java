package com.guoyasoft.dao;

import com.guoyasoft.bean.db.GyExamPic;
import com.guoyasoft.bean.db.GyExamPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyExamPicMapper {
    long countByExample(GyExamPicExample example);

    int deleteByExample(GyExamPicExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(GyExamPic record);

    int insertSelective(GyExamPic record);

    List<GyExamPic> selectByExample(GyExamPicExample example);

    GyExamPic selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") GyExamPic record, @Param("example") GyExamPicExample example);

    int updateByExample(@Param("record") GyExamPic record, @Param("example") GyExamPicExample example);

    int updateByPrimaryKeySelective(GyExamPic record);

    int updateByPrimaryKey(GyExamPic record);
}