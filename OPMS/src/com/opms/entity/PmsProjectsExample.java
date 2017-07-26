package com.opms.entity;

import java.util.ArrayList;
import java.util.List;

public class PmsProjectsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProjectsExample() {
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

        public Criteria andProjectidIsNull() {
            addCriterion("projectid is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Long value) {
            addCriterion("projectid =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Long value) {
            addCriterion("projectid <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Long value) {
            addCriterion("projectid >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Long value) {
            addCriterion("projectid >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Long value) {
            addCriterion("projectid <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Long value) {
            addCriterion("projectid <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Long> values) {
            addCriterion("projectid in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Long> values) {
            addCriterion("projectid not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Long value1, Long value2) {
            addCriterion("projectid between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Long value1, Long value2) {
            addCriterion("projectid not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAliasnameIsNull() {
            addCriterion("aliasname is null");
            return (Criteria) this;
        }

        public Criteria andAliasnameIsNotNull() {
            addCriterion("aliasname is not null");
            return (Criteria) this;
        }

        public Criteria andAliasnameEqualTo(String value) {
            addCriterion("aliasname =", value, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameNotEqualTo(String value) {
            addCriterion("aliasname <>", value, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameGreaterThan(String value) {
            addCriterion("aliasname >", value, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameGreaterThanOrEqualTo(String value) {
            addCriterion("aliasname >=", value, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameLessThan(String value) {
            addCriterion("aliasname <", value, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameLessThanOrEqualTo(String value) {
            addCriterion("aliasname <=", value, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameLike(String value) {
            addCriterion("aliasname like", value, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameNotLike(String value) {
            addCriterion("aliasname not like", value, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameIn(List<String> values) {
            addCriterion("aliasname in", values, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameNotIn(List<String> values) {
            addCriterion("aliasname not in", values, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameBetween(String value1, String value2) {
            addCriterion("aliasname between", value1, value2, "aliasname");
            return (Criteria) this;
        }

        public Criteria andAliasnameNotBetween(String value1, String value2) {
            addCriterion("aliasname not between", value1, value2, "aliasname");
            return (Criteria) this;
        }

        public Criteria andStartedIsNull() {
            addCriterion("started is null");
            return (Criteria) this;
        }

        public Criteria andStartedIsNotNull() {
            addCriterion("started is not null");
            return (Criteria) this;
        }

        public Criteria andStartedEqualTo(Integer value) {
            addCriterion("started =", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotEqualTo(Integer value) {
            addCriterion("started <>", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedGreaterThan(Integer value) {
            addCriterion("started >", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedGreaterThanOrEqualTo(Integer value) {
            addCriterion("started >=", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedLessThan(Integer value) {
            addCriterion("started <", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedLessThanOrEqualTo(Integer value) {
            addCriterion("started <=", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedIn(List<Integer> values) {
            addCriterion("started in", values, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotIn(List<Integer> values) {
            addCriterion("started not in", values, "started");
            return (Criteria) this;
        }

        public Criteria andStartedBetween(Integer value1, Integer value2) {
            addCriterion("started between", value1, value2, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotBetween(Integer value1, Integer value2) {
            addCriterion("started not between", value1, value2, "started");
            return (Criteria) this;
        }

        public Criteria andEndedIsNull() {
            addCriterion("ended is null");
            return (Criteria) this;
        }

        public Criteria andEndedIsNotNull() {
            addCriterion("ended is not null");
            return (Criteria) this;
        }

        public Criteria andEndedEqualTo(Integer value) {
            addCriterion("ended =", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotEqualTo(Integer value) {
            addCriterion("ended <>", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedGreaterThan(Integer value) {
            addCriterion("ended >", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedGreaterThanOrEqualTo(Integer value) {
            addCriterion("ended >=", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedLessThan(Integer value) {
            addCriterion("ended <", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedLessThanOrEqualTo(Integer value) {
            addCriterion("ended <=", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedIn(List<Integer> values) {
            addCriterion("ended in", values, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotIn(List<Integer> values) {
            addCriterion("ended not in", values, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedBetween(Integer value1, Integer value2) {
            addCriterion("ended between", value1, value2, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotBetween(Integer value1, Integer value2) {
            addCriterion("ended not between", value1, value2, "ended");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Integer value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Integer value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Integer value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Integer value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Integer> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Integer> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Integer value1, Integer value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("created not between", value1, value2, "created");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProjuseridIsNull() {
            addCriterion("projuserid is null");
            return (Criteria) this;
        }

        public Criteria andProjuseridIsNotNull() {
            addCriterion("projuserid is not null");
            return (Criteria) this;
        }

        public Criteria andProjuseridEqualTo(Long value) {
            addCriterion("projuserid =", value, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProjuseridNotEqualTo(Long value) {
            addCriterion("projuserid <>", value, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProjuseridGreaterThan(Long value) {
            addCriterion("projuserid >", value, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProjuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("projuserid >=", value, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProjuseridLessThan(Long value) {
            addCriterion("projuserid <", value, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProjuseridLessThanOrEqualTo(Long value) {
            addCriterion("projuserid <=", value, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProjuseridIn(List<Long> values) {
            addCriterion("projuserid in", values, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProjuseridNotIn(List<Long> values) {
            addCriterion("projuserid not in", values, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProjuseridBetween(Long value1, Long value2) {
            addCriterion("projuserid between", value1, value2, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProjuseridNotBetween(Long value1, Long value2) {
            addCriterion("projuserid not between", value1, value2, "projuserid");
            return (Criteria) this;
        }

        public Criteria andProduseridIsNull() {
            addCriterion("produserid is null");
            return (Criteria) this;
        }

        public Criteria andProduseridIsNotNull() {
            addCriterion("produserid is not null");
            return (Criteria) this;
        }

        public Criteria andProduseridEqualTo(Long value) {
            addCriterion("produserid =", value, "produserid");
            return (Criteria) this;
        }

        public Criteria andProduseridNotEqualTo(Long value) {
            addCriterion("produserid <>", value, "produserid");
            return (Criteria) this;
        }

        public Criteria andProduseridGreaterThan(Long value) {
            addCriterion("produserid >", value, "produserid");
            return (Criteria) this;
        }

        public Criteria andProduseridGreaterThanOrEqualTo(Long value) {
            addCriterion("produserid >=", value, "produserid");
            return (Criteria) this;
        }

        public Criteria andProduseridLessThan(Long value) {
            addCriterion("produserid <", value, "produserid");
            return (Criteria) this;
        }

        public Criteria andProduseridLessThanOrEqualTo(Long value) {
            addCriterion("produserid <=", value, "produserid");
            return (Criteria) this;
        }

        public Criteria andProduseridIn(List<Long> values) {
            addCriterion("produserid in", values, "produserid");
            return (Criteria) this;
        }

        public Criteria andProduseridNotIn(List<Long> values) {
            addCriterion("produserid not in", values, "produserid");
            return (Criteria) this;
        }

        public Criteria andProduseridBetween(Long value1, Long value2) {
            addCriterion("produserid between", value1, value2, "produserid");
            return (Criteria) this;
        }

        public Criteria andProduseridNotBetween(Long value1, Long value2) {
            addCriterion("produserid not between", value1, value2, "produserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridIsNull() {
            addCriterion("testuserid is null");
            return (Criteria) this;
        }

        public Criteria andTestuseridIsNotNull() {
            addCriterion("testuserid is not null");
            return (Criteria) this;
        }

        public Criteria andTestuseridEqualTo(Long value) {
            addCriterion("testuserid =", value, "testuserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridNotEqualTo(Long value) {
            addCriterion("testuserid <>", value, "testuserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridGreaterThan(Long value) {
            addCriterion("testuserid >", value, "testuserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("testuserid >=", value, "testuserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridLessThan(Long value) {
            addCriterion("testuserid <", value, "testuserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridLessThanOrEqualTo(Long value) {
            addCriterion("testuserid <=", value, "testuserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridIn(List<Long> values) {
            addCriterion("testuserid in", values, "testuserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridNotIn(List<Long> values) {
            addCriterion("testuserid not in", values, "testuserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridBetween(Long value1, Long value2) {
            addCriterion("testuserid between", value1, value2, "testuserid");
            return (Criteria) this;
        }

        public Criteria andTestuseridNotBetween(Long value1, Long value2) {
            addCriterion("testuserid not between", value1, value2, "testuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridIsNull() {
            addCriterion("publuserid is null");
            return (Criteria) this;
        }

        public Criteria andPubluseridIsNotNull() {
            addCriterion("publuserid is not null");
            return (Criteria) this;
        }

        public Criteria andPubluseridEqualTo(Long value) {
            addCriterion("publuserid =", value, "publuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridNotEqualTo(Long value) {
            addCriterion("publuserid <>", value, "publuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridGreaterThan(Long value) {
            addCriterion("publuserid >", value, "publuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridGreaterThanOrEqualTo(Long value) {
            addCriterion("publuserid >=", value, "publuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridLessThan(Long value) {
            addCriterion("publuserid <", value, "publuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridLessThanOrEqualTo(Long value) {
            addCriterion("publuserid <=", value, "publuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridIn(List<Long> values) {
            addCriterion("publuserid in", values, "publuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridNotIn(List<Long> values) {
            addCriterion("publuserid not in", values, "publuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridBetween(Long value1, Long value2) {
            addCriterion("publuserid between", value1, value2, "publuserid");
            return (Criteria) this;
        }

        public Criteria andPubluseridNotBetween(Long value1, Long value2) {
            addCriterion("publuserid not between", value1, value2, "publuserid");
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