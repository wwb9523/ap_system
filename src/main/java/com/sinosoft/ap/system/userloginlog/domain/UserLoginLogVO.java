package com.sinosoft.ap.system.userloginlog.domain;
import java.sql.Date;

public class UserLoginLogVO {
	private String userLoginLogId;
	private String userId;
	private String loginUser;
	private String loginIp;
	private String loginOs;
	private String loginBrower;
	private Date loginTime;
	
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public String getLoginOs() {
		return loginOs;
	}
	public void setLoginOs(String loginOs) {
		this.loginOs = loginOs;
	}
	public String getLoginBrower() {
		return loginBrower;
	}
	public void setLoginBrower(String loginBrower) {
		this.loginBrower = loginBrower;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getUserLoginLogId() {
		return userLoginLogId;
	}
	public void setUserLoginLogId(String userLoginLogId) {
		this.userLoginLogId = userLoginLogId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	
}
