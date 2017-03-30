package com.sinosoft.ap.system.organization.domain;

import java.sql.Date;

public class OrganizationVO {
	private String organId;
	private String organName;
	private String organCode;
	private Integer organSort;
	private String organParentId;
	private Integer organLevel;
	private Date organCreateTime;
	private String organDesc;
	
	public void setOrganId(String organId){
		this.organId=organId;
	}
	public String getOrganId(){
		return this.organId;
	}
	
	public void setOrganName(String organName){
		this.organName=organName;
	}
	public String getOrganName(){
		return this.organName;
	}
	
	public void setOrganCode(String organCode){
		this.organCode=organCode;
	}
	public String getOrganCode(){
		return this.organCode;
	}
	
	public void setOrganSort(Integer organSort){
		this.organSort=organSort;
	}
	public Integer getOrganSort(){
		return this.organSort;
	}
	
	public void setOrganParentId(String organParentId){
		this.organParentId=organParentId;
	}
	public String getOrganParentId(){
		return this.organParentId;
	}
	
	public void setOrganLevel(Integer organLevel){
		this.organLevel=organLevel;
	}
	public Integer getOrganLevel(){
		return this.organLevel;
	}
	
	public void setOrganCreateTime(Date organCreateTime){
		this.organCreateTime=organCreateTime;
	}
	public Date getOrganCreateTime(){
		return this.organCreateTime;
	}
	
	public void setOrganDesc(String organDesc){
		this.organDesc=organDesc;
	}
	public String getOrganDesc(){
		return this.organDesc;
	}
}
