package com.guoyasoft.dao.user;

import com.guoyasoft.bean.db.user.TUCustomer;
import com.guoyasoft.bean.db.user.TUCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUCustomerMapper {
    long countByExample(TUCustomerExample example);

    int deleteByExample(TUCustomerExample example);

    int deleteByPrimaryKey(Integer cno);

    int insert(TUCustomer record);

    int insertSelective(TUCustomer record);

    List<TUCustomer> selectByExample(TUCustomerExample example);

    TUCustomer selectByPrimaryKey(Integer cno);

    int updateByExampleSelective(@Param("record") TUCustomer record, @Param("example") TUCustomerExample example);

    int updateByExample(@Param("record") TUCustomer record, @Param("example") TUCustomerExample example);

    int updateByPrimaryKeySelective(TUCustomer record);

    int updateByPrimaryKey(TUCustomer record);
}