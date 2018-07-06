package com.guoyasoft.dao.interview;

import java.util.List;

import com.guoyasoft.bean.api.interview.SInterviewStatistic;
import com.guoyasoft.bean.api.interview.StatisticQueryBean;

public interface SInterviewStatisticMapper {
	public List<SInterviewStatistic> selectInterviewStatistic(StatisticQueryBean queryBean);
}
