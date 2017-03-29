package com.sinosoft.ap.system.library.service;

import com.sinosoft.ap.system.library.domain.LibraryEntity;


public interface LibraryService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	LibraryEntity findLibraryById(String id);
}
