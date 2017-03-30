package com.sinosoft.ap.system.user.domain;

import java.sql.Date;

public class UserVO {
	private String userId;
	private String userIdCode;
	private String userAccount;
	private String userMaile;
	private Integer userTelnumber;
	private Date userCreattime;
	
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
	
	public void setUserTelnumber(Integer userTelnumber){
		this.userTelnumber=userTelnumber;
	}
	public Integer getUserTelnumber(){
		return this.userTelnumber;
	}
	
	public void setUserCreattime(Date userCreattime){
		this.userCreattime=userCreattime;
	}
	public Date getUserCreateTime(){
		return this.userCreattime;
	}

}
