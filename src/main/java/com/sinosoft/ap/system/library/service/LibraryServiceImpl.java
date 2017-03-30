package com.sinosoft.ap.system.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.library.domain.LibraryEntity;
import com.sinosoft.ap.system.library.domain.LibraryRepository;


@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	private LibraryRepository libraryRepository;
	
	/**
	 * 获取全部的字典信息
	 * @return
	 */
	@Override
	public List<LibraryEntity> findLibraryInfoAll(){
		return null;
	}
	
	/**
	 * 根据id删除字典信息
	 * @param id
	 * @return
	 */
	@Override
	public boolean deleteLibraruById(String id){
		int count=libraryRepository.deleteLibraruById(id);
		if (count>0){
			return true;
		}else{
			return false;
		}
	}
}
