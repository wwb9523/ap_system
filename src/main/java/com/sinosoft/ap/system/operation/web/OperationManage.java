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
@RequestMapping("/apoperation")
public class OperationManage {
	
	@Autowired
	private OperationService operationService;

	/**
	 * 根据operationId查询operation对象
	 * @param operation
	 * @return
	 */
	@RequestMapping("find")
	@ResponseBody
	public List<OperationVO> findList(OperationVO operation) {
		List<OperationVO> operationVO=operationService.findList(operation);
		return operationVO;
	}
	
	/**
	 * 根据operationId删除operation对象
	 * @param operation
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public void remove(OperationVO operation) {
		operationService.remove(operation);
	}
	
	/**
	 * 新增operation对象
	 * @param operation
	 * @return
	 */
	@RequestMapping("add")
	@ResponseBody
	public void save(OperationVO operation) {
		operationService.save(operation);
	}
	
	/**
	 * 根据operationId修改operation对象
	 * @param operation
	 * @return
	 */
	@RequestMapping("modify")
	@ResponseBody
	public void modifyByPrimaryColumn(OperationVO operation) {
		operationService.modifyByPrimaryColumn(operation);
	}
}
