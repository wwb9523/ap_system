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

	/**
	 * 前往修改字典信息页面
	 * @param id
	 * @return
	 */
	@RequestMapping("jumpInfoPage")
	@ResponseBody
	public List<ResourceVO> findList(ResourceVO operation) {
		List<ResourceVO> operationVO=resourceService.findList(operation);
		return operationVO;
	}
}
