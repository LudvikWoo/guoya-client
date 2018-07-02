package com.guoyasoft.dao.student;

import com.guoyasoft.bean.db.student.VCourseStu2Class;
import com.guoyasoft.bean.db.student.VCourseStu2ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VCourseStu2ClassMapper {
    long countByExample(VCourseStu2ClassExample example);

    int deleteByExample(VCourseStu2ClassExample example);

    int insert(VCourseStu2Class record);

    int insertSelective(VCourseStu2Class record);

    List<VCourseStu2Class> selectByExample(VCourseStu2ClassExample example);

    int updateByExampleSelective(@Param("record") VCourseStu2Class record, @Param("example") VCourseStu2ClassExample example);

    int updateByExample(@Param("record") VCourseStu2Class record, @Param("example") VCourseStu2ClassExample example);
}