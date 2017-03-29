package com.sinosoft.ap.system.resource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.resource.domain.ResourceEntity;
import com.sinosoft.ap.system.resource.domain.ResourceRepository;


@Service
public class ResourceServiceImpl implements ResourceService{
	@Autowired
	private ResourceRepository resourceRepository;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	@Override
	public ResourceEntity findResourceById(String id) {
		return resourceRepository.findResourceById(id);
	}
}
