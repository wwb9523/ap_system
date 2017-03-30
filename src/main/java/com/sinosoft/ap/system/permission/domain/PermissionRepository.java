package com.sinosoft.ap.system.permission.domain;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Set;

public interface PermissionRepository {
	
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
	
	
public PermissionVO selectList(String permissionId);
	
	public void delete(String permissionId);
	
	public void insert(PermissionVO permissionVO);
	
	public void updateByPrimaryColumn(PermissionVO permissionVO);
	
	public void insertPermissionOpe(@Param("permissionId")String permissionId,@Param("operationId")String operationId);
	
	public void deletePermissionOpe(@Param("permissionId")String permissionId,@Param("operationId")String operationId);
}
