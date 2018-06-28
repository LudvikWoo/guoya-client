package com.guoyasoft.bean.db.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VInterviewInterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VInterviewInterviewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andInterviewIdIsNull() {
            addCriterion("interview_id is null");
            return (Criteria) this;
        }

        public Criteria andInterviewIdIsNotNull() {
            addCriterion("interview_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewIdEqualTo(Integer value) {
            addCriterion("interview_id =", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdNotEqualTo(Integer value) {
            addCriterion("interview_id <>", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdGreaterThan(Integer value) {
            addCriterion("interview_id >", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_id >=", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdLessThan(Integer value) {
            addCriterion("interview_id <", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdLessThanOrEqualTo(Integer value) {
            addCriterion("interview_id <=", value, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdIn(List<Integer> values) {
            addCriterion("interview_id in", values, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdNotIn(List<Integer> values) {
            addCriterion("interview_id not in", values, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdBetween(Integer value1, Integer value2) {
            addCriterion("interview_id between", value1, value2, "interviewId");
            return (Criteria) this;
        }

        public Criteria andInterviewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_id not between", value1, value2, "interviewId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeIsNull() {
            addCriterion("call_time is null");
            return (Criteria) this;
        }

        public Criteria andCallTimeIsNotNull() {
            addCriterion("call_time is not null");
            return (Criteria) this;
        }

        public Criteria andCallTimeEqualTo(Date value) {
            addCriterion("call_time =", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeNotEqualTo(Date value) {
            addCriterion("call_time <>", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeGreaterThan(Date value) {
            addCriterion("call_time >", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("call_time >=", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeLessThan(Date value) {
            addCriterion("call_time <", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeLessThanOrEqualTo(Date value) {
            addCriterion("call_time <=", value, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeIn(List<Date> values) {
            addCriterion("call_time in", values, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeNotIn(List<Date> values) {
            addCriterion("call_time not in", values, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeBetween(Date value1, Date value2) {
            addCriterion("call_time between", value1, value2, "callTime");
            return (Criteria) this;
        }

        public Criteria andCallTimeNotBetween(Date value1, Date value2) {
            addCriterion("call_time not between", value1, value2, "callTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeIsNull() {
            addCriterion("interview_time is null");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeIsNotNull() {
            addCriterion("interview_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeEqualTo(Date value) {
            addCriterion("interview_time =", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotEqualTo(Date value) {
            addCriterion("interview_time <>", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeGreaterThan(Date value) {
            addCriterion("interview_time >", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interview_time >=", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeLessThan(Date value) {
            addCriterion("interview_time <", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("interview_time <=", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeIn(List<Date> values) {
            addCriterion("interview_time in", values, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotIn(List<Date> values) {
            addCriterion("interview_time not in", values, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeBetween(Date value1, Date value2) {
            addCriterion("interview_time between", value1, value2, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotBetween(Date value1, Date value2) {
            addCriterion("interview_time not between", value1, value2, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateIsNull() {
            addCriterion("interview_time_date is null");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateIsNotNull() {
            addCriterion("interview_time_date is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateEqualTo(String value) {
            addCriterion("interview_time_date =", value, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateNotEqualTo(String value) {
            addCriterion("interview_time_date <>", value, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateGreaterThan(String value) {
            addCriterion("interview_time_date >", value, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateGreaterThanOrEqualTo(String value) {
            addCriterion("interview_time_date >=", value, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateLessThan(String value) {
            addCriterion("interview_time_date <", value, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateLessThanOrEqualTo(String value) {
            addCriterion("interview_time_date <=", value, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateLike(String value) {
            addCriterion("interview_time_date like", value, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateNotLike(String value) {
            addCriterion("interview_time_date not like", value, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateIn(List<String> values) {
            addCriterion("interview_time_date in", values, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateNotIn(List<String> values) {
            addCriterion("interview_time_date not in", values, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateBetween(String value1, String value2) {
            addCriterion("interview_time_date between", value1, value2, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeDateNotBetween(String value1, String value2) {
            addCriterion("interview_time_date not between", value1, value2, "interviewTimeDate");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeIsNull() {
            addCriterion("interview_time_time is null");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeIsNotNull() {
            addCriterion("interview_time_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeEqualTo(String value) {
            addCriterion("interview_time_time =", value, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeNotEqualTo(String value) {
            addCriterion("interview_time_time <>", value, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeGreaterThan(String value) {
            addCriterion("interview_time_time >", value, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("interview_time_time >=", value, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeLessThan(String value) {
            addCriterion("interview_time_time <", value, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeLessThanOrEqualTo(String value) {
            addCriterion("interview_time_time <=", value, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeLike(String value) {
            addCriterion("interview_time_time like", value, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeNotLike(String value) {
            addCriterion("interview_time_time not like", value, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeIn(List<String> values) {
            addCriterion("interview_time_time in", values, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeNotIn(List<String> values) {
            addCriterion("interview_time_time not in", values, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeBetween(String value1, String value2) {
            addCriterion("interview_time_time between", value1, value2, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeTimeNotBetween(String value1, String value2) {
            addCriterion("interview_time_time not between", value1, value2, "interviewTimeTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Date value) {
            addCriterionForJDBCDate("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterionForJDBCDate("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterionForJDBCDate("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_time not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryIsNull() {
            addCriterion("expect_salary is null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryIsNotNull() {
            addCriterion("expect_salary is not null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryEqualTo(Integer value) {
            addCriterion("expect_salary =", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotEqualTo(Integer value) {
            addCriterion("expect_salary <>", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryGreaterThan(Integer value) {
            addCriterion("expect_salary >", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("expect_salary >=", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryLessThan(Integer value) {
            addCriterion("expect_salary <", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("expect_salary <=", value, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryIn(List<Integer> values) {
            addCriterion("expect_salary in", values, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotIn(List<Integer> values) {
            addCriterion("expect_salary not in", values, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryBetween(Integer value1, Integer value2) {
            addCriterion("expect_salary between", value1, value2, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("expect_salary not between", value1, value2, "expectSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIsNull() {
            addCriterion("real_salary is null");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIsNotNull() {
            addCriterion("real_salary is not null");
            return (Criteria) this;
        }

        public Criteria andRealSalaryEqualTo(Integer value) {
            addCriterion("real_salary =", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotEqualTo(Integer value) {
            addCriterion("real_salary <>", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryGreaterThan(Integer value) {
            addCriterion("real_salary >", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_salary >=", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryLessThan(Integer value) {
            addCriterion("real_salary <", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("real_salary <=", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIn(List<Integer> values) {
            addCriterion("real_salary in", values, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotIn(List<Integer> values) {
            addCriterion("real_salary not in", values, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryBetween(Integer value1, Integer value2) {
            addCriterion("real_salary between", value1, value2, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("real_salary not between", value1, value2, "realSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryCountIsNull() {
            addCriterion("salary_count is null");
            return (Criteria) this;
        }

        public Criteria andSalaryCountIsNotNull() {
            addCriterion("salary_count is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryCountEqualTo(Integer value) {
            addCriterion("salary_count =", value, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andSalaryCountNotEqualTo(Integer value) {
            addCriterion("salary_count <>", value, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andSalaryCountGreaterThan(Integer value) {
            addCriterion("salary_count >", value, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andSalaryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary_count >=", value, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andSalaryCountLessThan(Integer value) {
            addCriterion("salary_count <", value, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andSalaryCountLessThanOrEqualTo(Integer value) {
            addCriterion("salary_count <=", value, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andSalaryCountIn(List<Integer> values) {
            addCriterion("salary_count in", values, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andSalaryCountNotIn(List<Integer> values) {
            addCriterion("salary_count not in", values, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andSalaryCountBetween(Integer value1, Integer value2) {
            addCriterion("salary_count between", value1, value2, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andSalaryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("salary_count not between", value1, value2, "salaryCount");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(Integer value) {
            addCriterion("progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(Integer value) {
            addCriterion("progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(Integer value) {
            addCriterion("progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(Integer value) {
            addCriterion("progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(Integer value) {
            addCriterion("progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<Integer> values) {
            addCriterion("progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<Integer> values) {
            addCriterion("progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(Integer value1, Integer value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("progress not between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressDescIsNull() {
            addCriterion("progress_desc is null");
            return (Criteria) this;
        }

        public Criteria andProgressDescIsNotNull() {
            addCriterion("progress_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProgressDescEqualTo(String value) {
            addCriterion("progress_desc =", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescNotEqualTo(String value) {
            addCriterion("progress_desc <>", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescGreaterThan(String value) {
            addCriterion("progress_desc >", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescGreaterThanOrEqualTo(String value) {
            addCriterion("progress_desc >=", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescLessThan(String value) {
            addCriterion("progress_desc <", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescLessThanOrEqualTo(String value) {
            addCriterion("progress_desc <=", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescLike(String value) {
            addCriterion("progress_desc like", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescNotLike(String value) {
            addCriterion("progress_desc not like", value, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescIn(List<String> values) {
            addCriterion("progress_desc in", values, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescNotIn(List<String> values) {
            addCriterion("progress_desc not in", values, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescBetween(String value1, String value2) {
            addCriterion("progress_desc between", value1, value2, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andProgressDescNotBetween(String value1, String value2) {
            addCriterion("progress_desc not between", value1, value2, "progressDesc");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultDescIsNull() {
            addCriterion("result_desc is null");
            return (Criteria) this;
        }

        public Criteria andResultDescIsNotNull() {
            addCriterion("result_desc is not null");
            return (Criteria) this;
        }

        public Criteria andResultDescEqualTo(String value) {
            addCriterion("result_desc =", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescNotEqualTo(String value) {
            addCriterion("result_desc <>", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescGreaterThan(String value) {
            addCriterion("result_desc >", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescGreaterThanOrEqualTo(String value) {
            addCriterion("result_desc >=", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescLessThan(String value) {
            addCriterion("result_desc <", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescLessThanOrEqualTo(String value) {
            addCriterion("result_desc <=", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescLike(String value) {
            addCriterion("result_desc like", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescNotLike(String value) {
            addCriterion("result_desc not like", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescIn(List<String> values) {
            addCriterion("result_desc in", values, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescNotIn(List<String> values) {
            addCriterion("result_desc not in", values, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescBetween(String value1, String value2) {
            addCriterion("result_desc between", value1, value2, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescNotBetween(String value1, String value2) {
            addCriterion("result_desc not between", value1, value2, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationIsNull() {
            addCriterion("class_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationIsNotNull() {
            addCriterion("class_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationEqualTo(String value) {
            addCriterion("class_abbreviation =", value, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationNotEqualTo(String value) {
            addCriterion("class_abbreviation <>", value, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationGreaterThan(String value) {
            addCriterion("class_abbreviation >", value, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("class_abbreviation >=", value, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationLessThan(String value) {
            addCriterion("class_abbreviation <", value, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("class_abbreviation <=", value, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationLike(String value) {
            addCriterion("class_abbreviation like", value, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationNotLike(String value) {
            addCriterion("class_abbreviation not like", value, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationIn(List<String> values) {
            addCriterion("class_abbreviation in", values, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationNotIn(List<String> values) {
            addCriterion("class_abbreviation not in", values, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationBetween(String value1, String value2) {
            addCriterion("class_abbreviation between", value1, value2, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassAbbreviationNotBetween(String value1, String value2) {
            addCriterion("class_abbreviation not between", value1, value2, "classAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdIsNull() {
            addCriterion("course_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdIsNotNull() {
            addCriterion("course_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdEqualTo(Integer value) {
            addCriterion("course_instance_id =", value, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdNotEqualTo(Integer value) {
            addCriterion("course_instance_id <>", value, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdGreaterThan(Integer value) {
            addCriterion("course_instance_id >", value, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_instance_id >=", value, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdLessThan(Integer value) {
            addCriterion("course_instance_id <", value, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_instance_id <=", value, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdIn(List<Integer> values) {
            addCriterion("course_instance_id in", values, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdNotIn(List<Integer> values) {
            addCriterion("course_instance_id not in", values, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdBetween(Integer value1, Integer value2) {
            addCriterion("course_instance_id between", value1, value2, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_instance_id not between", value1, value2, "courseInstanceId");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameIsNull() {
            addCriterion("course_instance_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameIsNotNull() {
            addCriterion("course_instance_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameEqualTo(String value) {
            addCriterion("course_instance_name =", value, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameNotEqualTo(String value) {
            addCriterion("course_instance_name <>", value, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameGreaterThan(String value) {
            addCriterion("course_instance_name >", value, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_instance_name >=", value, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameLessThan(String value) {
            addCriterion("course_instance_name <", value, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameLessThanOrEqualTo(String value) {
            addCriterion("course_instance_name <=", value, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameLike(String value) {
            addCriterion("course_instance_name like", value, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameNotLike(String value) {
            addCriterion("course_instance_name not like", value, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameIn(List<String> values) {
            addCriterion("course_instance_name in", values, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameNotIn(List<String> values) {
            addCriterion("course_instance_name not in", values, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameBetween(String value1, String value2) {
            addCriterion("course_instance_name between", value1, value2, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCourseInstanceNameNotBetween(String value1, String value2) {
            addCriterion("course_instance_name not between", value1, value2, "courseInstanceName");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationIsNull() {
            addCriterion("company_name_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationIsNotNull() {
            addCriterion("company_name_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationEqualTo(String value) {
            addCriterion("company_name_abbreviation =", value, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationNotEqualTo(String value) {
            addCriterion("company_name_abbreviation <>", value, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationGreaterThan(String value) {
            addCriterion("company_name_abbreviation >", value, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("company_name_abbreviation >=", value, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationLessThan(String value) {
            addCriterion("company_name_abbreviation <", value, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("company_name_abbreviation <=", value, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationLike(String value) {
            addCriterion("company_name_abbreviation like", value, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationNotLike(String value) {
            addCriterion("company_name_abbreviation not like", value, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationIn(List<String> values) {
            addCriterion("company_name_abbreviation in", values, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationNotIn(List<String> values) {
            addCriterion("company_name_abbreviation not in", values, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationBetween(String value1, String value2) {
            addCriterion("company_name_abbreviation between", value1, value2, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyNameAbbreviationNotBetween(String value1, String value2) {
            addCriterion("company_name_abbreviation not between", value1, value2, "companyNameAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIsNull() {
            addCriterion("company_desc is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIsNotNull() {
            addCriterion("company_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescEqualTo(String value) {
            addCriterion("company_desc =", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotEqualTo(String value) {
            addCriterion("company_desc <>", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThan(String value) {
            addCriterion("company_desc >", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThanOrEqualTo(String value) {
            addCriterion("company_desc >=", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThan(String value) {
            addCriterion("company_desc <", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThanOrEqualTo(String value) {
            addCriterion("company_desc <=", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLike(String value) {
            addCriterion("company_desc like", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotLike(String value) {
            addCriterion("company_desc not like", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIn(List<String> values) {
            addCriterion("company_desc in", values, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotIn(List<String> values) {
            addCriterion("company_desc not in", values, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescBetween(String value1, String value2) {
            addCriterion("company_desc between", value1, value2, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotBetween(String value1, String value2) {
            addCriterion("company_desc not between", value1, value2, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(Integer value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(Integer value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(Integer value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(Integer value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<Integer> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<Integer> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(Integer value1, Integer value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andHrIdIsNull() {
            addCriterion("hr_id is null");
            return (Criteria) this;
        }

        public Criteria andHrIdIsNotNull() {
            addCriterion("hr_id is not null");
            return (Criteria) this;
        }

        public Criteria andHrIdEqualTo(Integer value) {
            addCriterion("hr_id =", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotEqualTo(Integer value) {
            addCriterion("hr_id <>", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdGreaterThan(Integer value) {
            addCriterion("hr_id >", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hr_id >=", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLessThan(Integer value) {
            addCriterion("hr_id <", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdLessThanOrEqualTo(Integer value) {
            addCriterion("hr_id <=", value, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdIn(List<Integer> values) {
            addCriterion("hr_id in", values, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotIn(List<Integer> values) {
            addCriterion("hr_id not in", values, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdBetween(Integer value1, Integer value2) {
            addCriterion("hr_id between", value1, value2, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hr_id not between", value1, value2, "hrId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdIsNull() {
            addCriterion("hr_company_id is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdIsNotNull() {
            addCriterion("hr_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdEqualTo(Integer value) {
            addCriterion("hr_company_id =", value, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdNotEqualTo(Integer value) {
            addCriterion("hr_company_id <>", value, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdGreaterThan(Integer value) {
            addCriterion("hr_company_id >", value, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hr_company_id >=", value, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdLessThan(Integer value) {
            addCriterion("hr_company_id <", value, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("hr_company_id <=", value, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdIn(List<Integer> values) {
            addCriterion("hr_company_id in", values, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdNotIn(List<Integer> values) {
            addCriterion("hr_company_id not in", values, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("hr_company_id between", value1, value2, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hr_company_id not between", value1, value2, "hrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameIsNull() {
            addCriterion("hr_company_name is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameIsNotNull() {
            addCriterion("hr_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameEqualTo(String value) {
            addCriterion("hr_company_name =", value, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameNotEqualTo(String value) {
            addCriterion("hr_company_name <>", value, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameGreaterThan(String value) {
            addCriterion("hr_company_name >", value, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("hr_company_name >=", value, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameLessThan(String value) {
            addCriterion("hr_company_name <", value, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("hr_company_name <=", value, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameLike(String value) {
            addCriterion("hr_company_name like", value, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameNotLike(String value) {
            addCriterion("hr_company_name not like", value, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameIn(List<String> values) {
            addCriterion("hr_company_name in", values, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameNotIn(List<String> values) {
            addCriterion("hr_company_name not in", values, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameBetween(String value1, String value2) {
            addCriterion("hr_company_name between", value1, value2, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNameNotBetween(String value1, String value2) {
            addCriterion("hr_company_name not between", value1, value2, "hrCompanyName");
            return (Criteria) this;
        }

        public Criteria andHrNameIsNull() {
            addCriterion("hr_name is null");
            return (Criteria) this;
        }

        public Criteria andHrNameIsNotNull() {
            addCriterion("hr_name is not null");
            return (Criteria) this;
        }

        public Criteria andHrNameEqualTo(String value) {
            addCriterion("hr_name =", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameNotEqualTo(String value) {
            addCriterion("hr_name <>", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameGreaterThan(String value) {
            addCriterion("hr_name >", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameGreaterThanOrEqualTo(String value) {
            addCriterion("hr_name >=", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameLessThan(String value) {
            addCriterion("hr_name <", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameLessThanOrEqualTo(String value) {
            addCriterion("hr_name <=", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameLike(String value) {
            addCriterion("hr_name like", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameNotLike(String value) {
            addCriterion("hr_name not like", value, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameIn(List<String> values) {
            addCriterion("hr_name in", values, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameNotIn(List<String> values) {
            addCriterion("hr_name not in", values, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameBetween(String value1, String value2) {
            addCriterion("hr_name between", value1, value2, "hrName");
            return (Criteria) this;
        }

        public Criteria andHrNameNotBetween(String value1, String value2) {
            addCriterion("hr_name not between", value1, value2, "hrName");
            return (Criteria) this;
        }

        public Criteria andWeichatIsNull() {
            addCriterion("weichat is null");
            return (Criteria) this;
        }

        public Criteria andWeichatIsNotNull() {
            addCriterion("weichat is not null");
            return (Criteria) this;
        }

        public Criteria andWeichatEqualTo(String value) {
            addCriterion("weichat =", value, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatNotEqualTo(String value) {
            addCriterion("weichat <>", value, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatGreaterThan(String value) {
            addCriterion("weichat >", value, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatGreaterThanOrEqualTo(String value) {
            addCriterion("weichat >=", value, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatLessThan(String value) {
            addCriterion("weichat <", value, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatLessThanOrEqualTo(String value) {
            addCriterion("weichat <=", value, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatLike(String value) {
            addCriterion("weichat like", value, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatNotLike(String value) {
            addCriterion("weichat not like", value, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatIn(List<String> values) {
            addCriterion("weichat in", values, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatNotIn(List<String> values) {
            addCriterion("weichat not in", values, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatBetween(String value1, String value2) {
            addCriterion("weichat between", value1, value2, "weichat");
            return (Criteria) this;
        }

        public Criteria andWeichatNotBetween(String value1, String value2) {
            addCriterion("weichat not between", value1, value2, "weichat");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIsNull() {
            addCriterion("tel_phone is null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIsNotNull() {
            addCriterion("tel_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneEqualTo(String value) {
            addCriterion("tel_phone =", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotEqualTo(String value) {
            addCriterion("tel_phone <>", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneGreaterThan(String value) {
            addCriterion("tel_phone >", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("tel_phone >=", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLessThan(String value) {
            addCriterion("tel_phone <", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLessThanOrEqualTo(String value) {
            addCriterion("tel_phone <=", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLike(String value) {
            addCriterion("tel_phone like", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotLike(String value) {
            addCriterion("tel_phone not like", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIn(List<String> values) {
            addCriterion("tel_phone in", values, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotIn(List<String> values) {
            addCriterion("tel_phone not in", values, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneBetween(String value1, String value2) {
            addCriterion("tel_phone between", value1, value2, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotBetween(String value1, String value2) {
            addCriterion("tel_phone not between", value1, value2, "telPhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHasExamIsNull() {
            addCriterion("has_exam is null");
            return (Criteria) this;
        }

        public Criteria andHasExamIsNotNull() {
            addCriterion("has_exam is not null");
            return (Criteria) this;
        }

        public Criteria andHasExamEqualTo(Integer value) {
            addCriterion("has_exam =", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamNotEqualTo(Integer value) {
            addCriterion("has_exam <>", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamGreaterThan(Integer value) {
            addCriterion("has_exam >", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_exam >=", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamLessThan(Integer value) {
            addCriterion("has_exam <", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamLessThanOrEqualTo(Integer value) {
            addCriterion("has_exam <=", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamIn(List<Integer> values) {
            addCriterion("has_exam in", values, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamNotIn(List<Integer> values) {
            addCriterion("has_exam not in", values, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamBetween(Integer value1, Integer value2) {
            addCriterion("has_exam between", value1, value2, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamNotBetween(Integer value1, Integer value2) {
            addCriterion("has_exam not between", value1, value2, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamDescIsNull() {
            addCriterion("has_exam_desc is null");
            return (Criteria) this;
        }

        public Criteria andHasExamDescIsNotNull() {
            addCriterion("has_exam_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHasExamDescEqualTo(String value) {
            addCriterion("has_exam_desc =", value, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescNotEqualTo(String value) {
            addCriterion("has_exam_desc <>", value, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescGreaterThan(String value) {
            addCriterion("has_exam_desc >", value, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescGreaterThanOrEqualTo(String value) {
            addCriterion("has_exam_desc >=", value, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescLessThan(String value) {
            addCriterion("has_exam_desc <", value, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescLessThanOrEqualTo(String value) {
            addCriterion("has_exam_desc <=", value, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescLike(String value) {
            addCriterion("has_exam_desc like", value, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescNotLike(String value) {
            addCriterion("has_exam_desc not like", value, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescIn(List<String> values) {
            addCriterion("has_exam_desc in", values, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescNotIn(List<String> values) {
            addCriterion("has_exam_desc not in", values, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescBetween(String value1, String value2) {
            addCriterion("has_exam_desc between", value1, value2, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andHasExamDescNotBetween(String value1, String value2) {
            addCriterion("has_exam_desc not between", value1, value2, "hasExamDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceIsNull() {
            addCriterion("is_outsource is null");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceIsNotNull() {
            addCriterion("is_outsource is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceEqualTo(Integer value) {
            addCriterion("is_outsource =", value, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceNotEqualTo(Integer value) {
            addCriterion("is_outsource <>", value, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceGreaterThan(Integer value) {
            addCriterion("is_outsource >", value, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_outsource >=", value, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceLessThan(Integer value) {
            addCriterion("is_outsource <", value, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceLessThanOrEqualTo(Integer value) {
            addCriterion("is_outsource <=", value, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceIn(List<Integer> values) {
            addCriterion("is_outsource in", values, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceNotIn(List<Integer> values) {
            addCriterion("is_outsource not in", values, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceBetween(Integer value1, Integer value2) {
            addCriterion("is_outsource between", value1, value2, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_outsource not between", value1, value2, "isOutsource");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescIsNull() {
            addCriterion("is_outsource_desc is null");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescIsNotNull() {
            addCriterion("is_outsource_desc is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescEqualTo(String value) {
            addCriterion("is_outsource_desc =", value, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescNotEqualTo(String value) {
            addCriterion("is_outsource_desc <>", value, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescGreaterThan(String value) {
            addCriterion("is_outsource_desc >", value, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescGreaterThanOrEqualTo(String value) {
            addCriterion("is_outsource_desc >=", value, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescLessThan(String value) {
            addCriterion("is_outsource_desc <", value, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescLessThanOrEqualTo(String value) {
            addCriterion("is_outsource_desc <=", value, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescLike(String value) {
            addCriterion("is_outsource_desc like", value, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescNotLike(String value) {
            addCriterion("is_outsource_desc not like", value, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescIn(List<String> values) {
            addCriterion("is_outsource_desc in", values, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescNotIn(List<String> values) {
            addCriterion("is_outsource_desc not in", values, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescBetween(String value1, String value2) {
            addCriterion("is_outsource_desc between", value1, value2, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andIsOutsourceDescNotBetween(String value1, String value2) {
            addCriterion("is_outsource_desc not between", value1, value2, "isOutsourceDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferIsNull() {
            addCriterion("has_offer is null");
            return (Criteria) this;
        }

        public Criteria andHasOfferIsNotNull() {
            addCriterion("has_offer is not null");
            return (Criteria) this;
        }

        public Criteria andHasOfferEqualTo(Integer value) {
            addCriterion("has_offer =", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferNotEqualTo(Integer value) {
            addCriterion("has_offer <>", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferGreaterThan(Integer value) {
            addCriterion("has_offer >", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_offer >=", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferLessThan(Integer value) {
            addCriterion("has_offer <", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferLessThanOrEqualTo(Integer value) {
            addCriterion("has_offer <=", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferIn(List<Integer> values) {
            addCriterion("has_offer in", values, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferNotIn(List<Integer> values) {
            addCriterion("has_offer not in", values, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferBetween(Integer value1, Integer value2) {
            addCriterion("has_offer between", value1, value2, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferNotBetween(Integer value1, Integer value2) {
            addCriterion("has_offer not between", value1, value2, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescIsNull() {
            addCriterion("has_offer_desc is null");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescIsNotNull() {
            addCriterion("has_offer_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescEqualTo(Integer value) {
            addCriterion("has_offer_desc =", value, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescNotEqualTo(Integer value) {
            addCriterion("has_offer_desc <>", value, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescGreaterThan(Integer value) {
            addCriterion("has_offer_desc >", value, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_offer_desc >=", value, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescLessThan(Integer value) {
            addCriterion("has_offer_desc <", value, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescLessThanOrEqualTo(Integer value) {
            addCriterion("has_offer_desc <=", value, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescIn(List<Integer> values) {
            addCriterion("has_offer_desc in", values, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescNotIn(List<Integer> values) {
            addCriterion("has_offer_desc not in", values, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescBetween(Integer value1, Integer value2) {
            addCriterion("has_offer_desc between", value1, value2, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andHasOfferDescNotBetween(Integer value1, Integer value2) {
            addCriterion("has_offer_desc not between", value1, value2, "hasOfferDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkIsNull() {
            addCriterion("to_work is null");
            return (Criteria) this;
        }

        public Criteria andToWorkIsNotNull() {
            addCriterion("to_work is not null");
            return (Criteria) this;
        }

        public Criteria andToWorkEqualTo(Integer value) {
            addCriterion("to_work =", value, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkNotEqualTo(Integer value) {
            addCriterion("to_work <>", value, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkGreaterThan(Integer value) {
            addCriterion("to_work >", value, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_work >=", value, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkLessThan(Integer value) {
            addCriterion("to_work <", value, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkLessThanOrEqualTo(Integer value) {
            addCriterion("to_work <=", value, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkIn(List<Integer> values) {
            addCriterion("to_work in", values, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkNotIn(List<Integer> values) {
            addCriterion("to_work not in", values, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkBetween(Integer value1, Integer value2) {
            addCriterion("to_work between", value1, value2, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkNotBetween(Integer value1, Integer value2) {
            addCriterion("to_work not between", value1, value2, "toWork");
            return (Criteria) this;
        }

        public Criteria andToWorkDescIsNull() {
            addCriterion("to_work_desc is null");
            return (Criteria) this;
        }

        public Criteria andToWorkDescIsNotNull() {
            addCriterion("to_work_desc is not null");
            return (Criteria) this;
        }

        public Criteria andToWorkDescEqualTo(Integer value) {
            addCriterion("to_work_desc =", value, "toWorkDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkDescNotEqualTo(Integer value) {
            addCriterion("to_work_desc <>", value, "toWorkDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkDescGreaterThan(Integer value) {
            addCriterion("to_work_desc >", value, "toWorkDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkDescGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_work_desc >=", value, "toWorkDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkDescLessThan(Integer value) {
            addCriterion("to_work_desc <", value, "toWorkDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkDescLessThanOrEqualTo(Integer value) {
            addCriterion("to_work_desc <=", value, "toWorkDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkDescIn(List<Integer> values) {
            addCriterion("to_work_desc in", values, "toWorkDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkDescNotIn(List<Integer> values) {
            addCriterion("to_work_desc not in", values, "toWorkDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkDescBetween(Integer value1, Integer value2) {
            addCriterion("to_work_desc between", value1, value2, "toWorkDesc");
            return (Criteria) this;
        }

        public Criteria andToWorkDescNotBetween(Integer value1, Integer value2) {
            addCriterion("to_work_desc not between", value1, value2, "toWorkDesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}