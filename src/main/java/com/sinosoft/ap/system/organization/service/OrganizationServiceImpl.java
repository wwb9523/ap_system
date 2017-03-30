package com.sinosoft.ap.system.organization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.organization.domain.OrganizationRepository;
import com.sinosoft.ap.system.organization.domain.OrganizationVO;

@Service
public class OrganizationServiceImpl implements OrganizationService{
	@Autowired
	private OrganizationRepository organizationRepository;

	@Override
	public OrganizationVO selectById(String id) {
		OrganizationVO organizationVO=organizationRepository.selectById(id);
		return organizationVO;
	}

	@Override
	public List<OrganizationVO> selectList(OrganizationVO organizationVO) {
		List<OrganizationVO> list=organizationRepository.selectList(organizationVO);
		return list;
	}

	@Override
	public boolean delete(OrganizationVO organizationVO) {
		int count = organizationRepository.delete(organizationVO);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(OrganizationVO organizationVO) {
		int count = organizationRepository.insert(organizationVO);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean updateByPrimaryColumn(OrganizationVO organizationVO) {
		int count = organizationRepository.updateByPrimaryColumn(organizationVO);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean insertOranizationUser(String u_id, String o_id) {
		int count = organizationRepository.insertOranizationUser(u_id, o_id);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean insertOranizationPermisson(String p_id, String o_id) {
		int count = organizationRepository.insertOranizationPermisson(p_id, o_id);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean removeOrganizationUser(String id) {
		int count = organizationRepository.removeOrganizationUser(id);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean removeOrganizationPermission(String id) {
		int count = organizationRepository.removeOrganizationPermission(id);
		if (count>0){
			return true;
		}
		return false;
	}

}
