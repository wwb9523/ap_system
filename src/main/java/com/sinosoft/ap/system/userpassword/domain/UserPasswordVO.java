package com.sinosoft.ap.system.userpassword.domain;

import java.sql.Date;

import com.sinosoft.ap.util.MD5Translate;

public class UserPasswordVO {
	private String userPasswordId;
	private String userId;
	private String userPassword;
	private Date userPasswordCreatetime;
	public String getUserPasswordId() {
		return userPasswordId;
	}
	public void setUserPasswordId(String userPasswordId) {
		this.userPasswordId = userPasswordId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = MD5Translate.MD5(userPassword);
	}
	public Date getUserPasswordCreatetime() {
		return userPasswordCreatetime;
	}
	public void setUserPasswordCreatetime(Date userPasswordCreatetime) {
		this.userPasswordCreatetime = userPasswordCreatetime;
	}
	
	
}
