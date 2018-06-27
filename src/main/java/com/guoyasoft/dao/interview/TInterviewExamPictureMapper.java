package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.TInterviewExamPicture;
import com.guoyasoft.bean.db.interview.TInterviewExamPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInterviewExamPictureMapper {
    long countByExample(TInterviewExamPictureExample example);

    int deleteByExample(TInterviewExamPictureExample example);

    int deleteByPrimaryKey(Integer pictureId);

    int insert(TInterviewExamPicture record);

    int insertSelective(TInterviewExamPicture record);

    List<TInterviewExamPicture> selectByExample(TInterviewExamPictureExample example);

    TInterviewExamPicture selectByPrimaryKey(Integer pictureId);

    int updateByExampleSelective(@Param("record") TInterviewExamPicture record, @Param("example") TInterviewExamPictureExample example);

    int updateByExample(@Param("record") TInterviewExamPicture record, @Param("example") TInterviewExamPictureExample example);

    int updateByPrimaryKeySelective(TInterviewExamPicture record);

    int updateByPrimaryKey(TInterviewExamPicture record);
}