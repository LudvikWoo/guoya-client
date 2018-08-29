package com.guoyasoft.bean.db.interview;

import java.util.ArrayList;
import java.util.List;

public class TempInterviewProgressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempInterviewProgressExample() {
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

        public Criteria andPNoIsNull() {
            addCriterion("p_no is null");
            return (Criteria) this;
        }

        public Criteria andPNoIsNotNull() {
            addCriterion("p_no is not null");
            return (Criteria) this;
        }

        public Criteria andPNoEqualTo(Integer value) {
            addCriterion("p_no =", value, "pNo");
            return (Criteria) this;
        }

        public Criteria andPNoNotEqualTo(Integer value) {
            addCriterion("p_no <>", value, "pNo");
            return (Criteria) this;
        }

        public Criteria andPNoGreaterThan(Integer value) {
            addCriterion("p_no >", value, "pNo");
            return (Criteria) this;
        }

        public Criteria andPNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_no >=", value, "pNo");
            return (Criteria) this;
        }

        public Criteria andPNoLessThan(Integer value) {
            addCriterion("p_no <", value, "pNo");
            return (Criteria) this;
        }

        public Criteria andPNoLessThanOrEqualTo(Integer value) {
            addCriterion("p_no <=", value, "pNo");
            return (Criteria) this;
        }

        public Criteria andPNoIn(List<Integer> values) {
            addCriterion("p_no in", values, "pNo");
            return (Criteria) this;
        }

        public Criteria andPNoNotIn(List<Integer> values) {
            addCriterion("p_no not in", values, "pNo");
            return (Criteria) this;
        }

        public Criteria andPNoBetween(Integer value1, Integer value2) {
            addCriterion("p_no between", value1, value2, "pNo");
            return (Criteria) this;
        }

        public Criteria andPNoNotBetween(Integer value1, Integer value2) {
            addCriterion("p_no not between", value1, value2, "pNo");
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

        public Criteria andTutorIdIsNull() {
            addCriterion("tutor_id is null");
            return (Criteria) this;
        }

        public Criteria andTutorIdIsNotNull() {
            addCriterion("tutor_id is not null");
            return (Criteria) this;
        }

        public Criteria andTutorIdEqualTo(Integer value) {
            addCriterion("tutor_id =", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdNotEqualTo(Integer value) {
            addCriterion("tutor_id <>", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdGreaterThan(Integer value) {
            addCriterion("tutor_id >", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tutor_id >=", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdLessThan(Integer value) {
            addCriterion("tutor_id <", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdLessThanOrEqualTo(Integer value) {
            addCriterion("tutor_id <=", value, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdIn(List<Integer> values) {
            addCriterion("tutor_id in", values, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdNotIn(List<Integer> values) {
            addCriterion("tutor_id not in", values, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdBetween(Integer value1, Integer value2) {
            addCriterion("tutor_id between", value1, value2, "tutorId");
            return (Criteria) this;
        }

        public Criteria andTutorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tutor_id not between", value1, value2, "tutorId");
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

        public Criteria andProject1IsNull() {
            addCriterion("project_1 is null");
            return (Criteria) this;
        }

        public Criteria andProject1IsNotNull() {
            addCriterion("project_1 is not null");
            return (Criteria) this;
        }

        public Criteria andProject1EqualTo(String value) {
            addCriterion("project_1 =", value, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1NotEqualTo(String value) {
            addCriterion("project_1 <>", value, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1GreaterThan(String value) {
            addCriterion("project_1 >", value, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1GreaterThanOrEqualTo(String value) {
            addCriterion("project_1 >=", value, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1LessThan(String value) {
            addCriterion("project_1 <", value, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1LessThanOrEqualTo(String value) {
            addCriterion("project_1 <=", value, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1Like(String value) {
            addCriterion("project_1 like", value, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1NotLike(String value) {
            addCriterion("project_1 not like", value, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1In(List<String> values) {
            addCriterion("project_1 in", values, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1NotIn(List<String> values) {
            addCriterion("project_1 not in", values, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1Between(String value1, String value2) {
            addCriterion("project_1 between", value1, value2, "project1");
            return (Criteria) this;
        }

        public Criteria andProject1NotBetween(String value1, String value2) {
            addCriterion("project_1 not between", value1, value2, "project1");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdIsNull() {
            addCriterion("author1_stu_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdIsNotNull() {
            addCriterion("author1_stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdEqualTo(Integer value) {
            addCriterion("author1_stu_id =", value, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdNotEqualTo(Integer value) {
            addCriterion("author1_stu_id <>", value, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdGreaterThan(Integer value) {
            addCriterion("author1_stu_id >", value, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author1_stu_id >=", value, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdLessThan(Integer value) {
            addCriterion("author1_stu_id <", value, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdLessThanOrEqualTo(Integer value) {
            addCriterion("author1_stu_id <=", value, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdIn(List<Integer> values) {
            addCriterion("author1_stu_id in", values, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdNotIn(List<Integer> values) {
            addCriterion("author1_stu_id not in", values, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdBetween(Integer value1, Integer value2) {
            addCriterion("author1_stu_id between", value1, value2, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author1_stu_id not between", value1, value2, "author1StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameIsNull() {
            addCriterion("author1_stu_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameIsNotNull() {
            addCriterion("author1_stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameEqualTo(String value) {
            addCriterion("author1_stu_name =", value, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameNotEqualTo(String value) {
            addCriterion("author1_stu_name <>", value, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameGreaterThan(String value) {
            addCriterion("author1_stu_name >", value, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameGreaterThanOrEqualTo(String value) {
            addCriterion("author1_stu_name >=", value, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameLessThan(String value) {
            addCriterion("author1_stu_name <", value, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameLessThanOrEqualTo(String value) {
            addCriterion("author1_stu_name <=", value, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameLike(String value) {
            addCriterion("author1_stu_name like", value, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameNotLike(String value) {
            addCriterion("author1_stu_name not like", value, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameIn(List<String> values) {
            addCriterion("author1_stu_name in", values, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameNotIn(List<String> values) {
            addCriterion("author1_stu_name not in", values, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameBetween(String value1, String value2) {
            addCriterion("author1_stu_name between", value1, value2, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor1StuNameNotBetween(String value1, String value2) {
            addCriterion("author1_stu_name not between", value1, value2, "author1StuName");
            return (Criteria) this;
        }

        public Criteria andProject2IsNull() {
            addCriterion("project_2 is null");
            return (Criteria) this;
        }

        public Criteria andProject2IsNotNull() {
            addCriterion("project_2 is not null");
            return (Criteria) this;
        }

        public Criteria andProject2EqualTo(String value) {
            addCriterion("project_2 =", value, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2NotEqualTo(String value) {
            addCriterion("project_2 <>", value, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2GreaterThan(String value) {
            addCriterion("project_2 >", value, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2GreaterThanOrEqualTo(String value) {
            addCriterion("project_2 >=", value, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2LessThan(String value) {
            addCriterion("project_2 <", value, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2LessThanOrEqualTo(String value) {
            addCriterion("project_2 <=", value, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2Like(String value) {
            addCriterion("project_2 like", value, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2NotLike(String value) {
            addCriterion("project_2 not like", value, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2In(List<String> values) {
            addCriterion("project_2 in", values, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2NotIn(List<String> values) {
            addCriterion("project_2 not in", values, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2Between(String value1, String value2) {
            addCriterion("project_2 between", value1, value2, "project2");
            return (Criteria) this;
        }

        public Criteria andProject2NotBetween(String value1, String value2) {
            addCriterion("project_2 not between", value1, value2, "project2");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdIsNull() {
            addCriterion("author2_stu_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdIsNotNull() {
            addCriterion("author2_stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdEqualTo(Integer value) {
            addCriterion("author2_stu_id =", value, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdNotEqualTo(Integer value) {
            addCriterion("author2_stu_id <>", value, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdGreaterThan(Integer value) {
            addCriterion("author2_stu_id >", value, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author2_stu_id >=", value, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdLessThan(Integer value) {
            addCriterion("author2_stu_id <", value, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdLessThanOrEqualTo(Integer value) {
            addCriterion("author2_stu_id <=", value, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdIn(List<Integer> values) {
            addCriterion("author2_stu_id in", values, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdNotIn(List<Integer> values) {
            addCriterion("author2_stu_id not in", values, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdBetween(Integer value1, Integer value2) {
            addCriterion("author2_stu_id between", value1, value2, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author2_stu_id not between", value1, value2, "author2StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameIsNull() {
            addCriterion("author2_stu_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameIsNotNull() {
            addCriterion("author2_stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameEqualTo(String value) {
            addCriterion("author2_stu_name =", value, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameNotEqualTo(String value) {
            addCriterion("author2_stu_name <>", value, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameGreaterThan(String value) {
            addCriterion("author2_stu_name >", value, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameGreaterThanOrEqualTo(String value) {
            addCriterion("author2_stu_name >=", value, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameLessThan(String value) {
            addCriterion("author2_stu_name <", value, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameLessThanOrEqualTo(String value) {
            addCriterion("author2_stu_name <=", value, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameLike(String value) {
            addCriterion("author2_stu_name like", value, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameNotLike(String value) {
            addCriterion("author2_stu_name not like", value, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameIn(List<String> values) {
            addCriterion("author2_stu_name in", values, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameNotIn(List<String> values) {
            addCriterion("author2_stu_name not in", values, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameBetween(String value1, String value2) {
            addCriterion("author2_stu_name between", value1, value2, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor2StuNameNotBetween(String value1, String value2) {
            addCriterion("author2_stu_name not between", value1, value2, "author2StuName");
            return (Criteria) this;
        }

        public Criteria andProject3IsNull() {
            addCriterion("project_3 is null");
            return (Criteria) this;
        }

        public Criteria andProject3IsNotNull() {
            addCriterion("project_3 is not null");
            return (Criteria) this;
        }

        public Criteria andProject3EqualTo(String value) {
            addCriterion("project_3 =", value, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3NotEqualTo(String value) {
            addCriterion("project_3 <>", value, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3GreaterThan(String value) {
            addCriterion("project_3 >", value, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3GreaterThanOrEqualTo(String value) {
            addCriterion("project_3 >=", value, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3LessThan(String value) {
            addCriterion("project_3 <", value, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3LessThanOrEqualTo(String value) {
            addCriterion("project_3 <=", value, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3Like(String value) {
            addCriterion("project_3 like", value, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3NotLike(String value) {
            addCriterion("project_3 not like", value, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3In(List<String> values) {
            addCriterion("project_3 in", values, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3NotIn(List<String> values) {
            addCriterion("project_3 not in", values, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3Between(String value1, String value2) {
            addCriterion("project_3 between", value1, value2, "project3");
            return (Criteria) this;
        }

        public Criteria andProject3NotBetween(String value1, String value2) {
            addCriterion("project_3 not between", value1, value2, "project3");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdIsNull() {
            addCriterion("author3_stu_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdIsNotNull() {
            addCriterion("author3_stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdEqualTo(Integer value) {
            addCriterion("author3_stu_id =", value, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdNotEqualTo(Integer value) {
            addCriterion("author3_stu_id <>", value, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdGreaterThan(Integer value) {
            addCriterion("author3_stu_id >", value, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author3_stu_id >=", value, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdLessThan(Integer value) {
            addCriterion("author3_stu_id <", value, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdLessThanOrEqualTo(Integer value) {
            addCriterion("author3_stu_id <=", value, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdIn(List<Integer> values) {
            addCriterion("author3_stu_id in", values, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdNotIn(List<Integer> values) {
            addCriterion("author3_stu_id not in", values, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdBetween(Integer value1, Integer value2) {
            addCriterion("author3_stu_id between", value1, value2, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author3_stu_id not between", value1, value2, "author3StuId");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameIsNull() {
            addCriterion("author3_stu_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameIsNotNull() {
            addCriterion("author3_stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameEqualTo(String value) {
            addCriterion("author3_stu_name =", value, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameNotEqualTo(String value) {
            addCriterion("author3_stu_name <>", value, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameGreaterThan(String value) {
            addCriterion("author3_stu_name >", value, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameGreaterThanOrEqualTo(String value) {
            addCriterion("author3_stu_name >=", value, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameLessThan(String value) {
            addCriterion("author3_stu_name <", value, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameLessThanOrEqualTo(String value) {
            addCriterion("author3_stu_name <=", value, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameLike(String value) {
            addCriterion("author3_stu_name like", value, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameNotLike(String value) {
            addCriterion("author3_stu_name not like", value, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameIn(List<String> values) {
            addCriterion("author3_stu_name in", values, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameNotIn(List<String> values) {
            addCriterion("author3_stu_name not in", values, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameBetween(String value1, String value2) {
            addCriterion("author3_stu_name between", value1, value2, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andAuthor3StuNameNotBetween(String value1, String value2) {
            addCriterion("author3_stu_name not between", value1, value2, "author3StuName");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(Integer value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(Integer value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(Integer value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(Integer value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(Integer value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<Integer> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<Integer> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(Integer value1, Integer value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andResumeIsNull() {
            addCriterion("resume is null");
            return (Criteria) this;
        }

        public Criteria andResumeIsNotNull() {
            addCriterion("resume is not null");
            return (Criteria) this;
        }

        public Criteria andResumeEqualTo(String value) {
            addCriterion("resume =", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotEqualTo(String value) {
            addCriterion("resume <>", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeGreaterThan(String value) {
            addCriterion("resume >", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeGreaterThanOrEqualTo(String value) {
            addCriterion("resume >=", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLessThan(String value) {
            addCriterion("resume <", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLessThanOrEqualTo(String value) {
            addCriterion("resume <=", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeLike(String value) {
            addCriterion("resume like", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotLike(String value) {
            addCriterion("resume not like", value, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeIn(List<String> values) {
            addCriterion("resume in", values, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotIn(List<String> values) {
            addCriterion("resume not in", values, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeBetween(String value1, String value2) {
            addCriterion("resume between", value1, value2, "resume");
            return (Criteria) this;
        }

        public Criteria andResumeNotBetween(String value1, String value2) {
            addCriterion("resume not between", value1, value2, "resume");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andOfferIsNull() {
            addCriterion("offer is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsNotNull() {
            addCriterion("offer is not null");
            return (Criteria) this;
        }

        public Criteria andOfferEqualTo(String value) {
            addCriterion("offer =", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotEqualTo(String value) {
            addCriterion("offer <>", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThan(String value) {
            addCriterion("offer >", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferGreaterThanOrEqualTo(String value) {
            addCriterion("offer >=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThan(String value) {
            addCriterion("offer <", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLessThanOrEqualTo(String value) {
            addCriterion("offer <=", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferLike(String value) {
            addCriterion("offer like", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotLike(String value) {
            addCriterion("offer not like", value, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferIn(List<String> values) {
            addCriterion("offer in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotIn(List<String> values) {
            addCriterion("offer not in", values, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferBetween(String value1, String value2) {
            addCriterion("offer between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andOfferNotBetween(String value1, String value2) {
            addCriterion("offer not between", value1, value2, "offer");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andInterviewIsNull() {
            addCriterion("interview is null");
            return (Criteria) this;
        }

        public Criteria andInterviewIsNotNull() {
            addCriterion("interview is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewEqualTo(Integer value) {
            addCriterion("interview =", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewNotEqualTo(Integer value) {
            addCriterion("interview <>", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewGreaterThan(Integer value) {
            addCriterion("interview >", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview >=", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewLessThan(Integer value) {
            addCriterion("interview <", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewLessThanOrEqualTo(Integer value) {
            addCriterion("interview <=", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewIn(List<Integer> values) {
            addCriterion("interview in", values, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewNotIn(List<Integer> values) {
            addCriterion("interview not in", values, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewBetween(Integer value1, Integer value2) {
            addCriterion("interview between", value1, value2, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewNotBetween(Integer value1, Integer value2) {
            addCriterion("interview not between", value1, value2, "interview");
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