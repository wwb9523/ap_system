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
		int count =resourceIconRepository.delete(resourceIcon);
		if(count<0){
			//	System.out.println("删除失败");
			}else{
		//		System.out.println("删除成功");
			}
	}
	
	@Override
	public void save(ResourceIconVO resourceIcon){
		int count = resourceIconRepository.insert(resourceIcon);
		if(count<0){
		//	System.out.println("添加失败");
		}else{
			//System.out.println("添加成功");
		}
	}
	
	@Override
	public String findResourceIconRelById(String resourceIconId){
		String resourceId=resourceIconRepository.selectResourceIconRelById(resourceIconId);
		return resourceId;
	}
}
