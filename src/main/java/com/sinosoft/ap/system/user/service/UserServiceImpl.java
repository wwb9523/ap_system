package com.sinosoft.ap.system.user.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.sinosoft.ap.system.permission.domain.ModuleInfo;
import com.sinosoft.ap.system.permission.service.ModuleService;
import com.sinosoft.ap.system.user.domain.UserInfo;
import com.sinosoft.ap.system.user.domain.UserMapper;
import com.sinosoft.ap.system.user.domain.UserRespository;
import com.sinosoft.ap.system.user.domain.UserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ModuleService moduleService;

	
	
	
	
	
	
	@Autowired
	private UserRespository userRespository;
	@Override
	public void save(UserVO userEntity) {
		userRespository.insert(userEntity);
	}

	@Override
	public void remove(String userId) {
		userRespository.delete(userId);
	}

	@Override
	public void modifyByPrimaryColumn(UserVO userEntity) {
		userRespository.updateByPrimaryColumn(userEntity);
	}

	@Override
	public List<UserVO> findList() {
		return userRespository.selectList();
	}
	
	@Override
	public UserVO findUserByAccount(String userAccount) {
		
		return userRespository.getUserByAccount(userAccount);
	}
	
	@Override
	public void saveUserRole(String userId, String roleId) {
		userRespository.insertUserRole(userId, roleId);
		
	}

	@Override
	public void saveUserPerm(String userId, String permissionId) {
		userRespository.insertUserPerm(userId, permissionId);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public UserInfo findByAccount(String account) {
		return userMapper.findByAccount(account);
	}

	public Set<String> findPermissions(String account) {
		Set<String> set = Sets.newHashSet();
		UserInfo user = findByAccount(account);
		List<ModuleInfo> modules = moduleService.findModuleByUserId(user.getId());
		
		for(ModuleInfo info: modules) {
			set.add(info.getModuleKey());
		}
		return set;
	}

	public List<String> findPermissionUrl(String account) {
		List<String> list = Lists.newArrayList();
		UserInfo user = findByAccount(account);
		List<ModuleInfo>modules = moduleService.findModuleByUserId(user.getId());
		
		for(ModuleInfo info: modules) {
			if(info.getModuleType() == ModuleInfo.URL_TYPE) {
				list.add(info.getModulePath());
			}
		}
		return list;
	}

	

	
}