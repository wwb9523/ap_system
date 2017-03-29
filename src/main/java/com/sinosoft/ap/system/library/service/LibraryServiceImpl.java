package com.sinosoft.ap.system.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.library.domain.LibraryEntity;
import com.sinosoft.ap.system.library.domain.LibraryRepository;


@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	private LibraryRepository libraryRepository;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	@Override
	public LibraryEntity findLibraryById(String id) {
		return libraryRepository.findLibraryById(id);
	}
}
