package com.sinosoft.ap.system.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.library.domain.LibraryEntity;
import com.sinosoft.ap.system.library.domain.LibraryMapper;


@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	private LibraryMapper libraryMapper;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	@Override
	public LibraryEntity findLibraryById(String id) {
		return libraryMapper.findLibraryById(id);
	}
}
