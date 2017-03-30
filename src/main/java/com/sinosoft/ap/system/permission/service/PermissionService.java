package com.sinosoft.ap.system.permission.service;

import java.util.List;
import java.util.Set;

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
}
