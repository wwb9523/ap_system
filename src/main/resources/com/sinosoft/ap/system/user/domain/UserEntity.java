package com.sinosoft.ap.system.user.domain;

public class UserEntity {
	private String userId;
	private String userIdCode;
	private String userAccount;
	private String userMaile;
	private String userTelnumber;
	private String userCreateTime;
	
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
	
	public void setUserCreateTime(String userCreateTime){
		this.userCreateTime=userCreateTime;
	}
	public String getUserCreateTime(){
		return this.userCreateTime;
	}
}
