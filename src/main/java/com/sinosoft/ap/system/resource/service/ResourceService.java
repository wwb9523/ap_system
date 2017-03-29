package com.sinosoft.ap.system.resource.service;

import com.sinosoft.ap.system.library.domain.LibraryEntity;
import com.sinosoft.ap.system.resource.domain.ResourceEntity;


public interface ResourceService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	ResourceEntity findResourceById(String id);
}
