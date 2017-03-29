package com.sinosoft.ap.system.operation.domain;

import java.sql.Date;

public class OperationEntity {
	private String OPERETION_ID;
	private String RESOURCE_ID;
	private String OPERETION_NAME;
	private String OPERETION_DESC;
	private Date OPERETION_TIME;
	public String getOPERETION_ID() {
		return OPERETION_ID;
	}
	public void setOPERETION_ID(String oPERETION_ID) {
		OPERETION_ID = oPERETION_ID;
	}
	public String getRESOURCE_ID() {
		return RESOURCE_ID;
	}
	public void setRESOURCE_ID(String rESOURCE_ID) {
		RESOURCE_ID = rESOURCE_ID;
	}
	public String getOPERETION_NAME() {
		return OPERETION_NAME;
	}
	public void setOPERETION_NAME(String oPERETION_NAME) {
		OPERETION_NAME = oPERETION_NAME;
	}
	public String getOPERETION_DESC() {
		return OPERETION_DESC;
	}
	public void setOPERETION_DESC(String oPERETION_DESC) {
		OPERETION_DESC = oPERETION_DESC;
	}
	public Date getOPERETION_TIME() {
		return OPERETION_TIME;
	}
	public void setOPERETION_TIME(Date oPERETION_TIME) {
		OPERETION_TIME = oPERETION_TIME;
	}
}
