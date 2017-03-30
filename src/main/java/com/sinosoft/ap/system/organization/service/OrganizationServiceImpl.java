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

}
