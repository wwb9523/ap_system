package com.sinosoft.ap.system.role.domain;

import java.util.Date;

public class RoleEntity {
	private String ROLE_ID;
	private String ROLE_NAME;
	private String ROLE_CODE;
	private String ROLE_DESC;
	private Date ROLE_CREATTIME;
	
	public String getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(String rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public String getROLE_NAME() {
		return ROLE_NAME;
	}
	public void setROLE_NAME(String rOLE_NAME) {
		ROLE_NAME = rOLE_NAME;
	}
	public String getROLE_CODE() {
		return ROLE_CODE;
	}
	public void setROLE_CODE(String rOLE_CODE) {
		ROLE_CODE = rOLE_CODE;
	}
	public String getROLE_DESC() {
		return ROLE_DESC;
	}
	public void setROLE_DESC(String rOLE_DESC) {
		ROLE_DESC = rOLE_DESC;
	}
	public Date getROLE_CREATTIME() {
		return ROLE_CREATTIME;
	}
	public void setROLE_CREATTIME(Date rOLE_CREATTIME) {
		ROLE_CREATTIME = rOLE_CREATTIME;
	}
}
