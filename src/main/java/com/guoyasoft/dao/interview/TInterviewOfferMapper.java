package com.guoyasoft.dao.interview;

import com.guoyasoft.bean.db.interview.TInterviewOffer;
import com.guoyasoft.bean.db.interview.TInterviewOfferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInterviewOfferMapper {
    long countByExample(TInterviewOfferExample example);

    int deleteByExample(TInterviewOfferExample example);

    int deleteByPrimaryKey(Integer offerId);

    int insert(TInterviewOffer record);

    int insertSelective(TInterviewOffer record);

    List<TInterviewOffer> selectByExample(TInterviewOfferExample example);

    TInterviewOffer selectByPrimaryKey(Integer offerId);

    int updateByExampleSelective(@Param("record") TInterviewOffer record, @Param("example") TInterviewOfferExample example);

    int updateByExample(@Param("record") TInterviewOffer record, @Param("example") TInterviewOfferExample example);

    int updateByPrimaryKeySelective(TInterviewOffer record);

    int updateByPrimaryKey(TInterviewOffer record);
}