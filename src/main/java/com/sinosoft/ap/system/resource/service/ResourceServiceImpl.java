package com.sinosoft.ap.system.resource.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	public ResourceVO findAll() {
		return resourceRepository.selectAll();
	}
	
	@Override
	public List<ResourceVO> findList(ResourceVO resource) {
		return resourceRepository.selectList(resource);
	}
	
	@Override
	public  int remove(ResourceVO resource){
		int count=resourceRepository.delete(resource);
		return count;
	}
	
	@Override
	public int save(ResourceVO resource){
		int count=resourceRepository.insert(resource);
		return count;
	}
	
	@Override
	public int modifyByPrimaryColumn(ResourceVO resource){
		int count=resourceRepository.updateByPrimaryColumn(resource);
		return count;
	}
	
	@Override
	public int addRelIcon(ResourceVO resource){
		int count=resourceRepository.insertRelIcon(resource);
		return count;
	}
	
	@Override
	public int modifyRelIconById(ResourceVO resource){
		int count=resourceRepository.updateRelIconById(resource);
		return count;
	}
	
	@Override
	public int removeRelIconById(ResourceVO resource){
		int count=resourceRepository.updateRelIconById(resource);
		return count;
	}
	
	@Override
	public String findRelIconById(String resourceId){
		String resourceIconId=resourceRepository.selectRelIconById(resourceId);
		return resourceIconId;
	}
}
