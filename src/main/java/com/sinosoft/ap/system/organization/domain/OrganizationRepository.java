package com.sinosoft.ap.system.organization.domain;

import java.util.List;

public interface OrganizationRepository {
	
	OrganizationVO selectById(String id);
	
	List<OrganizationVO> selectList(OrganizationVO organizationVO);
	
	int delete(OrganizationVO organizationVO);
	
	int insert(OrganizationVO organizationVO);
	
	int updateByPrimaryColumn(OrganizationVO organizationVO);
}
