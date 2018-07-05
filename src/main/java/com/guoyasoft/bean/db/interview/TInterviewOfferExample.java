package com.guoyasoft.bean.db.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TInterviewOfferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInterviewOfferExample() {
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

        public Criteria andOfferIdIsNull() {
            addCriterion("offer_id is null");
            return (Criteria) this;
        }

        public Criteria andOfferIdIsNotNull() {
            addCriterion("offer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfferIdEqualTo(Integer value) {
            addCriterion("offer_id =", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotEqualTo(Integer value) {
            addCriterion("offer_id <>", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdGreaterThan(Integer value) {
            addCriterion("offer_id >", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_id >=", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdLessThan(Integer value) {
            addCriterion("offer_id <", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdLessThanOrEqualTo(Integer value) {
            addCriterion("offer_id <=", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdIn(List<Integer> values) {
            addCriterion("offer_id in", values, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotIn(List<Integer> values) {
            addCriterion("offer_id not in", values, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdBetween(Integer value1, Integer value2) {
            addCriterion("offer_id between", value1, value2, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_id not between", value1, value2, "offerId");
            return (Criteria) this;
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

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
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

        public Criteria andIsGrossPayIsNull() {
            addCriterion("is_gross_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayIsNotNull() {
            addCriterion("is_gross_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayEqualTo(Integer value) {
            addCriterion("is_gross_pay =", value, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayNotEqualTo(Integer value) {
            addCriterion("is_gross_pay <>", value, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayGreaterThan(Integer value) {
            addCriterion("is_gross_pay >", value, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_gross_pay >=", value, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayLessThan(Integer value) {
            addCriterion("is_gross_pay <", value, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayLessThanOrEqualTo(Integer value) {
            addCriterion("is_gross_pay <=", value, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayIn(List<Integer> values) {
            addCriterion("is_gross_pay in", values, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayNotIn(List<Integer> values) {
            addCriterion("is_gross_pay not in", values, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayBetween(Integer value1, Integer value2) {
            addCriterion("is_gross_pay between", value1, value2, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andIsGrossPayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_gross_pay not between", value1, value2, "isGrossPay");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodIsNull() {
            addCriterion("probationary_period is null");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodIsNotNull() {
            addCriterion("probationary_period is not null");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodEqualTo(Integer value) {
            addCriterion("probationary_period =", value, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodNotEqualTo(Integer value) {
            addCriterion("probationary_period <>", value, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodGreaterThan(Integer value) {
            addCriterion("probationary_period >", value, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("probationary_period >=", value, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodLessThan(Integer value) {
            addCriterion("probationary_period <", value, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("probationary_period <=", value, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodIn(List<Integer> values) {
            addCriterion("probationary_period in", values, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodNotIn(List<Integer> values) {
            addCriterion("probationary_period not in", values, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodBetween(Integer value1, Integer value2) {
            addCriterion("probationary_period between", value1, value2, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("probationary_period not between", value1, value2, "probationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountIsNull() {
            addCriterion("probationary_period_discount is null");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountIsNotNull() {
            addCriterion("probationary_period_discount is not null");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountEqualTo(Integer value) {
            addCriterion("probationary_period_discount =", value, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountNotEqualTo(Integer value) {
            addCriterion("probationary_period_discount <>", value, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountGreaterThan(Integer value) {
            addCriterion("probationary_period_discount >", value, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("probationary_period_discount >=", value, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountLessThan(Integer value) {
            addCriterion("probationary_period_discount <", value, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("probationary_period_discount <=", value, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountIn(List<Integer> values) {
            addCriterion("probationary_period_discount in", values, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountNotIn(List<Integer> values) {
            addCriterion("probationary_period_discount not in", values, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountBetween(Integer value1, Integer value2) {
            addCriterion("probationary_period_discount between", value1, value2, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andProbationaryPeriodDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("probationary_period_discount not between", value1, value2, "probationaryPeriodDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferTimeIsNull() {
            addCriterion("offer_time is null");
            return (Criteria) this;
        }

        public Criteria andOfferTimeIsNotNull() {
            addCriterion("offer_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfferTimeEqualTo(Date value) {
            addCriterion("offer_time =", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeNotEqualTo(Date value) {
            addCriterion("offer_time <>", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeGreaterThan(Date value) {
            addCriterion("offer_time >", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_time >=", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeLessThan(Date value) {
            addCriterion("offer_time <", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeLessThanOrEqualTo(Date value) {
            addCriterion("offer_time <=", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeIn(List<Date> values) {
            addCriterion("offer_time in", values, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeNotIn(List<Date> values) {
            addCriterion("offer_time not in", values, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeBetween(Date value1, Date value2) {
            addCriterion("offer_time between", value1, value2, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeNotBetween(Date value1, Date value2) {
            addCriterion("offer_time not between", value1, value2, "offerTime");
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
            addCriterion("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterion("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterion("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterion("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterion("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterion("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterion("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterion("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterion("work_time not between", value1, value2, "workTime");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNull() {
            addCriterion("operator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNotNull() {
            addCriterion("operator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdEqualTo(Integer value) {
            addCriterion("operator_user_id =", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotEqualTo(Integer value) {
            addCriterion("operator_user_id <>", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThan(Integer value) {
            addCriterion("operator_user_id >", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_user_id >=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThan(Integer value) {
            addCriterion("operator_user_id <", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_user_id <=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIn(List<Integer> values) {
            addCriterion("operator_user_id in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotIn(List<Integer> values) {
            addCriterion("operator_user_id not in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_user_id between", value1, value2, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_user_id not between", value1, value2, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andIsAcceptIsNull() {
            addCriterion("is_accept is null");
            return (Criteria) this;
        }

        public Criteria andIsAcceptIsNotNull() {
            addCriterion("is_accept is not null");
            return (Criteria) this;
        }

        public Criteria andIsAcceptEqualTo(Integer value) {
            addCriterion("is_accept =", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptNotEqualTo(Integer value) {
            addCriterion("is_accept <>", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptGreaterThan(Integer value) {
            addCriterion("is_accept >", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_accept >=", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptLessThan(Integer value) {
            addCriterion("is_accept <", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptLessThanOrEqualTo(Integer value) {
            addCriterion("is_accept <=", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptIn(List<Integer> values) {
            addCriterion("is_accept in", values, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptNotIn(List<Integer> values) {
            addCriterion("is_accept not in", values, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptBetween(Integer value1, Integer value2) {
            addCriterion("is_accept between", value1, value2, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptNotBetween(Integer value1, Integer value2) {
            addCriterion("is_accept not between", value1, value2, "isAccept");
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