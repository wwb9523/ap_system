package com.sinosoft.ap.system.permission.service;

import java.util.List;

import com.sinosoft.ap.system.permission.domain.ModuleInfo;



public interface ModuleService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	List<ModuleInfo> findModuleByUserId(int userId);
}
