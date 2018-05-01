package com.guoyasoft.dao;

import com.guoyasoft.bean.db.GyCustomer;
import com.guoyasoft.bean.db.GyCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyCustomerMapper {
    long countByExample(GyCustomerExample example);

    int deleteByExample(GyCustomerExample example);

    int deleteByPrimaryKey(Integer cno);

    int insert(GyCustomer record);

    int insertSelective(GyCustomer record);

    List<GyCustomer> selectByExample(GyCustomerExample example);

    GyCustomer selectByPrimaryKey(Integer cno);

    int updateByExampleSelective(@Param("record") GyCustomer record, @Param("example") GyCustomerExample example);

    int updateByExample(@Param("record") GyCustomer record, @Param("example") GyCustomerExample example);

    int updateByPrimaryKeySelective(GyCustomer record);

    int updateByPrimaryKey(GyCustomer record);
}