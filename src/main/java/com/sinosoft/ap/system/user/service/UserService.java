package com.sinosoft.ap.system.user.service;

import java.util.List;
import java.util.Set;

import com.sinosoft.ap.system.user.domain.UserInfo;
import com.sinosoft.ap.system.user.domain.UserVO;



public interface UserService {

	
	
	public void save(UserVO userEntity);
	
	public void remove(String userId);
	
	public void modifyByPrimaryColumn(UserVO userEntity);
	
	public List<UserVO> findList();
	
	public UserVO findUserByAccount(String userAccount);
	
	public void saveUserRole(String userId,String roleId);
	
	public void saveUserPerm(String userId,String permissionId);
	
	
	
	
	
	
	
	
	
	UserInfo findByAccount(String account);
	
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
