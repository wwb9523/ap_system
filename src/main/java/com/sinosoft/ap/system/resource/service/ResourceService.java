package com.sinosoft.ap.system.resource.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sinosoft.ap.system.resource.domain.ResourceVO;


public interface ResourceService {
	/**
	 * 获取模块
	 * @param userId
	 * @return
	 */
	ResourceVO findAll();
	List<ResourceVO> findList(ResourceVO resource);
	int remove(ResourceVO resource);
	int save(ResourceVO resource);
	int modifyByPrimaryColumn(ResourceVO resource);
	int addRelIcon(ResourceVO resource);
	int modifyRelIconById(ResourceVO resource);
	int removeRelIconById(ResourceVO resource);
	String findRelIconById(String resourceId);
}
