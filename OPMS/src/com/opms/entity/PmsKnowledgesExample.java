package com.opms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsKnowledgesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsKnowledgesExample() {
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

        public Criteria andKnowidIsNull() {
            addCriterion("knowid is null");
            return (Criteria) this;
        }

        public Criteria andKnowidIsNotNull() {
            addCriterion("knowid is not null");
            return (Criteria) this;
        }

        public Criteria andKnowidEqualTo(Long value) {
            addCriterion("knowid =", value, "knowid");
            return (Criteria) this;
        }

        public Criteria andKnowidNotEqualTo(Long value) {
            addCriterion("knowid <>", value, "knowid");
            return (Criteria) this;
        }

        public Criteria andKnowidGreaterThan(Long value) {
            addCriterion("knowid >", value, "knowid");
            return (Criteria) this;
        }

        public Criteria andKnowidGreaterThanOrEqualTo(Long value) {
            addCriterion("knowid >=", value, "knowid");
            return (Criteria) this;
        }

        public Criteria andKnowidLessThan(Long value) {
            addCriterion("knowid <", value, "knowid");
            return (Criteria) this;
        }

        public Criteria andKnowidLessThanOrEqualTo(Long value) {
            addCriterion("knowid <=", value, "knowid");
            return (Criteria) this;
        }

        public Criteria andKnowidIn(List<Long> values) {
            addCriterion("knowid in", values, "knowid");
            return (Criteria) this;
        }

        public Criteria andKnowidNotIn(List<Long> values) {
            addCriterion("knowid not in", values, "knowid");
            return (Criteria) this;
        }

        public Criteria andKnowidBetween(Long value1, Long value2) {
            addCriterion("knowid between", value1, value2, "knowid");
            return (Criteria) this;
        }

        public Criteria andKnowidNotBetween(Long value1, Long value2) {
            addCriterion("knowid not between", value1, value2, "knowid");
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

        public Criteria andSortidIsNull() {
            addCriterion("sortid is null");
            return (Criteria) this;
        }

        public Criteria andSortidIsNotNull() {
            addCriterion("sortid is not null");
            return (Criteria) this;
        }

        public Criteria andSortidEqualTo(Long value) {
            addCriterion("sortid =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(Long value) {
            addCriterion("sortid <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(Long value) {
            addCriterion("sortid >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(Long value) {
            addCriterion("sortid >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(Long value) {
            addCriterion("sortid <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(Long value) {
            addCriterion("sortid <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<Long> values) {
            addCriterion("sortid in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<Long> values) {
            addCriterion("sortid not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(Long value1, Long value2) {
            addCriterion("sortid between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(Long value1, Long value2) {
            addCriterion("sortid not between", value1, value2, "sortid");
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

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andViewnumIsNull() {
            addCriterion("viewnum is null");
            return (Criteria) this;
        }

        public Criteria andViewnumIsNotNull() {
            addCriterion("viewnum is not null");
            return (Criteria) this;
        }

        public Criteria andViewnumEqualTo(Integer value) {
            addCriterion("viewnum =", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumNotEqualTo(Integer value) {
            addCriterion("viewnum <>", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumGreaterThan(Integer value) {
            addCriterion("viewnum >", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewnum >=", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumLessThan(Integer value) {
            addCriterion("viewnum <", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumLessThanOrEqualTo(Integer value) {
            addCriterion("viewnum <=", value, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumIn(List<Integer> values) {
            addCriterion("viewnum in", values, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumNotIn(List<Integer> values) {
            addCriterion("viewnum not in", values, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumBetween(Integer value1, Integer value2) {
            addCriterion("viewnum between", value1, value2, "viewnum");
            return (Criteria) this;
        }

        public Criteria andViewnumNotBetween(Integer value1, Integer value2) {
            addCriterion("viewnum not between", value1, value2, "viewnum");
            return (Criteria) this;
        }

        public Criteria andComtnumIsNull() {
            addCriterion("comtnum is null");
            return (Criteria) this;
        }

        public Criteria andComtnumIsNotNull() {
            addCriterion("comtnum is not null");
            return (Criteria) this;
        }

        public Criteria andComtnumEqualTo(Integer value) {
            addCriterion("comtnum =", value, "comtnum");
            return (Criteria) this;
        }

        public Criteria andComtnumNotEqualTo(Integer value) {
            addCriterion("comtnum <>", value, "comtnum");
            return (Criteria) this;
        }

        public Criteria andComtnumGreaterThan(Integer value) {
            addCriterion("comtnum >", value, "comtnum");
            return (Criteria) this;
        }

        public Criteria andComtnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comtnum >=", value, "comtnum");
            return (Criteria) this;
        }

        public Criteria andComtnumLessThan(Integer value) {
            addCriterion("comtnum <", value, "comtnum");
            return (Criteria) this;
        }

        public Criteria andComtnumLessThanOrEqualTo(Integer value) {
            addCriterion("comtnum <=", value, "comtnum");
            return (Criteria) this;
        }

        public Criteria andComtnumIn(List<Integer> values) {
            addCriterion("comtnum in", values, "comtnum");
            return (Criteria) this;
        }

        public Criteria andComtnumNotIn(List<Integer> values) {
            addCriterion("comtnum not in", values, "comtnum");
            return (Criteria) this;
        }

        public Criteria andComtnumBetween(Integer value1, Integer value2) {
            addCriterion("comtnum between", value1, value2, "comtnum");
            return (Criteria) this;
        }

        public Criteria andComtnumNotBetween(Integer value1, Integer value2) {
            addCriterion("comtnum not between", value1, value2, "comtnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumIsNull() {
            addCriterion("laudnum is null");
            return (Criteria) this;
        }

        public Criteria andLaudnumIsNotNull() {
            addCriterion("laudnum is not null");
            return (Criteria) this;
        }

        public Criteria andLaudnumEqualTo(Integer value) {
            addCriterion("laudnum =", value, "laudnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumNotEqualTo(Integer value) {
            addCriterion("laudnum <>", value, "laudnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumGreaterThan(Integer value) {
            addCriterion("laudnum >", value, "laudnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("laudnum >=", value, "laudnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumLessThan(Integer value) {
            addCriterion("laudnum <", value, "laudnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumLessThanOrEqualTo(Integer value) {
            addCriterion("laudnum <=", value, "laudnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumIn(List<Integer> values) {
            addCriterion("laudnum in", values, "laudnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumNotIn(List<Integer> values) {
            addCriterion("laudnum not in", values, "laudnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumBetween(Integer value1, Integer value2) {
            addCriterion("laudnum between", value1, value2, "laudnum");
            return (Criteria) this;
        }

        public Criteria andLaudnumNotBetween(Integer value1, Integer value2) {
            addCriterion("laudnum not between", value1, value2, "laudnum");
            return (Criteria) this;
        }

        public Criteria andIspublisIsNull() {
            addCriterion("ispublis is null");
            return (Criteria) this;
        }

        public Criteria andIspublisIsNotNull() {
            addCriterion("ispublis is not null");
            return (Criteria) this;
        }

        public Criteria andIspublisEqualTo(Integer value) {
            addCriterion("ispublis =", value, "ispublis");
            return (Criteria) this;
        }

        public Criteria andIspublisNotEqualTo(Integer value) {
            addCriterion("ispublis <>", value, "ispublis");
            return (Criteria) this;
        }

        public Criteria andIspublisGreaterThan(Integer value) {
            addCriterion("ispublis >", value, "ispublis");
            return (Criteria) this;
        }

        public Criteria andIspublisGreaterThanOrEqualTo(Integer value) {
            addCriterion("ispublis >=", value, "ispublis");
            return (Criteria) this;
        }

        public Criteria andIspublisLessThan(Integer value) {
            addCriterion("ispublis <", value, "ispublis");
            return (Criteria) this;
        }

        public Criteria andIspublisLessThanOrEqualTo(Integer value) {
            addCriterion("ispublis <=", value, "ispublis");
            return (Criteria) this;
        }

        public Criteria andIspublisIn(List<Integer> values) {
            addCriterion("ispublis in", values, "ispublis");
            return (Criteria) this;
        }

        public Criteria andIspublisNotIn(List<Integer> values) {
            addCriterion("ispublis not in", values, "ispublis");
            return (Criteria) this;
        }

        public Criteria andIspublisBetween(Integer value1, Integer value2) {
            addCriterion("ispublis between", value1, value2, "ispublis");
            return (Criteria) this;
        }

        public Criteria andIspublisNotBetween(Integer value1, Integer value2) {
            addCriterion("ispublis not between", value1, value2, "ispublis");
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