package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.Vinterviewinterview;
import com.guoyasoft.bean.db.interview.VinterviewinterviewExample;
import com.guoyasoft.bean.db.interview.VinterviewinterviewWithBLOBs;
import java.util.List;

public interface VinterviewinterviewMapper {
    long countByExample(VinterviewinterviewExample example);

    List<VinterviewinterviewWithBLOBs> selectByExampleWithBLOBs(VinterviewinterviewExample example);

    List<Vinterviewinterview> selectByExample(VinterviewinterviewExample example);
}