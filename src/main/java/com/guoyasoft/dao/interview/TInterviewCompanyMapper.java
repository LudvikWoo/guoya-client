package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.TInterviewCompany;
import com.guoyasoft.bean.db.interview.TInterviewCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInterviewCompanyMapper {
    long countByExample(TInterviewCompanyExample example);

    int deleteByExample(TInterviewCompanyExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(TInterviewCompany record);

    int insertSelective(TInterviewCompany record);

    List<TInterviewCompany> selectByExample(TInterviewCompanyExample example);

    TInterviewCompany selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") TInterviewCompany record, @Param("example") TInterviewCompanyExample example);

    int updateByExample(@Param("record") TInterviewCompany record, @Param("example") TInterviewCompanyExample example);

    int updateByPrimaryKeySelective(TInterviewCompany record);

    int updateByPrimaryKey(TInterviewCompany record);
}