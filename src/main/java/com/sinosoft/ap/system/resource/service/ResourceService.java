package com.sinosoft.ap.system.resource.service;

import java.util.List;

import com.sinosoft.ap.system.resource.domain.ResourceVO;


public interface ResourceService {
	/**
	 * 获取模块
	 * @param userId
	 * @return
	 */
	List<ResourceVO> findList(ResourceVO resource);
	void remove(ResourceVO resource);
	void save(ResourceVO resource);
	void modifyByPrimaryColumn(ResourceVO resource);
}
