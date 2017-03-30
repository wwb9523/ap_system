package com.sinosoft.ap.system.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.library.domain.LibraryVO;
import com.sinosoft.ap.system.library.domain.LibraryRepository;


@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	private LibraryRepository libraryRepository;

	/**
	 * 根据id获取字典信息
	 * @param id
	 * @return
	 */
	@Override
	public LibraryVO findLibraryById(String id) {
		return libraryRepository.findLibraryById(id);
	}
	
	/**
	 * 获取全部的字典信息
	 * @return
	 */
	@Override
	public List<LibraryVO> selectList(){
		return null;
	}
	
	/**
	 * 根据id删除字典信息
	 * @param id
	 * @return
	 */
	@Override
	public boolean deleteLibraruById(String id){
		int count=libraryRepository.delete(id);
		if (count>0){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 根据id删除字典信息
	 * @param id
	 * @return
	 */
	@Override
	public boolean insertLibrary(LibraryVO libraryVO){
		int count=libraryRepository.insert(libraryVO);
		if (count>0){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 根据id删除字典信息
	 * @param id
	 * @return
	 */
	@Override
	public boolean updateLibrary(LibraryVO libraryVO){
		int count=libraryRepository.updateByPrimaryColumn(libraryVO);
		if (count>0){
			return true;
		}else{
			return false;
		}
	}
}
