package com.sinosoft.ap.system.library.domain;

public class LibraryEntity {
	private String libraryId;
	private String libraryName;
	private String libraryCode;
	private String libraryDesc;
	private String libraryCreateTime;
	
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
	public String getLibraryCode(){
		return this.libraryCode;
	}
	
	public void setLibraryDesc(){
		this.libraryDesc=libraryDesc;
	}
	public String getLibraryDesc(){
		return this.libraryDesc;
	}
	
	public void setLibraryCreateTime(String libraryCreateTime){
		this.libraryCreateTime=libraryCreateTime;
	}
	public String getLibraryCreateTime(){
		return this.libraryCreateTime;
	}
	
}
