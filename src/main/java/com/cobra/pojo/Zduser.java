package com.cobra.pojo;

import java.util.Date;

public class Zduser {
    private String username;

    private String realname;

    private String password;

    private String branchinnercode;

    private String isbranchadmin;

    private String status;

    private String type;

    private String email;

    private String tel;

    private String mobile;

    private Date lastlogintime;

    private String lastloginip;

    private String prop1;

    private String prop2;

    private String prop6;

    private String prop5;

    private String prop4;

    private String prop3;

    private String memo;

    private Date addtime;

    private String adduser;

    private Date modifytime;

    private String modifyuser;

    private Long loginerrorcount;

    private Date loginerrortime;

    private String modifypassstatus;

    private Date forbiddenlogintime;

    private Date lastmodifypasstime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getBranchinnercode() {
        return branchinnercode;
    }

    public void setBranchinnercode(String branchinnercode) {
        this.branchinnercode = branchinnercode == null ? null : branchinnercode.trim();
    }

    public String getIsbranchadmin() {
        return isbranchadmin;
    }

    public void setIsbranchadmin(String isbranchadmin) {
        this.isbranchadmin = isbranchadmin == null ? null : isbranchadmin.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1 == null ? null : prop1.trim();
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2 == null ? null : prop2.trim();
    }

    public String getProp6() {
        return prop6;
    }

    public void setProp6(String prop6) {
        this.prop6 = prop6 == null ? null : prop6.trim();
    }

    public String getProp5() {
        return prop5;
    }

    public void setProp5(String prop5) {
        this.prop5 = prop5 == null ? null : prop5.trim();
    }

    public String getProp4() {
        return prop4;
    }

    public void setProp4(String prop4) {
        this.prop4 = prop4 == null ? null : prop4.trim();
    }

    public String getProp3() {
        return prop3;
    }

    public void setProp3(String prop3) {
        this.prop3 = prop3 == null ? null : prop3.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser == null ? null : adduser.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(String modifyuser) {
        this.modifyuser = modifyuser == null ? null : modifyuser.trim();
    }

    public Long getLoginerrorcount() {
        return loginerrorcount;
    }

    public void setLoginerrorcount(Long loginerrorcount) {
        this.loginerrorcount = loginerrorcount;
    }

    public Date getLoginerrortime() {
        return loginerrortime;
    }

    public void setLoginerrortime(Date loginerrortime) {
        this.loginerrortime = loginerrortime;
    }

    public String getModifypassstatus() {
        return modifypassstatus;
    }

    public void setModifypassstatus(String modifypassstatus) {
        this.modifypassstatus = modifypassstatus == null ? null : modifypassstatus.trim();
    }

    public Date getForbiddenlogintime() {
        return forbiddenlogintime;
    }

    public void setForbiddenlogintime(Date forbiddenlogintime) {
        this.forbiddenlogintime = forbiddenlogintime;
    }

    public Date getLastmodifypasstime() {
        return lastmodifypasstime;
    }

    public void setLastmodifypasstime(Date lastmodifypasstime) {
        this.lastmodifypasstime = lastmodifypasstime;
    }
}