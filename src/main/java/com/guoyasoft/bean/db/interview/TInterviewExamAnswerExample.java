package com.guoyasoft.bean.db.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TInterviewExamAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInterviewExamAnswerExample() {
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

        public Criteria andAnswerIdIsNull() {
            addCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(Integer value) {
            addCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(Integer value) {
            addCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(Integer value) {
            addCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(Integer value) {
            addCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<Integer> values) {
            addCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<Integer> values) {
            addCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_id not between", value1, value2, "answerId");
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

        public Criteria andAuthorCstIdIsNull() {
            addCriterion("author_cst_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdIsNotNull() {
            addCriterion("author_cst_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdEqualTo(Integer value) {
            addCriterion("author_cst_id =", value, "authorCstId");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdNotEqualTo(Integer value) {
            addCriterion("author_cst_id <>", value, "authorCstId");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdGreaterThan(Integer value) {
            addCriterion("author_cst_id >", value, "authorCstId");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_cst_id >=", value, "authorCstId");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdLessThan(Integer value) {
            addCriterion("author_cst_id <", value, "authorCstId");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_cst_id <=", value, "authorCstId");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdIn(List<Integer> values) {
            addCriterion("author_cst_id in", values, "authorCstId");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdNotIn(List<Integer> values) {
            addCriterion("author_cst_id not in", values, "authorCstId");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdBetween(Integer value1, Integer value2) {
            addCriterion("author_cst_id between", value1, value2, "authorCstId");
            return (Criteria) this;
        }

        public Criteria andAuthorCstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_cst_id not between", value1, value2, "authorCstId");
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

        public Criteria andPraiseCountIsNull() {
            addCriterion("praise_count is null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIsNotNull() {
            addCriterion("praise_count is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountEqualTo(Integer value) {
            addCriterion("praise_count =", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotEqualTo(Integer value) {
            addCriterion("praise_count <>", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThan(Integer value) {
            addCriterion("praise_count >", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("praise_count >=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThan(Integer value) {
            addCriterion("praise_count <", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThanOrEqualTo(Integer value) {
            addCriterion("praise_count <=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIn(List<Integer> values) {
            addCriterion("praise_count in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotIn(List<Integer> values) {
            addCriterion("praise_count not in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountBetween(Integer value1, Integer value2) {
            addCriterion("praise_count between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("praise_count not between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexIsNull() {
            addCriterion("subject_index is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexIsNotNull() {
            addCriterion("subject_index is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexEqualTo(String value) {
            addCriterion("subject_index =", value, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexNotEqualTo(String value) {
            addCriterion("subject_index <>", value, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexGreaterThan(String value) {
            addCriterion("subject_index >", value, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexGreaterThanOrEqualTo(String value) {
            addCriterion("subject_index >=", value, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexLessThan(String value) {
            addCriterion("subject_index <", value, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexLessThanOrEqualTo(String value) {
            addCriterion("subject_index <=", value, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexLike(String value) {
            addCriterion("subject_index like", value, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexNotLike(String value) {
            addCriterion("subject_index not like", value, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexIn(List<String> values) {
            addCriterion("subject_index in", values, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexNotIn(List<String> values) {
            addCriterion("subject_index not in", values, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexBetween(String value1, String value2) {
            addCriterion("subject_index between", value1, value2, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectIndexNotBetween(String value1, String value2) {
            addCriterion("subject_index not between", value1, value2, "subjectIndex");
            return (Criteria) this;
        }

        public Criteria andSubjectDescIsNull() {
            addCriterion("subject_desc is null");
            return (Criteria) this;
        }

        public Criteria andSubjectDescIsNotNull() {
            addCriterion("subject_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectDescEqualTo(String value) {
            addCriterion("subject_desc =", value, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescNotEqualTo(String value) {
            addCriterion("subject_desc <>", value, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescGreaterThan(String value) {
            addCriterion("subject_desc >", value, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescGreaterThanOrEqualTo(String value) {
            addCriterion("subject_desc >=", value, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescLessThan(String value) {
            addCriterion("subject_desc <", value, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescLessThanOrEqualTo(String value) {
            addCriterion("subject_desc <=", value, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescLike(String value) {
            addCriterion("subject_desc like", value, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescNotLike(String value) {
            addCriterion("subject_desc not like", value, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescIn(List<String> values) {
            addCriterion("subject_desc in", values, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescNotIn(List<String> values) {
            addCriterion("subject_desc not in", values, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescBetween(String value1, String value2) {
            addCriterion("subject_desc between", value1, value2, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andSubjectDescNotBetween(String value1, String value2) {
            addCriterion("subject_desc not between", value1, value2, "subjectDesc");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
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