package com.sinosoft.ap.system.permission.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.permission.domain.ModuleInfo;
import com.sinosoft.ap.system.permission.domain.ModuleMapper;
import com.sinosoft.ap.system.permission.domain.PermissionRepository;


@Service
public class PermissionServiceImpl implements PermissionService{
	
	@Autowired
	private PermissionRepository permissionRepository;
	
	/**	
	 * 用户直接获取权限名称集合
	 * @param account
	 * @return
	 */
	public Set<String> findPermissionsByUser(String account){
		return permissionRepository.findPermissionsByUser(account);
	}
	
	/**
	 * 用户直接获取权限请求路径集合
	 * @param account
	 * @return
	 */
	public List<String> findPermissionUrlByUser(String account){
		return permissionRepository.findPermissionUrlByUser(account);
	}
	
	/**	
	 * 用户借助角色获取权限名称集合
	 * @param account
	 * @return
	 */
	public Set<String> findPermissionsByRole(String account){
		return permissionRepository.findPermissionsByRole(account);
	}
	
	/**
	 * 用户借助角色获取权限请求路径集合
	 * @param account
	 * @return
	 */
	public List<String> findPermissionUrlByRole(String account){
		return permissionRepository.findPermissionUrlByRole(account);
	}
}
