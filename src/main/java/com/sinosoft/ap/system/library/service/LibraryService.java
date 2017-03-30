package com.sinosoft.ap.system.library.service;

import java.util.List;

<<<<<<< HEAD
import com.sinosoft.ap.system.library.domain.LibraryEntity;
=======
import com.sinosoft.ap.system.library.domain.LibraryVO;
>>>>>>> 37025cec6bed888210871f3031eee274de268890


public interface LibraryService {
	
	/**
<<<<<<< HEAD
	 * 获取全部的字典信息
	 * @return
	 */
	List<LibraryEntity> findLibraryInfoAll();
	
	boolean deleteLibraruById(String id);
=======
	 * 根据id获取字典信息
	 * @param id
	 * @return
	 */
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
>>>>>>> 37025cec6bed888210871f3031eee274de268890
}
