package com.sinosoft.ap.system.resourceicon.service;

import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;




public interface ResourceIconService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	ResourceIconEntity findIconByUserId(String id);
}
