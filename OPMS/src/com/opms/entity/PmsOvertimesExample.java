package com.opms.entity;

import java.util.ArrayList;
import java.util.List;

public class PmsOvertimesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsOvertimesExample() {
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

        public Criteria andOvertimeidIsNull() {
            addCriterion("overtimeid is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeidIsNotNull() {
            addCriterion("overtimeid is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeidEqualTo(Long value) {
            addCriterion("overtimeid =", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidNotEqualTo(Long value) {
            addCriterion("overtimeid <>", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidGreaterThan(Long value) {
            addCriterion("overtimeid >", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidGreaterThanOrEqualTo(Long value) {
            addCriterion("overtimeid >=", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidLessThan(Long value) {
            addCriterion("overtimeid <", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidLessThanOrEqualTo(Long value) {
            addCriterion("overtimeid <=", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidIn(List<Long> values) {
            addCriterion("overtimeid in", values, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidNotIn(List<Long> values) {
            addCriterion("overtimeid not in", values, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidBetween(Long value1, Long value2) {
            addCriterion("overtimeid between", value1, value2, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidNotBetween(Long value1, Long value2) {
            addCriterion("overtimeid not between", value1, value2, "overtimeid");
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

        public Criteria andLongtimeIsNull() {
            addCriterion("longtime is null");
            return (Criteria) this;
        }

        public Criteria andLongtimeIsNotNull() {
            addCriterion("longtime is not null");
            return (Criteria) this;
        }

        public Criteria andLongtimeEqualTo(Byte value) {
            addCriterion("longtime =", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeNotEqualTo(Byte value) {
            addCriterion("longtime <>", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeGreaterThan(Byte value) {
            addCriterion("longtime >", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeGreaterThanOrEqualTo(Byte value) {
            addCriterion("longtime >=", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeLessThan(Byte value) {
            addCriterion("longtime <", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeLessThanOrEqualTo(Byte value) {
            addCriterion("longtime <=", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeIn(List<Byte> values) {
            addCriterion("longtime in", values, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeNotIn(List<Byte> values) {
            addCriterion("longtime not in", values, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeBetween(Byte value1, Byte value2) {
            addCriterion("longtime between", value1, value2, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeNotBetween(Byte value1, Byte value2) {
            addCriterion("longtime not between", value1, value2, "longtime");
            return (Criteria) this;
        }

        public Criteria andHolidayIsNull() {
            addCriterion("holiday is null");
            return (Criteria) this;
        }

        public Criteria andHolidayIsNotNull() {
            addCriterion("holiday is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayEqualTo(Boolean value) {
            addCriterion("holiday =", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotEqualTo(Boolean value) {
            addCriterion("holiday <>", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayGreaterThan(Boolean value) {
            addCriterion("holiday >", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("holiday >=", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayLessThan(Boolean value) {
            addCriterion("holiday <", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayLessThanOrEqualTo(Boolean value) {
            addCriterion("holiday <=", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayIn(List<Boolean> values) {
            addCriterion("holiday in", values, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotIn(List<Boolean> values) {
            addCriterion("holiday not in", values, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayBetween(Boolean value1, Boolean value2) {
            addCriterion("holiday between", value1, value2, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("holiday not between", value1, value2, "holiday");
            return (Criteria) this;
        }

        public Criteria andWayIsNull() {
            addCriterion("way is null");
            return (Criteria) this;
        }

        public Criteria andWayIsNotNull() {
            addCriterion("way is not null");
            return (Criteria) this;
        }

        public Criteria andWayEqualTo(Boolean value) {
            addCriterion("way =", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotEqualTo(Boolean value) {
            addCriterion("way <>", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThan(Boolean value) {
            addCriterion("way >", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("way >=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThan(Boolean value) {
            addCriterion("way <", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThanOrEqualTo(Boolean value) {
            addCriterion("way <=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayIn(List<Boolean> values) {
            addCriterion("way in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotIn(List<Boolean> values) {
            addCriterion("way not in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayBetween(Boolean value1, Boolean value2) {
            addCriterion("way between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("way not between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Boolean value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Boolean value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Boolean value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Boolean value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Boolean value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Boolean> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Boolean> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Boolean value1, Boolean value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("result not between", value1, value2, "result");
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

        public Criteria andApproveridsIsNull() {
            addCriterion("approverids is null");
            return (Criteria) this;
        }

        public Criteria andApproveridsIsNotNull() {
            addCriterion("approverids is not null");
            return (Criteria) this;
        }

        public Criteria andApproveridsEqualTo(String value) {
            addCriterion("approverids =", value, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsNotEqualTo(String value) {
            addCriterion("approverids <>", value, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsGreaterThan(String value) {
            addCriterion("approverids >", value, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsGreaterThanOrEqualTo(String value) {
            addCriterion("approverids >=", value, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsLessThan(String value) {
            addCriterion("approverids <", value, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsLessThanOrEqualTo(String value) {
            addCriterion("approverids <=", value, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsLike(String value) {
            addCriterion("approverids like", value, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsNotLike(String value) {
            addCriterion("approverids not like", value, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsIn(List<String> values) {
            addCriterion("approverids in", values, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsNotIn(List<String> values) {
            addCriterion("approverids not in", values, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsBetween(String value1, String value2) {
            addCriterion("approverids between", value1, value2, "approverids");
            return (Criteria) this;
        }

        public Criteria andApproveridsNotBetween(String value1, String value2) {
            addCriterion("approverids not between", value1, value2, "approverids");
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