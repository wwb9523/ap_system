package com.sinosoft.ap.system.library.service;

import java.util.List;

import com.sinosoft.ap.system.library.domain.LibraryEntity;


public interface LibraryService {
	/**
	 * 根据id获取字典信息
	 * @param id
	 * @return
	 */
	LibraryEntity findLibraryById(String id);
	
	/**
	 * 获取全部的字典信息
	 * @return
	 */
	List<LibraryEntity> findLibraryInfoAll();
	
	boolean deleteLibraruById(String id);
}
