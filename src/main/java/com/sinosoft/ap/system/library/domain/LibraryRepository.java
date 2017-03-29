package com.sinosoft.ap.system.library.domain;

public interface LibraryRepository {

	/**
	 * 获取该人的权限模块
	 * @param userId
	 * @return
	 */
//	@Select(value="select e.* from t_user_role b left join t_role c on b.role_id=c.id left join t_role_module d on c.id=d.role_id left join t_module e on d.module_id=e.id where b.user_id=#{userId}")
	LibraryEntity findLibraryById(String id);
}
