package com.opms.entity;

import java.util.ArrayList;
import java.util.List;

public class PmsProjectsTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProjectsTestExample() {
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

        public Criteria andTestidIsNull() {
            addCriterion("testid is null");
            return (Criteria) this;
        }

        public Criteria andTestidIsNotNull() {
            addCriterion("testid is not null");
            return (Criteria) this;
        }

        public Criteria andTestidEqualTo(Long value) {
            addCriterion("testid =", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotEqualTo(Long value) {
            addCriterion("testid <>", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThan(Long value) {
            addCriterion("testid >", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThanOrEqualTo(Long value) {
            addCriterion("testid >=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThan(Long value) {
            addCriterion("testid <", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThanOrEqualTo(Long value) {
            addCriterion("testid <=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidIn(List<Long> values) {
            addCriterion("testid in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotIn(List<Long> values) {
            addCriterion("testid not in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidBetween(Long value1, Long value2) {
            addCriterion("testid between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotBetween(Long value1, Long value2) {
            addCriterion("testid not between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskid is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Long value) {
            addCriterion("taskid =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Long value) {
            addCriterion("taskid <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Long value) {
            addCriterion("taskid >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Long value) {
            addCriterion("taskid >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Long value) {
            addCriterion("taskid <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Long value) {
            addCriterion("taskid <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Long> values) {
            addCriterion("taskid in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Long> values) {
            addCriterion("taskid not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Long value1, Long value2) {
            addCriterion("taskid between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Long value1, Long value2) {
            addCriterion("taskid not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andNeedsidIsNull() {
            addCriterion("needsid is null");
            return (Criteria) this;
        }

        public Criteria andNeedsidIsNotNull() {
            addCriterion("needsid is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsidEqualTo(Long value) {
            addCriterion("needsid =", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidNotEqualTo(Long value) {
            addCriterion("needsid <>", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidGreaterThan(Long value) {
            addCriterion("needsid >", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidGreaterThanOrEqualTo(Long value) {
            addCriterion("needsid >=", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidLessThan(Long value) {
            addCriterion("needsid <", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidLessThanOrEqualTo(Long value) {
            addCriterion("needsid <=", value, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidIn(List<Long> values) {
            addCriterion("needsid in", values, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidNotIn(List<Long> values) {
            addCriterion("needsid not in", values, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidBetween(Long value1, Long value2) {
            addCriterion("needsid between", value1, value2, "needsid");
            return (Criteria) this;
        }

        public Criteria andNeedsidNotBetween(Long value1, Long value2) {
            addCriterion("needsid not between", value1, value2, "needsid");
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

        public Criteria andAcceptidIsNull() {
            addCriterion("acceptid is null");
            return (Criteria) this;
        }

        public Criteria andAcceptidIsNotNull() {
            addCriterion("acceptid is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptidEqualTo(Long value) {
            addCriterion("acceptid =", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidNotEqualTo(Long value) {
            addCriterion("acceptid <>", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidGreaterThan(Long value) {
            addCriterion("acceptid >", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidGreaterThanOrEqualTo(Long value) {
            addCriterion("acceptid >=", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidLessThan(Long value) {
            addCriterion("acceptid <", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidLessThanOrEqualTo(Long value) {
            addCriterion("acceptid <=", value, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidIn(List<Long> values) {
            addCriterion("acceptid in", values, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidNotIn(List<Long> values) {
            addCriterion("acceptid not in", values, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidBetween(Long value1, Long value2) {
            addCriterion("acceptid between", value1, value2, "acceptid");
            return (Criteria) this;
        }

        public Criteria andAcceptidNotBetween(Long value1, Long value2) {
            addCriterion("acceptid not between", value1, value2, "acceptid");
            return (Criteria) this;
        }

        public Criteria andCompleteidIsNull() {
            addCriterion("completeid is null");
            return (Criteria) this;
        }

        public Criteria andCompleteidIsNotNull() {
            addCriterion("completeid is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteidEqualTo(Long value) {
            addCriterion("completeid =", value, "completeid");
            return (Criteria) this;
        }

        public Criteria andCompleteidNotEqualTo(Long value) {
            addCriterion("completeid <>", value, "completeid");
            return (Criteria) this;
        }

        public Criteria andCompleteidGreaterThan(Long value) {
            addCriterion("completeid >", value, "completeid");
            return (Criteria) this;
        }

        public Criteria andCompleteidGreaterThanOrEqualTo(Long value) {
            addCriterion("completeid >=", value, "completeid");
            return (Criteria) this;
        }

        public Criteria andCompleteidLessThan(Long value) {
            addCriterion("completeid <", value, "completeid");
            return (Criteria) this;
        }

        public Criteria andCompleteidLessThanOrEqualTo(Long value) {
            addCriterion("completeid <=", value, "completeid");
            return (Criteria) this;
        }

        public Criteria andCompleteidIn(List<Long> values) {
            addCriterion("completeid in", values, "completeid");
            return (Criteria) this;
        }

        public Criteria andCompleteidNotIn(List<Long> values) {
            addCriterion("completeid not in", values, "completeid");
            return (Criteria) this;
        }

        public Criteria andCompleteidBetween(Long value1, Long value2) {
            addCriterion("completeid between", value1, value2, "completeid");
            return (Criteria) this;
        }

        public Criteria andCompleteidNotBetween(Long value1, Long value2) {
            addCriterion("completeid not between", value1, value2, "completeid");
            return (Criteria) this;
        }

        public Criteria andCcidIsNull() {
            addCriterion("ccid is null");
            return (Criteria) this;
        }

        public Criteria andCcidIsNotNull() {
            addCriterion("ccid is not null");
            return (Criteria) this;
        }

        public Criteria andCcidEqualTo(String value) {
            addCriterion("ccid =", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotEqualTo(String value) {
            addCriterion("ccid <>", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThan(String value) {
            addCriterion("ccid >", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThanOrEqualTo(String value) {
            addCriterion("ccid >=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThan(String value) {
            addCriterion("ccid <", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThanOrEqualTo(String value) {
            addCriterion("ccid <=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLike(String value) {
            addCriterion("ccid like", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotLike(String value) {
            addCriterion("ccid not like", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidIn(List<String> values) {
            addCriterion("ccid in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotIn(List<String> values) {
            addCriterion("ccid not in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidBetween(String value1, String value2) {
            addCriterion("ccid between", value1, value2, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotBetween(String value1, String value2) {
            addCriterion("ccid not between", value1, value2, "ccid");
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Boolean value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Boolean value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Boolean value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Boolean value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Boolean> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Boolean> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("os is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("os is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("os =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("os <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("os >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("os >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("os <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("os <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("os like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("os not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("os in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("os not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("os between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("os not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNull() {
            addCriterion("browser is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("browser is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(String value) {
            addCriterion("browser =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(String value) {
            addCriterion("browser <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(String value) {
            addCriterion("browser >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("browser >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(String value) {
            addCriterion("browser <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(String value) {
            addCriterion("browser <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLike(String value) {
            addCriterion("browser like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotLike(String value) {
            addCriterion("browser not like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<String> values) {
            addCriterion("browser in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<String> values) {
            addCriterion("browser not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(String value1, String value2) {
            addCriterion("browser between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(String value1, String value2) {
            addCriterion("browser not between", value1, value2, "browser");
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

        public Criteria andCompletedIsNull() {
            addCriterion("completed is null");
            return (Criteria) this;
        }

        public Criteria andCompletedIsNotNull() {
            addCriterion("completed is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedEqualTo(Integer value) {
            addCriterion("completed =", value, "completed");
            return (Criteria) this;
        }

        public Criteria andCompletedNotEqualTo(Integer value) {
            addCriterion("completed <>", value, "completed");
            return (Criteria) this;
        }

        public Criteria andCompletedGreaterThan(Integer value) {
            addCriterion("completed >", value, "completed");
            return (Criteria) this;
        }

        public Criteria andCompletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("completed >=", value, "completed");
            return (Criteria) this;
        }

        public Criteria andCompletedLessThan(Integer value) {
            addCriterion("completed <", value, "completed");
            return (Criteria) this;
        }

        public Criteria andCompletedLessThanOrEqualTo(Integer value) {
            addCriterion("completed <=", value, "completed");
            return (Criteria) this;
        }

        public Criteria andCompletedIn(List<Integer> values) {
            addCriterion("completed in", values, "completed");
            return (Criteria) this;
        }

        public Criteria andCompletedNotIn(List<Integer> values) {
            addCriterion("completed not in", values, "completed");
            return (Criteria) this;
        }

        public Criteria andCompletedBetween(Integer value1, Integer value2) {
            addCriterion("completed between", value1, value2, "completed");
            return (Criteria) this;
        }

        public Criteria andCompletedNotBetween(Integer value1, Integer value2) {
            addCriterion("completed not between", value1, value2, "completed");
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

        public Criteria andChangedIsNull() {
            addCriterion("changed is null");
            return (Criteria) this;
        }

        public Criteria andChangedIsNotNull() {
            addCriterion("changed is not null");
            return (Criteria) this;
        }

        public Criteria andChangedEqualTo(Integer value) {
            addCriterion("changed =", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotEqualTo(Integer value) {
            addCriterion("changed <>", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedGreaterThan(Integer value) {
            addCriterion("changed >", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedGreaterThanOrEqualTo(Integer value) {
            addCriterion("changed >=", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedLessThan(Integer value) {
            addCriterion("changed <", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedLessThanOrEqualTo(Integer value) {
            addCriterion("changed <=", value, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedIn(List<Integer> values) {
            addCriterion("changed in", values, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotIn(List<Integer> values) {
            addCriterion("changed not in", values, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedBetween(Integer value1, Integer value2) {
            addCriterion("changed between", value1, value2, "changed");
            return (Criteria) this;
        }

        public Criteria andChangedNotBetween(Integer value1, Integer value2) {
            addCriterion("changed not between", value1, value2, "changed");
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