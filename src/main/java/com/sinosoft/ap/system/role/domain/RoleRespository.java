package com.sinosoft.ap.system.role.domain;
import org.apache.ibatis.annotations.Param;


public interface RoleRespository {

	public void insert(RoleVO roleVO);
	
	public void delete(String roleId);
	
	public RoleVO selectList(String roleId);
	
	public void updateByPrimaryColumn();
	
	public void insertRolePerm(@Param("roleId")String roleId,@Param("permissionId")String permissionId);
	
	public void deleteRolePerm(@Param("roleId")String roleId,@Param("permissionId")String permissionId);
}
