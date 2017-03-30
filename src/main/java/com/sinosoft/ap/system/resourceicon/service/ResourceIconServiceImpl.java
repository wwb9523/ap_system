package com.sinosoft.ap.system.resourceicon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.resourceicon.domain.ResourceIconRepository;
import com.sinosoft.ap.system.resourceicon.domain.ResourceIconVO;


@Service
public class ResourceIconServiceImpl implements ResourceIconService{
	@Autowired
	private ResourceIconRepository resourceIconRepository;
	
	/**
	 * 
	 */
	
	@Override
	public  void remove(ResourceIconVO icon){
		resourceIconRepository.delete(icon);
	}
	
	@Override
	public void save(ResourceIconVO icon){
		resourceIconRepository.insert(icon);
	}
	
}
