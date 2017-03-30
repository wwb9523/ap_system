package com.sinosoft.ap.system.library.domain;

import java.util.List;

public interface LibraryRepository {

	
	/**
	 * 获取全部的字典信息
	 * @return
	 */
	List<LibraryEntity> findLibraryInfoAll();
	
	int deleteLibraruById(String id);
}
