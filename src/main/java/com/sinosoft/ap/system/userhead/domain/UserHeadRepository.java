package com.sinosoft.ap.system.userhead.domain;


public interface UserHeadRepository {
	
	public UserHeadVO selectList(String userId);
	
	public void delete(String userHeadId);
	
	public void insert(UserHeadVO userHeadVO);
	
	public void updateByPrimaryColumn(UserHeadVO userHeadVO);
}
