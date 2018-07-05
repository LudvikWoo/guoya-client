package com.guoyasoft.bean.db.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VInterviewSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VInterviewSummaryExample() {
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

        public Criteria andCustomerAgeIsNull() {
            addCriterion("customer_age is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeIsNotNull() {
            addCriterion("customer_age is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeEqualTo(Integer value) {
            addCriterion("customer_age =", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotEqualTo(Integer value) {
            addCriterion("customer_age <>", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeGreaterThan(Integer value) {
            addCriterion("customer_age >", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_age >=", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeLessThan(Integer value) {
            addCriterion("customer_age <", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeLessThanOrEqualTo(Integer value) {
            addCriterion("customer_age <=", value, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeIn(List<Integer> values) {
            addCriterion("customer_age in", values, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotIn(List<Integer> values) {
            addCriterion("customer_age not in", values, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeBetween(Integer value1, Integer value2) {
            addCriterion("customer_age between", value1, value2, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_age not between", value1, value2, "customerAge");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayIsNull() {
            addCriterion("customer_birthday is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayIsNotNull() {
            addCriterion("customer_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("customer_birthday =", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_birthday <>", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_birthday >", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_birthday >=", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("customer_birthday <", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_birthday <=", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("customer_birthday in", values, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_birthday not in", values, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_birthday between", value1, value2, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_birthday not between", value1, value2, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("customer_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("customer_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(String value) {
            addCriterion("customer_sex =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(String value) {
            addCriterion("customer_sex <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(String value) {
            addCriterion("customer_sex >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(String value) {
            addCriterion("customer_sex >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(String value) {
            addCriterion("customer_sex <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(String value) {
            addCriterion("customer_sex <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLike(String value) {
            addCriterion("customer_sex like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotLike(String value) {
            addCriterion("customer_sex not like", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<String> values) {
            addCriterion("customer_sex in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<String> values) {
            addCriterion("customer_sex not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(String value1, String value2) {
            addCriterion("customer_sex between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(String value1, String value2) {
            addCriterion("customer_sex not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceIsNull() {
            addCriterion("customer_province is null");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceIsNotNull() {
            addCriterion("customer_province is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceEqualTo(String value) {
            addCriterion("customer_province =", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotEqualTo(String value) {
            addCriterion("customer_province <>", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceGreaterThan(String value) {
            addCriterion("customer_province >", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("customer_province >=", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceLessThan(String value) {
            addCriterion("customer_province <", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceLessThanOrEqualTo(String value) {
            addCriterion("customer_province <=", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceLike(String value) {
            addCriterion("customer_province like", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotLike(String value) {
            addCriterion("customer_province not like", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceIn(List<String> values) {
            addCriterion("customer_province in", values, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotIn(List<String> values) {
            addCriterion("customer_province not in", values, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceBetween(String value1, String value2) {
            addCriterion("customer_province between", value1, value2, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotBetween(String value1, String value2) {
            addCriterion("customer_province not between", value1, value2, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNull() {
            addCriterion("customer_city is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNotNull() {
            addCriterion("customer_city is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityEqualTo(String value) {
            addCriterion("customer_city =", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotEqualTo(String value) {
            addCriterion("customer_city <>", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThan(String value) {
            addCriterion("customer_city >", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThanOrEqualTo(String value) {
            addCriterion("customer_city >=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThan(String value) {
            addCriterion("customer_city <", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThanOrEqualTo(String value) {
            addCriterion("customer_city <=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLike(String value) {
            addCriterion("customer_city like", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotLike(String value) {
            addCriterion("customer_city not like", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIn(List<String> values) {
            addCriterion("customer_city in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotIn(List<String> values) {
            addCriterion("customer_city not in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityBetween(String value1, String value2) {
            addCriterion("customer_city between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotBetween(String value1, String value2) {
            addCriterion("customer_city not between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCertIsNull() {
            addCriterion("customer_cert is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCertIsNotNull() {
            addCriterion("customer_cert is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCertEqualTo(String value) {
            addCriterion("customer_cert =", value, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertNotEqualTo(String value) {
            addCriterion("customer_cert <>", value, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertGreaterThan(String value) {
            addCriterion("customer_cert >", value, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertGreaterThanOrEqualTo(String value) {
            addCriterion("customer_cert >=", value, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertLessThan(String value) {
            addCriterion("customer_cert <", value, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertLessThanOrEqualTo(String value) {
            addCriterion("customer_cert <=", value, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertLike(String value) {
            addCriterion("customer_cert like", value, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertNotLike(String value) {
            addCriterion("customer_cert not like", value, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertIn(List<String> values) {
            addCriterion("customer_cert in", values, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertNotIn(List<String> values) {
            addCriterion("customer_cert not in", values, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertBetween(String value1, String value2) {
            addCriterion("customer_cert between", value1, value2, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCertNotBetween(String value1, String value2) {
            addCriterion("customer_cert not between", value1, value2, "customerCert");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeIsNull() {
            addCriterion("customer_cst_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeIsNotNull() {
            addCriterion("customer_cst_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeEqualTo(String value) {
            addCriterion("customer_cst_type =", value, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeNotEqualTo(String value) {
            addCriterion("customer_cst_type <>", value, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeGreaterThan(String value) {
            addCriterion("customer_cst_type >", value, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_cst_type >=", value, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeLessThan(String value) {
            addCriterion("customer_cst_type <", value, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_cst_type <=", value, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeLike(String value) {
            addCriterion("customer_cst_type like", value, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeNotLike(String value) {
            addCriterion("customer_cst_type not like", value, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeIn(List<String> values) {
            addCriterion("customer_cst_type in", values, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeNotIn(List<String> values) {
            addCriterion("customer_cst_type not in", values, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeBetween(String value1, String value2) {
            addCriterion("customer_cst_type between", value1, value2, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeNotBetween(String value1, String value2) {
            addCriterion("customer_cst_type not between", value1, value2, "customerCstType");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescIsNull() {
            addCriterion("customer_cst_type_desc is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescIsNotNull() {
            addCriterion("customer_cst_type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescEqualTo(String value) {
            addCriterion("customer_cst_type_desc =", value, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescNotEqualTo(String value) {
            addCriterion("customer_cst_type_desc <>", value, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescGreaterThan(String value) {
            addCriterion("customer_cst_type_desc >", value, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("customer_cst_type_desc >=", value, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescLessThan(String value) {
            addCriterion("customer_cst_type_desc <", value, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescLessThanOrEqualTo(String value) {
            addCriterion("customer_cst_type_desc <=", value, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescLike(String value) {
            addCriterion("customer_cst_type_desc like", value, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescNotLike(String value) {
            addCriterion("customer_cst_type_desc not like", value, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescIn(List<String> values) {
            addCriterion("customer_cst_type_desc in", values, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescNotIn(List<String> values) {
            addCriterion("customer_cst_type_desc not in", values, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescBetween(String value1, String value2) {
            addCriterion("customer_cst_type_desc between", value1, value2, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCstTypeDescNotBetween(String value1, String value2) {
            addCriterion("customer_cst_type_desc not between", value1, value2, "customerCstTypeDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatIsNull() {
            addCriterion("customer_weichat is null");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatIsNotNull() {
            addCriterion("customer_weichat is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatEqualTo(String value) {
            addCriterion("customer_weichat =", value, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatNotEqualTo(String value) {
            addCriterion("customer_weichat <>", value, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatGreaterThan(String value) {
            addCriterion("customer_weichat >", value, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatGreaterThanOrEqualTo(String value) {
            addCriterion("customer_weichat >=", value, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatLessThan(String value) {
            addCriterion("customer_weichat <", value, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatLessThanOrEqualTo(String value) {
            addCriterion("customer_weichat <=", value, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatLike(String value) {
            addCriterion("customer_weichat like", value, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatNotLike(String value) {
            addCriterion("customer_weichat not like", value, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatIn(List<String> values) {
            addCriterion("customer_weichat in", values, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatNotIn(List<String> values) {
            addCriterion("customer_weichat not in", values, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatBetween(String value1, String value2) {
            addCriterion("customer_weichat between", value1, value2, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerWeichatNotBetween(String value1, String value2) {
            addCriterion("customer_weichat not between", value1, value2, "customerWeichat");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("customer_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("customer_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(Integer value) {
            addCriterion("customer_status =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(Integer value) {
            addCriterion("customer_status <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(Integer value) {
            addCriterion("customer_status >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_status >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(Integer value) {
            addCriterion("customer_status <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_status <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<Integer> values) {
            addCriterion("customer_status in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<Integer> values) {
            addCriterion("customer_status not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_status between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_status not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescIsNull() {
            addCriterion("customer_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescIsNotNull() {
            addCriterion("customer_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescEqualTo(String value) {
            addCriterion("customer_status_desc =", value, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescNotEqualTo(String value) {
            addCriterion("customer_status_desc <>", value, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescGreaterThan(String value) {
            addCriterion("customer_status_desc >", value, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("customer_status_desc >=", value, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescLessThan(String value) {
            addCriterion("customer_status_desc <", value, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescLessThanOrEqualTo(String value) {
            addCriterion("customer_status_desc <=", value, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescLike(String value) {
            addCriterion("customer_status_desc like", value, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescNotLike(String value) {
            addCriterion("customer_status_desc not like", value, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescIn(List<String> values) {
            addCriterion("customer_status_desc in", values, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescNotIn(List<String> values) {
            addCriterion("customer_status_desc not in", values, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescBetween(String value1, String value2) {
            addCriterion("customer_status_desc between", value1, value2, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusDescNotBetween(String value1, String value2) {
            addCriterion("customer_status_desc not between", value1, value2, "customerStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeIsNull() {
            addCriterion("customer_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeIsNotNull() {
            addCriterion("customer_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeEqualTo(Date value) {
            addCriterion("customer_create_time =", value, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeNotEqualTo(Date value) {
            addCriterion("customer_create_time <>", value, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeGreaterThan(Date value) {
            addCriterion("customer_create_time >", value, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_create_time >=", value, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeLessThan(Date value) {
            addCriterion("customer_create_time <", value, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_create_time <=", value, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeIn(List<Date> values) {
            addCriterion("customer_create_time in", values, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeNotIn(List<Date> values) {
            addCriterion("customer_create_time not in", values, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_create_time between", value1, value2, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_create_time not between", value1, value2, "customerCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeIsNull() {
            addCriterion("customer_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeIsNotNull() {
            addCriterion("customer_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeEqualTo(Date value) {
            addCriterion("customer_update_time =", value, "customerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeNotEqualTo(Date value) {
            addCriterion("customer_update_time <>", value, "customerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeGreaterThan(Date value) {
            addCriterion("customer_update_time >", value, "customerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_update_time >=", value, "customerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeLessThan(Date value) {
            addCriterion("customer_update_time <", value, "customerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_update_time <=", value, "customerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeIn(List<Date> values) {
            addCriterion("customer_update_time in", values, "customerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeNotIn(List<Date> values) {
            addCriterion("customer_update_time not in", values, "customerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("customer_update_time between", value1, value2, "customerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_update_time not between", value1, value2, "customerUpdateTime");
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

        public Criteria andStudentCreateTimeIsNull() {
            addCriterion("student_create_time is null");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeIsNotNull() {
            addCriterion("student_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeEqualTo(Date value) {
            addCriterion("student_create_time =", value, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeNotEqualTo(Date value) {
            addCriterion("student_create_time <>", value, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeGreaterThan(Date value) {
            addCriterion("student_create_time >", value, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("student_create_time >=", value, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeLessThan(Date value) {
            addCriterion("student_create_time <", value, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("student_create_time <=", value, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeIn(List<Date> values) {
            addCriterion("student_create_time in", values, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeNotIn(List<Date> values) {
            addCriterion("student_create_time not in", values, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeBetween(Date value1, Date value2) {
            addCriterion("student_create_time between", value1, value2, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("student_create_time not between", value1, value2, "studentCreateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeIsNull() {
            addCriterion("student_update_time is null");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeIsNotNull() {
            addCriterion("student_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeEqualTo(Date value) {
            addCriterion("student_update_time =", value, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeNotEqualTo(Date value) {
            addCriterion("student_update_time <>", value, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeGreaterThan(Date value) {
            addCriterion("student_update_time >", value, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("student_update_time >=", value, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeLessThan(Date value) {
            addCriterion("student_update_time <", value, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("student_update_time <=", value, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeIn(List<Date> values) {
            addCriterion("student_update_time in", values, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeNotIn(List<Date> values) {
            addCriterion("student_update_time not in", values, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("student_update_time between", value1, value2, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("student_update_time not between", value1, value2, "studentUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNull() {
            addCriterion("student_status is null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNotNull() {
            addCriterion("student_status is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusEqualTo(Integer value) {
            addCriterion("student_status =", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotEqualTo(Integer value) {
            addCriterion("student_status <>", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThan(Integer value) {
            addCriterion("student_status >", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_status >=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThan(Integer value) {
            addCriterion("student_status <", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("student_status <=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIn(List<Integer> values) {
            addCriterion("student_status in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotIn(List<Integer> values) {
            addCriterion("student_status not in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusBetween(Integer value1, Integer value2) {
            addCriterion("student_status between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("student_status not between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescIsNull() {
            addCriterion("student_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescIsNotNull() {
            addCriterion("student_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescEqualTo(String value) {
            addCriterion("student_status_desc =", value, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescNotEqualTo(String value) {
            addCriterion("student_status_desc <>", value, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescGreaterThan(String value) {
            addCriterion("student_status_desc >", value, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("student_status_desc >=", value, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescLessThan(String value) {
            addCriterion("student_status_desc <", value, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescLessThanOrEqualTo(String value) {
            addCriterion("student_status_desc <=", value, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescLike(String value) {
            addCriterion("student_status_desc like", value, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescNotLike(String value) {
            addCriterion("student_status_desc not like", value, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescIn(List<String> values) {
            addCriterion("student_status_desc in", values, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescNotIn(List<String> values) {
            addCriterion("student_status_desc not in", values, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescBetween(String value1, String value2) {
            addCriterion("student_status_desc between", value1, value2, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentStatusDescNotBetween(String value1, String value2) {
            addCriterion("student_status_desc not between", value1, value2, "studentStatusDesc");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorIsNull() {
            addCriterion("student_operator is null");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorIsNotNull() {
            addCriterion("student_operator is not null");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorEqualTo(String value) {
            addCriterion("student_operator =", value, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorNotEqualTo(String value) {
            addCriterion("student_operator <>", value, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorGreaterThan(String value) {
            addCriterion("student_operator >", value, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("student_operator >=", value, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorLessThan(String value) {
            addCriterion("student_operator <", value, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorLessThanOrEqualTo(String value) {
            addCriterion("student_operator <=", value, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorLike(String value) {
            addCriterion("student_operator like", value, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorNotLike(String value) {
            addCriterion("student_operator not like", value, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorIn(List<String> values) {
            addCriterion("student_operator in", values, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorNotIn(List<String> values) {
            addCriterion("student_operator not in", values, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorBetween(String value1, String value2) {
            addCriterion("student_operator between", value1, value2, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentOperatorNotBetween(String value1, String value2) {
            addCriterion("student_operator not between", value1, value2, "studentOperator");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeIsNull() {
            addCriterion("student_active_time is null");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeIsNotNull() {
            addCriterion("student_active_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeEqualTo(Date value) {
            addCriterion("student_active_time =", value, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeNotEqualTo(Date value) {
            addCriterion("student_active_time <>", value, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeGreaterThan(Date value) {
            addCriterion("student_active_time >", value, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("student_active_time >=", value, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeLessThan(Date value) {
            addCriterion("student_active_time <", value, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("student_active_time <=", value, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeIn(List<Date> values) {
            addCriterion("student_active_time in", values, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeNotIn(List<Date> values) {
            addCriterion("student_active_time not in", values, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeBetween(Date value1, Date value2) {
            addCriterion("student_active_time between", value1, value2, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("student_active_time not between", value1, value2, "studentActiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeIsNull() {
            addCriterion("student_deactive_time is null");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeIsNotNull() {
            addCriterion("student_deactive_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeEqualTo(Date value) {
            addCriterion("student_deactive_time =", value, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeNotEqualTo(Date value) {
            addCriterion("student_deactive_time <>", value, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeGreaterThan(Date value) {
            addCriterion("student_deactive_time >", value, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("student_deactive_time >=", value, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeLessThan(Date value) {
            addCriterion("student_deactive_time <", value, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("student_deactive_time <=", value, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeIn(List<Date> values) {
            addCriterion("student_deactive_time in", values, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeNotIn(List<Date> values) {
            addCriterion("student_deactive_time not in", values, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeBetween(Date value1, Date value2) {
            addCriterion("student_deactive_time between", value1, value2, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentDeactiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("student_deactive_time not between", value1, value2, "studentDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStudentEducationIsNull() {
            addCriterion("student_education is null");
            return (Criteria) this;
        }

        public Criteria andStudentEducationIsNotNull() {
            addCriterion("student_education is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEducationEqualTo(String value) {
            addCriterion("student_education =", value, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationNotEqualTo(String value) {
            addCriterion("student_education <>", value, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationGreaterThan(String value) {
            addCriterion("student_education >", value, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationGreaterThanOrEqualTo(String value) {
            addCriterion("student_education >=", value, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationLessThan(String value) {
            addCriterion("student_education <", value, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationLessThanOrEqualTo(String value) {
            addCriterion("student_education <=", value, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationLike(String value) {
            addCriterion("student_education like", value, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationNotLike(String value) {
            addCriterion("student_education not like", value, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationIn(List<String> values) {
            addCriterion("student_education in", values, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationNotIn(List<String> values) {
            addCriterion("student_education not in", values, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationBetween(String value1, String value2) {
            addCriterion("student_education between", value1, value2, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentEducationNotBetween(String value1, String value2) {
            addCriterion("student_education not between", value1, value2, "studentEducation");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceIsNull() {
            addCriterion("student_insurance is null");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceIsNotNull() {
            addCriterion("student_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceEqualTo(String value) {
            addCriterion("student_insurance =", value, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceNotEqualTo(String value) {
            addCriterion("student_insurance <>", value, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceGreaterThan(String value) {
            addCriterion("student_insurance >", value, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("student_insurance >=", value, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceLessThan(String value) {
            addCriterion("student_insurance <", value, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceLessThanOrEqualTo(String value) {
            addCriterion("student_insurance <=", value, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceLike(String value) {
            addCriterion("student_insurance like", value, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceNotLike(String value) {
            addCriterion("student_insurance not like", value, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceIn(List<String> values) {
            addCriterion("student_insurance in", values, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceNotIn(List<String> values) {
            addCriterion("student_insurance not in", values, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceBetween(String value1, String value2) {
            addCriterion("student_insurance between", value1, value2, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentInsuranceNotBetween(String value1, String value2) {
            addCriterion("student_insurance not between", value1, value2, "studentInsurance");
            return (Criteria) this;
        }

        public Criteria andStudentComputorIsNull() {
            addCriterion("student_computor is null");
            return (Criteria) this;
        }

        public Criteria andStudentComputorIsNotNull() {
            addCriterion("student_computor is not null");
            return (Criteria) this;
        }

        public Criteria andStudentComputorEqualTo(String value) {
            addCriterion("student_computor =", value, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorNotEqualTo(String value) {
            addCriterion("student_computor <>", value, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorGreaterThan(String value) {
            addCriterion("student_computor >", value, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorGreaterThanOrEqualTo(String value) {
            addCriterion("student_computor >=", value, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorLessThan(String value) {
            addCriterion("student_computor <", value, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorLessThanOrEqualTo(String value) {
            addCriterion("student_computor <=", value, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorLike(String value) {
            addCriterion("student_computor like", value, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorNotLike(String value) {
            addCriterion("student_computor not like", value, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorIn(List<String> values) {
            addCriterion("student_computor in", values, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorNotIn(List<String> values) {
            addCriterion("student_computor not in", values, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorBetween(String value1, String value2) {
            addCriterion("student_computor between", value1, value2, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentComputorNotBetween(String value1, String value2) {
            addCriterion("student_computor not between", value1, value2, "studentComputor");
            return (Criteria) this;
        }

        public Criteria andStudentBoardIsNull() {
            addCriterion("student_board is null");
            return (Criteria) this;
        }

        public Criteria andStudentBoardIsNotNull() {
            addCriterion("student_board is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBoardEqualTo(String value) {
            addCriterion("student_board =", value, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardNotEqualTo(String value) {
            addCriterion("student_board <>", value, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardGreaterThan(String value) {
            addCriterion("student_board >", value, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardGreaterThanOrEqualTo(String value) {
            addCriterion("student_board >=", value, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardLessThan(String value) {
            addCriterion("student_board <", value, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardLessThanOrEqualTo(String value) {
            addCriterion("student_board <=", value, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardLike(String value) {
            addCriterion("student_board like", value, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardNotLike(String value) {
            addCriterion("student_board not like", value, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardIn(List<String> values) {
            addCriterion("student_board in", values, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardNotIn(List<String> values) {
            addCriterion("student_board not in", values, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardBetween(String value1, String value2) {
            addCriterion("student_board between", value1, value2, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBoardNotBetween(String value1, String value2) {
            addCriterion("student_board not between", value1, value2, "studentBoard");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduIsNull() {
            addCriterion("student_buy_edu is null");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduIsNotNull() {
            addCriterion("student_buy_edu is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduEqualTo(Integer value) {
            addCriterion("student_buy_edu =", value, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduNotEqualTo(Integer value) {
            addCriterion("student_buy_edu <>", value, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduGreaterThan(Integer value) {
            addCriterion("student_buy_edu >", value, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_buy_edu >=", value, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduLessThan(Integer value) {
            addCriterion("student_buy_edu <", value, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduLessThanOrEqualTo(Integer value) {
            addCriterion("student_buy_edu <=", value, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduIn(List<Integer> values) {
            addCriterion("student_buy_edu in", values, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduNotIn(List<Integer> values) {
            addCriterion("student_buy_edu not in", values, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduBetween(Integer value1, Integer value2) {
            addCriterion("student_buy_edu between", value1, value2, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentBuyEduNotBetween(Integer value1, Integer value2) {
            addCriterion("student_buy_edu not between", value1, value2, "studentBuyEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduIsNull() {
            addCriterion("student_adult_edu is null");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduIsNotNull() {
            addCriterion("student_adult_edu is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduEqualTo(Integer value) {
            addCriterion("student_adult_edu =", value, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduNotEqualTo(Integer value) {
            addCriterion("student_adult_edu <>", value, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduGreaterThan(Integer value) {
            addCriterion("student_adult_edu >", value, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_adult_edu >=", value, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduLessThan(Integer value) {
            addCriterion("student_adult_edu <", value, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduLessThanOrEqualTo(Integer value) {
            addCriterion("student_adult_edu <=", value, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduIn(List<Integer> values) {
            addCriterion("student_adult_edu in", values, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduNotIn(List<Integer> values) {
            addCriterion("student_adult_edu not in", values, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduBetween(Integer value1, Integer value2) {
            addCriterion("student_adult_edu between", value1, value2, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentAdultEduNotBetween(Integer value1, Integer value2) {
            addCriterion("student_adult_edu not between", value1, value2, "studentAdultEdu");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerIsNull() {
            addCriterion("student_introducer is null");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerIsNotNull() {
            addCriterion("student_introducer is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerEqualTo(String value) {
            addCriterion("student_introducer =", value, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerNotEqualTo(String value) {
            addCriterion("student_introducer <>", value, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerGreaterThan(String value) {
            addCriterion("student_introducer >", value, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerGreaterThanOrEqualTo(String value) {
            addCriterion("student_introducer >=", value, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerLessThan(String value) {
            addCriterion("student_introducer <", value, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerLessThanOrEqualTo(String value) {
            addCriterion("student_introducer <=", value, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerLike(String value) {
            addCriterion("student_introducer like", value, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerNotLike(String value) {
            addCriterion("student_introducer not like", value, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerIn(List<String> values) {
            addCriterion("student_introducer in", values, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerNotIn(List<String> values) {
            addCriterion("student_introducer not in", values, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerBetween(String value1, String value2) {
            addCriterion("student_introducer between", value1, value2, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentIntroducerNotBetween(String value1, String value2) {
            addCriterion("student_introducer not between", value1, value2, "studentIntroducer");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateIsNull() {
            addCriterion("student_enroll_date is null");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateIsNotNull() {
            addCriterion("student_enroll_date is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateEqualTo(Date value) {
            addCriterion("student_enroll_date =", value, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateNotEqualTo(Date value) {
            addCriterion("student_enroll_date <>", value, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateGreaterThan(Date value) {
            addCriterion("student_enroll_date >", value, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateGreaterThanOrEqualTo(Date value) {
            addCriterion("student_enroll_date >=", value, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateLessThan(Date value) {
            addCriterion("student_enroll_date <", value, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateLessThanOrEqualTo(Date value) {
            addCriterion("student_enroll_date <=", value, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateIn(List<Date> values) {
            addCriterion("student_enroll_date in", values, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateNotIn(List<Date> values) {
            addCriterion("student_enroll_date not in", values, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateBetween(Date value1, Date value2) {
            addCriterion("student_enroll_date between", value1, value2, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentEnrollDateNotBetween(Date value1, Date value2) {
            addCriterion("student_enroll_date not between", value1, value2, "studentEnrollDate");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeIsNull() {
            addCriterion("student_student_type is null");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeIsNotNull() {
            addCriterion("student_student_type is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeEqualTo(Integer value) {
            addCriterion("student_student_type =", value, "studentStudentType");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeNotEqualTo(Integer value) {
            addCriterion("student_student_type <>", value, "studentStudentType");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeGreaterThan(Integer value) {
            addCriterion("student_student_type >", value, "studentStudentType");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_student_type >=", value, "studentStudentType");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeLessThan(Integer value) {
            addCriterion("student_student_type <", value, "studentStudentType");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("student_student_type <=", value, "studentStudentType");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeIn(List<Integer> values) {
            addCriterion("student_student_type in", values, "studentStudentType");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeNotIn(List<Integer> values) {
            addCriterion("student_student_type not in", values, "studentStudentType");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeBetween(Integer value1, Integer value2) {
            addCriterion("student_student_type between", value1, value2, "studentStudentType");
            return (Criteria) this;
        }

        public Criteria andStudentStudentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_student_type not between", value1, value2, "studentStudentType");
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

        public Criteria andUserUserNameIsNull() {
            addCriterion("user_user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserUserNameIsNotNull() {
            addCriterion("user_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserUserNameEqualTo(String value) {
            addCriterion("user_user_name =", value, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameNotEqualTo(String value) {
            addCriterion("user_user_name <>", value, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameGreaterThan(String value) {
            addCriterion("user_user_name >", value, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_user_name >=", value, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameLessThan(String value) {
            addCriterion("user_user_name <", value, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_user_name <=", value, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameLike(String value) {
            addCriterion("user_user_name like", value, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameNotLike(String value) {
            addCriterion("user_user_name not like", value, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameIn(List<String> values) {
            addCriterion("user_user_name in", values, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameNotIn(List<String> values) {
            addCriterion("user_user_name not in", values, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameBetween(String value1, String value2) {
            addCriterion("user_user_name between", value1, value2, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserUserNameNotBetween(String value1, String value2) {
            addCriterion("user_user_name not between", value1, value2, "userUserName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("user_pwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("user_pwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("user_pwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("user_pwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("user_pwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("user_pwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("user_pwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("user_pwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("user_pwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("user_pwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("user_pwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("user_pwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNull() {
            addCriterion("user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNotNull() {
            addCriterion("user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeEqualTo(Date value) {
            addCriterion("user_create_time =", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotEqualTo(Date value) {
            addCriterion("user_create_time <>", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThan(Date value) {
            addCriterion("user_create_time >", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_create_time >=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThan(Date value) {
            addCriterion("user_create_time <", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_create_time <=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIn(List<Date> values) {
            addCriterion("user_create_time in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotIn(List<Date> values) {
            addCriterion("user_create_time not in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_create_time between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_create_time not between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNull() {
            addCriterion("user_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNotNull() {
            addCriterion("user_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeEqualTo(Date value) {
            addCriterion("user_update_time =", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotEqualTo(Date value) {
            addCriterion("user_update_time <>", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThan(Date value) {
            addCriterion("user_update_time >", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_update_time >=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThan(Date value) {
            addCriterion("user_update_time <", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_update_time <=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIn(List<Date> values) {
            addCriterion("user_update_time in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotIn(List<Date> values) {
            addCriterion("user_update_time not in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("user_update_time between", value1, value2, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_update_time not between", value1, value2, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoIsNull() {
            addCriterion("user_operate_uno is null");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoIsNotNull() {
            addCriterion("user_operate_uno is not null");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoEqualTo(String value) {
            addCriterion("user_operate_uno =", value, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoNotEqualTo(String value) {
            addCriterion("user_operate_uno <>", value, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoGreaterThan(String value) {
            addCriterion("user_operate_uno >", value, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoGreaterThanOrEqualTo(String value) {
            addCriterion("user_operate_uno >=", value, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoLessThan(String value) {
            addCriterion("user_operate_uno <", value, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoLessThanOrEqualTo(String value) {
            addCriterion("user_operate_uno <=", value, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoLike(String value) {
            addCriterion("user_operate_uno like", value, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoNotLike(String value) {
            addCriterion("user_operate_uno not like", value, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoIn(List<String> values) {
            addCriterion("user_operate_uno in", values, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoNotIn(List<String> values) {
            addCriterion("user_operate_uno not in", values, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoBetween(String value1, String value2) {
            addCriterion("user_operate_uno between", value1, value2, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserOperateUnoNotBetween(String value1, String value2) {
            addCriterion("user_operate_uno not between", value1, value2, "userOperateUno");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeIsNull() {
            addCriterion("user_active_time is null");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeIsNotNull() {
            addCriterion("user_active_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeEqualTo(Date value) {
            addCriterion("user_active_time =", value, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeNotEqualTo(Date value) {
            addCriterion("user_active_time <>", value, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeGreaterThan(Date value) {
            addCriterion("user_active_time >", value, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_active_time >=", value, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeLessThan(Date value) {
            addCriterion("user_active_time <", value, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_active_time <=", value, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeIn(List<Date> values) {
            addCriterion("user_active_time in", values, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeNotIn(List<Date> values) {
            addCriterion("user_active_time not in", values, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeBetween(Date value1, Date value2) {
            addCriterion("user_active_time between", value1, value2, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_active_time not between", value1, value2, "userActiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeIsNull() {
            addCriterion("user_deactive_time is null");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeIsNotNull() {
            addCriterion("user_deactive_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeEqualTo(Date value) {
            addCriterion("user_deactive_time =", value, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeNotEqualTo(Date value) {
            addCriterion("user_deactive_time <>", value, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeGreaterThan(Date value) {
            addCriterion("user_deactive_time >", value, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_deactive_time >=", value, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeLessThan(Date value) {
            addCriterion("user_deactive_time <", value, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_deactive_time <=", value, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeIn(List<Date> values) {
            addCriterion("user_deactive_time in", values, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeNotIn(List<Date> values) {
            addCriterion("user_deactive_time not in", values, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeBetween(Date value1, Date value2) {
            addCriterion("user_deactive_time between", value1, value2, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andUserDeactiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_deactive_time not between", value1, value2, "userDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdIsNull() {
            addCriterion("stu_2_class_id is null");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdIsNotNull() {
            addCriterion("stu_2_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdEqualTo(Integer value) {
            addCriterion("stu_2_class_id =", value, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdNotEqualTo(Integer value) {
            addCriterion("stu_2_class_id <>", value, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdGreaterThan(Integer value) {
            addCriterion("stu_2_class_id >", value, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_2_class_id >=", value, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdLessThan(Integer value) {
            addCriterion("stu_2_class_id <", value, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_2_class_id <=", value, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdIn(List<Integer> values) {
            addCriterion("stu_2_class_id in", values, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdNotIn(List<Integer> values) {
            addCriterion("stu_2_class_id not in", values, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_2_class_id between", value1, value2, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2ClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_2_class_id not between", value1, value2, "stu2ClassId");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeIsNull() {
            addCriterion("stu_2_create_time is null");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeIsNotNull() {
            addCriterion("stu_2_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeEqualTo(Date value) {
            addCriterion("stu_2_create_time =", value, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeNotEqualTo(Date value) {
            addCriterion("stu_2_create_time <>", value, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeGreaterThan(Date value) {
            addCriterion("stu_2_create_time >", value, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_2_create_time >=", value, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeLessThan(Date value) {
            addCriterion("stu_2_create_time <", value, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_2_create_time <=", value, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeIn(List<Date> values) {
            addCriterion("stu_2_create_time in", values, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeNotIn(List<Date> values) {
            addCriterion("stu_2_create_time not in", values, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeBetween(Date value1, Date value2) {
            addCriterion("stu_2_create_time between", value1, value2, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2CreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_2_create_time not between", value1, value2, "stu2CreateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeIsNull() {
            addCriterion("stu_2_update_time is null");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeIsNotNull() {
            addCriterion("stu_2_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeEqualTo(Date value) {
            addCriterion("stu_2_update_time =", value, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeNotEqualTo(Date value) {
            addCriterion("stu_2_update_time <>", value, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeGreaterThan(Date value) {
            addCriterion("stu_2_update_time >", value, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stu_2_update_time >=", value, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeLessThan(Date value) {
            addCriterion("stu_2_update_time <", value, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("stu_2_update_time <=", value, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeIn(List<Date> values) {
            addCriterion("stu_2_update_time in", values, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeNotIn(List<Date> values) {
            addCriterion("stu_2_update_time not in", values, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeBetween(Date value1, Date value2) {
            addCriterion("stu_2_update_time between", value1, value2, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2UpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("stu_2_update_time not between", value1, value2, "stu2UpdateTime");
            return (Criteria) this;
        }

        public Criteria andStu2StatusIsNull() {
            addCriterion("stu_2_status is null");
            return (Criteria) this;
        }

        public Criteria andStu2StatusIsNotNull() {
            addCriterion("stu_2_status is not null");
            return (Criteria) this;
        }

        public Criteria andStu2StatusEqualTo(Integer value) {
            addCriterion("stu_2_status =", value, "stu2Status");
            return (Criteria) this;
        }

        public Criteria andStu2StatusNotEqualTo(Integer value) {
            addCriterion("stu_2_status <>", value, "stu2Status");
            return (Criteria) this;
        }

        public Criteria andStu2StatusGreaterThan(Integer value) {
            addCriterion("stu_2_status >", value, "stu2Status");
            return (Criteria) this;
        }

        public Criteria andStu2StatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_2_status >=", value, "stu2Status");
            return (Criteria) this;
        }

        public Criteria andStu2StatusLessThan(Integer value) {
            addCriterion("stu_2_status <", value, "stu2Status");
            return (Criteria) this;
        }

        public Criteria andStu2StatusLessThanOrEqualTo(Integer value) {
            addCriterion("stu_2_status <=", value, "stu2Status");
            return (Criteria) this;
        }

        public Criteria andStu2StatusIn(List<Integer> values) {
            addCriterion("stu_2_status in", values, "stu2Status");
            return (Criteria) this;
        }

        public Criteria andStu2StatusNotIn(List<Integer> values) {
            addCriterion("stu_2_status not in", values, "stu2Status");
            return (Criteria) this;
        }

        public Criteria andStu2StatusBetween(Integer value1, Integer value2) {
            addCriterion("stu_2_status between", value1, value2, "stu2Status");
            return (Criteria) this;
        }

        public Criteria andStu2StatusNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_2_status not between", value1, value2, "stu2Status");
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

        public Criteria andClassStartDateIsNull() {
            addCriterion("class_start_date is null");
            return (Criteria) this;
        }

        public Criteria andClassStartDateIsNotNull() {
            addCriterion("class_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andClassStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("class_start_date =", value, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("class_start_date <>", value, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("class_start_date >", value, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("class_start_date >=", value, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassStartDateLessThan(Date value) {
            addCriterionForJDBCDate("class_start_date <", value, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("class_start_date <=", value, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("class_start_date in", values, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("class_start_date not in", values, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("class_start_date between", value1, value2, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("class_start_date not between", value1, value2, "classStartDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateIsNull() {
            addCriterion("class_graduate_date is null");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateIsNotNull() {
            addCriterion("class_graduate_date is not null");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateEqualTo(Date value) {
            addCriterionForJDBCDate("class_graduate_date =", value, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("class_graduate_date <>", value, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("class_graduate_date >", value, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("class_graduate_date >=", value, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateLessThan(Date value) {
            addCriterionForJDBCDate("class_graduate_date <", value, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("class_graduate_date <=", value, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateIn(List<Date> values) {
            addCriterionForJDBCDate("class_graduate_date in", values, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("class_graduate_date not in", values, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("class_graduate_date between", value1, value2, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassGraduateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("class_graduate_date not between", value1, value2, "classGraduateDate");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIsNull() {
            addCriterion("class_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIsNotNull() {
            addCriterion("class_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdEqualTo(Integer value) {
            addCriterion("class_teacher_id =", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotEqualTo(Integer value) {
            addCriterion("class_teacher_id <>", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdGreaterThan(Integer value) {
            addCriterion("class_teacher_id >", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_teacher_id >=", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLessThan(Integer value) {
            addCriterion("class_teacher_id <", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_teacher_id <=", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIn(List<Integer> values) {
            addCriterion("class_teacher_id in", values, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotIn(List<Integer> values) {
            addCriterion("class_teacher_id not in", values, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("class_teacher_id between", value1, value2, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_teacher_id not between", value1, value2, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationIsNull() {
            addCriterion("class_class_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationIsNotNull() {
            addCriterion("class_class_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationEqualTo(String value) {
            addCriterion("class_class_abbreviation =", value, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationNotEqualTo(String value) {
            addCriterion("class_class_abbreviation <>", value, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationGreaterThan(String value) {
            addCriterion("class_class_abbreviation >", value, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("class_class_abbreviation >=", value, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationLessThan(String value) {
            addCriterion("class_class_abbreviation <", value, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("class_class_abbreviation <=", value, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationLike(String value) {
            addCriterion("class_class_abbreviation like", value, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationNotLike(String value) {
            addCriterion("class_class_abbreviation not like", value, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationIn(List<String> values) {
            addCriterion("class_class_abbreviation in", values, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationNotIn(List<String> values) {
            addCriterion("class_class_abbreviation not in", values, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationBetween(String value1, String value2) {
            addCriterion("class_class_abbreviation between", value1, value2, "classClassAbbreviation");
            return (Criteria) this;
        }

        public Criteria andClassClassAbbreviationNotBetween(String value1, String value2) {
            addCriterion("class_class_abbreviation not between", value1, value2, "classClassAbbreviation");
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

        public Criteria andTeacherStatusIsNull() {
            addCriterion("teacher_status is null");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIsNotNull() {
            addCriterion("teacher_status is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusEqualTo(String value) {
            addCriterion("teacher_status =", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotEqualTo(String value) {
            addCriterion("teacher_status <>", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusGreaterThan(String value) {
            addCriterion("teacher_status >", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_status >=", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLessThan(String value) {
            addCriterion("teacher_status <", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLessThanOrEqualTo(String value) {
            addCriterion("teacher_status <=", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusLike(String value) {
            addCriterion("teacher_status like", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotLike(String value) {
            addCriterion("teacher_status not like", value, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusIn(List<String> values) {
            addCriterion("teacher_status in", values, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotIn(List<String> values) {
            addCriterion("teacher_status not in", values, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusBetween(String value1, String value2) {
            addCriterion("teacher_status between", value1, value2, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherStatusNotBetween(String value1, String value2) {
            addCriterion("teacher_status not between", value1, value2, "teacherStatus");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeIsNull() {
            addCriterion("teacher_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeIsNotNull() {
            addCriterion("teacher_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeEqualTo(Date value) {
            addCriterion("teacher_create_time =", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeNotEqualTo(Date value) {
            addCriterion("teacher_create_time <>", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeGreaterThan(Date value) {
            addCriterion("teacher_create_time >", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_create_time >=", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeLessThan(Date value) {
            addCriterion("teacher_create_time <", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("teacher_create_time <=", value, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeIn(List<Date> values) {
            addCriterion("teacher_create_time in", values, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeNotIn(List<Date> values) {
            addCriterion("teacher_create_time not in", values, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeBetween(Date value1, Date value2) {
            addCriterion("teacher_create_time between", value1, value2, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("teacher_create_time not between", value1, value2, "teacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeIsNull() {
            addCriterion("teacher_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeIsNotNull() {
            addCriterion("teacher_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeEqualTo(Date value) {
            addCriterion("teacher_update_time =", value, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeNotEqualTo(Date value) {
            addCriterion("teacher_update_time <>", value, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeGreaterThan(Date value) {
            addCriterion("teacher_update_time >", value, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_update_time >=", value, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeLessThan(Date value) {
            addCriterion("teacher_update_time <", value, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("teacher_update_time <=", value, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeIn(List<Date> values) {
            addCriterion("teacher_update_time in", values, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeNotIn(List<Date> values) {
            addCriterion("teacher_update_time not in", values, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("teacher_update_time between", value1, value2, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("teacher_update_time not between", value1, value2, "teacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorIsNull() {
            addCriterion("teacher_operator is null");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorIsNotNull() {
            addCriterion("teacher_operator is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorEqualTo(String value) {
            addCriterion("teacher_operator =", value, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorNotEqualTo(String value) {
            addCriterion("teacher_operator <>", value, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorGreaterThan(String value) {
            addCriterion("teacher_operator >", value, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_operator >=", value, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorLessThan(String value) {
            addCriterion("teacher_operator <", value, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorLessThanOrEqualTo(String value) {
            addCriterion("teacher_operator <=", value, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorLike(String value) {
            addCriterion("teacher_operator like", value, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorNotLike(String value) {
            addCriterion("teacher_operator not like", value, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorIn(List<String> values) {
            addCriterion("teacher_operator in", values, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorNotIn(List<String> values) {
            addCriterion("teacher_operator not in", values, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorBetween(String value1, String value2) {
            addCriterion("teacher_operator between", value1, value2, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherOperatorNotBetween(String value1, String value2) {
            addCriterion("teacher_operator not between", value1, value2, "teacherOperator");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeIsNull() {
            addCriterion("teacher_grade is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeIsNotNull() {
            addCriterion("teacher_grade is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeEqualTo(Integer value) {
            addCriterion("teacher_grade =", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeNotEqualTo(Integer value) {
            addCriterion("teacher_grade <>", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeGreaterThan(Integer value) {
            addCriterion("teacher_grade >", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_grade >=", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeLessThan(Integer value) {
            addCriterion("teacher_grade <", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_grade <=", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeIn(List<Integer> values) {
            addCriterion("teacher_grade in", values, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeNotIn(List<Integer> values) {
            addCriterion("teacher_grade not in", values, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeBetween(Integer value1, Integer value2) {
            addCriterion("teacher_grade between", value1, value2, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_grade not between", value1, value2, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeIsNull() {
            addCriterion("teacher_teacher_type is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeIsNotNull() {
            addCriterion("teacher_teacher_type is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeEqualTo(Integer value) {
            addCriterion("teacher_teacher_type =", value, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeNotEqualTo(Integer value) {
            addCriterion("teacher_teacher_type <>", value, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeGreaterThan(Integer value) {
            addCriterion("teacher_teacher_type >", value, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_teacher_type >=", value, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeLessThan(Integer value) {
            addCriterion("teacher_teacher_type <", value, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_teacher_type <=", value, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeIn(List<Integer> values) {
            addCriterion("teacher_teacher_type in", values, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeNotIn(List<Integer> values) {
            addCriterion("teacher_teacher_type not in", values, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeBetween(Integer value1, Integer value2) {
            addCriterion("teacher_teacher_type between", value1, value2, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andTeacherTeacherTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_teacher_type not between", value1, value2, "teacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNull() {
            addCriterion("schedule_id is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIsNotNull() {
            addCriterion("schedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleIdEqualTo(Integer value) {
            addCriterion("schedule_id =", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotEqualTo(Integer value) {
            addCriterion("schedule_id <>", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThan(Integer value) {
            addCriterion("schedule_id >", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_id >=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThan(Integer value) {
            addCriterion("schedule_id <", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_id <=", value, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdIn(List<Integer> values) {
            addCriterion("schedule_id in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotIn(List<Integer> values) {
            addCriterion("schedule_id not in", values, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id not between", value1, value2, "scheduleId");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeIsNull() {
            addCriterion("schedule_create_time is null");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeIsNotNull() {
            addCriterion("schedule_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeEqualTo(Date value) {
            addCriterion("schedule_create_time =", value, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeNotEqualTo(Date value) {
            addCriterion("schedule_create_time <>", value, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeGreaterThan(Date value) {
            addCriterion("schedule_create_time >", value, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("schedule_create_time >=", value, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeLessThan(Date value) {
            addCriterion("schedule_create_time <", value, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("schedule_create_time <=", value, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeIn(List<Date> values) {
            addCriterion("schedule_create_time in", values, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeNotIn(List<Date> values) {
            addCriterion("schedule_create_time not in", values, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("schedule_create_time between", value1, value2, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("schedule_create_time not between", value1, value2, "scheduleCreateTime");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusIsNull() {
            addCriterion("schedule_status is null");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusIsNotNull() {
            addCriterion("schedule_status is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusEqualTo(Integer value) {
            addCriterion("schedule_status =", value, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusNotEqualTo(Integer value) {
            addCriterion("schedule_status <>", value, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusGreaterThan(Integer value) {
            addCriterion("schedule_status >", value, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_status >=", value, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusLessThan(Integer value) {
            addCriterion("schedule_status <", value, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_status <=", value, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusIn(List<Integer> values) {
            addCriterion("schedule_status in", values, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusNotIn(List<Integer> values) {
            addCriterion("schedule_status not in", values, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusBetween(Integer value1, Integer value2) {
            addCriterion("schedule_status between", value1, value2, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_status not between", value1, value2, "scheduleStatus");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeIsNull() {
            addCriterion("schedule_active_time is null");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeIsNotNull() {
            addCriterion("schedule_active_time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeEqualTo(Date value) {
            addCriterion("schedule_active_time =", value, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeNotEqualTo(Date value) {
            addCriterion("schedule_active_time <>", value, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeGreaterThan(Date value) {
            addCriterion("schedule_active_time >", value, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("schedule_active_time >=", value, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeLessThan(Date value) {
            addCriterion("schedule_active_time <", value, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("schedule_active_time <=", value, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeIn(List<Date> values) {
            addCriterion("schedule_active_time in", values, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeNotIn(List<Date> values) {
            addCriterion("schedule_active_time not in", values, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeBetween(Date value1, Date value2) {
            addCriterion("schedule_active_time between", value1, value2, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("schedule_active_time not between", value1, value2, "scheduleActiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeIsNull() {
            addCriterion("schedule_deactive_time is null");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeIsNotNull() {
            addCriterion("schedule_deactive_time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeEqualTo(Date value) {
            addCriterion("schedule_deactive_time =", value, "scheduleDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeNotEqualTo(Date value) {
            addCriterion("schedule_deactive_time <>", value, "scheduleDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeGreaterThan(Date value) {
            addCriterion("schedule_deactive_time >", value, "scheduleDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("schedule_deactive_time >=", value, "scheduleDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeLessThan(Date value) {
            addCriterion("schedule_deactive_time <", value, "scheduleDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("schedule_deactive_time <=", value, "scheduleDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeIn(List<Date> values) {
            addCriterion("schedule_deactive_time in", values, "scheduleDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeNotIn(List<Date> values) {
            addCriterion("schedule_deactive_time not in", values, "scheduleDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeBetween(Date value1, Date value2) {
            addCriterion("schedule_deactive_time between", value1, value2, "scheduleDeactiveTime");
            return (Criteria) this;
        }

        public Criteria andScheduleDeactiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("schedule_deactive_time not between", value1, value2, "scheduleDeactiveTime");
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

        public Criteria andCourseTeacherMainIdIsNull() {
            addCriterion("course_teacher_main_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdIsNotNull() {
            addCriterion("course_teacher_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdEqualTo(Integer value) {
            addCriterion("course_teacher_main_id =", value, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdNotEqualTo(Integer value) {
            addCriterion("course_teacher_main_id <>", value, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdGreaterThan(Integer value) {
            addCriterion("course_teacher_main_id >", value, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_main_id >=", value, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdLessThan(Integer value) {
            addCriterion("course_teacher_main_id <", value, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_main_id <=", value, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdIn(List<Integer> values) {
            addCriterion("course_teacher_main_id in", values, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdNotIn(List<Integer> values) {
            addCriterion("course_teacher_main_id not in", values, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_main_id between", value1, value2, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherMainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_main_id not between", value1, value2, "courseTeacherMainId");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIsNull() {
            addCriterion("course_status is null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIsNotNull() {
            addCriterion("course_status is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusEqualTo(Integer value) {
            addCriterion("course_status =", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotEqualTo(Integer value) {
            addCriterion("course_status <>", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusGreaterThan(Integer value) {
            addCriterion("course_status >", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_status >=", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusLessThan(Integer value) {
            addCriterion("course_status <", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("course_status <=", value, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusIn(List<Integer> values) {
            addCriterion("course_status in", values, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotIn(List<Integer> values) {
            addCriterion("course_status not in", values, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusBetween(Integer value1, Integer value2) {
            addCriterion("course_status between", value1, value2, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("course_status not between", value1, value2, "courseStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdIsNull() {
            addCriterion("course_teacher_asis_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdIsNotNull() {
            addCriterion("course_teacher_asis_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdEqualTo(Integer value) {
            addCriterion("course_teacher_asis_id =", value, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdNotEqualTo(Integer value) {
            addCriterion("course_teacher_asis_id <>", value, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdGreaterThan(Integer value) {
            addCriterion("course_teacher_asis_id >", value, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_asis_id >=", value, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdLessThan(Integer value) {
            addCriterion("course_teacher_asis_id <", value, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_asis_id <=", value, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdIn(List<Integer> values) {
            addCriterion("course_teacher_asis_id in", values, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdNotIn(List<Integer> values) {
            addCriterion("course_teacher_asis_id not in", values, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_asis_id between", value1, value2, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherAsisIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_asis_id not between", value1, value2, "courseTeacherAsisId");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeIsNull() {
            addCriterion("course_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeIsNotNull() {
            addCriterion("course_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("course_start_time =", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("course_start_time <>", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("course_start_time >", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("course_start_time >=", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("course_start_time <", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("course_start_time <=", value, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("course_start_time in", values, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("course_start_time not in", values, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("course_start_time between", value1, value2, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("course_start_time not between", value1, value2, "courseStartTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeIsNull() {
            addCriterion("course_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeIsNotNull() {
            addCriterion("course_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("course_end_time =", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("course_end_time <>", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("course_end_time >", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("course_end_time >=", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("course_end_time <", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("course_end_time <=", value, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("course_end_time in", values, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("course_end_time not in", values, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("course_end_time between", value1, value2, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("course_end_time not between", value1, value2, "courseEndTime");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdIsNull() {
            addCriterion("course_lecture_pkg_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdIsNotNull() {
            addCriterion("course_lecture_pkg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdEqualTo(Integer value) {
            addCriterion("course_lecture_pkg_id =", value, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdNotEqualTo(Integer value) {
            addCriterion("course_lecture_pkg_id <>", value, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdGreaterThan(Integer value) {
            addCriterion("course_lecture_pkg_id >", value, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_lecture_pkg_id >=", value, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdLessThan(Integer value) {
            addCriterion("course_lecture_pkg_id <", value, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_lecture_pkg_id <=", value, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdIn(List<Integer> values) {
            addCriterion("course_lecture_pkg_id in", values, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdNotIn(List<Integer> values) {
            addCriterion("course_lecture_pkg_id not in", values, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdBetween(Integer value1, Integer value2) {
            addCriterion("course_lecture_pkg_id between", value1, value2, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseLecturePkgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_lecture_pkg_id not between", value1, value2, "courseLecturePkgId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdIsNull() {
            addCriterion("course_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdIsNotNull() {
            addCriterion("course_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdEqualTo(Integer value) {
            addCriterion("course_teacher_id =", value, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdNotEqualTo(Integer value) {
            addCriterion("course_teacher_id <>", value, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdGreaterThan(Integer value) {
            addCriterion("course_teacher_id >", value, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_id >=", value, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdLessThan(Integer value) {
            addCriterion("course_teacher_id <", value, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_id <=", value, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdIn(List<Integer> values) {
            addCriterion("course_teacher_id in", values, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdNotIn(List<Integer> values) {
            addCriterion("course_teacher_id not in", values, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_id between", value1, value2, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_id not between", value1, value2, "courseTeacherId");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusIsNull() {
            addCriterion("course_teacher_status is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusIsNotNull() {
            addCriterion("course_teacher_status is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusEqualTo(String value) {
            addCriterion("course_teacher_status =", value, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusNotEqualTo(String value) {
            addCriterion("course_teacher_status <>", value, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusGreaterThan(String value) {
            addCriterion("course_teacher_status >", value, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusGreaterThanOrEqualTo(String value) {
            addCriterion("course_teacher_status >=", value, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusLessThan(String value) {
            addCriterion("course_teacher_status <", value, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusLessThanOrEqualTo(String value) {
            addCriterion("course_teacher_status <=", value, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusLike(String value) {
            addCriterion("course_teacher_status like", value, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusNotLike(String value) {
            addCriterion("course_teacher_status not like", value, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusIn(List<String> values) {
            addCriterion("course_teacher_status in", values, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusNotIn(List<String> values) {
            addCriterion("course_teacher_status not in", values, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusBetween(String value1, String value2) {
            addCriterion("course_teacher_status between", value1, value2, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherStatusNotBetween(String value1, String value2) {
            addCriterion("course_teacher_status not between", value1, value2, "courseTeacherStatus");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeIsNull() {
            addCriterion("course_teacher_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeIsNotNull() {
            addCriterion("course_teacher_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeEqualTo(Date value) {
            addCriterion("course_teacher_create_time =", value, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeNotEqualTo(Date value) {
            addCriterion("course_teacher_create_time <>", value, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeGreaterThan(Date value) {
            addCriterion("course_teacher_create_time >", value, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_teacher_create_time >=", value, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeLessThan(Date value) {
            addCriterion("course_teacher_create_time <", value, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("course_teacher_create_time <=", value, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeIn(List<Date> values) {
            addCriterion("course_teacher_create_time in", values, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeNotIn(List<Date> values) {
            addCriterion("course_teacher_create_time not in", values, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeBetween(Date value1, Date value2) {
            addCriterion("course_teacher_create_time between", value1, value2, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("course_teacher_create_time not between", value1, value2, "courseTeacherCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeIsNull() {
            addCriterion("course_teacher_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeIsNotNull() {
            addCriterion("course_teacher_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeEqualTo(Date value) {
            addCriterion("course_teacher_update_time =", value, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeNotEqualTo(Date value) {
            addCriterion("course_teacher_update_time <>", value, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeGreaterThan(Date value) {
            addCriterion("course_teacher_update_time >", value, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_teacher_update_time >=", value, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeLessThan(Date value) {
            addCriterion("course_teacher_update_time <", value, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("course_teacher_update_time <=", value, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeIn(List<Date> values) {
            addCriterion("course_teacher_update_time in", values, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeNotIn(List<Date> values) {
            addCriterion("course_teacher_update_time not in", values, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("course_teacher_update_time between", value1, value2, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("course_teacher_update_time not between", value1, value2, "courseTeacherUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorIsNull() {
            addCriterion("course_teacher_operator is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorIsNotNull() {
            addCriterion("course_teacher_operator is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorEqualTo(String value) {
            addCriterion("course_teacher_operator =", value, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorNotEqualTo(String value) {
            addCriterion("course_teacher_operator <>", value, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorGreaterThan(String value) {
            addCriterion("course_teacher_operator >", value, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("course_teacher_operator >=", value, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorLessThan(String value) {
            addCriterion("course_teacher_operator <", value, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorLessThanOrEqualTo(String value) {
            addCriterion("course_teacher_operator <=", value, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorLike(String value) {
            addCriterion("course_teacher_operator like", value, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorNotLike(String value) {
            addCriterion("course_teacher_operator not like", value, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorIn(List<String> values) {
            addCriterion("course_teacher_operator in", values, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorNotIn(List<String> values) {
            addCriterion("course_teacher_operator not in", values, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorBetween(String value1, String value2) {
            addCriterion("course_teacher_operator between", value1, value2, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherOperatorNotBetween(String value1, String value2) {
            addCriterion("course_teacher_operator not between", value1, value2, "courseTeacherOperator");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeIsNull() {
            addCriterion("course_teacher_grade is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeIsNotNull() {
            addCriterion("course_teacher_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeEqualTo(Integer value) {
            addCriterion("course_teacher_grade =", value, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeNotEqualTo(Integer value) {
            addCriterion("course_teacher_grade <>", value, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeGreaterThan(Integer value) {
            addCriterion("course_teacher_grade >", value, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_grade >=", value, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeLessThan(Integer value) {
            addCriterion("course_teacher_grade <", value, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeLessThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_grade <=", value, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeIn(List<Integer> values) {
            addCriterion("course_teacher_grade in", values, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeNotIn(List<Integer> values) {
            addCriterion("course_teacher_grade not in", values, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_grade between", value1, value2, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_grade not between", value1, value2, "courseTeacherGrade");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeIsNull() {
            addCriterion("course_teacher_teacher_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeIsNotNull() {
            addCriterion("course_teacher_teacher_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeEqualTo(Integer value) {
            addCriterion("course_teacher_teacher_type =", value, "courseTeacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeNotEqualTo(Integer value) {
            addCriterion("course_teacher_teacher_type <>", value, "courseTeacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeGreaterThan(Integer value) {
            addCriterion("course_teacher_teacher_type >", value, "courseTeacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_teacher_type >=", value, "courseTeacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeLessThan(Integer value) {
            addCriterion("course_teacher_teacher_type <", value, "courseTeacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeLessThanOrEqualTo(Integer value) {
            addCriterion("course_teacher_teacher_type <=", value, "courseTeacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeIn(List<Integer> values) {
            addCriterion("course_teacher_teacher_type in", values, "courseTeacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeNotIn(List<Integer> values) {
            addCriterion("course_teacher_teacher_type not in", values, "courseTeacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_teacher_type between", value1, value2, "courseTeacherTeacherType");
            return (Criteria) this;
        }

        public Criteria andCourseTeacherTeacherTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("course_teacher_teacher_type not between", value1, value2, "courseTeacherTeacherType");
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

        public Criteria andInterviewCallTimeIsNull() {
            addCriterion("interview_call_time is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeIsNotNull() {
            addCriterion("interview_call_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeEqualTo(Date value) {
            addCriterion("interview_call_time =", value, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeNotEqualTo(Date value) {
            addCriterion("interview_call_time <>", value, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeGreaterThan(Date value) {
            addCriterion("interview_call_time >", value, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interview_call_time >=", value, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeLessThan(Date value) {
            addCriterion("interview_call_time <", value, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeLessThanOrEqualTo(Date value) {
            addCriterion("interview_call_time <=", value, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeIn(List<Date> values) {
            addCriterion("interview_call_time in", values, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeNotIn(List<Date> values) {
            addCriterion("interview_call_time not in", values, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeBetween(Date value1, Date value2) {
            addCriterion("interview_call_time between", value1, value2, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCallTimeNotBetween(Date value1, Date value2) {
            addCriterion("interview_call_time not between", value1, value2, "interviewCallTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeIsNull() {
            addCriterion("interview_interview_time is null");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeIsNotNull() {
            addCriterion("interview_interview_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeEqualTo(Date value) {
            addCriterion("interview_interview_time =", value, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeNotEqualTo(Date value) {
            addCriterion("interview_interview_time <>", value, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeGreaterThan(Date value) {
            addCriterion("interview_interview_time >", value, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interview_interview_time >=", value, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeLessThan(Date value) {
            addCriterion("interview_interview_time <", value, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeLessThanOrEqualTo(Date value) {
            addCriterion("interview_interview_time <=", value, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeIn(List<Date> values) {
            addCriterion("interview_interview_time in", values, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeNotIn(List<Date> values) {
            addCriterion("interview_interview_time not in", values, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeBetween(Date value1, Date value2) {
            addCriterion("interview_interview_time between", value1, value2, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewInterviewTimeNotBetween(Date value1, Date value2) {
            addCriterion("interview_interview_time not between", value1, value2, "interviewInterviewTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeIsNull() {
            addCriterion("interview_work_time is null");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeIsNotNull() {
            addCriterion("interview_work_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeEqualTo(Date value) {
            addCriterionForJDBCDate("interview_work_time =", value, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("interview_work_time <>", value, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("interview_work_time >", value, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("interview_work_time >=", value, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeLessThan(Date value) {
            addCriterionForJDBCDate("interview_work_time <", value, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("interview_work_time <=", value, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeIn(List<Date> values) {
            addCriterionForJDBCDate("interview_work_time in", values, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("interview_work_time not in", values, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("interview_work_time between", value1, value2, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewWorkTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("interview_work_time not between", value1, value2, "interviewWorkTime");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressIsNull() {
            addCriterion("interview_progress is null");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressIsNotNull() {
            addCriterion("interview_progress is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressEqualTo(Integer value) {
            addCriterion("interview_progress =", value, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressNotEqualTo(Integer value) {
            addCriterion("interview_progress <>", value, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressGreaterThan(Integer value) {
            addCriterion("interview_progress >", value, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_progress >=", value, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressLessThan(Integer value) {
            addCriterion("interview_progress <", value, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressLessThanOrEqualTo(Integer value) {
            addCriterion("interview_progress <=", value, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressIn(List<Integer> values) {
            addCriterion("interview_progress in", values, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressNotIn(List<Integer> values) {
            addCriterion("interview_progress not in", values, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressBetween(Integer value1, Integer value2) {
            addCriterion("interview_progress between", value1, value2, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_progress not between", value1, value2, "interviewProgress");
            return (Criteria) this;
        }

        public Criteria andInterviewResultIsNull() {
            addCriterion("interview_result is null");
            return (Criteria) this;
        }

        public Criteria andInterviewResultIsNotNull() {
            addCriterion("interview_result is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewResultEqualTo(Integer value) {
            addCriterion("interview_result =", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultNotEqualTo(Integer value) {
            addCriterion("interview_result <>", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultGreaterThan(Integer value) {
            addCriterion("interview_result >", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_result >=", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultLessThan(Integer value) {
            addCriterion("interview_result <", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultLessThanOrEqualTo(Integer value) {
            addCriterion("interview_result <=", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultIn(List<Integer> values) {
            addCriterion("interview_result in", values, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultNotIn(List<Integer> values) {
            addCriterion("interview_result not in", values, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultBetween(Integer value1, Integer value2) {
            addCriterion("interview_result between", value1, value2, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_result not between", value1, value2, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkIsNull() {
            addCriterion("interview_mark is null");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkIsNotNull() {
            addCriterion("interview_mark is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkEqualTo(String value) {
            addCriterion("interview_mark =", value, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkNotEqualTo(String value) {
            addCriterion("interview_mark <>", value, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkGreaterThan(String value) {
            addCriterion("interview_mark >", value, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkGreaterThanOrEqualTo(String value) {
            addCriterion("interview_mark >=", value, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkLessThan(String value) {
            addCriterion("interview_mark <", value, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkLessThanOrEqualTo(String value) {
            addCriterion("interview_mark <=", value, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkLike(String value) {
            addCriterion("interview_mark like", value, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkNotLike(String value) {
            addCriterion("interview_mark not like", value, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkIn(List<String> values) {
            addCriterion("interview_mark in", values, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkNotIn(List<String> values) {
            addCriterion("interview_mark not in", values, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkBetween(String value1, String value2) {
            addCriterion("interview_mark between", value1, value2, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewMarkNotBetween(String value1, String value2) {
            addCriterion("interview_mark not between", value1, value2, "interviewMark");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIsNull() {
            addCriterion("interview_status is null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIsNotNull() {
            addCriterion("interview_status is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusEqualTo(Integer value) {
            addCriterion("interview_status =", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotEqualTo(Integer value) {
            addCriterion("interview_status <>", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThan(Integer value) {
            addCriterion("interview_status >", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_status >=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThan(Integer value) {
            addCriterion("interview_status <", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("interview_status <=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIn(List<Integer> values) {
            addCriterion("interview_status in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotIn(List<Integer> values) {
            addCriterion("interview_status not in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("interview_status between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_status not between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeIsNull() {
            addCriterion("interview_create_time is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeIsNotNull() {
            addCriterion("interview_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeEqualTo(Date value) {
            addCriterion("interview_create_time =", value, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeNotEqualTo(Date value) {
            addCriterion("interview_create_time <>", value, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeGreaterThan(Date value) {
            addCriterion("interview_create_time >", value, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interview_create_time >=", value, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeLessThan(Date value) {
            addCriterion("interview_create_time <", value, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("interview_create_time <=", value, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeIn(List<Date> values) {
            addCriterion("interview_create_time in", values, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeNotIn(List<Date> values) {
            addCriterion("interview_create_time not in", values, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeBetween(Date value1, Date value2) {
            addCriterion("interview_create_time between", value1, value2, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("interview_create_time not between", value1, value2, "interviewCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceIsNull() {
            addCriterion("interview_is_outsource is null");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceIsNotNull() {
            addCriterion("interview_is_outsource is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceEqualTo(Integer value) {
            addCriterion("interview_is_outsource =", value, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceNotEqualTo(Integer value) {
            addCriterion("interview_is_outsource <>", value, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceGreaterThan(Integer value) {
            addCriterion("interview_is_outsource >", value, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_is_outsource >=", value, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceLessThan(Integer value) {
            addCriterion("interview_is_outsource <", value, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceLessThanOrEqualTo(Integer value) {
            addCriterion("interview_is_outsource <=", value, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceIn(List<Integer> values) {
            addCriterion("interview_is_outsource in", values, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceNotIn(List<Integer> values) {
            addCriterion("interview_is_outsource not in", values, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceBetween(Integer value1, Integer value2) {
            addCriterion("interview_is_outsource between", value1, value2, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewIsOutsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_is_outsource not between", value1, value2, "interviewIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdIsNull() {
            addCriterion("interview_company_id is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdIsNotNull() {
            addCriterion("interview_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdEqualTo(Integer value) {
            addCriterion("interview_company_id =", value, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdNotEqualTo(Integer value) {
            addCriterion("interview_company_id <>", value, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdGreaterThan(Integer value) {
            addCriterion("interview_company_id >", value, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_company_id >=", value, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdLessThan(Integer value) {
            addCriterion("interview_company_id <", value, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("interview_company_id <=", value, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdIn(List<Integer> values) {
            addCriterion("interview_company_id in", values, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdNotIn(List<Integer> values) {
            addCriterion("interview_company_id not in", values, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("interview_company_id between", value1, value2, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_company_id not between", value1, value2, "interviewCompanyId");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameIsNull() {
            addCriterion("interview_company_name is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameIsNotNull() {
            addCriterion("interview_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameEqualTo(String value) {
            addCriterion("interview_company_name =", value, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameNotEqualTo(String value) {
            addCriterion("interview_company_name <>", value, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameGreaterThan(String value) {
            addCriterion("interview_company_name >", value, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("interview_company_name >=", value, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameLessThan(String value) {
            addCriterion("interview_company_name <", value, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("interview_company_name <=", value, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameLike(String value) {
            addCriterion("interview_company_name like", value, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameNotLike(String value) {
            addCriterion("interview_company_name not like", value, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameIn(List<String> values) {
            addCriterion("interview_company_name in", values, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameNotIn(List<String> values) {
            addCriterion("interview_company_name not in", values, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameBetween(String value1, String value2) {
            addCriterion("interview_company_name between", value1, value2, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyNameNotBetween(String value1, String value2) {
            addCriterion("interview_company_name not between", value1, value2, "interviewCompanyName");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrIsNull() {
            addCriterion("interview_company_addr is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrIsNotNull() {
            addCriterion("interview_company_addr is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrEqualTo(String value) {
            addCriterion("interview_company_addr =", value, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrNotEqualTo(String value) {
            addCriterion("interview_company_addr <>", value, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrGreaterThan(String value) {
            addCriterion("interview_company_addr >", value, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("interview_company_addr >=", value, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrLessThan(String value) {
            addCriterion("interview_company_addr <", value, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("interview_company_addr <=", value, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrLike(String value) {
            addCriterion("interview_company_addr like", value, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrNotLike(String value) {
            addCriterion("interview_company_addr not like", value, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrIn(List<String> values) {
            addCriterion("interview_company_addr in", values, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrNotIn(List<String> values) {
            addCriterion("interview_company_addr not in", values, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrBetween(String value1, String value2) {
            addCriterion("interview_company_addr between", value1, value2, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("interview_company_addr not between", value1, value2, "interviewCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeIsNull() {
            addCriterion("interview_company_type is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeIsNotNull() {
            addCriterion("interview_company_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeEqualTo(Integer value) {
            addCriterion("interview_company_type =", value, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeNotEqualTo(Integer value) {
            addCriterion("interview_company_type <>", value, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeGreaterThan(Integer value) {
            addCriterion("interview_company_type >", value, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_company_type >=", value, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeLessThan(Integer value) {
            addCriterion("interview_company_type <", value, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("interview_company_type <=", value, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeIn(List<Integer> values) {
            addCriterion("interview_company_type in", values, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeNotIn(List<Integer> values) {
            addCriterion("interview_company_type not in", values, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeBetween(Integer value1, Integer value2) {
            addCriterion("interview_company_type between", value1, value2, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_company_type not between", value1, value2, "interviewCompanyType");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescIsNull() {
            addCriterion("interview_company_desc is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescIsNotNull() {
            addCriterion("interview_company_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescEqualTo(String value) {
            addCriterion("interview_company_desc =", value, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescNotEqualTo(String value) {
            addCriterion("interview_company_desc <>", value, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescGreaterThan(String value) {
            addCriterion("interview_company_desc >", value, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescGreaterThanOrEqualTo(String value) {
            addCriterion("interview_company_desc >=", value, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescLessThan(String value) {
            addCriterion("interview_company_desc <", value, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescLessThanOrEqualTo(String value) {
            addCriterion("interview_company_desc <=", value, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescLike(String value) {
            addCriterion("interview_company_desc like", value, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescNotLike(String value) {
            addCriterion("interview_company_desc not like", value, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescIn(List<String> values) {
            addCriterion("interview_company_desc in", values, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescNotIn(List<String> values) {
            addCriterion("interview_company_desc not in", values, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescBetween(String value1, String value2) {
            addCriterion("interview_company_desc between", value1, value2, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyDescNotBetween(String value1, String value2) {
            addCriterion("interview_company_desc not between", value1, value2, "interviewCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeIsNull() {
            addCriterion("interview_company_create_time is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeIsNotNull() {
            addCriterion("interview_company_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeEqualTo(Date value) {
            addCriterion("interview_company_create_time =", value, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeNotEqualTo(Date value) {
            addCriterion("interview_company_create_time <>", value, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeGreaterThan(Date value) {
            addCriterion("interview_company_create_time >", value, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interview_company_create_time >=", value, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeLessThan(Date value) {
            addCriterion("interview_company_create_time <", value, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("interview_company_create_time <=", value, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeIn(List<Date> values) {
            addCriterion("interview_company_create_time in", values, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeNotIn(List<Date> values) {
            addCriterion("interview_company_create_time not in", values, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeBetween(Date value1, Date value2) {
            addCriterion("interview_company_create_time between", value1, value2, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("interview_company_create_time not between", value1, value2, "interviewCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusIsNull() {
            addCriterion("interview_company_status is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusIsNotNull() {
            addCriterion("interview_company_status is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusEqualTo(Integer value) {
            addCriterion("interview_company_status =", value, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusNotEqualTo(Integer value) {
            addCriterion("interview_company_status <>", value, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusGreaterThan(Integer value) {
            addCriterion("interview_company_status >", value, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_company_status >=", value, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusLessThan(Integer value) {
            addCriterion("interview_company_status <", value, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("interview_company_status <=", value, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusIn(List<Integer> values) {
            addCriterion("interview_company_status in", values, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusNotIn(List<Integer> values) {
            addCriterion("interview_company_status not in", values, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusBetween(Integer value1, Integer value2) {
            addCriterion("interview_company_status between", value1, value2, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_company_status not between", value1, value2, "interviewCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationIsNull() {
            addCriterion("interview_company_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationIsNotNull() {
            addCriterion("interview_company_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationEqualTo(String value) {
            addCriterion("interview_company_abbreviation =", value, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationNotEqualTo(String value) {
            addCriterion("interview_company_abbreviation <>", value, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationGreaterThan(String value) {
            addCriterion("interview_company_abbreviation >", value, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("interview_company_abbreviation >=", value, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationLessThan(String value) {
            addCriterion("interview_company_abbreviation <", value, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("interview_company_abbreviation <=", value, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationLike(String value) {
            addCriterion("interview_company_abbreviation like", value, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationNotLike(String value) {
            addCriterion("interview_company_abbreviation not like", value, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationIn(List<String> values) {
            addCriterion("interview_company_abbreviation in", values, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationNotIn(List<String> values) {
            addCriterion("interview_company_abbreviation not in", values, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationBetween(String value1, String value2) {
            addCriterion("interview_company_abbreviation between", value1, value2, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyAbbreviationNotBetween(String value1, String value2) {
            addCriterion("interview_company_abbreviation not between", value1, value2, "interviewCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeIsNull() {
            addCriterion("interview_company_update_time is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeIsNotNull() {
            addCriterion("interview_company_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeEqualTo(Date value) {
            addCriterion("interview_company_update_time =", value, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeNotEqualTo(Date value) {
            addCriterion("interview_company_update_time <>", value, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeGreaterThan(Date value) {
            addCriterion("interview_company_update_time >", value, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interview_company_update_time >=", value, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeLessThan(Date value) {
            addCriterion("interview_company_update_time <", value, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("interview_company_update_time <=", value, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeIn(List<Date> values) {
            addCriterion("interview_company_update_time in", values, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeNotIn(List<Date> values) {
            addCriterion("interview_company_update_time not in", values, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("interview_company_update_time between", value1, value2, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("interview_company_update_time not between", value1, value2, "interviewCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceIsNull() {
            addCriterion("interview_company_is_outsource is null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceIsNotNull() {
            addCriterion("interview_company_is_outsource is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceEqualTo(Integer value) {
            addCriterion("interview_company_is_outsource =", value, "interviewCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceNotEqualTo(Integer value) {
            addCriterion("interview_company_is_outsource <>", value, "interviewCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceGreaterThan(Integer value) {
            addCriterion("interview_company_is_outsource >", value, "interviewCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview_company_is_outsource >=", value, "interviewCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceLessThan(Integer value) {
            addCriterion("interview_company_is_outsource <", value, "interviewCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceLessThanOrEqualTo(Integer value) {
            addCriterion("interview_company_is_outsource <=", value, "interviewCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceIn(List<Integer> values) {
            addCriterion("interview_company_is_outsource in", values, "interviewCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceNotIn(List<Integer> values) {
            addCriterion("interview_company_is_outsource not in", values, "interviewCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceBetween(Integer value1, Integer value2) {
            addCriterion("interview_company_is_outsource between", value1, value2, "interviewCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andInterviewCompanyIsOutsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("interview_company_is_outsource not between", value1, value2, "interviewCompanyIsOutsource");
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

        public Criteria andHrQqIsNull() {
            addCriterion("hr_qq is null");
            return (Criteria) this;
        }

        public Criteria andHrQqIsNotNull() {
            addCriterion("hr_qq is not null");
            return (Criteria) this;
        }

        public Criteria andHrQqEqualTo(String value) {
            addCriterion("hr_qq =", value, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqNotEqualTo(String value) {
            addCriterion("hr_qq <>", value, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqGreaterThan(String value) {
            addCriterion("hr_qq >", value, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqGreaterThanOrEqualTo(String value) {
            addCriterion("hr_qq >=", value, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqLessThan(String value) {
            addCriterion("hr_qq <", value, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqLessThanOrEqualTo(String value) {
            addCriterion("hr_qq <=", value, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqLike(String value) {
            addCriterion("hr_qq like", value, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqNotLike(String value) {
            addCriterion("hr_qq not like", value, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqIn(List<String> values) {
            addCriterion("hr_qq in", values, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqNotIn(List<String> values) {
            addCriterion("hr_qq not in", values, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqBetween(String value1, String value2) {
            addCriterion("hr_qq between", value1, value2, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrQqNotBetween(String value1, String value2) {
            addCriterion("hr_qq not between", value1, value2, "hrQq");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneIsNull() {
            addCriterion("hr_mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneIsNotNull() {
            addCriterion("hr_mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneEqualTo(String value) {
            addCriterion("hr_mobile_phone =", value, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneNotEqualTo(String value) {
            addCriterion("hr_mobile_phone <>", value, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneGreaterThan(String value) {
            addCriterion("hr_mobile_phone >", value, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("hr_mobile_phone >=", value, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneLessThan(String value) {
            addCriterion("hr_mobile_phone <", value, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("hr_mobile_phone <=", value, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneLike(String value) {
            addCriterion("hr_mobile_phone like", value, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneNotLike(String value) {
            addCriterion("hr_mobile_phone not like", value, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneIn(List<String> values) {
            addCriterion("hr_mobile_phone in", values, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneNotIn(List<String> values) {
            addCriterion("hr_mobile_phone not in", values, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneBetween(String value1, String value2) {
            addCriterion("hr_mobile_phone between", value1, value2, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("hr_mobile_phone not between", value1, value2, "hrMobilePhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneIsNull() {
            addCriterion("hr_tel_phone is null");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneIsNotNull() {
            addCriterion("hr_tel_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneEqualTo(String value) {
            addCriterion("hr_tel_phone =", value, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneNotEqualTo(String value) {
            addCriterion("hr_tel_phone <>", value, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneGreaterThan(String value) {
            addCriterion("hr_tel_phone >", value, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("hr_tel_phone >=", value, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneLessThan(String value) {
            addCriterion("hr_tel_phone <", value, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneLessThanOrEqualTo(String value) {
            addCriterion("hr_tel_phone <=", value, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneLike(String value) {
            addCriterion("hr_tel_phone like", value, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneNotLike(String value) {
            addCriterion("hr_tel_phone not like", value, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneIn(List<String> values) {
            addCriterion("hr_tel_phone in", values, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneNotIn(List<String> values) {
            addCriterion("hr_tel_phone not in", values, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneBetween(String value1, String value2) {
            addCriterion("hr_tel_phone between", value1, value2, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrTelPhoneNotBetween(String value1, String value2) {
            addCriterion("hr_tel_phone not between", value1, value2, "hrTelPhone");
            return (Criteria) this;
        }

        public Criteria andHrEmailIsNull() {
            addCriterion("hr_email is null");
            return (Criteria) this;
        }

        public Criteria andHrEmailIsNotNull() {
            addCriterion("hr_email is not null");
            return (Criteria) this;
        }

        public Criteria andHrEmailEqualTo(String value) {
            addCriterion("hr_email =", value, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailNotEqualTo(String value) {
            addCriterion("hr_email <>", value, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailGreaterThan(String value) {
            addCriterion("hr_email >", value, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailGreaterThanOrEqualTo(String value) {
            addCriterion("hr_email >=", value, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailLessThan(String value) {
            addCriterion("hr_email <", value, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailLessThanOrEqualTo(String value) {
            addCriterion("hr_email <=", value, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailLike(String value) {
            addCriterion("hr_email like", value, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailNotLike(String value) {
            addCriterion("hr_email not like", value, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailIn(List<String> values) {
            addCriterion("hr_email in", values, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailNotIn(List<String> values) {
            addCriterion("hr_email not in", values, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailBetween(String value1, String value2) {
            addCriterion("hr_email between", value1, value2, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrEmailNotBetween(String value1, String value2) {
            addCriterion("hr_email not between", value1, value2, "hrEmail");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdIsNull() {
            addCriterion("hr_hr_company_id is null");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdIsNotNull() {
            addCriterion("hr_hr_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdEqualTo(Integer value) {
            addCriterion("hr_hr_company_id =", value, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdNotEqualTo(Integer value) {
            addCriterion("hr_hr_company_id <>", value, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdGreaterThan(Integer value) {
            addCriterion("hr_hr_company_id >", value, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hr_hr_company_id >=", value, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdLessThan(Integer value) {
            addCriterion("hr_hr_company_id <", value, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("hr_hr_company_id <=", value, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdIn(List<Integer> values) {
            addCriterion("hr_hr_company_id in", values, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdNotIn(List<Integer> values) {
            addCriterion("hr_hr_company_id not in", values, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("hr_hr_company_id between", value1, value2, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrHrCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hr_hr_company_id not between", value1, value2, "hrHrCompanyId");
            return (Criteria) this;
        }

        public Criteria andHrStatusIsNull() {
            addCriterion("hr_status is null");
            return (Criteria) this;
        }

        public Criteria andHrStatusIsNotNull() {
            addCriterion("hr_status is not null");
            return (Criteria) this;
        }

        public Criteria andHrStatusEqualTo(Integer value) {
            addCriterion("hr_status =", value, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrStatusNotEqualTo(Integer value) {
            addCriterion("hr_status <>", value, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrStatusGreaterThan(Integer value) {
            addCriterion("hr_status >", value, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("hr_status >=", value, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrStatusLessThan(Integer value) {
            addCriterion("hr_status <", value, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrStatusLessThanOrEqualTo(Integer value) {
            addCriterion("hr_status <=", value, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrStatusIn(List<Integer> values) {
            addCriterion("hr_status in", values, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrStatusNotIn(List<Integer> values) {
            addCriterion("hr_status not in", values, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrStatusBetween(Integer value1, Integer value2) {
            addCriterion("hr_status between", value1, value2, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("hr_status not between", value1, value2, "hrStatus");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeIsNull() {
            addCriterion("hr_create_time is null");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeIsNotNull() {
            addCriterion("hr_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeEqualTo(Date value) {
            addCriterion("hr_create_time =", value, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeNotEqualTo(Date value) {
            addCriterion("hr_create_time <>", value, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeGreaterThan(Date value) {
            addCriterion("hr_create_time >", value, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hr_create_time >=", value, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeLessThan(Date value) {
            addCriterion("hr_create_time <", value, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("hr_create_time <=", value, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeIn(List<Date> values) {
            addCriterion("hr_create_time in", values, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeNotIn(List<Date> values) {
            addCriterion("hr_create_time not in", values, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeBetween(Date value1, Date value2) {
            addCriterion("hr_create_time between", value1, value2, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("hr_create_time not between", value1, value2, "hrCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeIsNull() {
            addCriterion("hr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeIsNotNull() {
            addCriterion("hr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeEqualTo(Date value) {
            addCriterion("hr_update_time =", value, "hrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeNotEqualTo(Date value) {
            addCriterion("hr_update_time <>", value, "hrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeGreaterThan(Date value) {
            addCriterion("hr_update_time >", value, "hrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hr_update_time >=", value, "hrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeLessThan(Date value) {
            addCriterion("hr_update_time <", value, "hrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("hr_update_time <=", value, "hrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeIn(List<Date> values) {
            addCriterion("hr_update_time in", values, "hrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeNotIn(List<Date> values) {
            addCriterion("hr_update_time not in", values, "hrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("hr_update_time between", value1, value2, "hrUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("hr_update_time not between", value1, value2, "hrUpdateTime");
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

        public Criteria andHrCompanyAddrIsNull() {
            addCriterion("hr_company_addr is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrIsNotNull() {
            addCriterion("hr_company_addr is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrEqualTo(String value) {
            addCriterion("hr_company_addr =", value, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrNotEqualTo(String value) {
            addCriterion("hr_company_addr <>", value, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrGreaterThan(String value) {
            addCriterion("hr_company_addr >", value, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("hr_company_addr >=", value, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrLessThan(String value) {
            addCriterion("hr_company_addr <", value, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("hr_company_addr <=", value, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrLike(String value) {
            addCriterion("hr_company_addr like", value, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrNotLike(String value) {
            addCriterion("hr_company_addr not like", value, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrIn(List<String> values) {
            addCriterion("hr_company_addr in", values, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrNotIn(List<String> values) {
            addCriterion("hr_company_addr not in", values, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrBetween(String value1, String value2) {
            addCriterion("hr_company_addr between", value1, value2, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("hr_company_addr not between", value1, value2, "hrCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeIsNull() {
            addCriterion("hr_company_type is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeIsNotNull() {
            addCriterion("hr_company_type is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeEqualTo(Integer value) {
            addCriterion("hr_company_type =", value, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeNotEqualTo(Integer value) {
            addCriterion("hr_company_type <>", value, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeGreaterThan(Integer value) {
            addCriterion("hr_company_type >", value, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hr_company_type >=", value, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeLessThan(Integer value) {
            addCriterion("hr_company_type <", value, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("hr_company_type <=", value, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeIn(List<Integer> values) {
            addCriterion("hr_company_type in", values, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeNotIn(List<Integer> values) {
            addCriterion("hr_company_type not in", values, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeBetween(Integer value1, Integer value2) {
            addCriterion("hr_company_type between", value1, value2, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("hr_company_type not between", value1, value2, "hrCompanyType");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescIsNull() {
            addCriterion("hr_company_desc is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescIsNotNull() {
            addCriterion("hr_company_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescEqualTo(String value) {
            addCriterion("hr_company_desc =", value, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescNotEqualTo(String value) {
            addCriterion("hr_company_desc <>", value, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescGreaterThan(String value) {
            addCriterion("hr_company_desc >", value, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescGreaterThanOrEqualTo(String value) {
            addCriterion("hr_company_desc >=", value, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescLessThan(String value) {
            addCriterion("hr_company_desc <", value, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescLessThanOrEqualTo(String value) {
            addCriterion("hr_company_desc <=", value, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescLike(String value) {
            addCriterion("hr_company_desc like", value, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescNotLike(String value) {
            addCriterion("hr_company_desc not like", value, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescIn(List<String> values) {
            addCriterion("hr_company_desc in", values, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescNotIn(List<String> values) {
            addCriterion("hr_company_desc not in", values, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescBetween(String value1, String value2) {
            addCriterion("hr_company_desc between", value1, value2, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyDescNotBetween(String value1, String value2) {
            addCriterion("hr_company_desc not between", value1, value2, "hrCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeIsNull() {
            addCriterion("hr_company_create_time is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeIsNotNull() {
            addCriterion("hr_company_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeEqualTo(Date value) {
            addCriterion("hr_company_create_time =", value, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeNotEqualTo(Date value) {
            addCriterion("hr_company_create_time <>", value, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeGreaterThan(Date value) {
            addCriterion("hr_company_create_time >", value, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hr_company_create_time >=", value, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeLessThan(Date value) {
            addCriterion("hr_company_create_time <", value, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("hr_company_create_time <=", value, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeIn(List<Date> values) {
            addCriterion("hr_company_create_time in", values, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeNotIn(List<Date> values) {
            addCriterion("hr_company_create_time not in", values, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeBetween(Date value1, Date value2) {
            addCriterion("hr_company_create_time between", value1, value2, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("hr_company_create_time not between", value1, value2, "hrCompanyCreateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusIsNull() {
            addCriterion("hr_company_status is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusIsNotNull() {
            addCriterion("hr_company_status is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusEqualTo(Integer value) {
            addCriterion("hr_company_status =", value, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusNotEqualTo(Integer value) {
            addCriterion("hr_company_status <>", value, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusGreaterThan(Integer value) {
            addCriterion("hr_company_status >", value, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("hr_company_status >=", value, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusLessThan(Integer value) {
            addCriterion("hr_company_status <", value, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("hr_company_status <=", value, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusIn(List<Integer> values) {
            addCriterion("hr_company_status in", values, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusNotIn(List<Integer> values) {
            addCriterion("hr_company_status not in", values, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusBetween(Integer value1, Integer value2) {
            addCriterion("hr_company_status between", value1, value2, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("hr_company_status not between", value1, value2, "hrCompanyStatus");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationIsNull() {
            addCriterion("hr_company_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationIsNotNull() {
            addCriterion("hr_company_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationEqualTo(String value) {
            addCriterion("hr_company_abbreviation =", value, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationNotEqualTo(String value) {
            addCriterion("hr_company_abbreviation <>", value, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationGreaterThan(String value) {
            addCriterion("hr_company_abbreviation >", value, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("hr_company_abbreviation >=", value, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationLessThan(String value) {
            addCriterion("hr_company_abbreviation <", value, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("hr_company_abbreviation <=", value, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationLike(String value) {
            addCriterion("hr_company_abbreviation like", value, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationNotLike(String value) {
            addCriterion("hr_company_abbreviation not like", value, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationIn(List<String> values) {
            addCriterion("hr_company_abbreviation in", values, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationNotIn(List<String> values) {
            addCriterion("hr_company_abbreviation not in", values, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationBetween(String value1, String value2) {
            addCriterion("hr_company_abbreviation between", value1, value2, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyAbbreviationNotBetween(String value1, String value2) {
            addCriterion("hr_company_abbreviation not between", value1, value2, "hrCompanyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeIsNull() {
            addCriterion("hr_company_update_time is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeIsNotNull() {
            addCriterion("hr_company_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeEqualTo(Date value) {
            addCriterion("hr_company_update_time =", value, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeNotEqualTo(Date value) {
            addCriterion("hr_company_update_time <>", value, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeGreaterThan(Date value) {
            addCriterion("hr_company_update_time >", value, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hr_company_update_time >=", value, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeLessThan(Date value) {
            addCriterion("hr_company_update_time <", value, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("hr_company_update_time <=", value, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeIn(List<Date> values) {
            addCriterion("hr_company_update_time in", values, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeNotIn(List<Date> values) {
            addCriterion("hr_company_update_time not in", values, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("hr_company_update_time between", value1, value2, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("hr_company_update_time not between", value1, value2, "hrCompanyUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceIsNull() {
            addCriterion("hr_company_is_outsource is null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceIsNotNull() {
            addCriterion("hr_company_is_outsource is not null");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceEqualTo(Integer value) {
            addCriterion("hr_company_is_outsource =", value, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceNotEqualTo(Integer value) {
            addCriterion("hr_company_is_outsource <>", value, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceGreaterThan(Integer value) {
            addCriterion("hr_company_is_outsource >", value, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hr_company_is_outsource >=", value, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceLessThan(Integer value) {
            addCriterion("hr_company_is_outsource <", value, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceLessThanOrEqualTo(Integer value) {
            addCriterion("hr_company_is_outsource <=", value, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceIn(List<Integer> values) {
            addCriterion("hr_company_is_outsource in", values, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceNotIn(List<Integer> values) {
            addCriterion("hr_company_is_outsource not in", values, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceBetween(Integer value1, Integer value2) {
            addCriterion("hr_company_is_outsource between", value1, value2, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andHrCompanyIsOutsourceNotBetween(Integer value1, Integer value2) {
            addCriterion("hr_company_is_outsource not between", value1, value2, "hrCompanyIsOutsource");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeIsNull() {
            addCriterion("exam_create_time is null");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeIsNotNull() {
            addCriterion("exam_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeEqualTo(Date value) {
            addCriterion("exam_create_time =", value, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeNotEqualTo(Date value) {
            addCriterion("exam_create_time <>", value, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeGreaterThan(Date value) {
            addCriterion("exam_create_time >", value, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_create_time >=", value, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeLessThan(Date value) {
            addCriterion("exam_create_time <", value, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_create_time <=", value, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeIn(List<Date> values) {
            addCriterion("exam_create_time in", values, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeNotIn(List<Date> values) {
            addCriterion("exam_create_time not in", values, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeBetween(Date value1, Date value2) {
            addCriterion("exam_create_time between", value1, value2, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_create_time not between", value1, value2, "examCreateTime");
            return (Criteria) this;
        }

        public Criteria andExamStatusIsNull() {
            addCriterion("exam_status is null");
            return (Criteria) this;
        }

        public Criteria andExamStatusIsNotNull() {
            addCriterion("exam_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamStatusEqualTo(Integer value) {
            addCriterion("exam_status =", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusNotEqualTo(Integer value) {
            addCriterion("exam_status <>", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusGreaterThan(Integer value) {
            addCriterion("exam_status >", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_status >=", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusLessThan(Integer value) {
            addCriterion("exam_status <", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusLessThanOrEqualTo(Integer value) {
            addCriterion("exam_status <=", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusIn(List<Integer> values) {
            addCriterion("exam_status in", values, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusNotIn(List<Integer> values) {
            addCriterion("exam_status not in", values, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusBetween(Integer value1, Integer value2) {
            addCriterion("exam_status between", value1, value2, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_status not between", value1, value2, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeIsNull() {
            addCriterion("exam_update_time is null");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeIsNotNull() {
            addCriterion("exam_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeEqualTo(Date value) {
            addCriterion("exam_update_time =", value, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeNotEqualTo(Date value) {
            addCriterion("exam_update_time <>", value, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeGreaterThan(Date value) {
            addCriterion("exam_update_time >", value, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_update_time >=", value, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeLessThan(Date value) {
            addCriterion("exam_update_time <", value, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("exam_update_time <=", value, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeIn(List<Date> values) {
            addCriterion("exam_update_time in", values, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeNotIn(List<Date> values) {
            addCriterion("exam_update_time not in", values, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("exam_update_time between", value1, value2, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andExamUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("exam_update_time not between", value1, value2, "examUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAskIdIsNull() {
            addCriterion("ask_id is null");
            return (Criteria) this;
        }

        public Criteria andAskIdIsNotNull() {
            addCriterion("ask_id is not null");
            return (Criteria) this;
        }

        public Criteria andAskIdEqualTo(Integer value) {
            addCriterion("ask_id =", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdNotEqualTo(Integer value) {
            addCriterion("ask_id <>", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdGreaterThan(Integer value) {
            addCriterion("ask_id >", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ask_id >=", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdLessThan(Integer value) {
            addCriterion("ask_id <", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdLessThanOrEqualTo(Integer value) {
            addCriterion("ask_id <=", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdIn(List<Integer> values) {
            addCriterion("ask_id in", values, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdNotIn(List<Integer> values) {
            addCriterion("ask_id not in", values, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdBetween(Integer value1, Integer value2) {
            addCriterion("ask_id between", value1, value2, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ask_id not between", value1, value2, "askId");
            return (Criteria) this;
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

        public Criteria andOfferSalaryIsNull() {
            addCriterion("offer_salary is null");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryIsNotNull() {
            addCriterion("offer_salary is not null");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryEqualTo(Integer value) {
            addCriterion("offer_salary =", value, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryNotEqualTo(Integer value) {
            addCriterion("offer_salary <>", value, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryGreaterThan(Integer value) {
            addCriterion("offer_salary >", value, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_salary >=", value, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryLessThan(Integer value) {
            addCriterion("offer_salary <", value, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("offer_salary <=", value, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryIn(List<Integer> values) {
            addCriterion("offer_salary in", values, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryNotIn(List<Integer> values) {
            addCriterion("offer_salary not in", values, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryBetween(Integer value1, Integer value2) {
            addCriterion("offer_salary between", value1, value2, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_salary not between", value1, value2, "offerSalary");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountIsNull() {
            addCriterion("offer_salary_count is null");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountIsNotNull() {
            addCriterion("offer_salary_count is not null");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountEqualTo(Integer value) {
            addCriterion("offer_salary_count =", value, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountNotEqualTo(Integer value) {
            addCriterion("offer_salary_count <>", value, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountGreaterThan(Integer value) {
            addCriterion("offer_salary_count >", value, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_salary_count >=", value, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountLessThan(Integer value) {
            addCriterion("offer_salary_count <", value, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountLessThanOrEqualTo(Integer value) {
            addCriterion("offer_salary_count <=", value, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountIn(List<Integer> values) {
            addCriterion("offer_salary_count in", values, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountNotIn(List<Integer> values) {
            addCriterion("offer_salary_count not in", values, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountBetween(Integer value1, Integer value2) {
            addCriterion("offer_salary_count between", value1, value2, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferSalaryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_salary_count not between", value1, value2, "offerSalaryCount");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayIsNull() {
            addCriterion("offer_is_gross_pay is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayIsNotNull() {
            addCriterion("offer_is_gross_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayEqualTo(Integer value) {
            addCriterion("offer_is_gross_pay =", value, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayNotEqualTo(Integer value) {
            addCriterion("offer_is_gross_pay <>", value, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayGreaterThan(Integer value) {
            addCriterion("offer_is_gross_pay >", value, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_is_gross_pay >=", value, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayLessThan(Integer value) {
            addCriterion("offer_is_gross_pay <", value, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayLessThanOrEqualTo(Integer value) {
            addCriterion("offer_is_gross_pay <=", value, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayIn(List<Integer> values) {
            addCriterion("offer_is_gross_pay in", values, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayNotIn(List<Integer> values) {
            addCriterion("offer_is_gross_pay not in", values, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayBetween(Integer value1, Integer value2) {
            addCriterion("offer_is_gross_pay between", value1, value2, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferIsGrossPayNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_is_gross_pay not between", value1, value2, "offerIsGrossPay");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodIsNull() {
            addCriterion("offer_probationary_period is null");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodIsNotNull() {
            addCriterion("offer_probationary_period is not null");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodEqualTo(Integer value) {
            addCriterion("offer_probationary_period =", value, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodNotEqualTo(Integer value) {
            addCriterion("offer_probationary_period <>", value, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodGreaterThan(Integer value) {
            addCriterion("offer_probationary_period >", value, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_probationary_period >=", value, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodLessThan(Integer value) {
            addCriterion("offer_probationary_period <", value, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("offer_probationary_period <=", value, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodIn(List<Integer> values) {
            addCriterion("offer_probationary_period in", values, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodNotIn(List<Integer> values) {
            addCriterion("offer_probationary_period not in", values, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodBetween(Integer value1, Integer value2) {
            addCriterion("offer_probationary_period between", value1, value2, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_probationary_period not between", value1, value2, "offerProbationaryPeriod");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountIsNull() {
            addCriterion("offer_probationary_discount is null");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountIsNotNull() {
            addCriterion("offer_probationary_discount is not null");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountEqualTo(Integer value) {
            addCriterion("offer_probationary_discount =", value, "offerProbationaryDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountNotEqualTo(Integer value) {
            addCriterion("offer_probationary_discount <>", value, "offerProbationaryDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountGreaterThan(Integer value) {
            addCriterion("offer_probationary_discount >", value, "offerProbationaryDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_probationary_discount >=", value, "offerProbationaryDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountLessThan(Integer value) {
            addCriterion("offer_probationary_discount <", value, "offerProbationaryDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("offer_probationary_discount <=", value, "offerProbationaryDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountIn(List<Integer> values) {
            addCriterion("offer_probationary_discount in", values, "offerProbationaryDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountNotIn(List<Integer> values) {
            addCriterion("offer_probationary_discount not in", values, "offerProbationaryDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountBetween(Integer value1, Integer value2) {
            addCriterion("offer_probationary_discount between", value1, value2, "offerProbationaryDiscount");
            return (Criteria) this;
        }

        public Criteria andOfferProbationaryDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_probationary_discount not between", value1, value2, "offerProbationaryDiscount");
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

        public Criteria andOfferWorkTimeIsNull() {
            addCriterion("offer_work_time is null");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeIsNotNull() {
            addCriterion("offer_work_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeEqualTo(Date value) {
            addCriterion("offer_work_time =", value, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeNotEqualTo(Date value) {
            addCriterion("offer_work_time <>", value, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeGreaterThan(Date value) {
            addCriterion("offer_work_time >", value, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_work_time >=", value, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeLessThan(Date value) {
            addCriterion("offer_work_time <", value, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeLessThanOrEqualTo(Date value) {
            addCriterion("offer_work_time <=", value, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeIn(List<Date> values) {
            addCriterion("offer_work_time in", values, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeNotIn(List<Date> values) {
            addCriterion("offer_work_time not in", values, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeBetween(Date value1, Date value2) {
            addCriterion("offer_work_time between", value1, value2, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferWorkTimeNotBetween(Date value1, Date value2) {
            addCriterion("offer_work_time not between", value1, value2, "offerWorkTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeIsNull() {
            addCriterion("offer_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeIsNotNull() {
            addCriterion("offer_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeEqualTo(Date value) {
            addCriterion("offer_create_time =", value, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeNotEqualTo(Date value) {
            addCriterion("offer_create_time <>", value, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeGreaterThan(Date value) {
            addCriterion("offer_create_time >", value, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_create_time >=", value, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeLessThan(Date value) {
            addCriterion("offer_create_time <", value, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("offer_create_time <=", value, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeIn(List<Date> values) {
            addCriterion("offer_create_time in", values, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeNotIn(List<Date> values) {
            addCriterion("offer_create_time not in", values, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeBetween(Date value1, Date value2) {
            addCriterion("offer_create_time between", value1, value2, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("offer_create_time not between", value1, value2, "offerCreateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeIsNull() {
            addCriterion("offer_update_time is null");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeIsNotNull() {
            addCriterion("offer_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeEqualTo(Date value) {
            addCriterion("offer_update_time =", value, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeNotEqualTo(Date value) {
            addCriterion("offer_update_time <>", value, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeGreaterThan(Date value) {
            addCriterion("offer_update_time >", value, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_update_time >=", value, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeLessThan(Date value) {
            addCriterion("offer_update_time <", value, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("offer_update_time <=", value, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeIn(List<Date> values) {
            addCriterion("offer_update_time in", values, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeNotIn(List<Date> values) {
            addCriterion("offer_update_time not in", values, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("offer_update_time between", value1, value2, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("offer_update_time not between", value1, value2, "offerUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdIsNull() {
            addCriterion("offer_operator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdIsNotNull() {
            addCriterion("offer_operator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdEqualTo(Integer value) {
            addCriterion("offer_operator_user_id =", value, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdNotEqualTo(Integer value) {
            addCriterion("offer_operator_user_id <>", value, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdGreaterThan(Integer value) {
            addCriterion("offer_operator_user_id >", value, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_operator_user_id >=", value, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdLessThan(Integer value) {
            addCriterion("offer_operator_user_id <", value, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("offer_operator_user_id <=", value, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdIn(List<Integer> values) {
            addCriterion("offer_operator_user_id in", values, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdNotIn(List<Integer> values) {
            addCriterion("offer_operator_user_id not in", values, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdBetween(Integer value1, Integer value2) {
            addCriterion("offer_operator_user_id between", value1, value2, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferOperatorUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_operator_user_id not between", value1, value2, "offerOperatorUserId");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptIsNull() {
            addCriterion("offer_is_accept is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptIsNotNull() {
            addCriterion("offer_is_accept is not null");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptEqualTo(Integer value) {
            addCriterion("offer_is_accept =", value, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptNotEqualTo(Integer value) {
            addCriterion("offer_is_accept <>", value, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptGreaterThan(Integer value) {
            addCriterion("offer_is_accept >", value, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_is_accept >=", value, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptLessThan(Integer value) {
            addCriterion("offer_is_accept <", value, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptLessThanOrEqualTo(Integer value) {
            addCriterion("offer_is_accept <=", value, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptIn(List<Integer> values) {
            addCriterion("offer_is_accept in", values, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptNotIn(List<Integer> values) {
            addCriterion("offer_is_accept not in", values, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptBetween(Integer value1, Integer value2) {
            addCriterion("offer_is_accept between", value1, value2, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferIsAcceptNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_is_accept not between", value1, value2, "offerIsAccept");
            return (Criteria) this;
        }

        public Criteria andOfferStatusIsNull() {
            addCriterion("offer_status is null");
            return (Criteria) this;
        }

        public Criteria andOfferStatusIsNotNull() {
            addCriterion("offer_status is not null");
            return (Criteria) this;
        }

        public Criteria andOfferStatusEqualTo(Integer value) {
            addCriterion("offer_status =", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusNotEqualTo(Integer value) {
            addCriterion("offer_status <>", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusGreaterThan(Integer value) {
            addCriterion("offer_status >", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_status >=", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusLessThan(Integer value) {
            addCriterion("offer_status <", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusLessThanOrEqualTo(Integer value) {
            addCriterion("offer_status <=", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusIn(List<Integer> values) {
            addCriterion("offer_status in", values, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusNotIn(List<Integer> values) {
            addCriterion("offer_status not in", values, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusBetween(Integer value1, Integer value2) {
            addCriterion("offer_status between", value1, value2, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_status not between", value1, value2, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNull() {
            addCriterion("resume_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Integer value) {
            addCriterion("resume_id =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Integer value) {
            addCriterion("resume_id <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Integer value) {
            addCriterion("resume_id >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resume_id >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Integer value) {
            addCriterion("resume_id <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("resume_id <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Integer> values) {
            addCriterion("resume_id in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Integer> values) {
            addCriterion("resume_id not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Integer value1, Integer value2) {
            addCriterion("resume_id between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resume_id not between", value1, value2, "resumeId");
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