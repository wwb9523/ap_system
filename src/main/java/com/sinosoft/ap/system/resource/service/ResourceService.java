package com.sinosoft.ap.system.resource.service;

import java.util.List;

import com.sinosoft.ap.system.library.domain.LibraryEntity;
import com.sinosoft.ap.system.resource.domain.ResourceEntity;
import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;


public interface ResourceService {
	/**
	 * 获取模块
	 * @param userId
	 * @return
	 */
	List<ResourceEntity> findList(ResourceEntity resource);
	void remove(ResourceEntity resource);
	void save(ResourceEntity resource);
	void modifyByPrimaryColumn(ResourceEntity resource);
}
