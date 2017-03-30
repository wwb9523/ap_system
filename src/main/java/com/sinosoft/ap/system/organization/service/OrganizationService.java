package com.sinosoft.ap.system.organization.service;

import java.util.List;

import com.sinosoft.ap.system.library.domain.LibraryVO;
import com.sinosoft.ap.system.organization.domain.OrganizationVO;


public interface OrganizationService {
	
	OrganizationVO selectById(String id);
	
	List<OrganizationVO> selectList(OrganizationVO organizationVO);
	
	boolean delete(OrganizationVO organizationVO);
	
	boolean insert(OrganizationVO organizationVO);
	
	boolean updateByPrimaryColumn(OrganizationVO organizationVO);
}
