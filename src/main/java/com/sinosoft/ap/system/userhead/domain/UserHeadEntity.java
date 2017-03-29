package com.sinosoft.ap.system.userhead.domain;

public class UserHeadEntity {
	private String USER_HEAD_ID;
	private String USER_ID;
	private String USER_HEAD_ADDRESS;
	
	public String getUSER_HEAD_ADDRESS() {
		return USER_HEAD_ADDRESS;
	}
	public void setUSER_HEAD_ADDRESS(String uSER_HEAD_ADDRESS) {
		USER_HEAD_ADDRESS = uSER_HEAD_ADDRESS;
	}
	public String getUSER_HEAD_ID() {
		//注释
		return USER_HEAD_ID;
	}
	public void setUSER_HEAD_ID(String uSER_HEAD_ID) {
		USER_HEAD_ID = uSER_HEAD_ID;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	
}
