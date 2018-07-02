package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.VCourseSchedule;
import com.guoyasoft.bean.db.interview.VCourseScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VCourseScheduleMapper {
    long countByExample(VCourseScheduleExample example);

    int deleteByExample(VCourseScheduleExample example);

    int insert(VCourseSchedule record);

    int insertSelective(VCourseSchedule record);

    List<VCourseSchedule> selectByExample(VCourseScheduleExample example);

    int updateByExampleSelective(@Param("record") VCourseSchedule record, @Param("example") VCourseScheduleExample example);

    int updateByExample(@Param("record") VCourseSchedule record, @Param("example") VCourseScheduleExample example);
}