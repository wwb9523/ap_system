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
@RequestMapping("/resource")
public class ResourceIconController {
	
	@Autowired
	private ResourceIconService resourceIconService;

	/**
	 * 前往修改字典信息页面
	 * @param id
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public void save(ResourceIconVO resourceIcon) {
		resourceIconService.save(resourceIcon);
	}
}
