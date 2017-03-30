package com.sinosoft.ap.system.permission.service;

import java.util.List;
import java.util.Set;

import com.sinosoft.ap.system.permission.domain.PermissionVO;

public interface PermissionService {

	/**	
	 * 用户直接获取权限名称集合
	 * @param account
	 * @return
	 */
	Set<String> findPermissionsByUser(String account);
	
	/**
	 * 用户直接获取权限请求路径集合
	 * @param account
	 * @return
	 */
	List<String> findPermissionUrlByUser(String account);
	
	/**	
	 * 用户借助角色获取权限名称集合
	 * @param account
	 * @return
	 */
	Set<String> findPermissionsByRole(String account);
	
	/**
	 * 用户借助角色获取权限请求路径集合
	 * @param account
	 * @return
	 */
	List<String> findPermissionUrlByRole(String account);
	
	
	public PermissionVO findList(String permissionId);
	
	public void remove(String permissionId);
	
	public void save(PermissionVO permissionVO);
	
	
	public void savePermissionOpe(String permissionId,String operationId);
	
	public void removePermissionOpe(String permissionId,String operationId);
}
