package com.sinosoft.ap.system.resource.domain;

import java.util.List;

import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;

public interface ResourceRepository {

	/**
	 * 获取该人的权限模块
	 * @param userId
	 * @return
	 */
//	@Select(value="select e.* from t_user_role b left join t_role c on b.role_id=c.id left join t_role_module d on c.id=d.role_id left join t_module e on d.module_id=e.id where b.user_id=#{userId}")
	List<ResourceEntity> selectList(ResourceEntity resource);
	void delete(ResourceEntity resource);
	void insert(ResourceEntity resource);
	void updateByPrimaryColumn(ResourceEntity resource);
}