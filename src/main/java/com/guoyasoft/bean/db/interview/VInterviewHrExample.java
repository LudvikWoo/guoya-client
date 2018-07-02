package com.guoyasoft.bean.db.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VInterviewHrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VInterviewHrExample() {
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

        public Criteria andHrStatusDescIsNull() {
            addCriterion("hr_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescIsNotNull() {
            addCriterion("hr_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescEqualTo(String value) {
            addCriterion("hr_status_desc =", value, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescNotEqualTo(String value) {
            addCriterion("hr_status_desc <>", value, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescGreaterThan(String value) {
            addCriterion("hr_status_desc >", value, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("hr_status_desc >=", value, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescLessThan(String value) {
            addCriterion("hr_status_desc <", value, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescLessThanOrEqualTo(String value) {
            addCriterion("hr_status_desc <=", value, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescLike(String value) {
            addCriterion("hr_status_desc like", value, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescNotLike(String value) {
            addCriterion("hr_status_desc not like", value, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescIn(List<String> values) {
            addCriterion("hr_status_desc in", values, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescNotIn(List<String> values) {
            addCriterion("hr_status_desc not in", values, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescBetween(String value1, String value2) {
            addCriterion("hr_status_desc between", value1, value2, "hrStatusDesc");
            return (Criteria) this;
        }

        public Criteria andHrStatusDescNotBetween(String value1, String value2) {
            addCriterion("hr_status_desc not between", value1, value2, "hrStatusDesc");
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

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusIsNull() {
            addCriterion("company_status is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusIsNotNull() {
            addCriterion("company_status is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusEqualTo(Integer value) {
            addCriterion("company_status =", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusNotEqualTo(Integer value) {
            addCriterion("company_status <>", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusGreaterThan(Integer value) {
            addCriterion("company_status >", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_status >=", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusLessThan(Integer value) {
            addCriterion("company_status <", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("company_status <=", value, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusIn(List<Integer> values) {
            addCriterion("company_status in", values, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusNotIn(List<Integer> values) {
            addCriterion("company_status not in", values, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusBetween(Integer value1, Integer value2) {
            addCriterion("company_status between", value1, value2, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("company_status not between", value1, value2, "companyStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescIsNull() {
            addCriterion("company_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescIsNotNull() {
            addCriterion("company_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescEqualTo(String value) {
            addCriterion("company_status_desc =", value, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescNotEqualTo(String value) {
            addCriterion("company_status_desc <>", value, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescGreaterThan(String value) {
            addCriterion("company_status_desc >", value, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("company_status_desc >=", value, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescLessThan(String value) {
            addCriterion("company_status_desc <", value, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescLessThanOrEqualTo(String value) {
            addCriterion("company_status_desc <=", value, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescLike(String value) {
            addCriterion("company_status_desc like", value, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescNotLike(String value) {
            addCriterion("company_status_desc not like", value, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescIn(List<String> values) {
            addCriterion("company_status_desc in", values, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescNotIn(List<String> values) {
            addCriterion("company_status_desc not in", values, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescBetween(String value1, String value2) {
            addCriterion("company_status_desc between", value1, value2, "companyStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyStatusDescNotBetween(String value1, String value2) {
            addCriterion("company_status_desc not between", value1, value2, "companyStatusDesc");
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