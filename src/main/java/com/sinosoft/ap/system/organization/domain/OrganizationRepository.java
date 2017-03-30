package com.sinosoft.ap.system.organization.domain;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrganizationRepository {
	
	OrganizationVO selectById(String id);
	
	List<OrganizationVO> selectList(OrganizationVO organizationVO);
	
	int delete(OrganizationVO organizationVO);
	
	int insert(OrganizationVO organizationVO);
	
	int updateByPrimaryColumn(OrganizationVO organizationVO);
	
	int insertOranizationUser(@Param("u_id")String u_id,@Param("o_id")String o_id);
	
	int insertOranizationPermisson(@Param("p_id")String p_id,@Param("o_id")String o_id);
	
	int removeOrganizationUser(@Param("u_id")String u_id,@Param("o_id")String o_id);
	
	int removeOrganizationPermission(@Param("p_id")String p_id,@Param("o_id")String o_id);
}
