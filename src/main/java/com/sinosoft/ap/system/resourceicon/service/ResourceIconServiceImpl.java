package com.sinosoft.ap.system.resourceicon.service;

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
	public ResourceIconEntity findIconByUserId(String id) {
		return resourceIconRepository.findIconByUserId(id);
	}
}
