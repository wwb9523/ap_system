package com.sinosoft.ap.system.role.service;

import com.sinosoft.ap.system.role.domain.RoleVO;

public interface RoleService {
	public void save(RoleVO roleVO);//新增
	
	public void remove(String roleId);//删除
	
	public RoleVO findList(String roleId);//查找
	
	public void modifyByPrimaryColumn(String roleId);//修改
	
	public void saveRolePerm(String roleId,String permissionId);//角色关联许可
	
	public void removeRolePerm(String roleId,String permissionId);//角色取消许可
}
