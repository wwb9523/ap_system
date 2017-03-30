package com.sinosoft.ap.system.role.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.role.domain.RoleRespository;
import com.sinosoft.ap.system.role.domain.RoleVO;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleRespository roleRespository;

	@Override
	public void save(RoleVO roleVO) {
		roleRespository.insert(roleVO);
	}

	@Override
	public void remove(String roleId) {
		roleRespository.delete(roleId);
	}

	@Override
	public RoleVO findList(String roleId) {
		
		return roleRespository.selectList(roleId);
	}

	@Override
	public void modifyByPrimaryColumn(String roleId) {
		roleRespository.updateByPrimaryColumn();
		
	}

	@Override
	public void saveRolePerm(String roleId, String permissionId) {
		roleRespository.insertRolePerm(roleId, permissionId);
	}

	@Override
	public void removeRolePerm(String roleId, String permissionId) {
		roleRespository.deleteRolePerm(roleId, permissionId);
		
	}
	
	

}
