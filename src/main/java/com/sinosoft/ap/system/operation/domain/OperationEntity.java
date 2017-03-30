package com.sinosoft.ap.system.operation.domain;

import java.util.Date;

public class OperationEntity {
	private String OPERATION_ID;
	private String RESOURCE_ID;
	private String OPERATION_NAME;
	private String OPERATION_DESC;
	private Date OPERATION_TIME;
	
	public String getOPERETION_ID() {
		return OPERATION_ID;
	}
	public void setOPERETION_ID(String oPERETION_ID) {
		OPERATION_ID = oPERETION_ID;
	}
	public String getRESOURCE_ID() {
		return RESOURCE_ID;
	}
	public void setRESOURCE_ID(String rESOURCE_ID) {
		RESOURCE_ID = rESOURCE_ID;
	}
	public String getOPERETION_NAME() {
		return OPERATION_NAME;
	}
	public void setOPERETION_NAME(String oPERETION_NAME) {
		OPERATION_NAME = oPERETION_NAME;
	}
	public String getOPERETION_DESC() {
		return OPERATION_DESC;
	}
	public void setOPERETION_DESC(String oPERETION_DESC) {
		OPERATION_DESC = oPERETION_DESC;
	}
	public Date getOPERETION_TIME() {
		return OPERATION_TIME;
	}
	public void setOPERETION_TIME(Date oPERETION_TIME) {
		OPERATION_TIME = oPERETION_TIME;
	}
}
