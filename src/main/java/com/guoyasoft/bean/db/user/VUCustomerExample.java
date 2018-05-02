package com.guoyasoft.bean.db.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VUCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VUCustomerExample() {
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

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(Integer value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(Integer value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(Integer value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(Integer value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(Integer value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<Integer> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<Integer> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(Integer value1, Integer value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCstTypeIsNull() {
            addCriterion("cst_type is null");
            return (Criteria) this;
        }

        public Criteria andCstTypeIsNotNull() {
            addCriterion("cst_type is not null");
            return (Criteria) this;
        }

        public Criteria andCstTypeEqualTo(String value) {
            addCriterion("cst_type =", value, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeNotEqualTo(String value) {
            addCriterion("cst_type <>", value, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeGreaterThan(String value) {
            addCriterion("cst_type >", value, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cst_type >=", value, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeLessThan(String value) {
            addCriterion("cst_type <", value, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeLessThanOrEqualTo(String value) {
            addCriterion("cst_type <=", value, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeLike(String value) {
            addCriterion("cst_type like", value, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeNotLike(String value) {
            addCriterion("cst_type not like", value, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeIn(List<String> values) {
            addCriterion("cst_type in", values, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeNotIn(List<String> values) {
            addCriterion("cst_type not in", values, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeBetween(String value1, String value2) {
            addCriterion("cst_type between", value1, value2, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeNotBetween(String value1, String value2) {
            addCriterion("cst_type not between", value1, value2, "cstType");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescIsNull() {
            addCriterion("cst_type_desc is null");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescIsNotNull() {
            addCriterion("cst_type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescEqualTo(String value) {
            addCriterion("cst_type_desc =", value, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescNotEqualTo(String value) {
            addCriterion("cst_type_desc <>", value, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescGreaterThan(String value) {
            addCriterion("cst_type_desc >", value, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("cst_type_desc >=", value, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescLessThan(String value) {
            addCriterion("cst_type_desc <", value, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescLessThanOrEqualTo(String value) {
            addCriterion("cst_type_desc <=", value, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescLike(String value) {
            addCriterion("cst_type_desc like", value, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescNotLike(String value) {
            addCriterion("cst_type_desc not like", value, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescIn(List<String> values) {
            addCriterion("cst_type_desc in", values, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescNotIn(List<String> values) {
            addCriterion("cst_type_desc not in", values, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescBetween(String value1, String value2) {
            addCriterion("cst_type_desc between", value1, value2, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCstTypeDescNotBetween(String value1, String value2) {
            addCriterion("cst_type_desc not between", value1, value2, "cstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescIsNull() {
            addCriterion("birthday_desc is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescIsNotNull() {
            addCriterion("birthday_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescEqualTo(String value) {
            addCriterion("birthday_desc =", value, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescNotEqualTo(String value) {
            addCriterion("birthday_desc <>", value, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescGreaterThan(String value) {
            addCriterion("birthday_desc >", value, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescGreaterThanOrEqualTo(String value) {
            addCriterion("birthday_desc >=", value, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescLessThan(String value) {
            addCriterion("birthday_desc <", value, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescLessThanOrEqualTo(String value) {
            addCriterion("birthday_desc <=", value, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescLike(String value) {
            addCriterion("birthday_desc like", value, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescNotLike(String value) {
            addCriterion("birthday_desc not like", value, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescIn(List<String> values) {
            addCriterion("birthday_desc in", values, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescNotIn(List<String> values) {
            addCriterion("birthday_desc not in", values, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescBetween(String value1, String value2) {
            addCriterion("birthday_desc between", value1, value2, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andBirthdayDescNotBetween(String value1, String value2) {
            addCriterion("birthday_desc not between", value1, value2, "birthdayDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIsNull() {
            addCriterion("enroll_date is null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIsNotNull() {
            addCriterion("enroll_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateEqualTo(Date value) {
            addCriterion("enroll_date =", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotEqualTo(Date value) {
            addCriterion("enroll_date <>", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThan(Date value) {
            addCriterion("enroll_date >", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThanOrEqualTo(Date value) {
            addCriterion("enroll_date >=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThan(Date value) {
            addCriterion("enroll_date <", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThanOrEqualTo(Date value) {
            addCriterion("enroll_date <=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIn(List<Date> values) {
            addCriterion("enroll_date in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotIn(List<Date> values) {
            addCriterion("enroll_date not in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateBetween(Date value1, Date value2) {
            addCriterion("enroll_date between", value1, value2, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotBetween(Date value1, Date value2) {
            addCriterion("enroll_date not between", value1, value2, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescIsNull() {
            addCriterion("enroll_date_desc is null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescIsNotNull() {
            addCriterion("enroll_date_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescEqualTo(String value) {
            addCriterion("enroll_date_desc =", value, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescNotEqualTo(String value) {
            addCriterion("enroll_date_desc <>", value, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescGreaterThan(String value) {
            addCriterion("enroll_date_desc >", value, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescGreaterThanOrEqualTo(String value) {
            addCriterion("enroll_date_desc >=", value, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescLessThan(String value) {
            addCriterion("enroll_date_desc <", value, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescLessThanOrEqualTo(String value) {
            addCriterion("enroll_date_desc <=", value, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescLike(String value) {
            addCriterion("enroll_date_desc like", value, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescNotLike(String value) {
            addCriterion("enroll_date_desc not like", value, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescIn(List<String> values) {
            addCriterion("enroll_date_desc in", values, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescNotIn(List<String> values) {
            addCriterion("enroll_date_desc not in", values, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescBetween(String value1, String value2) {
            addCriterion("enroll_date_desc between", value1, value2, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andEnrollDateDescNotBetween(String value1, String value2) {
            addCriterion("enroll_date_desc not between", value1, value2, "enrollDateDesc");
            return (Criteria) this;
        }

        public Criteria andCertIsNull() {
            addCriterion("cert is null");
            return (Criteria) this;
        }

        public Criteria andCertIsNotNull() {
            addCriterion("cert is not null");
            return (Criteria) this;
        }

        public Criteria andCertEqualTo(String value) {
            addCriterion("cert =", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertNotEqualTo(String value) {
            addCriterion("cert <>", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertGreaterThan(String value) {
            addCriterion("cert >", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertGreaterThanOrEqualTo(String value) {
            addCriterion("cert >=", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertLessThan(String value) {
            addCriterion("cert <", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertLessThanOrEqualTo(String value) {
            addCriterion("cert <=", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertLike(String value) {
            addCriterion("cert like", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertNotLike(String value) {
            addCriterion("cert not like", value, "cert");
            return (Criteria) this;
        }

        public Criteria andCertIn(List<String> values) {
            addCriterion("cert in", values, "cert");
            return (Criteria) this;
        }

        public Criteria andCertNotIn(List<String> values) {
            addCriterion("cert not in", values, "cert");
            return (Criteria) this;
        }

        public Criteria andCertBetween(String value1, String value2) {
            addCriterion("cert between", value1, value2, "cert");
            return (Criteria) this;
        }

        public Criteria andCertNotBetween(String value1, String value2) {
            addCriterion("cert not between", value1, value2, "cert");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexDescIsNull() {
            addCriterion("sex_desc is null");
            return (Criteria) this;
        }

        public Criteria andSexDescIsNotNull() {
            addCriterion("sex_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSexDescEqualTo(String value) {
            addCriterion("sex_desc =", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotEqualTo(String value) {
            addCriterion("sex_desc <>", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescGreaterThan(String value) {
            addCriterion("sex_desc >", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescGreaterThanOrEqualTo(String value) {
            addCriterion("sex_desc >=", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescLessThan(String value) {
            addCriterion("sex_desc <", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescLessThanOrEqualTo(String value) {
            addCriterion("sex_desc <=", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescLike(String value) {
            addCriterion("sex_desc like", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotLike(String value) {
            addCriterion("sex_desc not like", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescIn(List<String> values) {
            addCriterion("sex_desc in", values, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotIn(List<String> values) {
            addCriterion("sex_desc not in", values, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescBetween(String value1, String value2) {
            addCriterion("sex_desc between", value1, value2, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotBetween(String value1, String value2) {
            addCriterion("sex_desc not between", value1, value2, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationDescIsNull() {
            addCriterion("education_desc is null");
            return (Criteria) this;
        }

        public Criteria andEducationDescIsNotNull() {
            addCriterion("education_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEducationDescEqualTo(String value) {
            addCriterion("education_desc =", value, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescNotEqualTo(String value) {
            addCriterion("education_desc <>", value, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescGreaterThan(String value) {
            addCriterion("education_desc >", value, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescGreaterThanOrEqualTo(String value) {
            addCriterion("education_desc >=", value, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescLessThan(String value) {
            addCriterion("education_desc <", value, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescLessThanOrEqualTo(String value) {
            addCriterion("education_desc <=", value, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescLike(String value) {
            addCriterion("education_desc like", value, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescNotLike(String value) {
            addCriterion("education_desc not like", value, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescIn(List<String> values) {
            addCriterion("education_desc in", values, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescNotIn(List<String> values) {
            addCriterion("education_desc not in", values, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescBetween(String value1, String value2) {
            addCriterion("education_desc between", value1, value2, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andEducationDescNotBetween(String value1, String value2) {
            addCriterion("education_desc not between", value1, value2, "educationDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(String value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(String value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(String value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(String value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(String value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLike(String value) {
            addCriterion("insurance like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotLike(String value) {
            addCriterion("insurance not like", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<String> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<String> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(String value1, String value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(String value1, String value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescIsNull() {
            addCriterion("insurance_desc is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescIsNotNull() {
            addCriterion("insurance_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescEqualTo(String value) {
            addCriterion("insurance_desc =", value, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescNotEqualTo(String value) {
            addCriterion("insurance_desc <>", value, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescGreaterThan(String value) {
            addCriterion("insurance_desc >", value, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_desc >=", value, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescLessThan(String value) {
            addCriterion("insurance_desc <", value, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescLessThanOrEqualTo(String value) {
            addCriterion("insurance_desc <=", value, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescLike(String value) {
            addCriterion("insurance_desc like", value, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescNotLike(String value) {
            addCriterion("insurance_desc not like", value, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescIn(List<String> values) {
            addCriterion("insurance_desc in", values, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescNotIn(List<String> values) {
            addCriterion("insurance_desc not in", values, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescBetween(String value1, String value2) {
            addCriterion("insurance_desc between", value1, value2, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andInsuranceDescNotBetween(String value1, String value2) {
            addCriterion("insurance_desc not between", value1, value2, "insuranceDesc");
            return (Criteria) this;
        }

        public Criteria andComputorIsNull() {
            addCriterion("computor is null");
            return (Criteria) this;
        }

        public Criteria andComputorIsNotNull() {
            addCriterion("computor is not null");
            return (Criteria) this;
        }

        public Criteria andComputorEqualTo(String value) {
            addCriterion("computor =", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorNotEqualTo(String value) {
            addCriterion("computor <>", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorGreaterThan(String value) {
            addCriterion("computor >", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorGreaterThanOrEqualTo(String value) {
            addCriterion("computor >=", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorLessThan(String value) {
            addCriterion("computor <", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorLessThanOrEqualTo(String value) {
            addCriterion("computor <=", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorLike(String value) {
            addCriterion("computor like", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorNotLike(String value) {
            addCriterion("computor not like", value, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorIn(List<String> values) {
            addCriterion("computor in", values, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorNotIn(List<String> values) {
            addCriterion("computor not in", values, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorBetween(String value1, String value2) {
            addCriterion("computor between", value1, value2, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorNotBetween(String value1, String value2) {
            addCriterion("computor not between", value1, value2, "computor");
            return (Criteria) this;
        }

        public Criteria andComputorDescIsNull() {
            addCriterion("computor_desc is null");
            return (Criteria) this;
        }

        public Criteria andComputorDescIsNotNull() {
            addCriterion("computor_desc is not null");
            return (Criteria) this;
        }

        public Criteria andComputorDescEqualTo(String value) {
            addCriterion("computor_desc =", value, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescNotEqualTo(String value) {
            addCriterion("computor_desc <>", value, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescGreaterThan(String value) {
            addCriterion("computor_desc >", value, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescGreaterThanOrEqualTo(String value) {
            addCriterion("computor_desc >=", value, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescLessThan(String value) {
            addCriterion("computor_desc <", value, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescLessThanOrEqualTo(String value) {
            addCriterion("computor_desc <=", value, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescLike(String value) {
            addCriterion("computor_desc like", value, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescNotLike(String value) {
            addCriterion("computor_desc not like", value, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescIn(List<String> values) {
            addCriterion("computor_desc in", values, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescNotIn(List<String> values) {
            addCriterion("computor_desc not in", values, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescBetween(String value1, String value2) {
            addCriterion("computor_desc between", value1, value2, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andComputorDescNotBetween(String value1, String value2) {
            addCriterion("computor_desc not between", value1, value2, "computorDesc");
            return (Criteria) this;
        }

        public Criteria andBoardIsNull() {
            addCriterion("board is null");
            return (Criteria) this;
        }

        public Criteria andBoardIsNotNull() {
            addCriterion("board is not null");
            return (Criteria) this;
        }

        public Criteria andBoardEqualTo(String value) {
            addCriterion("board =", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotEqualTo(String value) {
            addCriterion("board <>", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardGreaterThan(String value) {
            addCriterion("board >", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardGreaterThanOrEqualTo(String value) {
            addCriterion("board >=", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardLessThan(String value) {
            addCriterion("board <", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardLessThanOrEqualTo(String value) {
            addCriterion("board <=", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardLike(String value) {
            addCriterion("board like", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotLike(String value) {
            addCriterion("board not like", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardIn(List<String> values) {
            addCriterion("board in", values, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotIn(List<String> values) {
            addCriterion("board not in", values, "board");
            return (Criteria) this;
        }

        public Criteria andBoardBetween(String value1, String value2) {
            addCriterion("board between", value1, value2, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotBetween(String value1, String value2) {
            addCriterion("board not between", value1, value2, "board");
            return (Criteria) this;
        }

        public Criteria andBoardDescIsNull() {
            addCriterion("board_desc is null");
            return (Criteria) this;
        }

        public Criteria andBoardDescIsNotNull() {
            addCriterion("board_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBoardDescEqualTo(String value) {
            addCriterion("board_desc =", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescNotEqualTo(String value) {
            addCriterion("board_desc <>", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescGreaterThan(String value) {
            addCriterion("board_desc >", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescGreaterThanOrEqualTo(String value) {
            addCriterion("board_desc >=", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescLessThan(String value) {
            addCriterion("board_desc <", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescLessThanOrEqualTo(String value) {
            addCriterion("board_desc <=", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescLike(String value) {
            addCriterion("board_desc like", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescNotLike(String value) {
            addCriterion("board_desc not like", value, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescIn(List<String> values) {
            addCriterion("board_desc in", values, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescNotIn(List<String> values) {
            addCriterion("board_desc not in", values, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescBetween(String value1, String value2) {
            addCriterion("board_desc between", value1, value2, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andBoardDescNotBetween(String value1, String value2) {
            addCriterion("board_desc not between", value1, value2, "boardDesc");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andIntroducerIsNull() {
            addCriterion("introducer is null");
            return (Criteria) this;
        }

        public Criteria andIntroducerIsNotNull() {
            addCriterion("introducer is not null");
            return (Criteria) this;
        }

        public Criteria andIntroducerEqualTo(String value) {
            addCriterion("introducer =", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerNotEqualTo(String value) {
            addCriterion("introducer <>", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerGreaterThan(String value) {
            addCriterion("introducer >", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerGreaterThanOrEqualTo(String value) {
            addCriterion("introducer >=", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerLessThan(String value) {
            addCriterion("introducer <", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerLessThanOrEqualTo(String value) {
            addCriterion("introducer <=", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerLike(String value) {
            addCriterion("introducer like", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerNotLike(String value) {
            addCriterion("introducer not like", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerIn(List<String> values) {
            addCriterion("introducer in", values, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerNotIn(List<String> values) {
            addCriterion("introducer not in", values, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerBetween(String value1, String value2) {
            addCriterion("introducer between", value1, value2, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerNotBetween(String value1, String value2) {
            addCriterion("introducer not between", value1, value2, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescIsNull() {
            addCriterion("introducer_desc is null");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescIsNotNull() {
            addCriterion("introducer_desc is not null");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescEqualTo(String value) {
            addCriterion("introducer_desc =", value, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescNotEqualTo(String value) {
            addCriterion("introducer_desc <>", value, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescGreaterThan(String value) {
            addCriterion("introducer_desc >", value, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescGreaterThanOrEqualTo(String value) {
            addCriterion("introducer_desc >=", value, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescLessThan(String value) {
            addCriterion("introducer_desc <", value, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescLessThanOrEqualTo(String value) {
            addCriterion("introducer_desc <=", value, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescLike(String value) {
            addCriterion("introducer_desc like", value, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescNotLike(String value) {
            addCriterion("introducer_desc not like", value, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescIn(List<String> values) {
            addCriterion("introducer_desc in", values, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescNotIn(List<String> values) {
            addCriterion("introducer_desc not in", values, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescBetween(String value1, String value2) {
            addCriterion("introducer_desc between", value1, value2, "introducerDesc");
            return (Criteria) this;
        }

        public Criteria andIntroducerDescNotBetween(String value1, String value2) {
            addCriterion("introducer_desc not between", value1, value2, "introducerDesc");
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

        public Criteria andStatusDescIsNull() {
            addCriterion("status_desc is null");
            return (Criteria) this;
        }

        public Criteria andStatusDescIsNotNull() {
            addCriterion("status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDescEqualTo(String value) {
            addCriterion("status_desc =", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotEqualTo(String value) {
            addCriterion("status_desc <>", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThan(String value) {
            addCriterion("status_desc >", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("status_desc >=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThan(String value) {
            addCriterion("status_desc <", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThanOrEqualTo(String value) {
            addCriterion("status_desc <=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLike(String value) {
            addCriterion("status_desc like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotLike(String value) {
            addCriterion("status_desc not like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescIn(List<String> values) {
            addCriterion("status_desc in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotIn(List<String> values) {
            addCriterion("status_desc not in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescBetween(String value1, String value2) {
            addCriterion("status_desc between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotBetween(String value1, String value2) {
            addCriterion("status_desc not between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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