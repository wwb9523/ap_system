package com.sinosoft.ap.system.resource.domain;

import java.sql.Date;

public class ResourceVO {
	private String resourceId;
	private String resourceName;
	private String resourceType;
	private String resourceAddress;
	private String resourceParentId;
	private String resourceDesc;
	private int resourceLevel;
	private Date resourceCreateTime;
	private int resourceSort;
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getResourceAddress() {
		return resourceAddress;
	}
	public void setResourceAddress(String resourceAddress) {
		this.resourceAddress = resourceAddress;
	}
	public String getResourceParentId() {
		return resourceParentId;
	}
	public void setResourceParentId(String resourceParentId) {
		this.resourceParentId = resourceParentId;
	}
	public String getResourceDesc() {
		return resourceDesc;
	}
	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}
	public int getResourceLevel() {
		return resourceLevel;
	}
	public void setResourceLevel(int resourceLevel) {
		this.resourceLevel = resourceLevel;
	}
	public Date getResourceCreateTime() {
		return resourceCreateTime;
	}
	public void setResourceCreateTime(Date resourceCreateTime) {
		this.resourceCreateTime = resourceCreateTime;
	}
	public int getResourceSort() {
		return resourceSort;
	}
	public void setResourceSort(int resourceSort) {
		this.resourceSort = resourceSort;
	}
	
}
