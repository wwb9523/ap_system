package com.sinosoft.ap.system.resourceicon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;
import com.sinosoft.ap.system.resourceicon.domain.ResourceIconRepository;


@Service
public class ResourceIconServiceImpl implements ResourceIconService{
	@Autowired
	private ResourceIconRepository resourceIconRepository;
	
	/**
	 * 
	 */
	
	@Override
	public  void remove(ResourceIconEntity icon){
		resourceIconRepository.delete(icon);
	}
	
	@Override
	public void save(ResourceIconEntity icon){
		resourceIconRepository.insert(icon);
	}
	
}
