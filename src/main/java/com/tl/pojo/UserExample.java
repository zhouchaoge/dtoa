package com.tl.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("pass like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("pass not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andRealPassIsNull() {
            addCriterion("real_pass is null");
            return (Criteria) this;
        }

        public Criteria andRealPassIsNotNull() {
            addCriterion("real_pass is not null");
            return (Criteria) this;
        }

        public Criteria andRealPassEqualTo(String value) {
            addCriterion("real_pass =", value, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassNotEqualTo(String value) {
            addCriterion("real_pass <>", value, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassGreaterThan(String value) {
            addCriterion("real_pass >", value, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassGreaterThanOrEqualTo(String value) {
            addCriterion("real_pass >=", value, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassLessThan(String value) {
            addCriterion("real_pass <", value, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassLessThanOrEqualTo(String value) {
            addCriterion("real_pass <=", value, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassLike(String value) {
            addCriterion("real_pass like", value, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassNotLike(String value) {
            addCriterion("real_pass not like", value, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassIn(List<String> values) {
            addCriterion("real_pass in", values, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassNotIn(List<String> values) {
            addCriterion("real_pass not in", values, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassBetween(String value1, String value2) {
            addCriterion("real_pass between", value1, value2, "realPass");
            return (Criteria) this;
        }

        public Criteria andRealPassNotBetween(String value1, String value2) {
            addCriterion("real_pass not between", value1, value2, "realPass");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andActivatedIsNull() {
            addCriterion("activated is null");
            return (Criteria) this;
        }

        public Criteria andActivatedIsNotNull() {
            addCriterion("activated is not null");
            return (Criteria) this;
        }

        public Criteria andActivatedEqualTo(Byte value) {
            addCriterion("activated =", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedNotEqualTo(Byte value) {
            addCriterion("activated <>", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedGreaterThan(Byte value) {
            addCriterion("activated >", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedGreaterThanOrEqualTo(Byte value) {
            addCriterion("activated >=", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedLessThan(Byte value) {
            addCriterion("activated <", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedLessThanOrEqualTo(Byte value) {
            addCriterion("activated <=", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedIn(List<Byte> values) {
            addCriterion("activated in", values, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedNotIn(List<Byte> values) {
            addCriterion("activated not in", values, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedBetween(Byte value1, Byte value2) {
            addCriterion("activated between", value1, value2, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedNotBetween(Byte value1, Byte value2) {
            addCriterion("activated not between", value1, value2, "activated");
            return (Criteria) this;
        }

        public Criteria andOnjobIsNull() {
            addCriterion("onjob is null");
            return (Criteria) this;
        }

        public Criteria andOnjobIsNotNull() {
            addCriterion("onjob is not null");
            return (Criteria) this;
        }

        public Criteria andOnjobEqualTo(Byte value) {
            addCriterion("onjob =", value, "onjob");
            return (Criteria) this;
        }

        public Criteria andOnjobNotEqualTo(Byte value) {
            addCriterion("onjob <>", value, "onjob");
            return (Criteria) this;
        }

        public Criteria andOnjobGreaterThan(Byte value) {
            addCriterion("onjob >", value, "onjob");
            return (Criteria) this;
        }

        public Criteria andOnjobGreaterThanOrEqualTo(Byte value) {
            addCriterion("onjob >=", value, "onjob");
            return (Criteria) this;
        }

        public Criteria andOnjobLessThan(Byte value) {
            addCriterion("onjob <", value, "onjob");
            return (Criteria) this;
        }

        public Criteria andOnjobLessThanOrEqualTo(Byte value) {
            addCriterion("onjob <=", value, "onjob");
            return (Criteria) this;
        }

        public Criteria andOnjobIn(List<Byte> values) {
            addCriterion("onjob in", values, "onjob");
            return (Criteria) this;
        }

        public Criteria andOnjobNotIn(List<Byte> values) {
            addCriterion("onjob not in", values, "onjob");
            return (Criteria) this;
        }

        public Criteria andOnjobBetween(Byte value1, Byte value2) {
            addCriterion("onjob between", value1, value2, "onjob");
            return (Criteria) this;
        }

        public Criteria andOnjobNotBetween(Byte value1, Byte value2) {
            addCriterion("onjob not between", value1, value2, "onjob");
            return (Criteria) this;
        }

        public Criteria andApproveAccessIsNull() {
            addCriterion("approve_access is null");
            return (Criteria) this;
        }

        public Criteria andApproveAccessIsNotNull() {
            addCriterion("approve_access is not null");
            return (Criteria) this;
        }

        public Criteria andApproveAccessEqualTo(Byte value) {
            addCriterion("approve_access =", value, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andApproveAccessNotEqualTo(Byte value) {
            addCriterion("approve_access <>", value, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andApproveAccessGreaterThan(Byte value) {
            addCriterion("approve_access >", value, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andApproveAccessGreaterThanOrEqualTo(Byte value) {
            addCriterion("approve_access >=", value, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andApproveAccessLessThan(Byte value) {
            addCriterion("approve_access <", value, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andApproveAccessLessThanOrEqualTo(Byte value) {
            addCriterion("approve_access <=", value, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andApproveAccessIn(List<Byte> values) {
            addCriterion("approve_access in", values, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andApproveAccessNotIn(List<Byte> values) {
            addCriterion("approve_access not in", values, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andApproveAccessBetween(Byte value1, Byte value2) {
            addCriterion("approve_access between", value1, value2, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andApproveAccessNotBetween(Byte value1, Byte value2) {
            addCriterion("approve_access not between", value1, value2, "approveAccess");
            return (Criteria) this;
        }

        public Criteria andAccessLevelIsNull() {
            addCriterion("access_level is null");
            return (Criteria) this;
        }

        public Criteria andAccessLevelIsNotNull() {
            addCriterion("access_level is not null");
            return (Criteria) this;
        }

        public Criteria andAccessLevelEqualTo(Byte value) {
            addCriterion("access_level =", value, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andAccessLevelNotEqualTo(Byte value) {
            addCriterion("access_level <>", value, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andAccessLevelGreaterThan(Byte value) {
            addCriterion("access_level >", value, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andAccessLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("access_level >=", value, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andAccessLevelLessThan(Byte value) {
            addCriterion("access_level <", value, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andAccessLevelLessThanOrEqualTo(Byte value) {
            addCriterion("access_level <=", value, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andAccessLevelIn(List<Byte> values) {
            addCriterion("access_level in", values, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andAccessLevelNotIn(List<Byte> values) {
            addCriterion("access_level not in", values, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andAccessLevelBetween(Byte value1, Byte value2) {
            addCriterion("access_level between", value1, value2, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andAccessLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("access_level not between", value1, value2, "accessLevel");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andDirectLineIsNull() {
            addCriterion("direct_line is null");
            return (Criteria) this;
        }

        public Criteria andDirectLineIsNotNull() {
            addCriterion("direct_line is not null");
            return (Criteria) this;
        }

        public Criteria andDirectLineEqualTo(String value) {
            addCriterion("direct_line =", value, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineNotEqualTo(String value) {
            addCriterion("direct_line <>", value, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineGreaterThan(String value) {
            addCriterion("direct_line >", value, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineGreaterThanOrEqualTo(String value) {
            addCriterion("direct_line >=", value, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineLessThan(String value) {
            addCriterion("direct_line <", value, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineLessThanOrEqualTo(String value) {
            addCriterion("direct_line <=", value, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineLike(String value) {
            addCriterion("direct_line like", value, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineNotLike(String value) {
            addCriterion("direct_line not like", value, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineIn(List<String> values) {
            addCriterion("direct_line in", values, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineNotIn(List<String> values) {
            addCriterion("direct_line not in", values, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineBetween(String value1, String value2) {
            addCriterion("direct_line between", value1, value2, "directLine");
            return (Criteria) this;
        }

        public Criteria andDirectLineNotBetween(String value1, String value2) {
            addCriterion("direct_line not between", value1, value2, "directLine");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneIsNull() {
            addCriterion("branch_phone is null");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneIsNotNull() {
            addCriterion("branch_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneEqualTo(String value) {
            addCriterion("branch_phone =", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneNotEqualTo(String value) {
            addCriterion("branch_phone <>", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneGreaterThan(String value) {
            addCriterion("branch_phone >", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("branch_phone >=", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneLessThan(String value) {
            addCriterion("branch_phone <", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneLessThanOrEqualTo(String value) {
            addCriterion("branch_phone <=", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneLike(String value) {
            addCriterion("branch_phone like", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneNotLike(String value) {
            addCriterion("branch_phone not like", value, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneIn(List<String> values) {
            addCriterion("branch_phone in", values, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneNotIn(List<String> values) {
            addCriterion("branch_phone not in", values, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneBetween(String value1, String value2) {
            addCriterion("branch_phone between", value1, value2, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andBranchPhoneNotBetween(String value1, String value2) {
            addCriterion("branch_phone not between", value1, value2, "branchPhone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("entry_time is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("entry_time =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("entry_time <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("entry_time >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_time >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("entry_time <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("entry_time <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("entry_time in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("entry_time not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("entry_time between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("entry_time not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeIsNull() {
            addCriterion("positive_time is null");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeIsNotNull() {
            addCriterion("positive_time is not null");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeEqualTo(Date value) {
            addCriterion("positive_time =", value, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeNotEqualTo(Date value) {
            addCriterion("positive_time <>", value, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeGreaterThan(Date value) {
            addCriterion("positive_time >", value, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("positive_time >=", value, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeLessThan(Date value) {
            addCriterion("positive_time <", value, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("positive_time <=", value, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeIn(List<Date> values) {
            addCriterion("positive_time in", values, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeNotIn(List<Date> values) {
            addCriterion("positive_time not in", values, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeBetween(Date value1, Date value2) {
            addCriterion("positive_time between", value1, value2, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andPositiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("positive_time not between", value1, value2, "positiveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdIsNull() {
            addCriterion("directSuperior_id is null");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdIsNotNull() {
            addCriterion("directSuperior_id is not null");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdEqualTo(Integer value) {
            addCriterion("directSuperior_id =", value, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdNotEqualTo(Integer value) {
            addCriterion("directSuperior_id <>", value, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdGreaterThan(Integer value) {
            addCriterion("directSuperior_id >", value, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("directSuperior_id >=", value, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdLessThan(Integer value) {
            addCriterion("directSuperior_id <", value, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdLessThanOrEqualTo(Integer value) {
            addCriterion("directSuperior_id <=", value, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdIn(List<Integer> values) {
            addCriterion("directSuperior_id in", values, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdNotIn(List<Integer> values) {
            addCriterion("directSuperior_id not in", values, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdBetween(Integer value1, Integer value2) {
            addCriterion("directSuperior_id between", value1, value2, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("directSuperior_id not between", value1, value2, "directsuperiorId");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameIsNull() {
            addCriterion("directSuperior_name is null");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameIsNotNull() {
            addCriterion("directSuperior_name is not null");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameEqualTo(String value) {
            addCriterion("directSuperior_name =", value, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameNotEqualTo(String value) {
            addCriterion("directSuperior_name <>", value, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameGreaterThan(String value) {
            addCriterion("directSuperior_name >", value, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameGreaterThanOrEqualTo(String value) {
            addCriterion("directSuperior_name >=", value, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameLessThan(String value) {
            addCriterion("directSuperior_name <", value, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameLessThanOrEqualTo(String value) {
            addCriterion("directSuperior_name <=", value, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameLike(String value) {
            addCriterion("directSuperior_name like", value, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameNotLike(String value) {
            addCriterion("directSuperior_name not like", value, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameIn(List<String> values) {
            addCriterion("directSuperior_name in", values, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameNotIn(List<String> values) {
            addCriterion("directSuperior_name not in", values, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameBetween(String value1, String value2) {
            addCriterion("directSuperior_name between", value1, value2, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andDirectsuperiorNameNotBetween(String value1, String value2) {
            addCriterion("directSuperior_name not between", value1, value2, "directsuperiorName");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessIsNull() {
            addCriterion("attendance_access is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessIsNotNull() {
            addCriterion("attendance_access is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessEqualTo(Byte value) {
            addCriterion("attendance_access =", value, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessNotEqualTo(Byte value) {
            addCriterion("attendance_access <>", value, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessGreaterThan(Byte value) {
            addCriterion("attendance_access >", value, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessGreaterThanOrEqualTo(Byte value) {
            addCriterion("attendance_access >=", value, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessLessThan(Byte value) {
            addCriterion("attendance_access <", value, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessLessThanOrEqualTo(Byte value) {
            addCriterion("attendance_access <=", value, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessIn(List<Byte> values) {
            addCriterion("attendance_access in", values, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessNotIn(List<Byte> values) {
            addCriterion("attendance_access not in", values, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessBetween(Byte value1, Byte value2) {
            addCriterion("attendance_access between", value1, value2, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andAttendanceAccessNotBetween(Byte value1, Byte value2) {
            addCriterion("attendance_access not between", value1, value2, "attendanceAccess");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourIsNull() {
            addCriterion("can_adjust_hour is null");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourIsNotNull() {
            addCriterion("can_adjust_hour is not null");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourEqualTo(Double value) {
            addCriterion("can_adjust_hour =", value, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourNotEqualTo(Double value) {
            addCriterion("can_adjust_hour <>", value, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourGreaterThan(Double value) {
            addCriterion("can_adjust_hour >", value, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourGreaterThanOrEqualTo(Double value) {
            addCriterion("can_adjust_hour >=", value, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourLessThan(Double value) {
            addCriterion("can_adjust_hour <", value, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourLessThanOrEqualTo(Double value) {
            addCriterion("can_adjust_hour <=", value, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourIn(List<Double> values) {
            addCriterion("can_adjust_hour in", values, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourNotIn(List<Double> values) {
            addCriterion("can_adjust_hour not in", values, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourBetween(Double value1, Double value2) {
            addCriterion("can_adjust_hour between", value1, value2, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andCanAdjustHourNotBetween(Double value1, Double value2) {
            addCriterion("can_adjust_hour not between", value1, value2, "canAdjustHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourIsNull() {
            addCriterion("already_annual_hour is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourIsNotNull() {
            addCriterion("already_annual_hour is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourEqualTo(Double value) {
            addCriterion("already_annual_hour =", value, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourNotEqualTo(Double value) {
            addCriterion("already_annual_hour <>", value, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourGreaterThan(Double value) {
            addCriterion("already_annual_hour >", value, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourGreaterThanOrEqualTo(Double value) {
            addCriterion("already_annual_hour >=", value, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourLessThan(Double value) {
            addCriterion("already_annual_hour <", value, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourLessThanOrEqualTo(Double value) {
            addCriterion("already_annual_hour <=", value, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourIn(List<Double> values) {
            addCriterion("already_annual_hour in", values, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourNotIn(List<Double> values) {
            addCriterion("already_annual_hour not in", values, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourBetween(Double value1, Double value2) {
            addCriterion("already_annual_hour between", value1, value2, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAlreadyAnnualHourNotBetween(Double value1, Double value2) {
            addCriterion("already_annual_hour not between", value1, value2, "alreadyAnnualHour");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessIsNull() {
            addCriterion("assets_access is null");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessIsNotNull() {
            addCriterion("assets_access is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessEqualTo(Byte value) {
            addCriterion("assets_access =", value, "assetsAccess");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessNotEqualTo(Byte value) {
            addCriterion("assets_access <>", value, "assetsAccess");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessGreaterThan(Byte value) {
            addCriterion("assets_access >", value, "assetsAccess");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessGreaterThanOrEqualTo(Byte value) {
            addCriterion("assets_access >=", value, "assetsAccess");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessLessThan(Byte value) {
            addCriterion("assets_access <", value, "assetsAccess");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessLessThanOrEqualTo(Byte value) {
            addCriterion("assets_access <=", value, "assetsAccess");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessIn(List<Byte> values) {
            addCriterion("assets_access in", values, "assetsAccess");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessNotIn(List<Byte> values) {
            addCriterion("assets_access not in", values, "assetsAccess");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessBetween(Byte value1, Byte value2) {
            addCriterion("assets_access between", value1, value2, "assetsAccess");
            return (Criteria) this;
        }

        public Criteria andAssetsAccessNotBetween(Byte value1, Byte value2) {
            addCriterion("assets_access not between", value1, value2, "assetsAccess");
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