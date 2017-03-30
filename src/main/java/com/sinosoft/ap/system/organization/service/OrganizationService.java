package com.sinosoft.ap.system.organization.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sinosoft.ap.system.library.domain.LibraryVO;
import com.sinosoft.ap.system.organization.domain.OrganizationVO;


public interface OrganizationService {
	
	OrganizationVO selectById(String id);
	
	List<OrganizationVO> selectList(OrganizationVO organizationVO);
	
	boolean delete(OrganizationVO organizationVO);
	
	boolean insert(OrganizationVO organizationVO);
	
	boolean updateByPrimaryColumn(OrganizationVO organizationVO);
	
	boolean insertOranizationUser(String u_id,String o_id);
	
	boolean insertOranizationPermisson(String p_id,String o_id);
	
	boolean removeOrganizationUser(String id);
	
	boolean removeOrganizationPermission(String id);
}
