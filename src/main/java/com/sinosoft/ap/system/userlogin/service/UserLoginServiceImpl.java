package com.sinosoft.ap.system.userlogin.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.sinosoft.ap.system.permission.domain.ModuleInfo;
import com.sinosoft.ap.system.permission.service.ModuleService;
import com.sinosoft.ap.system.permission.service.PermissionService;
import com.sinosoft.ap.system.user.domain.UserInfo;
import com.sinosoft.ap.system.user.domain.UserMapper;
import com.sinosoft.ap.system.userlogin.domain.UserLoginRepository;
import com.sinosoft.ap.system.userlogin.domain.UserLoginVO;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	@Autowired
	private UserLoginRepository userLoginRepository;
	
	@Autowired
	private PermissionService permissionService;

	/**
	 * 根据账号Account查询当前用户
	 * @param account
	 * @return
	 */
	public UserLoginVO findByAccount(String account) {
		return userLoginRepository.selectByUserAccount(account);
	}

	/**
	 * 获取资源集合
	 * @param account
	 * @return
	 */
	public Set<String> findPermissions(String account) {
		Set<String> set = Sets.newHashSet();
		set = permissionService.findPermissionsByUser(account);
		Set<String> set1 = Sets.newHashSet();
		set1 = permissionService.findPermissionsByRole(account);
		set.retainAll(set1); 
		return set;
	}

	/**
	 * 获取URL权限
	 * @param account
	 * @return
	 */
	public List<String> findPermissionUrl(String account) {
		List<String> list = Lists.newArrayList();
		list = permissionService.findPermissionUrlByUser(account);
		List<String> list1 = Lists.newArrayList();
		list1 = permissionService.findPermissionUrlByRole(account);
		list.addAll(list1);  
		return list;
	}
}