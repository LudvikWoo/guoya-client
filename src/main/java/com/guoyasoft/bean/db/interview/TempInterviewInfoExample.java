package com.guoyasoft.bean.db.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TempInterviewInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempInterviewInfoExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andProgressIdIsNull() {
            addCriterion("progress_id is null");
            return (Criteria) this;
        }

        public Criteria andProgressIdIsNotNull() {
            addCriterion("progress_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgressIdEqualTo(Integer value) {
            addCriterion("progress_id =", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdNotEqualTo(Integer value) {
            addCriterion("progress_id <>", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdGreaterThan(Integer value) {
            addCriterion("progress_id >", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("progress_id >=", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdLessThan(Integer value) {
            addCriterion("progress_id <", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdLessThanOrEqualTo(Integer value) {
            addCriterion("progress_id <=", value, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdIn(List<Integer> values) {
            addCriterion("progress_id in", values, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdNotIn(List<Integer> values) {
            addCriterion("progress_id not in", values, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdBetween(Integer value1, Integer value2) {
            addCriterion("progress_id between", value1, value2, "progressId");
            return (Criteria) this;
        }

        public Criteria andProgressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("progress_id not between", value1, value2, "progressId");
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

        public Criteria andCompanyJianIsNull() {
            addCriterion("company_jian is null");
            return (Criteria) this;
        }

        public Criteria andCompanyJianIsNotNull() {
            addCriterion("company_jian is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyJianEqualTo(String value) {
            addCriterion("company_jian =", value, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianNotEqualTo(String value) {
            addCriterion("company_jian <>", value, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianGreaterThan(String value) {
            addCriterion("company_jian >", value, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianGreaterThanOrEqualTo(String value) {
            addCriterion("company_jian >=", value, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianLessThan(String value) {
            addCriterion("company_jian <", value, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianLessThanOrEqualTo(String value) {
            addCriterion("company_jian <=", value, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianLike(String value) {
            addCriterion("company_jian like", value, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianNotLike(String value) {
            addCriterion("company_jian not like", value, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianIn(List<String> values) {
            addCriterion("company_jian in", values, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianNotIn(List<String> values) {
            addCriterion("company_jian not in", values, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianBetween(String value1, String value2) {
            addCriterion("company_jian between", value1, value2, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyJianNotBetween(String value1, String value2) {
            addCriterion("company_jian not between", value1, value2, "companyJian");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIsNull() {
            addCriterion("company_addr is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIsNotNull() {
            addCriterion("company_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrEqualTo(String value) {
            addCriterion("company_addr =", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotEqualTo(String value) {
            addCriterion("company_addr <>", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThan(String value) {
            addCriterion("company_addr >", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("company_addr >=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThan(String value) {
            addCriterion("company_addr <", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("company_addr <=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLike(String value) {
            addCriterion("company_addr like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotLike(String value) {
            addCriterion("company_addr not like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIn(List<String> values) {
            addCriterion("company_addr in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotIn(List<String> values) {
            addCriterion("company_addr not in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrBetween(String value1, String value2) {
            addCriterion("company_addr between", value1, value2, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("company_addr not between", value1, value2, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameIsNull() {
            addCriterion("out_company_name is null");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameIsNotNull() {
            addCriterion("out_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameEqualTo(String value) {
            addCriterion("out_company_name =", value, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameNotEqualTo(String value) {
            addCriterion("out_company_name <>", value, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameGreaterThan(String value) {
            addCriterion("out_company_name >", value, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("out_company_name >=", value, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameLessThan(String value) {
            addCriterion("out_company_name <", value, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("out_company_name <=", value, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameLike(String value) {
            addCriterion("out_company_name like", value, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameNotLike(String value) {
            addCriterion("out_company_name not like", value, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameIn(List<String> values) {
            addCriterion("out_company_name in", values, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameNotIn(List<String> values) {
            addCriterion("out_company_name not in", values, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameBetween(String value1, String value2) {
            addCriterion("out_company_name between", value1, value2, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyNameNotBetween(String value1, String value2) {
            addCriterion("out_company_name not between", value1, value2, "outCompanyName");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianIsNull() {
            addCriterion("out_company_jian is null");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianIsNotNull() {
            addCriterion("out_company_jian is not null");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianEqualTo(String value) {
            addCriterion("out_company_jian =", value, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianNotEqualTo(String value) {
            addCriterion("out_company_jian <>", value, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianGreaterThan(String value) {
            addCriterion("out_company_jian >", value, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianGreaterThanOrEqualTo(String value) {
            addCriterion("out_company_jian >=", value, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianLessThan(String value) {
            addCriterion("out_company_jian <", value, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianLessThanOrEqualTo(String value) {
            addCriterion("out_company_jian <=", value, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianLike(String value) {
            addCriterion("out_company_jian like", value, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianNotLike(String value) {
            addCriterion("out_company_jian not like", value, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianIn(List<String> values) {
            addCriterion("out_company_jian in", values, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianNotIn(List<String> values) {
            addCriterion("out_company_jian not in", values, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianBetween(String value1, String value2) {
            addCriterion("out_company_jian between", value1, value2, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyJianNotBetween(String value1, String value2) {
            addCriterion("out_company_jian not between", value1, value2, "outCompanyJian");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrIsNull() {
            addCriterion("out_company_addr is null");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrIsNotNull() {
            addCriterion("out_company_addr is not null");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrEqualTo(String value) {
            addCriterion("out_company_addr =", value, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrNotEqualTo(String value) {
            addCriterion("out_company_addr <>", value, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrGreaterThan(String value) {
            addCriterion("out_company_addr >", value, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("out_company_addr >=", value, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrLessThan(String value) {
            addCriterion("out_company_addr <", value, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("out_company_addr <=", value, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrLike(String value) {
            addCriterion("out_company_addr like", value, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrNotLike(String value) {
            addCriterion("out_company_addr not like", value, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrIn(List<String> values) {
            addCriterion("out_company_addr in", values, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrNotIn(List<String> values) {
            addCriterion("out_company_addr not in", values, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrBetween(String value1, String value2) {
            addCriterion("out_company_addr between", value1, value2, "outCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andOutCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("out_company_addr not between", value1, value2, "outCompanyAddr");
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

        public Criteria andHrWeichatIsNull() {
            addCriterion("hr_weichat is null");
            return (Criteria) this;
        }

        public Criteria andHrWeichatIsNotNull() {
            addCriterion("hr_weichat is not null");
            return (Criteria) this;
        }

        public Criteria andHrWeichatEqualTo(String value) {
            addCriterion("hr_weichat =", value, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatNotEqualTo(String value) {
            addCriterion("hr_weichat <>", value, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatGreaterThan(String value) {
            addCriterion("hr_weichat >", value, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatGreaterThanOrEqualTo(String value) {
            addCriterion("hr_weichat >=", value, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatLessThan(String value) {
            addCriterion("hr_weichat <", value, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatLessThanOrEqualTo(String value) {
            addCriterion("hr_weichat <=", value, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatLike(String value) {
            addCriterion("hr_weichat like", value, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatNotLike(String value) {
            addCriterion("hr_weichat not like", value, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatIn(List<String> values) {
            addCriterion("hr_weichat in", values, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatNotIn(List<String> values) {
            addCriterion("hr_weichat not in", values, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatBetween(String value1, String value2) {
            addCriterion("hr_weichat between", value1, value2, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrWeichatNotBetween(String value1, String value2) {
            addCriterion("hr_weichat not between", value1, value2, "hrWeichat");
            return (Criteria) this;
        }

        public Criteria andHrPhoneIsNull() {
            addCriterion("hr_phone is null");
            return (Criteria) this;
        }

        public Criteria andHrPhoneIsNotNull() {
            addCriterion("hr_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHrPhoneEqualTo(String value) {
            addCriterion("hr_phone =", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneNotEqualTo(String value) {
            addCriterion("hr_phone <>", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneGreaterThan(String value) {
            addCriterion("hr_phone >", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("hr_phone >=", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneLessThan(String value) {
            addCriterion("hr_phone <", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneLessThanOrEqualTo(String value) {
            addCriterion("hr_phone <=", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneLike(String value) {
            addCriterion("hr_phone like", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneNotLike(String value) {
            addCriterion("hr_phone not like", value, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneIn(List<String> values) {
            addCriterion("hr_phone in", values, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneNotIn(List<String> values) {
            addCriterion("hr_phone not in", values, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneBetween(String value1, String value2) {
            addCriterion("hr_phone between", value1, value2, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrPhoneNotBetween(String value1, String value2) {
            addCriterion("hr_phone not between", value1, value2, "hrPhone");
            return (Criteria) this;
        }

        public Criteria andHrTellIsNull() {
            addCriterion("hr_tell is null");
            return (Criteria) this;
        }

        public Criteria andHrTellIsNotNull() {
            addCriterion("hr_tell is not null");
            return (Criteria) this;
        }

        public Criteria andHrTellEqualTo(String value) {
            addCriterion("hr_tell =", value, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellNotEqualTo(String value) {
            addCriterion("hr_tell <>", value, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellGreaterThan(String value) {
            addCriterion("hr_tell >", value, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellGreaterThanOrEqualTo(String value) {
            addCriterion("hr_tell >=", value, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellLessThan(String value) {
            addCriterion("hr_tell <", value, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellLessThanOrEqualTo(String value) {
            addCriterion("hr_tell <=", value, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellLike(String value) {
            addCriterion("hr_tell like", value, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellNotLike(String value) {
            addCriterion("hr_tell not like", value, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellIn(List<String> values) {
            addCriterion("hr_tell in", values, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellNotIn(List<String> values) {
            addCriterion("hr_tell not in", values, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellBetween(String value1, String value2) {
            addCriterion("hr_tell between", value1, value2, "hrTell");
            return (Criteria) this;
        }

        public Criteria andHrTellNotBetween(String value1, String value2) {
            addCriterion("hr_tell not between", value1, value2, "hrTell");
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

        public Criteria andInterviewTimeEqualTo(Date value) {
            addCriterionForJDBCTime("interview_time =", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("interview_time <>", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("interview_time >", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("interview_time >=", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeLessThan(Date value) {
            addCriterionForJDBCTime("interview_time <", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("interview_time <=", value, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeIn(List<Date> values) {
            addCriterionForJDBCTime("interview_time in", values, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("interview_time not in", values, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("interview_time between", value1, value2, "interviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("interview_time not between", value1, value2, "interviewTime");
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

        public Criteria andHasExamEqualTo(String value) {
            addCriterion("has_exam =", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamNotEqualTo(String value) {
            addCriterion("has_exam <>", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamGreaterThan(String value) {
            addCriterion("has_exam >", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamGreaterThanOrEqualTo(String value) {
            addCriterion("has_exam >=", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamLessThan(String value) {
            addCriterion("has_exam <", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamLessThanOrEqualTo(String value) {
            addCriterion("has_exam <=", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamLike(String value) {
            addCriterion("has_exam like", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamNotLike(String value) {
            addCriterion("has_exam not like", value, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamIn(List<String> values) {
            addCriterion("has_exam in", values, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamNotIn(List<String> values) {
            addCriterion("has_exam not in", values, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamBetween(String value1, String value2) {
            addCriterion("has_exam between", value1, value2, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamNotBetween(String value1, String value2) {
            addCriterion("has_exam not between", value1, value2, "hasExam");
            return (Criteria) this;
        }

        public Criteria andHasExamFileIsNull() {
            addCriterion("has_exam_file is null");
            return (Criteria) this;
        }

        public Criteria andHasExamFileIsNotNull() {
            addCriterion("has_exam_file is not null");
            return (Criteria) this;
        }

        public Criteria andHasExamFileEqualTo(String value) {
            addCriterion("has_exam_file =", value, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileNotEqualTo(String value) {
            addCriterion("has_exam_file <>", value, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileGreaterThan(String value) {
            addCriterion("has_exam_file >", value, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileGreaterThanOrEqualTo(String value) {
            addCriterion("has_exam_file >=", value, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileLessThan(String value) {
            addCriterion("has_exam_file <", value, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileLessThanOrEqualTo(String value) {
            addCriterion("has_exam_file <=", value, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileLike(String value) {
            addCriterion("has_exam_file like", value, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileNotLike(String value) {
            addCriterion("has_exam_file not like", value, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileIn(List<String> values) {
            addCriterion("has_exam_file in", values, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileNotIn(List<String> values) {
            addCriterion("has_exam_file not in", values, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileBetween(String value1, String value2) {
            addCriterion("has_exam_file between", value1, value2, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasExamFileNotBetween(String value1, String value2) {
            addCriterion("has_exam_file not between", value1, value2, "hasExamFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioIsNull() {
            addCriterion("has_audio is null");
            return (Criteria) this;
        }

        public Criteria andHasAudioIsNotNull() {
            addCriterion("has_audio is not null");
            return (Criteria) this;
        }

        public Criteria andHasAudioEqualTo(String value) {
            addCriterion("has_audio =", value, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioNotEqualTo(String value) {
            addCriterion("has_audio <>", value, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioGreaterThan(String value) {
            addCriterion("has_audio >", value, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioGreaterThanOrEqualTo(String value) {
            addCriterion("has_audio >=", value, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioLessThan(String value) {
            addCriterion("has_audio <", value, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioLessThanOrEqualTo(String value) {
            addCriterion("has_audio <=", value, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioLike(String value) {
            addCriterion("has_audio like", value, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioNotLike(String value) {
            addCriterion("has_audio not like", value, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioIn(List<String> values) {
            addCriterion("has_audio in", values, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioNotIn(List<String> values) {
            addCriterion("has_audio not in", values, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioBetween(String value1, String value2) {
            addCriterion("has_audio between", value1, value2, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioNotBetween(String value1, String value2) {
            addCriterion("has_audio not between", value1, value2, "hasAudio");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileIsNull() {
            addCriterion("has_audio_file is null");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileIsNotNull() {
            addCriterion("has_audio_file is not null");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileEqualTo(String value) {
            addCriterion("has_audio_file =", value, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileNotEqualTo(String value) {
            addCriterion("has_audio_file <>", value, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileGreaterThan(String value) {
            addCriterion("has_audio_file >", value, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileGreaterThanOrEqualTo(String value) {
            addCriterion("has_audio_file >=", value, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileLessThan(String value) {
            addCriterion("has_audio_file <", value, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileLessThanOrEqualTo(String value) {
            addCriterion("has_audio_file <=", value, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileLike(String value) {
            addCriterion("has_audio_file like", value, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileNotLike(String value) {
            addCriterion("has_audio_file not like", value, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileIn(List<String> values) {
            addCriterion("has_audio_file in", values, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileNotIn(List<String> values) {
            addCriterion("has_audio_file not in", values, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileBetween(String value1, String value2) {
            addCriterion("has_audio_file between", value1, value2, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasAudioFileNotBetween(String value1, String value2) {
            addCriterion("has_audio_file not between", value1, value2, "hasAudioFile");
            return (Criteria) this;
        }

        public Criteria andHasPassIsNull() {
            addCriterion("has_pass is null");
            return (Criteria) this;
        }

        public Criteria andHasPassIsNotNull() {
            addCriterion("has_pass is not null");
            return (Criteria) this;
        }

        public Criteria andHasPassEqualTo(String value) {
            addCriterion("has_pass =", value, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassNotEqualTo(String value) {
            addCriterion("has_pass <>", value, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassGreaterThan(String value) {
            addCriterion("has_pass >", value, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassGreaterThanOrEqualTo(String value) {
            addCriterion("has_pass >=", value, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassLessThan(String value) {
            addCriterion("has_pass <", value, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassLessThanOrEqualTo(String value) {
            addCriterion("has_pass <=", value, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassLike(String value) {
            addCriterion("has_pass like", value, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassNotLike(String value) {
            addCriterion("has_pass not like", value, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassIn(List<String> values) {
            addCriterion("has_pass in", values, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassNotIn(List<String> values) {
            addCriterion("has_pass not in", values, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassBetween(String value1, String value2) {
            addCriterion("has_pass between", value1, value2, "hasPass");
            return (Criteria) this;
        }

        public Criteria andHasPassNotBetween(String value1, String value2) {
            addCriterion("has_pass not between", value1, value2, "hasPass");
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

        public Criteria andHasOfferEqualTo(String value) {
            addCriterion("has_offer =", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferNotEqualTo(String value) {
            addCriterion("has_offer <>", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferGreaterThan(String value) {
            addCriterion("has_offer >", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferGreaterThanOrEqualTo(String value) {
            addCriterion("has_offer >=", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferLessThan(String value) {
            addCriterion("has_offer <", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferLessThanOrEqualTo(String value) {
            addCriterion("has_offer <=", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferLike(String value) {
            addCriterion("has_offer like", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferNotLike(String value) {
            addCriterion("has_offer not like", value, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferIn(List<String> values) {
            addCriterion("has_offer in", values, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferNotIn(List<String> values) {
            addCriterion("has_offer not in", values, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferBetween(String value1, String value2) {
            addCriterion("has_offer between", value1, value2, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasOfferNotBetween(String value1, String value2) {
            addCriterion("has_offer not between", value1, value2, "hasOffer");
            return (Criteria) this;
        }

        public Criteria andHasJobIsNull() {
            addCriterion("has_job is null");
            return (Criteria) this;
        }

        public Criteria andHasJobIsNotNull() {
            addCriterion("has_job is not null");
            return (Criteria) this;
        }

        public Criteria andHasJobEqualTo(String value) {
            addCriterion("has_job =", value, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobNotEqualTo(String value) {
            addCriterion("has_job <>", value, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobGreaterThan(String value) {
            addCriterion("has_job >", value, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobGreaterThanOrEqualTo(String value) {
            addCriterion("has_job >=", value, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobLessThan(String value) {
            addCriterion("has_job <", value, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobLessThanOrEqualTo(String value) {
            addCriterion("has_job <=", value, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobLike(String value) {
            addCriterion("has_job like", value, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobNotLike(String value) {
            addCriterion("has_job not like", value, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobIn(List<String> values) {
            addCriterion("has_job in", values, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobNotIn(List<String> values) {
            addCriterion("has_job not in", values, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobBetween(String value1, String value2) {
            addCriterion("has_job between", value1, value2, "hasJob");
            return (Criteria) this;
        }

        public Criteria andHasJobNotBetween(String value1, String value2) {
            addCriterion("has_job not between", value1, value2, "hasJob");
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

        public Criteria andProbCountIsNull() {
            addCriterion("prob_count is null");
            return (Criteria) this;
        }

        public Criteria andProbCountIsNotNull() {
            addCriterion("prob_count is not null");
            return (Criteria) this;
        }

        public Criteria andProbCountEqualTo(Integer value) {
            addCriterion("prob_count =", value, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbCountNotEqualTo(Integer value) {
            addCriterion("prob_count <>", value, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbCountGreaterThan(Integer value) {
            addCriterion("prob_count >", value, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("prob_count >=", value, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbCountLessThan(Integer value) {
            addCriterion("prob_count <", value, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbCountLessThanOrEqualTo(Integer value) {
            addCriterion("prob_count <=", value, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbCountIn(List<Integer> values) {
            addCriterion("prob_count in", values, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbCountNotIn(List<Integer> values) {
            addCriterion("prob_count not in", values, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbCountBetween(Integer value1, Integer value2) {
            addCriterion("prob_count between", value1, value2, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbCountNotBetween(Integer value1, Integer value2) {
            addCriterion("prob_count not between", value1, value2, "probCount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountIsNull() {
            addCriterion("prob_discount is null");
            return (Criteria) this;
        }

        public Criteria andProbDiscountIsNotNull() {
            addCriterion("prob_discount is not null");
            return (Criteria) this;
        }

        public Criteria andProbDiscountEqualTo(Integer value) {
            addCriterion("prob_discount =", value, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountNotEqualTo(Integer value) {
            addCriterion("prob_discount <>", value, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountGreaterThan(Integer value) {
            addCriterion("prob_discount >", value, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("prob_discount >=", value, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountLessThan(Integer value) {
            addCriterion("prob_discount <", value, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("prob_discount <=", value, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountIn(List<Integer> values) {
            addCriterion("prob_discount in", values, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountNotIn(List<Integer> values) {
            addCriterion("prob_discount not in", values, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountBetween(Integer value1, Integer value2) {
            addCriterion("prob_discount between", value1, value2, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andProbDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("prob_discount not between", value1, value2, "probDiscount");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxIsNull() {
            addCriterion("has_pre_tax is null");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxIsNotNull() {
            addCriterion("has_pre_tax is not null");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxEqualTo(String value) {
            addCriterion("has_pre_tax =", value, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxNotEqualTo(String value) {
            addCriterion("has_pre_tax <>", value, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxGreaterThan(String value) {
            addCriterion("has_pre_tax >", value, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxGreaterThanOrEqualTo(String value) {
            addCriterion("has_pre_tax >=", value, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxLessThan(String value) {
            addCriterion("has_pre_tax <", value, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxLessThanOrEqualTo(String value) {
            addCriterion("has_pre_tax <=", value, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxLike(String value) {
            addCriterion("has_pre_tax like", value, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxNotLike(String value) {
            addCriterion("has_pre_tax not like", value, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxIn(List<String> values) {
            addCriterion("has_pre_tax in", values, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxNotIn(List<String> values) {
            addCriterion("has_pre_tax not in", values, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxBetween(String value1, String value2) {
            addCriterion("has_pre_tax between", value1, value2, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andHasPreTaxNotBetween(String value1, String value2) {
            addCriterion("has_pre_tax not between", value1, value2, "hasPreTax");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceIsNull() {
            addCriterion("is_introduce is null");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceIsNotNull() {
            addCriterion("is_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceEqualTo(String value) {
            addCriterion("is_introduce =", value, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceNotEqualTo(String value) {
            addCriterion("is_introduce <>", value, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceGreaterThan(String value) {
            addCriterion("is_introduce >", value, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("is_introduce >=", value, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceLessThan(String value) {
            addCriterion("is_introduce <", value, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceLessThanOrEqualTo(String value) {
            addCriterion("is_introduce <=", value, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceLike(String value) {
            addCriterion("is_introduce like", value, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceNotLike(String value) {
            addCriterion("is_introduce not like", value, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceIn(List<String> values) {
            addCriterion("is_introduce in", values, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceNotIn(List<String> values) {
            addCriterion("is_introduce not in", values, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceBetween(String value1, String value2) {
            addCriterion("is_introduce between", value1, value2, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIsIntroduceNotBetween(String value1, String value2) {
            addCriterion("is_introduce not between", value1, value2, "isIntroduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdIsNull() {
            addCriterion("introduce_stu_id is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdIsNotNull() {
            addCriterion("introduce_stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdEqualTo(Integer value) {
            addCriterion("introduce_stu_id =", value, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdNotEqualTo(Integer value) {
            addCriterion("introduce_stu_id <>", value, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdGreaterThan(Integer value) {
            addCriterion("introduce_stu_id >", value, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("introduce_stu_id >=", value, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdLessThan(Integer value) {
            addCriterion("introduce_stu_id <", value, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("introduce_stu_id <=", value, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdIn(List<Integer> values) {
            addCriterion("introduce_stu_id in", values, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdNotIn(List<Integer> values) {
            addCriterion("introduce_stu_id not in", values, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdBetween(Integer value1, Integer value2) {
            addCriterion("introduce_stu_id between", value1, value2, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("introduce_stu_id not between", value1, value2, "introduceStuId");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameIsNull() {
            addCriterion("introduce_stu_name is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameIsNotNull() {
            addCriterion("introduce_stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameEqualTo(String value) {
            addCriterion("introduce_stu_name =", value, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameNotEqualTo(String value) {
            addCriterion("introduce_stu_name <>", value, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameGreaterThan(String value) {
            addCriterion("introduce_stu_name >", value, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("introduce_stu_name >=", value, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameLessThan(String value) {
            addCriterion("introduce_stu_name <", value, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameLessThanOrEqualTo(String value) {
            addCriterion("introduce_stu_name <=", value, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameLike(String value) {
            addCriterion("introduce_stu_name like", value, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameNotLike(String value) {
            addCriterion("introduce_stu_name not like", value, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameIn(List<String> values) {
            addCriterion("introduce_stu_name in", values, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameNotIn(List<String> values) {
            addCriterion("introduce_stu_name not in", values, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameBetween(String value1, String value2) {
            addCriterion("introduce_stu_name between", value1, value2, "introduceStuName");
            return (Criteria) this;
        }

        public Criteria andIntroduceStuNameNotBetween(String value1, String value2) {
            addCriterion("introduce_stu_name not between", value1, value2, "introduceStuName");
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

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
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

        public Criteria andTutorNameIsNull() {
            addCriterion("tutor_name is null");
            return (Criteria) this;
        }

        public Criteria andTutorNameIsNotNull() {
            addCriterion("tutor_name is not null");
            return (Criteria) this;
        }

        public Criteria andTutorNameEqualTo(String value) {
            addCriterion("tutor_name =", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotEqualTo(String value) {
            addCriterion("tutor_name <>", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameGreaterThan(String value) {
            addCriterion("tutor_name >", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameGreaterThanOrEqualTo(String value) {
            addCriterion("tutor_name >=", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameLessThan(String value) {
            addCriterion("tutor_name <", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameLessThanOrEqualTo(String value) {
            addCriterion("tutor_name <=", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameLike(String value) {
            addCriterion("tutor_name like", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotLike(String value) {
            addCriterion("tutor_name not like", value, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameIn(List<String> values) {
            addCriterion("tutor_name in", values, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotIn(List<String> values) {
            addCriterion("tutor_name not in", values, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameBetween(String value1, String value2) {
            addCriterion("tutor_name between", value1, value2, "tutorName");
            return (Criteria) this;
        }

        public Criteria andTutorNameNotBetween(String value1, String value2) {
            addCriterion("tutor_name not between", value1, value2, "tutorName");
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