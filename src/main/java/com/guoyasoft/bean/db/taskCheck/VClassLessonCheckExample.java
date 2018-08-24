package com.guoyasoft.bean.db.taskCheck;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VClassLessonCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VClassLessonCheckExample() {
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

        public Criteria andStuClassIdIsNull() {
            addCriterion("stu_class_id is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIdIsNotNull() {
            addCriterion("stu_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassIdEqualTo(Integer value) {
            addCriterion("stu_class_id =", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdNotEqualTo(Integer value) {
            addCriterion("stu_class_id <>", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdGreaterThan(Integer value) {
            addCriterion("stu_class_id >", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_class_id >=", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdLessThan(Integer value) {
            addCriterion("stu_class_id <", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_class_id <=", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdIn(List<Integer> values) {
            addCriterion("stu_class_id in", values, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdNotIn(List<Integer> values) {
            addCriterion("stu_class_id not in", values, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_class_id between", value1, value2, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_class_id not between", value1, value2, "stuClassId");
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

        public Criteria andLecturePkgIdIsNull() {
            addCriterion("lecture_pkg_id is null");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdIsNotNull() {
            addCriterion("lecture_pkg_id is not null");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdEqualTo(Integer value) {
            addCriterion("lecture_pkg_id =", value, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdNotEqualTo(Integer value) {
            addCriterion("lecture_pkg_id <>", value, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdGreaterThan(Integer value) {
            addCriterion("lecture_pkg_id >", value, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lecture_pkg_id >=", value, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdLessThan(Integer value) {
            addCriterion("lecture_pkg_id <", value, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdLessThanOrEqualTo(Integer value) {
            addCriterion("lecture_pkg_id <=", value, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdIn(List<Integer> values) {
            addCriterion("lecture_pkg_id in", values, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdNotIn(List<Integer> values) {
            addCriterion("lecture_pkg_id not in", values, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdBetween(Integer value1, Integer value2) {
            addCriterion("lecture_pkg_id between", value1, value2, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lecture_pkg_id not between", value1, value2, "lecturePkgId");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameIsNull() {
            addCriterion("lecture_pkg_name is null");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameIsNotNull() {
            addCriterion("lecture_pkg_name is not null");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameEqualTo(String value) {
            addCriterion("lecture_pkg_name =", value, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameNotEqualTo(String value) {
            addCriterion("lecture_pkg_name <>", value, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameGreaterThan(String value) {
            addCriterion("lecture_pkg_name >", value, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameGreaterThanOrEqualTo(String value) {
            addCriterion("lecture_pkg_name >=", value, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameLessThan(String value) {
            addCriterion("lecture_pkg_name <", value, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameLessThanOrEqualTo(String value) {
            addCriterion("lecture_pkg_name <=", value, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameLike(String value) {
            addCriterion("lecture_pkg_name like", value, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameNotLike(String value) {
            addCriterion("lecture_pkg_name not like", value, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameIn(List<String> values) {
            addCriterion("lecture_pkg_name in", values, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameNotIn(List<String> values) {
            addCriterion("lecture_pkg_name not in", values, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameBetween(String value1, String value2) {
            addCriterion("lecture_pkg_name between", value1, value2, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andLecturePkgNameNotBetween(String value1, String value2) {
            addCriterion("lecture_pkg_name not between", value1, value2, "lecturePkgName");
            return (Criteria) this;
        }

        public Criteria andRelateIdIsNull() {
            addCriterion("relate_id is null");
            return (Criteria) this;
        }

        public Criteria andRelateIdIsNotNull() {
            addCriterion("relate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelateIdEqualTo(Integer value) {
            addCriterion("relate_id =", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotEqualTo(Integer value) {
            addCriterion("relate_id <>", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdGreaterThan(Integer value) {
            addCriterion("relate_id >", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("relate_id >=", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdLessThan(Integer value) {
            addCriterion("relate_id <", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdLessThanOrEqualTo(Integer value) {
            addCriterion("relate_id <=", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdIn(List<Integer> values) {
            addCriterion("relate_id in", values, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotIn(List<Integer> values) {
            addCriterion("relate_id not in", values, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdBetween(Integer value1, Integer value2) {
            addCriterion("relate_id between", value1, value2, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("relate_id not between", value1, value2, "relateId");
            return (Criteria) this;
        }

        public Criteria andLectureIdIsNull() {
            addCriterion("lecture_id is null");
            return (Criteria) this;
        }

        public Criteria andLectureIdIsNotNull() {
            addCriterion("lecture_id is not null");
            return (Criteria) this;
        }

        public Criteria andLectureIdEqualTo(Integer value) {
            addCriterion("lecture_id =", value, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureIdNotEqualTo(Integer value) {
            addCriterion("lecture_id <>", value, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureIdGreaterThan(Integer value) {
            addCriterion("lecture_id >", value, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lecture_id >=", value, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureIdLessThan(Integer value) {
            addCriterion("lecture_id <", value, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureIdLessThanOrEqualTo(Integer value) {
            addCriterion("lecture_id <=", value, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureIdIn(List<Integer> values) {
            addCriterion("lecture_id in", values, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureIdNotIn(List<Integer> values) {
            addCriterion("lecture_id not in", values, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureIdBetween(Integer value1, Integer value2) {
            addCriterion("lecture_id between", value1, value2, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lecture_id not between", value1, value2, "lectureId");
            return (Criteria) this;
        }

        public Criteria andLectureNameIsNull() {
            addCriterion("lecture_name is null");
            return (Criteria) this;
        }

        public Criteria andLectureNameIsNotNull() {
            addCriterion("lecture_name is not null");
            return (Criteria) this;
        }

        public Criteria andLectureNameEqualTo(String value) {
            addCriterion("lecture_name =", value, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameNotEqualTo(String value) {
            addCriterion("lecture_name <>", value, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameGreaterThan(String value) {
            addCriterion("lecture_name >", value, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameGreaterThanOrEqualTo(String value) {
            addCriterion("lecture_name >=", value, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameLessThan(String value) {
            addCriterion("lecture_name <", value, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameLessThanOrEqualTo(String value) {
            addCriterion("lecture_name <=", value, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameLike(String value) {
            addCriterion("lecture_name like", value, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameNotLike(String value) {
            addCriterion("lecture_name not like", value, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameIn(List<String> values) {
            addCriterion("lecture_name in", values, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameNotIn(List<String> values) {
            addCriterion("lecture_name not in", values, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameBetween(String value1, String value2) {
            addCriterion("lecture_name between", value1, value2, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureNameNotBetween(String value1, String value2) {
            addCriterion("lecture_name not between", value1, value2, "lectureName");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryIsNull() {
            addCriterion("lecture_summary is null");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryIsNotNull() {
            addCriterion("lecture_summary is not null");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryEqualTo(String value) {
            addCriterion("lecture_summary =", value, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryNotEqualTo(String value) {
            addCriterion("lecture_summary <>", value, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryGreaterThan(String value) {
            addCriterion("lecture_summary >", value, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("lecture_summary >=", value, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryLessThan(String value) {
            addCriterion("lecture_summary <", value, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryLessThanOrEqualTo(String value) {
            addCriterion("lecture_summary <=", value, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryLike(String value) {
            addCriterion("lecture_summary like", value, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryNotLike(String value) {
            addCriterion("lecture_summary not like", value, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryIn(List<String> values) {
            addCriterion("lecture_summary in", values, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryNotIn(List<String> values) {
            addCriterion("lecture_summary not in", values, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryBetween(String value1, String value2) {
            addCriterion("lecture_summary between", value1, value2, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andLectureSummaryNotBetween(String value1, String value2) {
            addCriterion("lecture_summary not between", value1, value2, "lectureSummary");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdIsNull() {
            addCriterion("task_pkg_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdIsNotNull() {
            addCriterion("task_pkg_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdEqualTo(Integer value) {
            addCriterion("task_pkg_id =", value, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdNotEqualTo(Integer value) {
            addCriterion("task_pkg_id <>", value, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdGreaterThan(Integer value) {
            addCriterion("task_pkg_id >", value, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_pkg_id >=", value, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdLessThan(Integer value) {
            addCriterion("task_pkg_id <", value, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_pkg_id <=", value, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdIn(List<Integer> values) {
            addCriterion("task_pkg_id in", values, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdNotIn(List<Integer> values) {
            addCriterion("task_pkg_id not in", values, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdBetween(Integer value1, Integer value2) {
            addCriterion("task_pkg_id between", value1, value2, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_pkg_id not between", value1, value2, "taskPkgId");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameIsNull() {
            addCriterion("task_pkg_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameIsNotNull() {
            addCriterion("task_pkg_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameEqualTo(String value) {
            addCriterion("task_pkg_name =", value, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameNotEqualTo(String value) {
            addCriterion("task_pkg_name <>", value, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameGreaterThan(String value) {
            addCriterion("task_pkg_name >", value, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_pkg_name >=", value, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameLessThan(String value) {
            addCriterion("task_pkg_name <", value, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameLessThanOrEqualTo(String value) {
            addCriterion("task_pkg_name <=", value, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameLike(String value) {
            addCriterion("task_pkg_name like", value, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameNotLike(String value) {
            addCriterion("task_pkg_name not like", value, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameIn(List<String> values) {
            addCriterion("task_pkg_name in", values, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameNotIn(List<String> values) {
            addCriterion("task_pkg_name not in", values, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameBetween(String value1, String value2) {
            addCriterion("task_pkg_name between", value1, value2, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andTaskPkgNameNotBetween(String value1, String value2) {
            addCriterion("task_pkg_name not between", value1, value2, "taskPkgName");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryIsNull() {
            addCriterion("pkg_summary is null");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryIsNotNull() {
            addCriterion("pkg_summary is not null");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryEqualTo(String value) {
            addCriterion("pkg_summary =", value, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryNotEqualTo(String value) {
            addCriterion("pkg_summary <>", value, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryGreaterThan(String value) {
            addCriterion("pkg_summary >", value, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("pkg_summary >=", value, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryLessThan(String value) {
            addCriterion("pkg_summary <", value, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryLessThanOrEqualTo(String value) {
            addCriterion("pkg_summary <=", value, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryLike(String value) {
            addCriterion("pkg_summary like", value, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryNotLike(String value) {
            addCriterion("pkg_summary not like", value, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryIn(List<String> values) {
            addCriterion("pkg_summary in", values, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryNotIn(List<String> values) {
            addCriterion("pkg_summary not in", values, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryBetween(String value1, String value2) {
            addCriterion("pkg_summary between", value1, value2, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgSummaryNotBetween(String value1, String value2) {
            addCriterion("pkg_summary not between", value1, value2, "pkgSummary");
            return (Criteria) this;
        }

        public Criteria andPkgMarkIsNull() {
            addCriterion("pkg_mark is null");
            return (Criteria) this;
        }

        public Criteria andPkgMarkIsNotNull() {
            addCriterion("pkg_mark is not null");
            return (Criteria) this;
        }

        public Criteria andPkgMarkEqualTo(String value) {
            addCriterion("pkg_mark =", value, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkNotEqualTo(String value) {
            addCriterion("pkg_mark <>", value, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkGreaterThan(String value) {
            addCriterion("pkg_mark >", value, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkGreaterThanOrEqualTo(String value) {
            addCriterion("pkg_mark >=", value, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkLessThan(String value) {
            addCriterion("pkg_mark <", value, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkLessThanOrEqualTo(String value) {
            addCriterion("pkg_mark <=", value, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkLike(String value) {
            addCriterion("pkg_mark like", value, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkNotLike(String value) {
            addCriterion("pkg_mark not like", value, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkIn(List<String> values) {
            addCriterion("pkg_mark in", values, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkNotIn(List<String> values) {
            addCriterion("pkg_mark not in", values, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkBetween(String value1, String value2) {
            addCriterion("pkg_mark between", value1, value2, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andPkgMarkNotBetween(String value1, String value2) {
            addCriterion("pkg_mark not between", value1, value2, "pkgMark");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdIsNull() {
            addCriterion("task_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdIsNotNull() {
            addCriterion("task_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdEqualTo(Integer value) {
            addCriterion("task_detail_id =", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdNotEqualTo(Integer value) {
            addCriterion("task_detail_id <>", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdGreaterThan(Integer value) {
            addCriterion("task_detail_id >", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_detail_id >=", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdLessThan(Integer value) {
            addCriterion("task_detail_id <", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_detail_id <=", value, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdIn(List<Integer> values) {
            addCriterion("task_detail_id in", values, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdNotIn(List<Integer> values) {
            addCriterion("task_detail_id not in", values, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("task_detail_id between", value1, value2, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_detail_id not between", value1, value2, "taskDetailId");
            return (Criteria) this;
        }

        public Criteria andTaskDescIsNull() {
            addCriterion("task_desc is null");
            return (Criteria) this;
        }

        public Criteria andTaskDescIsNotNull() {
            addCriterion("task_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDescEqualTo(String value) {
            addCriterion("task_desc =", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotEqualTo(String value) {
            addCriterion("task_desc <>", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescGreaterThan(String value) {
            addCriterion("task_desc >", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescGreaterThanOrEqualTo(String value) {
            addCriterion("task_desc >=", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLessThan(String value) {
            addCriterion("task_desc <", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLessThanOrEqualTo(String value) {
            addCriterion("task_desc <=", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLike(String value) {
            addCriterion("task_desc like", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotLike(String value) {
            addCriterion("task_desc not like", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescIn(List<String> values) {
            addCriterion("task_desc in", values, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotIn(List<String> values) {
            addCriterion("task_desc not in", values, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescBetween(String value1, String value2) {
            addCriterion("task_desc between", value1, value2, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotBetween(String value1, String value2) {
            addCriterion("task_desc not between", value1, value2, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("item_desc is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("item_desc is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("item_desc =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("item_desc <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("item_desc >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("item_desc >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("item_desc <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("item_desc <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("item_desc like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("item_desc not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("item_desc in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("item_desc not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("item_desc between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("item_desc not between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemMarkIsNull() {
            addCriterion("item_mark is null");
            return (Criteria) this;
        }

        public Criteria andItemMarkIsNotNull() {
            addCriterion("item_mark is not null");
            return (Criteria) this;
        }

        public Criteria andItemMarkEqualTo(String value) {
            addCriterion("item_mark =", value, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkNotEqualTo(String value) {
            addCriterion("item_mark <>", value, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkGreaterThan(String value) {
            addCriterion("item_mark >", value, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkGreaterThanOrEqualTo(String value) {
            addCriterion("item_mark >=", value, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkLessThan(String value) {
            addCriterion("item_mark <", value, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkLessThanOrEqualTo(String value) {
            addCriterion("item_mark <=", value, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkLike(String value) {
            addCriterion("item_mark like", value, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkNotLike(String value) {
            addCriterion("item_mark not like", value, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkIn(List<String> values) {
            addCriterion("item_mark in", values, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkNotIn(List<String> values) {
            addCriterion("item_mark not in", values, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkBetween(String value1, String value2) {
            addCriterion("item_mark between", value1, value2, "itemMark");
            return (Criteria) this;
        }

        public Criteria andItemMarkNotBetween(String value1, String value2) {
            addCriterion("item_mark not between", value1, value2, "itemMark");
            return (Criteria) this;
        }

        public Criteria andLessonIdIsNull() {
            addCriterion("lesson_id is null");
            return (Criteria) this;
        }

        public Criteria andLessonIdIsNotNull() {
            addCriterion("lesson_id is not null");
            return (Criteria) this;
        }

        public Criteria andLessonIdEqualTo(Integer value) {
            addCriterion("lesson_id =", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotEqualTo(Integer value) {
            addCriterion("lesson_id <>", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThan(Integer value) {
            addCriterion("lesson_id >", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lesson_id >=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThan(Integer value) {
            addCriterion("lesson_id <", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThanOrEqualTo(Integer value) {
            addCriterion("lesson_id <=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdIn(List<Integer> values) {
            addCriterion("lesson_id in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotIn(List<Integer> values) {
            addCriterion("lesson_id not in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdBetween(Integer value1, Integer value2) {
            addCriterion("lesson_id between", value1, value2, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lesson_id not between", value1, value2, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeIsNull() {
            addCriterion("lesson_start_time is null");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeIsNotNull() {
            addCriterion("lesson_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("lesson_start_time =", value, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("lesson_start_time <>", value, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("lesson_start_time >", value, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lesson_start_time >=", value, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("lesson_start_time <", value, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lesson_start_time <=", value, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("lesson_start_time in", values, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("lesson_start_time not in", values, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lesson_start_time between", value1, value2, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lesson_start_time not between", value1, value2, "lessonStartTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeIsNull() {
            addCriterion("lesson_end_time is null");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeIsNotNull() {
            addCriterion("lesson_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("lesson_end_time =", value, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("lesson_end_time <>", value, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("lesson_end_time >", value, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lesson_end_time >=", value, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("lesson_end_time <", value, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lesson_end_time <=", value, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("lesson_end_time in", values, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("lesson_end_time not in", values, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lesson_end_time between", value1, value2, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andLessonEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lesson_end_time not between", value1, value2, "lessonEndTime");
            return (Criteria) this;
        }

        public Criteria andAttendIdIsNull() {
            addCriterion("attend_id is null");
            return (Criteria) this;
        }

        public Criteria andAttendIdIsNotNull() {
            addCriterion("attend_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttendIdEqualTo(Integer value) {
            addCriterion("attend_id =", value, "attendId");
            return (Criteria) this;
        }

        public Criteria andAttendIdNotEqualTo(Integer value) {
            addCriterion("attend_id <>", value, "attendId");
            return (Criteria) this;
        }

        public Criteria andAttendIdGreaterThan(Integer value) {
            addCriterion("attend_id >", value, "attendId");
            return (Criteria) this;
        }

        public Criteria andAttendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attend_id >=", value, "attendId");
            return (Criteria) this;
        }

        public Criteria andAttendIdLessThan(Integer value) {
            addCriterion("attend_id <", value, "attendId");
            return (Criteria) this;
        }

        public Criteria andAttendIdLessThanOrEqualTo(Integer value) {
            addCriterion("attend_id <=", value, "attendId");
            return (Criteria) this;
        }

        public Criteria andAttendIdIn(List<Integer> values) {
            addCriterion("attend_id in", values, "attendId");
            return (Criteria) this;
        }

        public Criteria andAttendIdNotIn(List<Integer> values) {
            addCriterion("attend_id not in", values, "attendId");
            return (Criteria) this;
        }

        public Criteria andAttendIdBetween(Integer value1, Integer value2) {
            addCriterion("attend_id between", value1, value2, "attendId");
            return (Criteria) this;
        }

        public Criteria andAttendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attend_id not between", value1, value2, "attendId");
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

        public Criteria andCheckIdIsNull() {
            addCriterion("check_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("check_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIdEqualTo(Integer value) {
            addCriterion("check_id =", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotEqualTo(Integer value) {
            addCriterion("check_id <>", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThan(Integer value) {
            addCriterion("check_id >", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_id >=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThan(Integer value) {
            addCriterion("check_id <", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("check_id <=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdIn(List<Integer> values) {
            addCriterion("check_id in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotIn(List<Integer> values) {
            addCriterion("check_id not in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdBetween(Integer value1, Integer value2) {
            addCriterion("check_id between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("check_id not between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusIsNull() {
            addCriterion("task_check_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusIsNotNull() {
            addCriterion("task_check_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusEqualTo(Short value) {
            addCriterion("task_check_status =", value, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusNotEqualTo(Short value) {
            addCriterion("task_check_status <>", value, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusGreaterThan(Short value) {
            addCriterion("task_check_status >", value, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("task_check_status >=", value, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusLessThan(Short value) {
            addCriterion("task_check_status <", value, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusLessThanOrEqualTo(Short value) {
            addCriterion("task_check_status <=", value, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusIn(List<Short> values) {
            addCriterion("task_check_status in", values, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusNotIn(List<Short> values) {
            addCriterion("task_check_status not in", values, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusBetween(Short value1, Short value2) {
            addCriterion("task_check_status between", value1, value2, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCheckStatusNotBetween(Short value1, Short value2) {
            addCriterion("task_check_status not between", value1, value2, "taskCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPicturesIdIsNull() {
            addCriterion("pictures_id is null");
            return (Criteria) this;
        }

        public Criteria andPicturesIdIsNotNull() {
            addCriterion("pictures_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicturesIdEqualTo(Integer value) {
            addCriterion("pictures_id =", value, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPicturesIdNotEqualTo(Integer value) {
            addCriterion("pictures_id <>", value, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPicturesIdGreaterThan(Integer value) {
            addCriterion("pictures_id >", value, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPicturesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictures_id >=", value, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPicturesIdLessThan(Integer value) {
            addCriterion("pictures_id <", value, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPicturesIdLessThanOrEqualTo(Integer value) {
            addCriterion("pictures_id <=", value, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPicturesIdIn(List<Integer> values) {
            addCriterion("pictures_id in", values, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPicturesIdNotIn(List<Integer> values) {
            addCriterion("pictures_id not in", values, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPicturesIdBetween(Integer value1, Integer value2) {
            addCriterion("pictures_id between", value1, value2, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPicturesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pictures_id not between", value1, value2, "picturesId");
            return (Criteria) this;
        }

        public Criteria andPictureIdIsNull() {
            addCriterion("picture_id is null");
            return (Criteria) this;
        }

        public Criteria andPictureIdIsNotNull() {
            addCriterion("picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andPictureIdEqualTo(Integer value) {
            addCriterion("picture_id =", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotEqualTo(Integer value) {
            addCriterion("picture_id <>", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThan(Integer value) {
            addCriterion("picture_id >", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("picture_id >=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThan(Integer value) {
            addCriterion("picture_id <", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("picture_id <=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdIn(List<Integer> values) {
            addCriterion("picture_id in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotIn(List<Integer> values) {
            addCriterion("picture_id not in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("picture_id between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("picture_id not between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPitureUrlIsNull() {
            addCriterion("piture_url is null");
            return (Criteria) this;
        }

        public Criteria andPitureUrlIsNotNull() {
            addCriterion("piture_url is not null");
            return (Criteria) this;
        }

        public Criteria andPitureUrlEqualTo(String value) {
            addCriterion("piture_url =", value, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlNotEqualTo(String value) {
            addCriterion("piture_url <>", value, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlGreaterThan(String value) {
            addCriterion("piture_url >", value, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("piture_url >=", value, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlLessThan(String value) {
            addCriterion("piture_url <", value, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlLessThanOrEqualTo(String value) {
            addCriterion("piture_url <=", value, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlLike(String value) {
            addCriterion("piture_url like", value, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlNotLike(String value) {
            addCriterion("piture_url not like", value, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlIn(List<String> values) {
            addCriterion("piture_url in", values, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlNotIn(List<String> values) {
            addCriterion("piture_url not in", values, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlBetween(String value1, String value2) {
            addCriterion("piture_url between", value1, value2, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPitureUrlNotBetween(String value1, String value2) {
            addCriterion("piture_url not between", value1, value2, "pitureUrl");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusIsNull() {
            addCriterion("picture_check_status is null");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusIsNotNull() {
            addCriterion("picture_check_status is not null");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusEqualTo(Integer value) {
            addCriterion("picture_check_status =", value, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusNotEqualTo(Integer value) {
            addCriterion("picture_check_status <>", value, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusGreaterThan(Integer value) {
            addCriterion("picture_check_status >", value, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("picture_check_status >=", value, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusLessThan(Integer value) {
            addCriterion("picture_check_status <", value, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("picture_check_status <=", value, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusIn(List<Integer> values) {
            addCriterion("picture_check_status in", values, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusNotIn(List<Integer> values) {
            addCriterion("picture_check_status not in", values, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("picture_check_status between", value1, value2, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPictureCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("picture_check_status not between", value1, value2, "pictureCheckStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescIsNull() {
            addCriterion("check_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescIsNotNull() {
            addCriterion("check_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescEqualTo(Integer value) {
            addCriterion("check_status_desc =", value, "checkStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescNotEqualTo(Integer value) {
            addCriterion("check_status_desc <>", value, "checkStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescGreaterThan(Integer value) {
            addCriterion("check_status_desc >", value, "checkStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_status_desc >=", value, "checkStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescLessThan(Integer value) {
            addCriterion("check_status_desc <", value, "checkStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescLessThanOrEqualTo(Integer value) {
            addCriterion("check_status_desc <=", value, "checkStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescIn(List<Integer> values) {
            addCriterion("check_status_desc in", values, "checkStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescNotIn(List<Integer> values) {
            addCriterion("check_status_desc not in", values, "checkStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescBetween(Integer value1, Integer value2) {
            addCriterion("check_status_desc between", value1, value2, "checkStatusDesc");
            return (Criteria) this;
        }

        public Criteria andCheckStatusDescNotBetween(Integer value1, Integer value2) {
            addCriterion("check_status_desc not between", value1, value2, "checkStatusDesc");
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