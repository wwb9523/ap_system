package com.sinosoft.ap.system.resource.domain;

import java.util.Date;

public class ResourceEntity {
	private String RESOURCE_ID;
	private String RESOURCE_NAME;
	private String RESOURCE_TYPE;
	private String RESOURCE_ADDRESS;
	private String RESOURCE_PARENT_ID;
	private String RESOURCE_DESC;
	private int RESOURCE_LEVEL;
	private Date RESOURCE_CREATTIME;
	private int RESOURCE_SORT;
	public String getRESOURCE_ID() {
		return RESOURCE_ID;
	}
	public void setRESOURCE_ID(String rESOURCE_ID) {
		RESOURCE_ID = rESOURCE_ID;
	}
	public String getRESOURCE_NAME() {
		return RESOURCE_NAME;
	}
	public void setRESOURCE_NAME(String rESOURCE_NAME) {
		RESOURCE_NAME = rESOURCE_NAME;
	}
	public String getRESOURCE_TYPE() {
		return RESOURCE_TYPE;
	}
	public void setRESOURCE_TYPE(String rESOURCE_TYPE) {
		RESOURCE_TYPE = rESOURCE_TYPE;
	}
	public String getRESOURCE_ADDRESS() {
		return RESOURCE_ADDRESS;
	}
	public void setRESOURCE_ADDRESS(String rESOURCE_ADDRESS) {
		RESOURCE_ADDRESS = rESOURCE_ADDRESS;
	}
	public String getRESOURCE_PARENT_ID() {
		return RESOURCE_PARENT_ID;
	}
	public void setRESOURCE_PARENT_ID(String rESOURCE_PARENT_ID) {
		RESOURCE_PARENT_ID = rESOURCE_PARENT_ID;
	}
	public String getRESOURCE_DESC() {
		return RESOURCE_DESC;
	}
	public void setRESOURCE_DESC(String rESOURCE_DESC) {
		RESOURCE_DESC = rESOURCE_DESC;
	}
	public int getRESOURCE_LEVEL() {
		return RESOURCE_LEVEL;
	}
	public void setRESOURCE_LEVEL(int rESOURCE_LEVEL) {
		RESOURCE_LEVEL = rESOURCE_LEVEL;
	}
	public Date getRESOURCE_CREATTIME() {
		return RESOURCE_CREATTIME;
	}
	public void setRESOURCE_CREATTIME(Date rESOURCE_CREATTIME) {
		RESOURCE_CREATTIME = rESOURCE_CREATTIME;
	}
	public int getRESOURCE_SORT() {
		return RESOURCE_SORT;
	}
	public void setRESOURCE_SORT(int rESOURCE_SORT) {
		RESOURCE_SORT = rESOURCE_SORT;
	}
}
