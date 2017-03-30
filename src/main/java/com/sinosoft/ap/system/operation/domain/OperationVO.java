package com.sinosoft.ap.system.operation.domain;

import java.sql.Date;

public class OperationVO {
	private String OPERATION_ID;
	private String RESOURCE_ID;
	private String OPERATION_NAME;
	private String OPERATION_DESC;
	private Date OPERATION_TIME;
	
	public String getOPERATION_ID() {
		return OPERATION_ID;
	}
	public void setOPERATION_ID(String oPERATION_ID) {
		OPERATION_ID = oPERATION_ID;
	}
	public String getRESOURCE_ID() {
		return RESOURCE_ID;
	}
	public void setRESOURCE_ID(String rESOURCE_ID) {
		RESOURCE_ID = rESOURCE_ID;
	}
	public String getOPERATION_NAME() {
		return OPERATION_NAME;
	}
	public void setOPERATION_NAME(String oPERATION_NAME) {
		OPERATION_NAME = oPERATION_NAME;
	}
	public String getOPERATION_DESC() {
		return OPERATION_DESC;
	}
	public void setOPERATION_DESC(String oPERATION_DESC) {
		OPERATION_DESC = oPERATION_DESC;
	}
	public Date getOPERATION_TIME() {
		return OPERATION_TIME;
	}
	public void setOPERATION_TIME(Date oPERATION_TIME) {
		OPERATION_TIME = oPERATION_TIME;
	}
	
	
}
