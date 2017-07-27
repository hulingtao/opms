package com.opms.entity;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andStartedEqualTo(Date value) {
            addCriterion("started =", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotEqualTo(Date value) {
            addCriterion("started <>", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedGreaterThan(Date value) {
            addCriterion("started >", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedGreaterThanOrEqualTo(Date value) {
            addCriterion("started >=", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedLessThan(Date value) {
            addCriterion("started <", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedLessThanOrEqualTo(Date value) {
            addCriterion("started <=", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedIn(List<Date> values) {
            addCriterion("started in", values, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotIn(List<Date> values) {
            addCriterion("started not in", values, "started");
            return (Criteria) this;
        }

        public Criteria andStartedBetween(Date value1, Date value2) {
            addCriterion("started between", value1, value2, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotBetween(Date value1, Date value2) {
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

        public Criteria andEndedEqualTo(Date value) {
            addCriterion("ended =", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotEqualTo(Date value) {
            addCriterion("ended <>", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedGreaterThan(Date value) {
            addCriterion("ended >", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedGreaterThanOrEqualTo(Date value) {
            addCriterion("ended >=", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedLessThan(Date value) {
            addCriterion("ended <", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedLessThanOrEqualTo(Date value) {
            addCriterion("ended <=", value, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedIn(List<Date> values) {
            addCriterion("ended in", values, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotIn(List<Date> values) {
            addCriterion("ended not in", values, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedBetween(Date value1, Date value2) {
            addCriterion("ended between", value1, value2, "ended");
            return (Criteria) this;
        }

        public Criteria andEndedNotBetween(Date value1, Date value2) {
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

        public Criteria andLongtimeEqualTo(Integer value) {
            addCriterion("longtime =", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeNotEqualTo(Integer value) {
            addCriterion("longtime <>", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeGreaterThan(Integer value) {
            addCriterion("longtime >", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("longtime >=", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeLessThan(Integer value) {
            addCriterion("longtime <", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeLessThanOrEqualTo(Integer value) {
            addCriterion("longtime <=", value, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeIn(List<Integer> values) {
            addCriterion("longtime in", values, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeNotIn(List<Integer> values) {
            addCriterion("longtime not in", values, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeBetween(Integer value1, Integer value2) {
            addCriterion("longtime between", value1, value2, "longtime");
            return (Criteria) this;
        }

        public Criteria andLongtimeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andHolidayEqualTo(Integer value) {
            addCriterion("holiday =", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotEqualTo(Integer value) {
            addCriterion("holiday <>", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayGreaterThan(Integer value) {
            addCriterion("holiday >", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayGreaterThanOrEqualTo(Integer value) {
            addCriterion("holiday >=", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayLessThan(Integer value) {
            addCriterion("holiday <", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayLessThanOrEqualTo(Integer value) {
            addCriterion("holiday <=", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayIn(List<Integer> values) {
            addCriterion("holiday in", values, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotIn(List<Integer> values) {
            addCriterion("holiday not in", values, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayBetween(Integer value1, Integer value2) {
            addCriterion("holiday between", value1, value2, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotBetween(Integer value1, Integer value2) {
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

        public Criteria andWayEqualTo(Integer value) {
            addCriterion("way =", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotEqualTo(Integer value) {
            addCriterion("way <>", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThan(Integer value) {
            addCriterion("way >", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("way >=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThan(Integer value) {
            addCriterion("way <", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThanOrEqualTo(Integer value) {
            addCriterion("way <=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayIn(List<Integer> values) {
            addCriterion("way in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotIn(List<Integer> values) {
            addCriterion("way not in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayBetween(Integer value1, Integer value2) {
            addCriterion("way between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotBetween(Integer value1, Integer value2) {
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

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
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