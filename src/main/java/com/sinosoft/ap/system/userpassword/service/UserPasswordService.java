package com.sinosoft.ap.system.userpassword.service;

import com.sinosoft.ap.system.userpassword.domain.UserPasswordEntity;


public interface UserPasswordService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	UserPasswordEntity findPasswordById(String id);
}
