package com.sinosoft.ap.system.library.service;

import java.util.List;

import com.sinosoft.ap.system.library.domain.LibraryVO;


public interface LibraryService {
	
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
	boolean deleteLibraruById(String id);
	
	boolean insertLibrary(LibraryVO libraryVO);
	
	boolean updateLibrary(LibraryVO libraryVO);
}
