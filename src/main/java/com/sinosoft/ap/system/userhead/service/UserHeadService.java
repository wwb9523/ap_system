package com.sinosoft.ap.system.userhead.service;

import com.sinosoft.ap.system.userhead.domain.UserHeadEntity;


public interface UserHeadService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	UserHeadEntity findHeadByUserId(String id);
}
