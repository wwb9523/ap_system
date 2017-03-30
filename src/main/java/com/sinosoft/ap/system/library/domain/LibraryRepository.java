package com.sinosoft.ap.system.library.domain;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LibraryRepository {

	
	/**
	 * 获取全部的字典信息
	 * @return
	 */
	List<LibraryVO> findLibraryInfoAll();
	
	int deleteLibraruById(String id);
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
}
