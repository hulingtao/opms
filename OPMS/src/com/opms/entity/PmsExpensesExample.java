package com.opms.entity;

import java.util.ArrayList;
import java.util.List;

public class PmsExpensesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsExpensesExample() {
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

        public Criteria andExpenseidIsNull() {
            addCriterion("expenseid is null");
            return (Criteria) this;
        }

        public Criteria andExpenseidIsNotNull() {
            addCriterion("expenseid is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseidEqualTo(Long value) {
            addCriterion("expenseid =", value, "expenseid");
            return (Criteria) this;
        }

        public Criteria andExpenseidNotEqualTo(Long value) {
            addCriterion("expenseid <>", value, "expenseid");
            return (Criteria) this;
        }

        public Criteria andExpenseidGreaterThan(Long value) {
            addCriterion("expenseid >", value, "expenseid");
            return (Criteria) this;
        }

        public Criteria andExpenseidGreaterThanOrEqualTo(Long value) {
            addCriterion("expenseid >=", value, "expenseid");
            return (Criteria) this;
        }

        public Criteria andExpenseidLessThan(Long value) {
            addCriterion("expenseid <", value, "expenseid");
            return (Criteria) this;
        }

        public Criteria andExpenseidLessThanOrEqualTo(Long value) {
            addCriterion("expenseid <=", value, "expenseid");
            return (Criteria) this;
        }

        public Criteria andExpenseidIn(List<Long> values) {
            addCriterion("expenseid in", values, "expenseid");
            return (Criteria) this;
        }

        public Criteria andExpenseidNotIn(List<Long> values) {
            addCriterion("expenseid not in", values, "expenseid");
            return (Criteria) this;
        }

        public Criteria andExpenseidBetween(Long value1, Long value2) {
            addCriterion("expenseid between", value1, value2, "expenseid");
            return (Criteria) this;
        }

        public Criteria andExpenseidNotBetween(Long value1, Long value2) {
            addCriterion("expenseid not between", value1, value2, "expenseid");
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

        public Criteria andAmountsIsNull() {
            addCriterion("amounts is null");
            return (Criteria) this;
        }

        public Criteria andAmountsIsNotNull() {
            addCriterion("amounts is not null");
            return (Criteria) this;
        }

        public Criteria andAmountsEqualTo(String value) {
            addCriterion("amounts =", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsNotEqualTo(String value) {
            addCriterion("amounts <>", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsGreaterThan(String value) {
            addCriterion("amounts >", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsGreaterThanOrEqualTo(String value) {
            addCriterion("amounts >=", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsLessThan(String value) {
            addCriterion("amounts <", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsLessThanOrEqualTo(String value) {
            addCriterion("amounts <=", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsLike(String value) {
            addCriterion("amounts like", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsNotLike(String value) {
            addCriterion("amounts not like", value, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsIn(List<String> values) {
            addCriterion("amounts in", values, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsNotIn(List<String> values) {
            addCriterion("amounts not in", values, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsBetween(String value1, String value2) {
            addCriterion("amounts between", value1, value2, "amounts");
            return (Criteria) this;
        }

        public Criteria andAmountsNotBetween(String value1, String value2) {
            addCriterion("amounts not between", value1, value2, "amounts");
            return (Criteria) this;
        }

        public Criteria andTypesIsNull() {
            addCriterion("types is null");
            return (Criteria) this;
        }

        public Criteria andTypesIsNotNull() {
            addCriterion("types is not null");
            return (Criteria) this;
        }

        public Criteria andTypesEqualTo(String value) {
            addCriterion("types =", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotEqualTo(String value) {
            addCriterion("types <>", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThan(String value) {
            addCriterion("types >", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThanOrEqualTo(String value) {
            addCriterion("types >=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThan(String value) {
            addCriterion("types <", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThanOrEqualTo(String value) {
            addCriterion("types <=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLike(String value) {
            addCriterion("types like", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotLike(String value) {
            addCriterion("types not like", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesIn(List<String> values) {
            addCriterion("types in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotIn(List<String> values) {
            addCriterion("types not in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesBetween(String value1, String value2) {
            addCriterion("types between", value1, value2, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotBetween(String value1, String value2) {
            addCriterion("types not between", value1, value2, "types");
            return (Criteria) this;
        }

        public Criteria andContentsIsNull() {
            addCriterion("contents is null");
            return (Criteria) this;
        }

        public Criteria andContentsIsNotNull() {
            addCriterion("contents is not null");
            return (Criteria) this;
        }

        public Criteria andContentsEqualTo(String value) {
            addCriterion("contents =", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotEqualTo(String value) {
            addCriterion("contents <>", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThan(String value) {
            addCriterion("contents >", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThanOrEqualTo(String value) {
            addCriterion("contents >=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThan(String value) {
            addCriterion("contents <", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThanOrEqualTo(String value) {
            addCriterion("contents <=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLike(String value) {
            addCriterion("contents like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotLike(String value) {
            addCriterion("contents not like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsIn(List<String> values) {
            addCriterion("contents in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotIn(List<String> values) {
            addCriterion("contents not in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsBetween(String value1, String value2) {
            addCriterion("contents between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotBetween(String value1, String value2) {
            addCriterion("contents not between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(String value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(String value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(String value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(String value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(String value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(String value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLike(String value) {
            addCriterion("total like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotLike(String value) {
            addCriterion("total not like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<String> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<String> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(String value1, String value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(String value1, String value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
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