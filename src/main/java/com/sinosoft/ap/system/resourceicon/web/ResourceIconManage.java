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
@RequestMapping("/resourceIcon")
public class ResourceIconManage {
	
	@Autowired
	private ResourceIconService resourceIconService;

	/**
	 * 前往修改字典信息页面
	 * @param id
	 * @return
	 */
	@RequestMapping("add")
	@ResponseBody
	public String save(ResourceIconVO resourceIconVo) {
		resourceIconService.save(resourceIconVo);
		return "ceshi";
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public void remove(ResourceIconVO resourceIcon) {
		String resourceId=resourceIconService.findResourceIconRelById(resourceIcon.getResourceIconId());
		if(resourceId==null)resourceIconService.remove(resourceIcon);
	}
}
