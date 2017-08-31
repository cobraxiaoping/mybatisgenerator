package com.cobra.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZduserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZduserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeIsNull() {
            addCriterion("BranchInnerCode is null");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeIsNotNull() {
            addCriterion("BranchInnerCode is not null");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeEqualTo(String value) {
            addCriterion("BranchInnerCode =", value, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeNotEqualTo(String value) {
            addCriterion("BranchInnerCode <>", value, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeGreaterThan(String value) {
            addCriterion("BranchInnerCode >", value, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeGreaterThanOrEqualTo(String value) {
            addCriterion("BranchInnerCode >=", value, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeLessThan(String value) {
            addCriterion("BranchInnerCode <", value, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeLessThanOrEqualTo(String value) {
            addCriterion("BranchInnerCode <=", value, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeLike(String value) {
            addCriterion("BranchInnerCode like", value, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeNotLike(String value) {
            addCriterion("BranchInnerCode not like", value, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeIn(List<String> values) {
            addCriterion("BranchInnerCode in", values, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeNotIn(List<String> values) {
            addCriterion("BranchInnerCode not in", values, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeBetween(String value1, String value2) {
            addCriterion("BranchInnerCode between", value1, value2, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andBranchinnercodeNotBetween(String value1, String value2) {
            addCriterion("BranchInnerCode not between", value1, value2, "branchinnercode");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminIsNull() {
            addCriterion("IsBranchAdmin is null");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminIsNotNull() {
            addCriterion("IsBranchAdmin is not null");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminEqualTo(String value) {
            addCriterion("IsBranchAdmin =", value, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminNotEqualTo(String value) {
            addCriterion("IsBranchAdmin <>", value, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminGreaterThan(String value) {
            addCriterion("IsBranchAdmin >", value, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminGreaterThanOrEqualTo(String value) {
            addCriterion("IsBranchAdmin >=", value, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminLessThan(String value) {
            addCriterion("IsBranchAdmin <", value, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminLessThanOrEqualTo(String value) {
            addCriterion("IsBranchAdmin <=", value, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminLike(String value) {
            addCriterion("IsBranchAdmin like", value, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminNotLike(String value) {
            addCriterion("IsBranchAdmin not like", value, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminIn(List<String> values) {
            addCriterion("IsBranchAdmin in", values, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminNotIn(List<String> values) {
            addCriterion("IsBranchAdmin not in", values, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminBetween(String value1, String value2) {
            addCriterion("IsBranchAdmin between", value1, value2, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andIsbranchadminNotBetween(String value1, String value2) {
            addCriterion("IsBranchAdmin not between", value1, value2, "isbranchadmin");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("LastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("LastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("LastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("LastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("LastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("LastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("LastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("LastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNull() {
            addCriterion("LastLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNotNull() {
            addCriterion("LastLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginipEqualTo(String value) {
            addCriterion("LastLoginIP =", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotEqualTo(String value) {
            addCriterion("LastLoginIP <>", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThan(String value) {
            addCriterion("LastLoginIP >", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThanOrEqualTo(String value) {
            addCriterion("LastLoginIP >=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThan(String value) {
            addCriterion("LastLoginIP <", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThanOrEqualTo(String value) {
            addCriterion("LastLoginIP <=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLike(String value) {
            addCriterion("LastLoginIP like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotLike(String value) {
            addCriterion("LastLoginIP not like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipIn(List<String> values) {
            addCriterion("LastLoginIP in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotIn(List<String> values) {
            addCriterion("LastLoginIP not in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipBetween(String value1, String value2) {
            addCriterion("LastLoginIP between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotBetween(String value1, String value2) {
            addCriterion("LastLoginIP not between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andProp1IsNull() {
            addCriterion("Prop1 is null");
            return (Criteria) this;
        }

        public Criteria andProp1IsNotNull() {
            addCriterion("Prop1 is not null");
            return (Criteria) this;
        }

        public Criteria andProp1EqualTo(String value) {
            addCriterion("Prop1 =", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotEqualTo(String value) {
            addCriterion("Prop1 <>", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThan(String value) {
            addCriterion("Prop1 >", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThanOrEqualTo(String value) {
            addCriterion("Prop1 >=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThan(String value) {
            addCriterion("Prop1 <", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThanOrEqualTo(String value) {
            addCriterion("Prop1 <=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Like(String value) {
            addCriterion("Prop1 like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotLike(String value) {
            addCriterion("Prop1 not like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1In(List<String> values) {
            addCriterion("Prop1 in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotIn(List<String> values) {
            addCriterion("Prop1 not in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Between(String value1, String value2) {
            addCriterion("Prop1 between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotBetween(String value1, String value2) {
            addCriterion("Prop1 not between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp2IsNull() {
            addCriterion("Prop2 is null");
            return (Criteria) this;
        }

        public Criteria andProp2IsNotNull() {
            addCriterion("Prop2 is not null");
            return (Criteria) this;
        }

        public Criteria andProp2EqualTo(String value) {
            addCriterion("Prop2 =", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotEqualTo(String value) {
            addCriterion("Prop2 <>", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThan(String value) {
            addCriterion("Prop2 >", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThanOrEqualTo(String value) {
            addCriterion("Prop2 >=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThan(String value) {
            addCriterion("Prop2 <", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThanOrEqualTo(String value) {
            addCriterion("Prop2 <=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Like(String value) {
            addCriterion("Prop2 like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotLike(String value) {
            addCriterion("Prop2 not like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2In(List<String> values) {
            addCriterion("Prop2 in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotIn(List<String> values) {
            addCriterion("Prop2 not in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Between(String value1, String value2) {
            addCriterion("Prop2 between", value1, value2, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotBetween(String value1, String value2) {
            addCriterion("Prop2 not between", value1, value2, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp6IsNull() {
            addCriterion("Prop6 is null");
            return (Criteria) this;
        }

        public Criteria andProp6IsNotNull() {
            addCriterion("Prop6 is not null");
            return (Criteria) this;
        }

        public Criteria andProp6EqualTo(String value) {
            addCriterion("Prop6 =", value, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6NotEqualTo(String value) {
            addCriterion("Prop6 <>", value, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6GreaterThan(String value) {
            addCriterion("Prop6 >", value, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6GreaterThanOrEqualTo(String value) {
            addCriterion("Prop6 >=", value, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6LessThan(String value) {
            addCriterion("Prop6 <", value, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6LessThanOrEqualTo(String value) {
            addCriterion("Prop6 <=", value, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6Like(String value) {
            addCriterion("Prop6 like", value, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6NotLike(String value) {
            addCriterion("Prop6 not like", value, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6In(List<String> values) {
            addCriterion("Prop6 in", values, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6NotIn(List<String> values) {
            addCriterion("Prop6 not in", values, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6Between(String value1, String value2) {
            addCriterion("Prop6 between", value1, value2, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp6NotBetween(String value1, String value2) {
            addCriterion("Prop6 not between", value1, value2, "prop6");
            return (Criteria) this;
        }

        public Criteria andProp5IsNull() {
            addCriterion("Prop5 is null");
            return (Criteria) this;
        }

        public Criteria andProp5IsNotNull() {
            addCriterion("Prop5 is not null");
            return (Criteria) this;
        }

        public Criteria andProp5EqualTo(String value) {
            addCriterion("Prop5 =", value, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5NotEqualTo(String value) {
            addCriterion("Prop5 <>", value, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5GreaterThan(String value) {
            addCriterion("Prop5 >", value, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5GreaterThanOrEqualTo(String value) {
            addCriterion("Prop5 >=", value, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5LessThan(String value) {
            addCriterion("Prop5 <", value, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5LessThanOrEqualTo(String value) {
            addCriterion("Prop5 <=", value, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5Like(String value) {
            addCriterion("Prop5 like", value, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5NotLike(String value) {
            addCriterion("Prop5 not like", value, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5In(List<String> values) {
            addCriterion("Prop5 in", values, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5NotIn(List<String> values) {
            addCriterion("Prop5 not in", values, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5Between(String value1, String value2) {
            addCriterion("Prop5 between", value1, value2, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp5NotBetween(String value1, String value2) {
            addCriterion("Prop5 not between", value1, value2, "prop5");
            return (Criteria) this;
        }

        public Criteria andProp4IsNull() {
            addCriterion("Prop4 is null");
            return (Criteria) this;
        }

        public Criteria andProp4IsNotNull() {
            addCriterion("Prop4 is not null");
            return (Criteria) this;
        }

        public Criteria andProp4EqualTo(String value) {
            addCriterion("Prop4 =", value, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4NotEqualTo(String value) {
            addCriterion("Prop4 <>", value, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4GreaterThan(String value) {
            addCriterion("Prop4 >", value, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4GreaterThanOrEqualTo(String value) {
            addCriterion("Prop4 >=", value, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4LessThan(String value) {
            addCriterion("Prop4 <", value, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4LessThanOrEqualTo(String value) {
            addCriterion("Prop4 <=", value, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4Like(String value) {
            addCriterion("Prop4 like", value, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4NotLike(String value) {
            addCriterion("Prop4 not like", value, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4In(List<String> values) {
            addCriterion("Prop4 in", values, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4NotIn(List<String> values) {
            addCriterion("Prop4 not in", values, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4Between(String value1, String value2) {
            addCriterion("Prop4 between", value1, value2, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp4NotBetween(String value1, String value2) {
            addCriterion("Prop4 not between", value1, value2, "prop4");
            return (Criteria) this;
        }

        public Criteria andProp3IsNull() {
            addCriterion("Prop3 is null");
            return (Criteria) this;
        }

        public Criteria andProp3IsNotNull() {
            addCriterion("Prop3 is not null");
            return (Criteria) this;
        }

        public Criteria andProp3EqualTo(String value) {
            addCriterion("Prop3 =", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotEqualTo(String value) {
            addCriterion("Prop3 <>", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3GreaterThan(String value) {
            addCriterion("Prop3 >", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3GreaterThanOrEqualTo(String value) {
            addCriterion("Prop3 >=", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3LessThan(String value) {
            addCriterion("Prop3 <", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3LessThanOrEqualTo(String value) {
            addCriterion("Prop3 <=", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3Like(String value) {
            addCriterion("Prop3 like", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotLike(String value) {
            addCriterion("Prop3 not like", value, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3In(List<String> values) {
            addCriterion("Prop3 in", values, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotIn(List<String> values) {
            addCriterion("Prop3 not in", values, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3Between(String value1, String value2) {
            addCriterion("Prop3 between", value1, value2, "prop3");
            return (Criteria) this;
        }

        public Criteria andProp3NotBetween(String value1, String value2) {
            addCriterion("Prop3 not between", value1, value2, "prop3");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("AddTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("AddTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("AddTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AddTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("AddTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("AddTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("AddTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("AddTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("AddTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("AddTime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAdduserIsNull() {
            addCriterion("AddUser is null");
            return (Criteria) this;
        }

        public Criteria andAdduserIsNotNull() {
            addCriterion("AddUser is not null");
            return (Criteria) this;
        }

        public Criteria andAdduserEqualTo(String value) {
            addCriterion("AddUser =", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotEqualTo(String value) {
            addCriterion("AddUser <>", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserGreaterThan(String value) {
            addCriterion("AddUser >", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserGreaterThanOrEqualTo(String value) {
            addCriterion("AddUser >=", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLessThan(String value) {
            addCriterion("AddUser <", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLessThanOrEqualTo(String value) {
            addCriterion("AddUser <=", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserLike(String value) {
            addCriterion("AddUser like", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotLike(String value) {
            addCriterion("AddUser not like", value, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserIn(List<String> values) {
            addCriterion("AddUser in", values, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotIn(List<String> values) {
            addCriterion("AddUser not in", values, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserBetween(String value1, String value2) {
            addCriterion("AddUser between", value1, value2, "adduser");
            return (Criteria) this;
        }

        public Criteria andAdduserNotBetween(String value1, String value2) {
            addCriterion("AddUser not between", value1, value2, "adduser");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("ModifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("ModifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("ModifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("ModifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("ModifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("ModifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("ModifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNull() {
            addCriterion("ModifyUser is null");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNotNull() {
            addCriterion("ModifyUser is not null");
            return (Criteria) this;
        }

        public Criteria andModifyuserEqualTo(String value) {
            addCriterion("ModifyUser =", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotEqualTo(String value) {
            addCriterion("ModifyUser <>", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThan(String value) {
            addCriterion("ModifyUser >", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyUser >=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThan(String value) {
            addCriterion("ModifyUser <", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThanOrEqualTo(String value) {
            addCriterion("ModifyUser <=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLike(String value) {
            addCriterion("ModifyUser like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotLike(String value) {
            addCriterion("ModifyUser not like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserIn(List<String> values) {
            addCriterion("ModifyUser in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotIn(List<String> values) {
            addCriterion("ModifyUser not in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserBetween(String value1, String value2) {
            addCriterion("ModifyUser between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotBetween(String value1, String value2) {
            addCriterion("ModifyUser not between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountIsNull() {
            addCriterion("LoginErrorCount is null");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountIsNotNull() {
            addCriterion("LoginErrorCount is not null");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountEqualTo(Long value) {
            addCriterion("LoginErrorCount =", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountNotEqualTo(Long value) {
            addCriterion("LoginErrorCount <>", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountGreaterThan(Long value) {
            addCriterion("LoginErrorCount >", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountGreaterThanOrEqualTo(Long value) {
            addCriterion("LoginErrorCount >=", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountLessThan(Long value) {
            addCriterion("LoginErrorCount <", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountLessThanOrEqualTo(Long value) {
            addCriterion("LoginErrorCount <=", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountIn(List<Long> values) {
            addCriterion("LoginErrorCount in", values, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountNotIn(List<Long> values) {
            addCriterion("LoginErrorCount not in", values, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountBetween(Long value1, Long value2) {
            addCriterion("LoginErrorCount between", value1, value2, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountNotBetween(Long value1, Long value2) {
            addCriterion("LoginErrorCount not between", value1, value2, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeIsNull() {
            addCriterion("LoginErrorTime is null");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeIsNotNull() {
            addCriterion("LoginErrorTime is not null");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeEqualTo(Date value) {
            addCriterion("LoginErrorTime =", value, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeNotEqualTo(Date value) {
            addCriterion("LoginErrorTime <>", value, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeGreaterThan(Date value) {
            addCriterion("LoginErrorTime >", value, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LoginErrorTime >=", value, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeLessThan(Date value) {
            addCriterion("LoginErrorTime <", value, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeLessThanOrEqualTo(Date value) {
            addCriterion("LoginErrorTime <=", value, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeIn(List<Date> values) {
            addCriterion("LoginErrorTime in", values, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeNotIn(List<Date> values) {
            addCriterion("LoginErrorTime not in", values, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeBetween(Date value1, Date value2) {
            addCriterion("LoginErrorTime between", value1, value2, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andLoginerrortimeNotBetween(Date value1, Date value2) {
            addCriterion("LoginErrorTime not between", value1, value2, "loginerrortime");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusIsNull() {
            addCriterion("ModifyPassStatus is null");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusIsNotNull() {
            addCriterion("ModifyPassStatus is not null");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusEqualTo(String value) {
            addCriterion("ModifyPassStatus =", value, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusNotEqualTo(String value) {
            addCriterion("ModifyPassStatus <>", value, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusGreaterThan(String value) {
            addCriterion("ModifyPassStatus >", value, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyPassStatus >=", value, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusLessThan(String value) {
            addCriterion("ModifyPassStatus <", value, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusLessThanOrEqualTo(String value) {
            addCriterion("ModifyPassStatus <=", value, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusLike(String value) {
            addCriterion("ModifyPassStatus like", value, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusNotLike(String value) {
            addCriterion("ModifyPassStatus not like", value, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusIn(List<String> values) {
            addCriterion("ModifyPassStatus in", values, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusNotIn(List<String> values) {
            addCriterion("ModifyPassStatus not in", values, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusBetween(String value1, String value2) {
            addCriterion("ModifyPassStatus between", value1, value2, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andModifypassstatusNotBetween(String value1, String value2) {
            addCriterion("ModifyPassStatus not between", value1, value2, "modifypassstatus");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeIsNull() {
            addCriterion("ForbiddenLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeIsNotNull() {
            addCriterion("ForbiddenLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeEqualTo(Date value) {
            addCriterion("ForbiddenLoginTime =", value, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeNotEqualTo(Date value) {
            addCriterion("ForbiddenLoginTime <>", value, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeGreaterThan(Date value) {
            addCriterion("ForbiddenLoginTime >", value, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ForbiddenLoginTime >=", value, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeLessThan(Date value) {
            addCriterion("ForbiddenLoginTime <", value, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("ForbiddenLoginTime <=", value, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeIn(List<Date> values) {
            addCriterion("ForbiddenLoginTime in", values, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeNotIn(List<Date> values) {
            addCriterion("ForbiddenLoginTime not in", values, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeBetween(Date value1, Date value2) {
            addCriterion("ForbiddenLoginTime between", value1, value2, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andForbiddenlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("ForbiddenLoginTime not between", value1, value2, "forbiddenlogintime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeIsNull() {
            addCriterion("LastModifyPassTime is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeIsNotNull() {
            addCriterion("LastModifyPassTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeEqualTo(Date value) {
            addCriterion("LastModifyPassTime =", value, "lastmodifypasstime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeNotEqualTo(Date value) {
            addCriterion("LastModifyPassTime <>", value, "lastmodifypasstime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeGreaterThan(Date value) {
            addCriterion("LastModifyPassTime >", value, "lastmodifypasstime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModifyPassTime >=", value, "lastmodifypasstime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeLessThan(Date value) {
            addCriterion("LastModifyPassTime <", value, "lastmodifypasstime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeLessThanOrEqualTo(Date value) {
            addCriterion("LastModifyPassTime <=", value, "lastmodifypasstime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeIn(List<Date> values) {
            addCriterion("LastModifyPassTime in", values, "lastmodifypasstime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeNotIn(List<Date> values) {
            addCriterion("LastModifyPassTime not in", values, "lastmodifypasstime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeBetween(Date value1, Date value2) {
            addCriterion("LastModifyPassTime between", value1, value2, "lastmodifypasstime");
            return (Criteria) this;
        }

        public Criteria andLastmodifypasstimeNotBetween(Date value1, Date value2) {
            addCriterion("LastModifyPassTime not between", value1, value2, "lastmodifypasstime");
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