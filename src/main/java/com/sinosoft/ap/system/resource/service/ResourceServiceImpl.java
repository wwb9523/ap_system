package com.sinosoft.ap.system.resource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.resource.domain.ResourceEntity;
import com.sinosoft.ap.system.resource.domain.ResourceRepository;
import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;


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
	public List<ResourceEntity> findList(ResourceEntity resource) {
		return resourceRepository.selectList(resource);
	}
	
	@Override
	public  void remove(ResourceEntity resource){
		resourceRepository.delete(resource);
	}
	
	@Override
	public void save(ResourceEntity resource){
		resourceRepository.insert(resource);
	}
	
	@Override
	public void modifyByPrimaryColumn(ResourceEntity resource){
		resourceRepository.updateByPrimaryColumn(resource);
	}
}
