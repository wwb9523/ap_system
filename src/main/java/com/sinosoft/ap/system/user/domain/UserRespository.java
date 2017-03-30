package com.sinosoft.ap.system.user.domain;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserRespository {
	
	public void insert(UserVO userEntity);
	
	public void delete(String userId);
	
	public void updateByPrimaryColumn(UserVO userEntity);
	
	public List<UserVO> selectList();
	
	public UserVO getUserByAccount(String userAccount);
	
	public void insertUserRole(@Param("userId")String userId,@Param("roleId")String roleId);

	public void insertUserPerm(@Param("userId")String userId,@Param("permissionId")String permissionId);
	
}
