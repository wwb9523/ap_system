package com.sinosoft.ap.system.resourceicon.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.ap.system.resourceicon.domain.ResourceIconVO;
import com.sinosoft.ap.system.resourceicon.service.ResourceIconService;


@Controller
@RequestMapping("/apresourceIcon")
public class ResourceIconManage {
	
	@Autowired
	private ResourceIconService resourceIconService;

	/**
	 * 新增resourceIcon对象
	 * @param resourceIconVo
	 * @return
	 */
	@RequestMapping("add")
	@ResponseBody
	public String save(ResourceIconVO resourceIconVo) {
		resourceIconService.save(resourceIconVo);
		return "ceshi";
	}
	
	/**
	 * 根据resourceIconId删除resourceIcon对象
	 * @param resourceIconVo
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public void remove(ResourceIconVO resourceIcon) {
		String resourceId=resourceIconService.findResourceIconRelById(resourceIcon.getResourceIconId());
		if(resourceId==null)resourceIconService.remove(resourceIcon);
	}
}
