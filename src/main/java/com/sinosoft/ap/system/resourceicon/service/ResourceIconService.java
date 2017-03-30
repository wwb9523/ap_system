package com.sinosoft.ap.system.resourceicon.service;

import java.util.List;

import com.sinosoft.ap.system.resourceicon.domain.ResourceIconVO;





public interface ResourceIconService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	void remove(ResourceIconVO resourceIcon);
	void save(ResourceIconVO resourceIcon);
	
}
