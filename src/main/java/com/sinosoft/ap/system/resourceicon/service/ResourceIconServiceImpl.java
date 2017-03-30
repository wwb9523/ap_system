package com.sinosoft.ap.system.resourceicon.service;

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
	public  void remove(ResourceIconVO resourceIcon){
		resourceIconRepository.delete(resourceIcon);
	}
	
	@Override
	public void save(ResourceIconVO resourceIcon){
		resourceIconRepository.insert(resourceIcon);
	}
	
}
