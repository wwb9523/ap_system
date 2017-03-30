package com.sinosoft.ap.system.resource.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.ap.system.resource.domain.ResourceVO;
import com.sinosoft.ap.system.resource.service.ResourceService;


@Controller
@RequestMapping("/resource")
public class ResourceController {
	
	@Autowired
	private ResourceService resourceService;

	@RequestMapping("findALL")
	@ResponseBody
	public String findAll() {
		ResourceVO resourceVO=resourceService.findAll();
		return resourceVO.getResourceId();
	}
	
	/**
	 * 前往修改字典信息页面
	 * @param id
	 * @return
	 */
	@RequestMapping("findList")
	@ResponseBody
	public List<ResourceVO> findList(ResourceVO resource) {
		List<ResourceVO> resourceVO=resourceService.findList(resource);
		return resourceVO;
	}
	
	@RequestMapping("remove")
	@ResponseBody
	public void remove(ResourceVO resource) {
		resourceService.remove(resource);
		String resourceIconId=resourceService.findRelIconById(resource.getResourceId());
		if(resourceIconId!=null)
		resourceService.removeRelIconById(resource.getResourceId(),resourceIconId);
	}
	
	@RequestMapping("saveResource")
	@ResponseBody
	public void save(ResourceVO resource,String resourceIconId) {
		resourceService.addRelIcon(resource.getResourceId(), resourceIconId);
		resourceService.save(resource);
	}
	
	@RequestMapping("modify")
	@ResponseBody
	public void modifyByPrimaryColumn(ResourceVO resource,String resourceIconId){
		resourceService.modifyRelIconById(resource.getResourceId(), resourceIconId);
		resourceService.modifyByPrimaryColumn(resource);
	}
}
