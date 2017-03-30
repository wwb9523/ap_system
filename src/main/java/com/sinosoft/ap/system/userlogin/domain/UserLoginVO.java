package com.sinosoft.ap.system.userlogin.domain;

public class UserLoginVO {
	private String userId;
	private String userIdCode;
	private String userAccount;
	private String userMaile;
	private String userTelnumber;
	private String password;
	
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
		this.userMaile=userMaile;
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
	
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}
}
