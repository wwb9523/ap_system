package com.sinosoft.ap.system.resourceicon.service;

import java.util.List;

import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;




public interface ResourceIconService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	void remove(ResourceIconEntity icon);
	void save(ResourceIconEntity icon);
}
