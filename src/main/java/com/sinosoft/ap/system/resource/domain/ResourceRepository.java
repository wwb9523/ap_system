package com.sinosoft.ap.system.resource.domain;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ResourceRepository {

	/**
	 * 获取该人的权限模块
	 * @param userId
	 * @return
	 */
	ResourceVO selectAll();
	List<ResourceVO> selectList(ResourceVO resource);
	int delete(ResourceVO resource);
	int insert(ResourceVO resource);
	int updateByPrimaryColumn(ResourceVO resource);
	int insertRelIcon(ResourceVO resource);
	int updateRelIconById(ResourceVO resource);
	int deleteRelIconById(ResourceVO resource);
	String selectRelIconById(String resourceId);
}
