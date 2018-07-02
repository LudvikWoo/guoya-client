package com.guoyasoft.bean.db.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VCourseScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VCourseScheduleExample() {
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

        public Criteria andScheduleStatusDescIsNull() {
            addCriterion("schedule_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescIsNotNull() {
            addCriterion("schedule_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescEqualTo(String value) {
            addCriterion("schedule_status_desc =", value, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescNotEqualTo(String value) {
            addCriterion("schedule_status_desc <>", value, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescGreaterThan(String value) {
            addCriterion("schedule_status_desc >", value, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_status_desc >=", value, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescLessThan(String value) {
            addCriterion("schedule_status_desc <", value, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescLessThanOrEqualTo(String value) {
            addCriterion("schedule_status_desc <=", value, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescLike(String value) {
            addCriterion("schedule_status_desc like", value, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescNotLike(String value) {
            addCriterion("schedule_status_desc not like", value, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescIn(List<String> values) {
            addCriterion("schedule_status_desc in", values, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescNotIn(List<String> values) {
            addCriterion("schedule_status_desc not in", values, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescBetween(String value1, String value2) {
            addCriterion("schedule_status_desc between", value1, value2, "scheduleStatusDesc");
            return (Criteria) this;
        }

        public Criteria andScheduleStatusDescNotBetween(String value1, String value2) {
            addCriterion("schedule_status_desc not between", value1, value2, "scheduleStatusDesc");
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
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

        public Criteria andCourseStatusDescIsNull() {
            addCriterion("course_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescIsNotNull() {
            addCriterion("course_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescEqualTo(String value) {
            addCriterion("course_status_desc =", value, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescNotEqualTo(String value) {
            addCriterion("course_status_desc <>", value, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescGreaterThan(String value) {
            addCriterion("course_status_desc >", value, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("course_status_desc >=", value, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescLessThan(String value) {
            addCriterion("course_status_desc <", value, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescLessThanOrEqualTo(String value) {
            addCriterion("course_status_desc <=", value, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescLike(String value) {
            addCriterion("course_status_desc like", value, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescNotLike(String value) {
            addCriterion("course_status_desc not like", value, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescIn(List<String> values) {
            addCriterion("course_status_desc in", values, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescNotIn(List<String> values) {
            addCriterion("course_status_desc not in", values, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescBetween(String value1, String value2) {
            addCriterion("course_status_desc between", value1, value2, "courseStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCourseStatusDescNotBetween(String value1, String value2) {
            addCriterion("course_status_desc not between", value1, value2, "courseStatusDesc");
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

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIsNull() {
            addCriterion("graduate_date is null");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIsNotNull() {
            addCriterion("graduate_date is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateDateEqualTo(Date value) {
            addCriterionForJDBCDate("graduate_date =", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("graduate_date <>", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("graduate_date >", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduate_date >=", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLessThan(Date value) {
            addCriterionForJDBCDate("graduate_date <", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduate_date <=", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIn(List<Date> values) {
            addCriterionForJDBCDate("graduate_date in", values, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("graduate_date not in", values, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduate_date between", value1, value2, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduate_date not between", value1, value2, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andClassStatusIsNull() {
            addCriterion("class_status is null");
            return (Criteria) this;
        }

        public Criteria andClassStatusIsNotNull() {
            addCriterion("class_status is not null");
            return (Criteria) this;
        }

        public Criteria andClassStatusEqualTo(Integer value) {
            addCriterion("class_status =", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotEqualTo(Integer value) {
            addCriterion("class_status <>", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusGreaterThan(Integer value) {
            addCriterion("class_status >", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_status >=", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusLessThan(Integer value) {
            addCriterion("class_status <", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusLessThanOrEqualTo(Integer value) {
            addCriterion("class_status <=", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusIn(List<Integer> values) {
            addCriterion("class_status in", values, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotIn(List<Integer> values) {
            addCriterion("class_status not in", values, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusBetween(Integer value1, Integer value2) {
            addCriterion("class_status between", value1, value2, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("class_status not between", value1, value2, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescIsNull() {
            addCriterion("class_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescIsNotNull() {
            addCriterion("class_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescEqualTo(String value) {
            addCriterion("class_status_desc =", value, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescNotEqualTo(String value) {
            addCriterion("class_status_desc <>", value, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescGreaterThan(String value) {
            addCriterion("class_status_desc >", value, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("class_status_desc >=", value, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescLessThan(String value) {
            addCriterion("class_status_desc <", value, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescLessThanOrEqualTo(String value) {
            addCriterion("class_status_desc <=", value, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescLike(String value) {
            addCriterion("class_status_desc like", value, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescNotLike(String value) {
            addCriterion("class_status_desc not like", value, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescIn(List<String> values) {
            addCriterion("class_status_desc in", values, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescNotIn(List<String> values) {
            addCriterion("class_status_desc not in", values, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescBetween(String value1, String value2) {
            addCriterion("class_status_desc between", value1, value2, "classStatusDesc");
            return (Criteria) this;
        }

        public Criteria andClassStatusDescNotBetween(String value1, String value2) {
            addCriterion("class_status_desc not between", value1, value2, "classStatusDesc");
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