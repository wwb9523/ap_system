package com.sinosoft.ap.system.library.service;

import java.util.List;

import com.sinosoft.ap.system.library.domain.LibraryEntity;


public interface LibraryService {
	
	/**
	 * 根据ID获取字典信息
	 * @param userId
	 * @return
	 */
	LibraryEntity findLibraryById(String id);
	
	/**
	 * 获取字典全部的信息
	 * @return
	 */
	List<LibraryEntity> findLibraryAll();
}
