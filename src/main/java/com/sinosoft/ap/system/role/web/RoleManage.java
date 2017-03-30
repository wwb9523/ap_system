package com.sinosoft.ap.system.role.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinosoft.ap.system.role.domain.RoleVO;
import com.sinosoft.ap.system.role.service.RoleService;

@Controller
@RequestMapping("/aprole")
public class RoleManage {
	
	@Autowired
	private RoleService roleService;
	/**
	 * 新建角色信息
	 * @param roleVO
	 */
	@RequestMapping("/saveRoleInfo")
	@ResponseBody
	public void save(RoleVO roleVO){
		roleService.save(roleVO);
	}
	
	/**
	 * 删除角色
	 * @param roleId
	 */
	@RequestMapping("/deleteARole")
	@ResponseBody
	public void remove(String roleId){
		roleService.remove(roleId);
	}
	
	/**
	 * 查询
	 * @param roleId
	 * @return
	 */
	@RequestMapping("/queryARole")
	@ResponseBody
	public RoleVO findList(String roleId){
		RoleVO roleVO = roleService.findList(roleId);
		return roleVO;
	}
	
	/**
	 * 角色许可关联
	 * @param roleId
	 * @param permissionId
	 */
	@RequestMapping("/saveRolePermission")
	@ResponseBody
	public void saveRolePerm(String roleId,String permissionId){
		roleService.saveRolePerm(roleId,permissionId);
	}
	
	/**
	 * 角色取消许可
	 * @param roleId
	 * @param permissionId
	 */
	@RequestMapping("/removeRolePermission")
	@ResponseBody
	public void removeRolePerm(String roleId,String permissionId){
		roleService.removeRolePerm(roleId,permissionId);
	}
	
}
