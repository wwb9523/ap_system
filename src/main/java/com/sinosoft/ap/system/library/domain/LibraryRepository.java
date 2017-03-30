package com.sinosoft.ap.system.library.domain;

import java.util.List;

<<<<<<< HEAD
=======
import org.apache.ibatis.annotations.Param;

>>>>>>> 37025cec6bed888210871f3031eee274de268890
public interface LibraryRepository {

	
	/**
<<<<<<< HEAD
	 * 获取全部的字典信息
	 * @return
	 */
	List<LibraryEntity> findLibraryInfoAll();
	
	int deleteLibraruById(String id);
=======
	 * 根据id获取字典信息
	 * @param id
	 * @return
	 */
//	@Select(value="select e.* from t_user_role b left join t_role c on b.role_id=c.id left join t_role_module d on c.id=d.role_id left join t_module e on d.module_id=e.id where b.user_id=#{userId}")
	LibraryVO findLibraryById(String id);
	
	/**
	 * 获取全部的字典信息
	 * @return
	 */
	List<LibraryVO> selectList();
	
	/**
	 * 根据id删除字典信息
	 * @param id
	 * @return
	 */
	int delete(String id);
	
	/**
	 * 更新字典信息
	 * @param libraryEntity
	 * @return
	 */
	int updateByPrimaryColumn(@Param("library")LibraryVO libraryVO);
	
	/**
	 * 新增字典信息
	 * @param libraryEntity
	 * @return
	 */
	int insert(@Param("library")LibraryVO libraryVO);
>>>>>>> 37025cec6bed888210871f3031eee274de268890
}
