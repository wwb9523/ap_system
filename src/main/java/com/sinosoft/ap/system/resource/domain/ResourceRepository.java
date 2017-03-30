package com.sinosoft.ap.system.resource.domain;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ResourceRepository {

	/**
	 * 获取该人的权限模块
	 * @param userId
	 * @return
	 */
	List<ResourceVO> selectList(ResourceVO resource);
	void delete(ResourceVO resource);
	void insert(ResourceVO resource);
	void updateByPrimaryColumn(ResourceVO resource);
	void insertRelIcon(@Param("resourceId")String resourceId,@Param("resourceIconId")String resourceIconId);
	void updateRelIconById(@Param("resourceId")String resourceId,@Param("resourceIconId")String resourceIconId);
	void deleteRelIconById(@Param("resourceId")String resourceId,@Param("resourceIconId")String resourceIconId);
	String selectRelIconById(String resourceId);
}
