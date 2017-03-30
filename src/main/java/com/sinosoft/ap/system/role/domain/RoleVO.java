package com.sinosoft.ap.system.role.domain;

import java.sql.Date;

public class RoleVO {
	private String roleId;
	private String roleName;
	private String roleCode;
	private String roleDesc;
	private Date roleCreattime;
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public Date getROLE_CREATTIME() {
		return roleCreattime;
	}
	public void setROLE_CREATTIME(Date roleCreattime) {
		this.roleCreattime = roleCreattime;
	}
}
