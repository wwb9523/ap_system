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
	List<ResourceVO> findList(ResourceVO resource);
	void remove(ResourceVO resource);
	void save(ResourceVO resource);
	void modifyByPrimaryColumn(ResourceVO resource);
	void addRelIcon(String resourceId,String resourceIconId);
	void modifyRelIconById(@Param("resourceId")String resourceId,@Param("resourceIconId")String resourceIconId);
	void removeRelIconById(@Param("resourceId")String resourceId,@Param("resourceIconId")String resourceIconId);
	String findRelIconById(String resourceId);
}
