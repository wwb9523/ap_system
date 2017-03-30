package com.sinosoft.ap.system.userlogin.service;

import java.util.List;
import java.util.Set;

import com.sinosoft.ap.system.userlogin.domain.UserLoginVO;

public interface UserLoginService {
	
	/**
	 * 根据账号Account查询当前用户
	 * @param account
	 * @return
	 */
	UserLoginVO findByAccount(String account);
	
	/**	
	 * 获取资源集合
	 * @param account
	 * @return
	 */
	Set<String> findPermissions(String account);
	
	/**
	 * 获取URL权限
	 * @param account
	 * @return
	 */
	List<String> findPermissionUrl(String account);
}
