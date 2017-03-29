package com.sinosoft.ap.system.userloginlog.service;

import com.sinosoft.ap.system.userloginlog.domain.UserLoginLogEntity;



public interface UserLoginLogService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	UserLoginLogEntity findLogById(String id);
}
