package com.guoyasoft.bean.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GyInterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GyInterviewExample() {
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

        public Criteria andInoIsNull() {
            addCriterion("ino is null");
            return (Criteria) this;
        }

        public Criteria andInoIsNotNull() {
            addCriterion("ino is not null");
            return (Criteria) this;
        }

        public Criteria andInoEqualTo(Integer value) {
            addCriterion("ino =", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoNotEqualTo(Integer value) {
            addCriterion("ino <>", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoGreaterThan(Integer value) {
            addCriterion("ino >", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ino >=", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoLessThan(Integer value) {
            addCriterion("ino <", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoLessThanOrEqualTo(Integer value) {
            addCriterion("ino <=", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoIn(List<Integer> values) {
            addCriterion("ino in", values, "ino");
            return (Criteria) this;
        }

        public Criteria andInoNotIn(List<Integer> values) {
            addCriterion("ino not in", values, "ino");
            return (Criteria) this;
        }

        public Criteria andInoBetween(Integer value1, Integer value2) {
            addCriterion("ino between", value1, value2, "ino");
            return (Criteria) this;
        }

        public Criteria andInoNotBetween(Integer value1, Integer value2) {
            addCriterion("ino not between", value1, value2, "ino");
            return (Criteria) this;
        }

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(String value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(String value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(String value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(String value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(String value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(String value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLike(String value) {
            addCriterion("sno like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotLike(String value) {
            addCriterion("sno not like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<String> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<String> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(String value1, String value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(String value1, String value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
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

        public Criteria andInterviewDateIsNull() {
            addCriterion("interview_date is null");
            return (Criteria) this;
        }

        public Criteria andInterviewDateIsNotNull() {
            addCriterion("interview_date is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewDateEqualTo(Date value) {
            addCriterionForJDBCDate("interview_date =", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("interview_date <>", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateGreaterThan(Date value) {
            addCriterionForJDBCDate("interview_date >", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("interview_date >=", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateLessThan(Date value) {
            addCriterionForJDBCDate("interview_date <", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("interview_date <=", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateIn(List<Date> values) {
            addCriterionForJDBCDate("interview_date in", values, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("interview_date not in", values, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("interview_date between", value1, value2, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("interview_date not between", value1, value2, "interviewDate");
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

        public Criteria andInterviewTimeEqualTo(String value) {
            addCriterion("interview_time =", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotEqualTo(String value) {
            addCriterion("interview_time <>", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeGreaterThan(String value) {
            addCriterion("interview_time >", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("interview_time >=", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeLessThan(String value) {
            addCriterion("interview_time <", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeLessThanOrEqualTo(String value) {
            addCriterion("interview_time <=", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeLike(String value) {
            addCriterion("interview_time like", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotLike(String value) {
            addCriterion("interview_time not like", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeIn(List<String> values) {
            addCriterion("interview_time in", values, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotIn(List<String> values) {
            addCriterion("interview_time not in", values, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeBetween(String value1, String value2) {
            addCriterion("interview_time between", value1, value2, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotBetween(String value1, String value2) {
            addCriterion("interview_time not between", value1, value2, "interviewTime");
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

        public Criteria andProgressIsNull() {
            addCriterion("progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(String value) {
            addCriterion("progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(String value) {
            addCriterion("progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(String value) {
            addCriterion("progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(String value) {
            addCriterion("progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(String value) {
            addCriterion("progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(String value) {
            addCriterion("progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLike(String value) {
            addCriterion("progress like", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotLike(String value) {
            addCriterion("progress not like", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<String> values) {
            addCriterion("progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<String> values) {
            addCriterion("progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(String value1, String value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(String value1, String value2) {
            addCriterion("progress not between", value1, value2, "progress");
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

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
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

        public Criteria andHrCompanyIsNull() {
            addCriterion("hr_company is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsNotNull() {
            addCriterion("hr_company is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyEqualTo(String value) {
            addCriterion("hr_company =", value, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNotEqualTo(String value) {
            addCriterion("hr_company <>", value, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyGreaterThan(String value) {
            addCriterion("hr_company >", value, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("hr_company >=", value, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyLessThan(String value) {
            addCriterion("hr_company <", value, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyLessThanOrEqualTo(String value) {
            addCriterion("hr_company <=", value, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyLike(String value) {
            addCriterion("hr_company like", value, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNotLike(String value) {
            addCriterion("hr_company not like", value, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIn(List<String> values) {
            addCriterion("hr_company in", values, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNotIn(List<String> values) {
            addCriterion("hr_company not in", values, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyBetween(String value1, String value2) {
            addCriterion("hr_company between", value1, value2, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrCompanyNotBetween(String value1, String value2) {
            addCriterion("hr_company not between", value1, value2, "hrCompany");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeIsNull() {
            addCriterion("hr_contact_type is null");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeIsNotNull() {
            addCriterion("hr_contact_type is not null");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeEqualTo(String value) {
            addCriterion("hr_contact_type =", value, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeNotEqualTo(String value) {
            addCriterion("hr_contact_type <>", value, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeGreaterThan(String value) {
            addCriterion("hr_contact_type >", value, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hr_contact_type >=", value, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeLessThan(String value) {
            addCriterion("hr_contact_type <", value, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeLessThanOrEqualTo(String value) {
            addCriterion("hr_contact_type <=", value, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeLike(String value) {
            addCriterion("hr_contact_type like", value, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeNotLike(String value) {
            addCriterion("hr_contact_type not like", value, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeIn(List<String> values) {
            addCriterion("hr_contact_type in", values, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeNotIn(List<String> values) {
            addCriterion("hr_contact_type not in", values, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeBetween(String value1, String value2) {
            addCriterion("hr_contact_type between", value1, value2, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactTypeNotBetween(String value1, String value2) {
            addCriterion("hr_contact_type not between", value1, value2, "hrContactType");
            return (Criteria) this;
        }

        public Criteria andHrContactIsNull() {
            addCriterion("hr_contact is null");
            return (Criteria) this;
        }

        public Criteria andHrContactIsNotNull() {
            addCriterion("hr_contact is not null");
            return (Criteria) this;
        }

        public Criteria andHrContactEqualTo(String value) {
            addCriterion("hr_contact =", value, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactNotEqualTo(String value) {
            addCriterion("hr_contact <>", value, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactGreaterThan(String value) {
            addCriterion("hr_contact >", value, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactGreaterThanOrEqualTo(String value) {
            addCriterion("hr_contact >=", value, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactLessThan(String value) {
            addCriterion("hr_contact <", value, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactLessThanOrEqualTo(String value) {
            addCriterion("hr_contact <=", value, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactLike(String value) {
            addCriterion("hr_contact like", value, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactNotLike(String value) {
            addCriterion("hr_contact not like", value, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactIn(List<String> values) {
            addCriterion("hr_contact in", values, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactNotIn(List<String> values) {
            addCriterion("hr_contact not in", values, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactBetween(String value1, String value2) {
            addCriterion("hr_contact between", value1, value2, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHrContactNotBetween(String value1, String value2) {
            addCriterion("hr_contact not between", value1, value2, "hrContact");
            return (Criteria) this;
        }

        public Criteria andHardTechIsNull() {
            addCriterion("hard_tech is null");
            return (Criteria) this;
        }

        public Criteria andHardTechIsNotNull() {
            addCriterion("hard_tech is not null");
            return (Criteria) this;
        }

        public Criteria andHardTechEqualTo(String value) {
            addCriterion("hard_tech =", value, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechNotEqualTo(String value) {
            addCriterion("hard_tech <>", value, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechGreaterThan(String value) {
            addCriterion("hard_tech >", value, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechGreaterThanOrEqualTo(String value) {
            addCriterion("hard_tech >=", value, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechLessThan(String value) {
            addCriterion("hard_tech <", value, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechLessThanOrEqualTo(String value) {
            addCriterion("hard_tech <=", value, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechLike(String value) {
            addCriterion("hard_tech like", value, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechNotLike(String value) {
            addCriterion("hard_tech not like", value, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechIn(List<String> values) {
            addCriterion("hard_tech in", values, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechNotIn(List<String> values) {
            addCriterion("hard_tech not in", values, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechBetween(String value1, String value2) {
            addCriterion("hard_tech between", value1, value2, "hardTech");
            return (Criteria) this;
        }

        public Criteria andHardTechNotBetween(String value1, String value2) {
            addCriterion("hard_tech not between", value1, value2, "hardTech");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1IsNull() {
            addCriterion("audio_addr_1 is null");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1IsNotNull() {
            addCriterion("audio_addr_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1EqualTo(String value) {
            addCriterion("audio_addr_1 =", value, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1NotEqualTo(String value) {
            addCriterion("audio_addr_1 <>", value, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1GreaterThan(String value) {
            addCriterion("audio_addr_1 >", value, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1GreaterThanOrEqualTo(String value) {
            addCriterion("audio_addr_1 >=", value, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1LessThan(String value) {
            addCriterion("audio_addr_1 <", value, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1LessThanOrEqualTo(String value) {
            addCriterion("audio_addr_1 <=", value, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1Like(String value) {
            addCriterion("audio_addr_1 like", value, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1NotLike(String value) {
            addCriterion("audio_addr_1 not like", value, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1In(List<String> values) {
            addCriterion("audio_addr_1 in", values, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1NotIn(List<String> values) {
            addCriterion("audio_addr_1 not in", values, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1Between(String value1, String value2) {
            addCriterion("audio_addr_1 between", value1, value2, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr1NotBetween(String value1, String value2) {
            addCriterion("audio_addr_1 not between", value1, value2, "audioAddr1");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2IsNull() {
            addCriterion("audio_addr_2 is null");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2IsNotNull() {
            addCriterion("audio_addr_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2EqualTo(String value) {
            addCriterion("audio_addr_2 =", value, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2NotEqualTo(String value) {
            addCriterion("audio_addr_2 <>", value, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2GreaterThan(String value) {
            addCriterion("audio_addr_2 >", value, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2GreaterThanOrEqualTo(String value) {
            addCriterion("audio_addr_2 >=", value, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2LessThan(String value) {
            addCriterion("audio_addr_2 <", value, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2LessThanOrEqualTo(String value) {
            addCriterion("audio_addr_2 <=", value, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2Like(String value) {
            addCriterion("audio_addr_2 like", value, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2NotLike(String value) {
            addCriterion("audio_addr_2 not like", value, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2In(List<String> values) {
            addCriterion("audio_addr_2 in", values, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2NotIn(List<String> values) {
            addCriterion("audio_addr_2 not in", values, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2Between(String value1, String value2) {
            addCriterion("audio_addr_2 between", value1, value2, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr2NotBetween(String value1, String value2) {
            addCriterion("audio_addr_2 not between", value1, value2, "audioAddr2");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3IsNull() {
            addCriterion("audio_addr_3 is null");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3IsNotNull() {
            addCriterion("audio_addr_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3EqualTo(String value) {
            addCriterion("audio_addr_3 =", value, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3NotEqualTo(String value) {
            addCriterion("audio_addr_3 <>", value, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3GreaterThan(String value) {
            addCriterion("audio_addr_3 >", value, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3GreaterThanOrEqualTo(String value) {
            addCriterion("audio_addr_3 >=", value, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3LessThan(String value) {
            addCriterion("audio_addr_3 <", value, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3LessThanOrEqualTo(String value) {
            addCriterion("audio_addr_3 <=", value, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3Like(String value) {
            addCriterion("audio_addr_3 like", value, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3NotLike(String value) {
            addCriterion("audio_addr_3 not like", value, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3In(List<String> values) {
            addCriterion("audio_addr_3 in", values, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3NotIn(List<String> values) {
            addCriterion("audio_addr_3 not in", values, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3Between(String value1, String value2) {
            addCriterion("audio_addr_3 between", value1, value2, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andAudioAddr3NotBetween(String value1, String value2) {
            addCriterion("audio_addr_3 not between", value1, value2, "audioAddr3");
            return (Criteria) this;
        }

        public Criteria andTnoIsNull() {
            addCriterion("tno is null");
            return (Criteria) this;
        }

        public Criteria andTnoIsNotNull() {
            addCriterion("tno is not null");
            return (Criteria) this;
        }

        public Criteria andTnoEqualTo(String value) {
            addCriterion("tno =", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotEqualTo(String value) {
            addCriterion("tno <>", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThan(String value) {
            addCriterion("tno >", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThanOrEqualTo(String value) {
            addCriterion("tno >=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThan(String value) {
            addCriterion("tno <", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThanOrEqualTo(String value) {
            addCriterion("tno <=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLike(String value) {
            addCriterion("tno like", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotLike(String value) {
            addCriterion("tno not like", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoIn(List<String> values) {
            addCriterion("tno in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotIn(List<String> values) {
            addCriterion("tno not in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoBetween(String value1, String value2) {
            addCriterion("tno between", value1, value2, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotBetween(String value1, String value2) {
            addCriterion("tno not between", value1, value2, "tno");
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