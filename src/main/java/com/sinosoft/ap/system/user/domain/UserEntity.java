package com.sinosoft.ap.system.user.domain;

import java.sql.Date;

public class UserEntity {
	private String userId;
	private String userIdCode;
	private String userAccount;
	private String userMaile;
	private String userTelnumber;
	private Date userCreateTime;
	
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return this.userId;
	}
	
	public void setUserIdCode(String userIdCode){
		this.userIdCode=userIdCode;
	}
	public String getUserIdCode(){
		return this.userIdCode;
	}
	
	public void setUserAccount(String userAccount){
		this.userAccount=userAccount;
	}
	public String getUserAccount(){
		return this.userAccount;
	}
	
	public void setUserMaile(String userMaile){
		this.userTelnumber=userMaile;
	}
	public String getUserMaile(){
		return this.userMaile;
	}
	
	public void setUserTelnumber(String userTelnumber){
		this.userTelnumber=userTelnumber;
	}
	public String getUserTelnumber(){
		return this.userTelnumber;
	}
	
	public void setUserCreateTime(Date userCreateTime){
		this.userCreateTime=userCreateTime;
	}
	public Date getUserCreateTime(){
		return this.userCreateTime;
	}
}
