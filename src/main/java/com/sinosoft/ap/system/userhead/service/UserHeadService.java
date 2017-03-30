package com.sinosoft.ap.system.userhead.service;

import com.sinosoft.ap.system.userhead.domain.UserHeadVO;


public interface UserHeadService {
	
	public UserHeadVO findList(String userId);
	
	public void save(UserHeadVO userHeadVO);
	
	public void remove(String userHeadId);
	
	public void modifyByPrimaryColumn(UserHeadVO userHeadVO);
	
	
}
