package com.guoyasoft.dao.user;

import com.guoyasoft.bean.db.user.VUStudent;
import com.guoyasoft.bean.db.user.VUStudentExample;
import java.util.List;

public interface VUStudentMapper {
    long countByExample(VUStudentExample example);

    List<VUStudent> selectByExample(VUStudentExample example);
}