package com.sinosoft.ap.system.permission.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinosoft.ap.system.permission.domain.PermissionVO;
import com.sinosoft.ap.system.permission.service.PermissionService;


@Controller
@RequestMapping("/permission")
public class PermissionManage {
	@Autowired
	private PermissionService permissionService;
	/**
	 * 查看许可
	 * @param id
	 * @return
	 */
	@RequestMapping("/getpermissionInfo")
	@ResponseBody
	public PermissionVO findlist(String permissionId){
		return permissionService.findList(permissionId);
	}
	/**
	 * 删除许可
	 * @param permissionId
	 */
	@RequestMapping("/removePermissionInfo")
	@ResponseBody
	public void remove(String permissionId){
		permissionService.remove(permissionId);
	}
	
	/**
	 * 新建许可
	 * @param permissionVO
	 */
	@RequestMapping("/savePermissionInfo")
	@ResponseBody
	public void save(PermissionVO permissionVO){
		permissionService.save(permissionVO);
	}
	
	@RequestMapping("/changePermissionInfo")
	@ResponseBody
	public void modifyByPrimaryColumn(PermissionVO permissionVO){
		permissionService.modifyByPrimaryColumn(permissionVO);
	}
	
	/**
	 * 许可关联操作
	 * @param permissionId
	 * @param operationId
	 */
	@RequestMapping("/savePermissionOperation")
	@ResponseBody
	public void savePermissionOpe(String permissionId,String operationId){
		permissionService.savePermissionOpe(permissionId,operationId);
	}
	
	/**
	 * 许可取消操作
	 * @param permissionId
	 * @param operationId
	 */
	@RequestMapping("/removePermissionOperation")
	@ResponseBody
	public void removePermissionOpe(String permissionId,String operationId){
		permissionService.removePermissionOpe(permissionId,operationId);
	}
	
}
