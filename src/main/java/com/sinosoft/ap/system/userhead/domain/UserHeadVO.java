package com.sinosoft.ap.system.userhead.domain;


public class UserHeadVO {
	private String userHeadId;
	private String userId;
	private String userHeadAddress;
	
	public void setUserHeadId(String userHeadId){
		this.userHeadId=userHeadId;
	}
	public String getUserHeadId(){
		return this.userHeadId;
	}
	
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return this.userId;
	}
	
	public void setUserHeadAddress(String userHeadAddress){
		this.userHeadAddress=userHeadAddress;
	}
	public String getUserHeadAddress(){
		return this.userHeadAddress;
	}
}
