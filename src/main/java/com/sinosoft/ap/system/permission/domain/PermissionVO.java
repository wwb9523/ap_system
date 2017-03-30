package com.sinosoft.ap.system.permission.domain;

import java.sql.Date;

public class PermissionVO {
	private String permissionId;
	private String permissionName;
	private String permissionCode;
	private String permissionDesc;
	private Date permissionCreattime;
	
	public String getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
	
	
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
	
	public String getPermissionCode() {
		return permissionCode;
	}
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}
	
	
	public String getPermissionDesc() {
		return permissionDesc;
	}
	public void setPermissionDesc(String permissionDesc) {
		this.permissionDesc = permissionDesc;
	}
	
	
	public Date getPermissionCreattime() {
		return permissionCreattime;
	}
	public void setPermissionCreattime(Date permissionCreattime) {
		this.permissionCreattime = permissionCreattime;
	}
	
	
}
