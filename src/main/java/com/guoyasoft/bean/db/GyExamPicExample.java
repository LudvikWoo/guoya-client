package com.guoyasoft.bean.db;

import java.util.ArrayList;
import java.util.List;

public class GyExamPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GyExamPicExample() {
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

        public Criteria andPicIdIsNull() {
            addCriterion("pic_id is null");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNotNull() {
            addCriterion("pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicIdEqualTo(Integer value) {
            addCriterion("pic_id =", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotEqualTo(Integer value) {
            addCriterion("pic_id <>", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThan(Integer value) {
            addCriterion("pic_id >", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_id >=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThan(Integer value) {
            addCriterion("pic_id <", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("pic_id <=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdIn(List<Integer> values) {
            addCriterion("pic_id in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotIn(List<Integer> values) {
            addCriterion("pic_id not in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdBetween(Integer value1, Integer value2) {
            addCriterion("pic_id between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_id not between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicNoIsNull() {
            addCriterion("pic_no is null");
            return (Criteria) this;
        }

        public Criteria andPicNoIsNotNull() {
            addCriterion("pic_no is not null");
            return (Criteria) this;
        }

        public Criteria andPicNoEqualTo(String value) {
            addCriterion("pic_no =", value, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoNotEqualTo(String value) {
            addCriterion("pic_no <>", value, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoGreaterThan(String value) {
            addCriterion("pic_no >", value, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoGreaterThanOrEqualTo(String value) {
            addCriterion("pic_no >=", value, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoLessThan(String value) {
            addCriterion("pic_no <", value, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoLessThanOrEqualTo(String value) {
            addCriterion("pic_no <=", value, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoLike(String value) {
            addCriterion("pic_no like", value, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoNotLike(String value) {
            addCriterion("pic_no not like", value, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoIn(List<String> values) {
            addCriterion("pic_no in", values, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoNotIn(List<String> values) {
            addCriterion("pic_no not in", values, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoBetween(String value1, String value2) {
            addCriterion("pic_no between", value1, value2, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicNoNotBetween(String value1, String value2) {
            addCriterion("pic_no not between", value1, value2, "picNo");
            return (Criteria) this;
        }

        public Criteria andPicAddrIsNull() {
            addCriterion("pic_addr is null");
            return (Criteria) this;
        }

        public Criteria andPicAddrIsNotNull() {
            addCriterion("pic_addr is not null");
            return (Criteria) this;
        }

        public Criteria andPicAddrEqualTo(String value) {
            addCriterion("pic_addr =", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrNotEqualTo(String value) {
            addCriterion("pic_addr <>", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrGreaterThan(String value) {
            addCriterion("pic_addr >", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrGreaterThanOrEqualTo(String value) {
            addCriterion("pic_addr >=", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrLessThan(String value) {
            addCriterion("pic_addr <", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrLessThanOrEqualTo(String value) {
            addCriterion("pic_addr <=", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrLike(String value) {
            addCriterion("pic_addr like", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrNotLike(String value) {
            addCriterion("pic_addr not like", value, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrIn(List<String> values) {
            addCriterion("pic_addr in", values, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrNotIn(List<String> values) {
            addCriterion("pic_addr not in", values, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrBetween(String value1, String value2) {
            addCriterion("pic_addr between", value1, value2, "picAddr");
            return (Criteria) this;
        }

        public Criteria andPicAddrNotBetween(String value1, String value2) {
            addCriterion("pic_addr not between", value1, value2, "picAddr");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
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