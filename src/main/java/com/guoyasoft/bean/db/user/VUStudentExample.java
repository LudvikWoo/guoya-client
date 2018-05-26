package com.guoyasoft.bean.db.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VUStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VUStudentExample() {
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

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Integer value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Integer value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Integer value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Integer value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Integer value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Integer> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Integer> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Integer value1, Integer value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andPsnoIsNull() {
            addCriterion("psno is null");
            return (Criteria) this;
        }

        public Criteria andPsnoIsNotNull() {
            addCriterion("psno is not null");
            return (Criteria) this;
        }

        public Criteria andPsnoEqualTo(Integer value) {
            addCriterion("psno =", value, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoNotEqualTo(Integer value) {
            addCriterion("psno <>", value, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoGreaterThan(Integer value) {
            addCriterion("psno >", value, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("psno >=", value, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoLessThan(Integer value) {
            addCriterion("psno <", value, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoLessThanOrEqualTo(Integer value) {
            addCriterion("psno <=", value, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoIn(List<Integer> values) {
            addCriterion("psno in", values, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoNotIn(List<Integer> values) {
            addCriterion("psno not in", values, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoBetween(Integer value1, Integer value2) {
            addCriterion("psno between", value1, value2, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoNotBetween(Integer value1, Integer value2) {
            addCriterion("psno not between", value1, value2, "psno");
            return (Criteria) this;
        }

        public Criteria andPsnoDescIsNull() {
            addCriterion("psno_desc is null");
            return (Criteria) this;
        }

        public Criteria andPsnoDescIsNotNull() {
            addCriterion("psno_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPsnoDescEqualTo(String value) {
            addCriterion("psno_desc =", value, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescNotEqualTo(String value) {
            addCriterion("psno_desc <>", value, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescGreaterThan(String value) {
            addCriterion("psno_desc >", value, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescGreaterThanOrEqualTo(String value) {
            addCriterion("psno_desc >=", value, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescLessThan(String value) {
            addCriterion("psno_desc <", value, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescLessThanOrEqualTo(String value) {
            addCriterion("psno_desc <=", value, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescLike(String value) {
            addCriterion("psno_desc like", value, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescNotLike(String value) {
            addCriterion("psno_desc not like", value, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescIn(List<String> values) {
            addCriterion("psno_desc in", values, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescNotIn(List<String> values) {
            addCriterion("psno_desc not in", values, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescBetween(String value1, String value2) {
            addCriterion("psno_desc between", value1, value2, "psnoDesc");
            return (Criteria) this;
        }

        public Criteria andPsnoDescNotBetween(String value1, String value2) {
            addCriterion("psno_desc not between", value1, value2, "psnoDesc");
            return (Criteria) this;
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

        public Criteria andCnoDescIsNull() {
            addCriterion("cno_desc is null");
            return (Criteria) this;
        }

        public Criteria andCnoDescIsNotNull() {
            addCriterion("cno_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCnoDescEqualTo(String value) {
            addCriterion("cno_desc =", value, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescNotEqualTo(String value) {
            addCriterion("cno_desc <>", value, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescGreaterThan(String value) {
            addCriterion("cno_desc >", value, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescGreaterThanOrEqualTo(String value) {
            addCriterion("cno_desc >=", value, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescLessThan(String value) {
            addCriterion("cno_desc <", value, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescLessThanOrEqualTo(String value) {
            addCriterion("cno_desc <=", value, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescLike(String value) {
            addCriterion("cno_desc like", value, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescNotLike(String value) {
            addCriterion("cno_desc not like", value, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescIn(List<String> values) {
            addCriterion("cno_desc in", values, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescNotIn(List<String> values) {
            addCriterion("cno_desc not in", values, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescBetween(String value1, String value2) {
            addCriterion("cno_desc between", value1, value2, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andCnoDescNotBetween(String value1, String value2) {
            addCriterion("cno_desc not between", value1, value2, "cnoDesc");
            return (Criteria) this;
        }

        public Criteria andUnoIsNull() {
            addCriterion("uno is null");
            return (Criteria) this;
        }

        public Criteria andUnoIsNotNull() {
            addCriterion("uno is not null");
            return (Criteria) this;
        }

        public Criteria andUnoEqualTo(Integer value) {
            addCriterion("uno =", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotEqualTo(Integer value) {
            addCriterion("uno <>", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThan(Integer value) {
            addCriterion("uno >", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("uno >=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThan(Integer value) {
            addCriterion("uno <", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThanOrEqualTo(Integer value) {
            addCriterion("uno <=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoIn(List<Integer> values) {
            addCriterion("uno in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotIn(List<Integer> values) {
            addCriterion("uno not in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoBetween(Integer value1, Integer value2) {
            addCriterion("uno between", value1, value2, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotBetween(Integer value1, Integer value2) {
            addCriterion("uno not between", value1, value2, "uno");
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

        public Criteria andCreateTimeDescIsNull() {
            addCriterion("create_time_desc is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescIsNotNull() {
            addCriterion("create_time_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescEqualTo(String value) {
            addCriterion("create_time_desc =", value, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescNotEqualTo(String value) {
            addCriterion("create_time_desc <>", value, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescGreaterThan(String value) {
            addCriterion("create_time_desc >", value, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescGreaterThanOrEqualTo(String value) {
            addCriterion("create_time_desc >=", value, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescLessThan(String value) {
            addCriterion("create_time_desc <", value, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescLessThanOrEqualTo(String value) {
            addCriterion("create_time_desc <=", value, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescLike(String value) {
            addCriterion("create_time_desc like", value, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescNotLike(String value) {
            addCriterion("create_time_desc not like", value, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescIn(List<String> values) {
            addCriterion("create_time_desc in", values, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescNotIn(List<String> values) {
            addCriterion("create_time_desc not in", values, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescBetween(String value1, String value2) {
            addCriterion("create_time_desc between", value1, value2, "createTimeDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeDescNotBetween(String value1, String value2) {
            addCriterion("create_time_desc not between", value1, value2, "createTimeDesc");
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

        public Criteria andUpdateTimeDescIsNull() {
            addCriterion("update_time_desc is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescIsNotNull() {
            addCriterion("update_time_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescEqualTo(String value) {
            addCriterion("update_time_desc =", value, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescNotEqualTo(String value) {
            addCriterion("update_time_desc <>", value, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescGreaterThan(String value) {
            addCriterion("update_time_desc >", value, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescGreaterThanOrEqualTo(String value) {
            addCriterion("update_time_desc >=", value, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescLessThan(String value) {
            addCriterion("update_time_desc <", value, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescLessThanOrEqualTo(String value) {
            addCriterion("update_time_desc <=", value, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescLike(String value) {
            addCriterion("update_time_desc like", value, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescNotLike(String value) {
            addCriterion("update_time_desc not like", value, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescIn(List<String> values) {
            addCriterion("update_time_desc in", values, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescNotIn(List<String> values) {
            addCriterion("update_time_desc not in", values, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescBetween(String value1, String value2) {
            addCriterion("update_time_desc between", value1, value2, "updateTimeDesc");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeDescNotBetween(String value1, String value2) {
            addCriterion("update_time_desc not between", value1, value2, "updateTimeDesc");
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

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorDescIsNull() {
            addCriterion("operator_desc is null");
            return (Criteria) this;
        }

        public Criteria andOperatorDescIsNotNull() {
            addCriterion("operator_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorDescEqualTo(String value) {
            addCriterion("operator_desc =", value, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescNotEqualTo(String value) {
            addCriterion("operator_desc <>", value, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescGreaterThan(String value) {
            addCriterion("operator_desc >", value, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescGreaterThanOrEqualTo(String value) {
            addCriterion("operator_desc >=", value, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescLessThan(String value) {
            addCriterion("operator_desc <", value, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescLessThanOrEqualTo(String value) {
            addCriterion("operator_desc <=", value, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescLike(String value) {
            addCriterion("operator_desc like", value, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescNotLike(String value) {
            addCriterion("operator_desc not like", value, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescIn(List<String> values) {
            addCriterion("operator_desc in", values, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescNotIn(List<String> values) {
            addCriterion("operator_desc not in", values, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescBetween(String value1, String value2) {
            addCriterion("operator_desc between", value1, value2, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andOperatorDescNotBetween(String value1, String value2) {
            addCriterion("operator_desc not between", value1, value2, "operatorDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNull() {
            addCriterion("active_time is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("active_time is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(Date value) {
            addCriterion("active_time =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(Date value) {
            addCriterion("active_time <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(Date value) {
            addCriterion("active_time >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("active_time >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(Date value) {
            addCriterion("active_time <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("active_time <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<Date> values) {
            addCriterion("active_time in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<Date> values) {
            addCriterion("active_time not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(Date value1, Date value2) {
            addCriterion("active_time between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("active_time not between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescIsNull() {
            addCriterion("active_time_desc is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescIsNotNull() {
            addCriterion("active_time_desc is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescEqualTo(String value) {
            addCriterion("active_time_desc =", value, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescNotEqualTo(String value) {
            addCriterion("active_time_desc <>", value, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescGreaterThan(String value) {
            addCriterion("active_time_desc >", value, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescGreaterThanOrEqualTo(String value) {
            addCriterion("active_time_desc >=", value, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescLessThan(String value) {
            addCriterion("active_time_desc <", value, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescLessThanOrEqualTo(String value) {
            addCriterion("active_time_desc <=", value, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescLike(String value) {
            addCriterion("active_time_desc like", value, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescNotLike(String value) {
            addCriterion("active_time_desc not like", value, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescIn(List<String> values) {
            addCriterion("active_time_desc in", values, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescNotIn(List<String> values) {
            addCriterion("active_time_desc not in", values, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescBetween(String value1, String value2) {
            addCriterion("active_time_desc between", value1, value2, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andActiveTimeDescNotBetween(String value1, String value2) {
            addCriterion("active_time_desc not between", value1, value2, "activeTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeIsNull() {
            addCriterion("deactive_time is null");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeIsNotNull() {
            addCriterion("deactive_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeEqualTo(Date value) {
            addCriterion("deactive_time =", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeNotEqualTo(Date value) {
            addCriterion("deactive_time <>", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeGreaterThan(Date value) {
            addCriterion("deactive_time >", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deactive_time >=", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeLessThan(Date value) {
            addCriterion("deactive_time <", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("deactive_time <=", value, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeIn(List<Date> values) {
            addCriterion("deactive_time in", values, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeNotIn(List<Date> values) {
            addCriterion("deactive_time not in", values, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeBetween(Date value1, Date value2) {
            addCriterion("deactive_time between", value1, value2, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("deactive_time not between", value1, value2, "deactiveTime");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescIsNull() {
            addCriterion("deactive_time_desc is null");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescIsNotNull() {
            addCriterion("deactive_time_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescEqualTo(String value) {
            addCriterion("deactive_time_desc =", value, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescNotEqualTo(String value) {
            addCriterion("deactive_time_desc <>", value, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescGreaterThan(String value) {
            addCriterion("deactive_time_desc >", value, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescGreaterThanOrEqualTo(String value) {
            addCriterion("deactive_time_desc >=", value, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescLessThan(String value) {
            addCriterion("deactive_time_desc <", value, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescLessThanOrEqualTo(String value) {
            addCriterion("deactive_time_desc <=", value, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescLike(String value) {
            addCriterion("deactive_time_desc like", value, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescNotLike(String value) {
            addCriterion("deactive_time_desc not like", value, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescIn(List<String> values) {
            addCriterion("deactive_time_desc in", values, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescNotIn(List<String> values) {
            addCriterion("deactive_time_desc not in", values, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescBetween(String value1, String value2) {
            addCriterion("deactive_time_desc between", value1, value2, "deactiveTimeDesc");
            return (Criteria) this;
        }

        public Criteria andDeactiveTimeDescNotBetween(String value1, String value2) {
            addCriterion("deactive_time_desc not between", value1, value2, "deactiveTimeDesc");
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