package com.sinosoft.ap.system.permission.domain;

import java.sql.Date;

public class PermissionVO {
	private String PERMISSION_ID;
	private String PERMISSION_NAME;
	private String PERMISSION_CODE;
	private String PERMISSION_DESC;
	private Date PERMISSION_CREATTIME;
	public String getPERMISSION_ID() {
		return PERMISSION_ID;
	}
	public void setPERMISSION_ID(String pERMISSION_ID) {
		PERMISSION_ID = pERMISSION_ID;
	}
	public String getPERMISSION_NAME() {
		return PERMISSION_NAME;
	}
	public void setPERMISSION_NAME(String pERMISSION_NAME) {
		PERMISSION_NAME = pERMISSION_NAME;
	}
	public String getPERMISSION_CODE() {
		return PERMISSION_CODE;
	}
	public void setPERMISSION_CODE(String pERMISSION_CODE) {
		PERMISSION_CODE = pERMISSION_CODE;
	}
	public String getPERMISSION_DESC() {
		return PERMISSION_DESC;
	}
	public void setPERMISSION_DESC(String pERMISSION_DESC) {
		PERMISSION_DESC = pERMISSION_DESC;
	}
	public Date getPERMISSION_CREATTIME() {
		return PERMISSION_CREATTIME;
	}
	public void setPERMISSION_CREATTIME(Date pERMISSION_CREATTIME) {
		PERMISSION_CREATTIME = pERMISSION_CREATTIME;
	}
}
