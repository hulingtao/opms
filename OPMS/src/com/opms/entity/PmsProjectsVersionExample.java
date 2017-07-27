package com.opms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsProjectsVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProjectsVersionExample() {
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

        public Criteria andVersionidIsNull() {
            addCriterion("versionid is null");
            return (Criteria) this;
        }

        public Criteria andVersionidIsNotNull() {
            addCriterion("versionid is not null");
            return (Criteria) this;
        }

        public Criteria andVersionidEqualTo(Long value) {
            addCriterion("versionid =", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotEqualTo(Long value) {
            addCriterion("versionid <>", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidGreaterThan(Long value) {
            addCriterion("versionid >", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidGreaterThanOrEqualTo(Long value) {
            addCriterion("versionid >=", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidLessThan(Long value) {
            addCriterion("versionid <", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidLessThanOrEqualTo(Long value) {
            addCriterion("versionid <=", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidIn(List<Long> values) {
            addCriterion("versionid in", values, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotIn(List<Long> values) {
            addCriterion("versionid not in", values, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidBetween(Long value1, Long value2) {
            addCriterion("versionid between", value1, value2, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotBetween(Long value1, Long value2) {
            addCriterion("versionid not between", value1, value2, "versionid");
            return (Criteria) this;
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andVersionedIsNull() {
            addCriterion("versioned is null");
            return (Criteria) this;
        }

        public Criteria andVersionedIsNotNull() {
            addCriterion("versioned is not null");
            return (Criteria) this;
        }

        public Criteria andVersionedEqualTo(Integer value) {
            addCriterion("versioned =", value, "versioned");
            return (Criteria) this;
        }

        public Criteria andVersionedNotEqualTo(Integer value) {
            addCriterion("versioned <>", value, "versioned");
            return (Criteria) this;
        }

        public Criteria andVersionedGreaterThan(Integer value) {
            addCriterion("versioned >", value, "versioned");
            return (Criteria) this;
        }

        public Criteria andVersionedGreaterThanOrEqualTo(Integer value) {
            addCriterion("versioned >=", value, "versioned");
            return (Criteria) this;
        }

        public Criteria andVersionedLessThan(Integer value) {
            addCriterion("versioned <", value, "versioned");
            return (Criteria) this;
        }

        public Criteria andVersionedLessThanOrEqualTo(Integer value) {
            addCriterion("versioned <=", value, "versioned");
            return (Criteria) this;
        }

        public Criteria andVersionedIn(List<Integer> values) {
            addCriterion("versioned in", values, "versioned");
            return (Criteria) this;
        }

        public Criteria andVersionedNotIn(List<Integer> values) {
            addCriterion("versioned not in", values, "versioned");
            return (Criteria) this;
        }

        public Criteria andVersionedBetween(Integer value1, Integer value2) {
            addCriterion("versioned between", value1, value2, "versioned");
            return (Criteria) this;
        }

        public Criteria andVersionedNotBetween(Integer value1, Integer value2) {
            addCriterion("versioned not between", value1, value2, "versioned");
            return (Criteria) this;
        }

        public Criteria andSourceurlIsNull() {
            addCriterion("sourceurl is null");
            return (Criteria) this;
        }

        public Criteria andSourceurlIsNotNull() {
            addCriterion("sourceurl is not null");
            return (Criteria) this;
        }

        public Criteria andSourceurlEqualTo(String value) {
            addCriterion("sourceurl =", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlNotEqualTo(String value) {
            addCriterion("sourceurl <>", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlGreaterThan(String value) {
            addCriterion("sourceurl >", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlGreaterThanOrEqualTo(String value) {
            addCriterion("sourceurl >=", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlLessThan(String value) {
            addCriterion("sourceurl <", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlLessThanOrEqualTo(String value) {
            addCriterion("sourceurl <=", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlLike(String value) {
            addCriterion("sourceurl like", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlNotLike(String value) {
            addCriterion("sourceurl not like", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlIn(List<String> values) {
            addCriterion("sourceurl in", values, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlNotIn(List<String> values) {
            addCriterion("sourceurl not in", values, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlBetween(String value1, String value2) {
            addCriterion("sourceurl between", value1, value2, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlNotBetween(String value1, String value2) {
            addCriterion("sourceurl not between", value1, value2, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andDownurlIsNull() {
            addCriterion("downurl is null");
            return (Criteria) this;
        }

        public Criteria andDownurlIsNotNull() {
            addCriterion("downurl is not null");
            return (Criteria) this;
        }

        public Criteria andDownurlEqualTo(String value) {
            addCriterion("downurl =", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlNotEqualTo(String value) {
            addCriterion("downurl <>", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlGreaterThan(String value) {
            addCriterion("downurl >", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlGreaterThanOrEqualTo(String value) {
            addCriterion("downurl >=", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlLessThan(String value) {
            addCriterion("downurl <", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlLessThanOrEqualTo(String value) {
            addCriterion("downurl <=", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlLike(String value) {
            addCriterion("downurl like", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlNotLike(String value) {
            addCriterion("downurl not like", value, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlIn(List<String> values) {
            addCriterion("downurl in", values, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlNotIn(List<String> values) {
            addCriterion("downurl not in", values, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlBetween(String value1, String value2) {
            addCriterion("downurl between", value1, value2, "downurl");
            return (Criteria) this;
        }

        public Criteria andDownurlNotBetween(String value1, String value2) {
            addCriterion("downurl not between", value1, value2, "downurl");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("attachment is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("attachment =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("attachment <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("attachment >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("attachment >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("attachment <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("attachment <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("attachment like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("attachment not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("attachment in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("attachment not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("attachment not between", value1, value2, "attachment");
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

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andChangedIsNull() {
            addCriterion("changed is null");
            return (Criteria) this;
        }

        public Criteria andChangedIsNotNull() {
            addCriterion("changed is not null");
            return (Criteria) this;
        }

        public Criteria andChangedEqualTo(Date value) {
            addCriterion("changed =", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotEqualTo(Date value) {
            addCriterion("changed <>", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedGreaterThan(Date value) {
            addCriterion("changed >", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedGreaterThanOrEqualTo(Date value) {
            addCriterion("changed >=", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedLessThan(Date value) {
            addCriterion("changed <", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedLessThanOrEqualTo(Date value) {
            addCriterion("changed <=", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedIn(List<Date> values) {
            addCriterion("changed in", values, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotIn(List<Date> values) {
            addCriterion("changed not in", values, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedBetween(Date value1, Date value2) {
            addCriterion("changed between", value1, value2, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotBetween(Date value1, Date value2) {
            addCriterion("changed not between", value1, value2, "changed");
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