package com.sinosoft.ap.system.resource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.resource.domain.ResourceRepository;
import com.sinosoft.ap.system.resource.domain.ResourceVO;


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
	public List<ResourceVO> findAll() {
		return resourceRepository.selectAll();
	}
	
	@Override
	public List<ResourceVO> findList(ResourceVO resource) {
		return resourceRepository.selectList(resource);
	}
	
	@Override
	public  void remove(ResourceVO resource){
		resourceRepository.delete(resource);
	}
	
	@Override
	public void save(ResourceVO resource){
		resourceRepository.insert(resource);
	}
	
	@Override
	public void modifyByPrimaryColumn(ResourceVO resource){
		resourceRepository.updateByPrimaryColumn(resource);
	}
}
