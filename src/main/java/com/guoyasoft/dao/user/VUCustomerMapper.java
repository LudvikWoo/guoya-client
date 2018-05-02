package com.guoyasoft.dao.user;

import com.guoyasoft.bean.db.user.VUCustomer;
import com.guoyasoft.bean.db.user.VUCustomerExample;
import java.util.List;

public interface VUCustomerMapper {
    long countByExample(VUCustomerExample example);

    List<VUCustomer> selectByExample(VUCustomerExample example);
}