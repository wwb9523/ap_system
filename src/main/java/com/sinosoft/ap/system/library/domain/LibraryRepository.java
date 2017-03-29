package com.sinosoft.ap.system.library.domain;

import java.util.List;

public interface LibraryRepository {

	/**
	 * 根据id获取字典信息
	 * @param id
	 * @return
	 */
//	@Select(value="select e.* from t_user_role b left join t_role c on b.role_id=c.id left join t_role_module d on c.id=d.role_id left join t_module e on d.module_id=e.id where b.user_id=#{userId}")
	LibraryEntity findLibraryById(String id);
	
	/**
	 * 获取全部的字典信息
	 * @return
	 */
	List<LibraryEntity> findLibraryInfoAll();
	
	int deleteLibraruById(String id);
}
