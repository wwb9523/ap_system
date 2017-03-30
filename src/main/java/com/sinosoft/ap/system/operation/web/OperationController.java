package com.sinosoft.ap.system.operation.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.ap.system.operation.domain.OperationVO;
import com.sinosoft.ap.system.operation.service.OperationService;


@Controller
@RequestMapping("/operation")
public class OperationController {
	
	@Autowired
	private OperationService operationService;

	/**
	 * 前往修改字典信息页面
	 * @param id
	 * @return
	 */
	@RequestMapping("find")
	@ResponseBody
	public List<OperationVO> findList(OperationVO operation) {
		List<OperationVO> operationVO=operationService.findList(operation);
		return operationVO;
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public void remove(OperationVO operation) {
		operationService.remove(operation);
	}
	
	@RequestMapping("add")
	@ResponseBody
	public void save(OperationVO operation) {
		operationService.save(operation);
	}
	
	@RequestMapping("modify")
	@ResponseBody
	public void modifyByPrimaryColumn(OperationVO operation) {
		operationService.modifyByPrimaryColumn(operation);
	}
}
