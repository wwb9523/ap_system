package com.sinosoft.ap.system.library.domain;

import java.sql.Date;

public class LibraryEntity {
	private String libraryId;
	private String libraryName;
	private String libraryCode;
	private String libraryDesc;
	private Date libraryCreateTime;
	public String getLibraryCode() {
		return libraryCode;
	}
	
	public void setLibraryId(String libraryId){
		this.libraryId=libraryId;
	}
	public String getLibraryId(){
		return this.libraryId;
	}
	public void setLibraryName(String libraryName){
		this.libraryName=libraryName;
	}
	public String getLibraryName(){
		return this.libraryName;
	}
	
	public void setLibraryCode(String libraryCode){
		this.libraryCode=libraryCode;
	}
	public String getLibraryDesc(){
		return this.libraryDesc;
	}
	public Date getLibraryCreateTime() {
		return libraryCreateTime;
	}
	public void setLibraryCreateTime(Date libraryCreateTime) {
		this.libraryCreateTime = libraryCreateTime;
	}
	public void setLibraryDesc(String libraryDesc) {
		this.libraryDesc = libraryDesc;
	}
		
}
