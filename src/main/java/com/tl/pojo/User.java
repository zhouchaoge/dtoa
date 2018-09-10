package com.tl.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String realName;

    private String pass;

    private String realPass;

    private String code;

    private Byte activated;

    private Byte onjob;

    private Byte approveAccess;

    private Byte accessLevel;

    private Byte sex;

    private Date birth;

    private String directLine;

    private String branchPhone;

    private String mobile;

    private String email;

    private Integer companyId;

    private String companyName;

    private Integer departmentId;

    private String departmentName;

    private String position;

    private Integer createId;

    private String createName;

    private Date createTime;

    private Date updateTime;

    private Date entryTime;

    private Date positiveTime;

    private Date leaveTime;

    private Date lastLoginTime;

    private Integer directsuperiorId;

    private String directsuperiorName;

    private Byte attendanceAccess;

    private Double canAdjustHour;

    private Double alreadyAnnualHour;

    private Byte assetsAccess;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public String getRealPass() {
        return realPass;
    }

    public void setRealPass(String realPass) {
        this.realPass = realPass == null ? null : realPass.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Byte getActivated() {
        return activated;
    }

    public void setActivated(Byte activated) {
        this.activated = activated;
    }

    public Byte getOnjob() {
        return onjob;
    }

    public void setOnjob(Byte onjob) {
        this.onjob = onjob;
    }

    public Byte getApproveAccess() {
        return approveAccess;
    }

    public void setApproveAccess(Byte approveAccess) {
        this.approveAccess = approveAccess;
    }

    public Byte getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Byte accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getDirectLine() {
        return directLine;
    }

    public void setDirectLine(String directLine) {
        this.directLine = directLine == null ? null : directLine.trim();
    }

    public String getBranchPhone() {
        return branchPhone;
    }

    public void setBranchPhone(String branchPhone) {
        this.branchPhone = branchPhone == null ? null : branchPhone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getPositiveTime() {
        return positiveTime;
    }

    public void setPositiveTime(Date positiveTime) {
        this.positiveTime = positiveTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getDirectsuperiorId() {
        return directsuperiorId;
    }

    public void setDirectsuperiorId(Integer directsuperiorId) {
        this.directsuperiorId = directsuperiorId;
    }

    public String getDirectsuperiorName() {
        return directsuperiorName;
    }

    public void setDirectsuperiorName(String directsuperiorName) {
        this.directsuperiorName = directsuperiorName == null ? null : directsuperiorName.trim();
    }

    public Byte getAttendanceAccess() {
        return attendanceAccess;
    }

    public void setAttendanceAccess(Byte attendanceAccess) {
        this.attendanceAccess = attendanceAccess;
    }

    public Double getCanAdjustHour() {
        return canAdjustHour;
    }

    public void setCanAdjustHour(Double canAdjustHour) {
        this.canAdjustHour = canAdjustHour;
    }

    public Double getAlreadyAnnualHour() {
        return alreadyAnnualHour;
    }

    public void setAlreadyAnnualHour(Double alreadyAnnualHour) {
        this.alreadyAnnualHour = alreadyAnnualHour;
    }

    public Byte getAssetsAccess() {
        return assetsAccess;
    }

    public void setAssetsAccess(Byte assetsAccess) {
        this.assetsAccess = assetsAccess;
    }
}