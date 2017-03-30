package com.sinosoft.ap.system.operation.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.sinosoft.ap.system.operation.domain.OperationEntity;
import com.sinosoft.ap.system.operation.domain.OperationRepository;
import com.sinosoft.ap.system.permission.domain.ModuleInfo;
import com.sinosoft.ap.system.permission.service.ModuleService;
import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;
import com.sinosoft.ap.system.user.domain.UserInfo;
import com.sinosoft.ap.system.user.domain.UserMapper;

@Service
public class OperationServiceImpl implements OperationrService{
	@Autowired
	private OperationRepository operationRepository;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	
	@Override
	public List<OperationEntity> findList(OperationEntity operation) {
		return operationRepository.selectList(operation);
	}
	
	@Override
	public  void remove(OperationEntity operation){
		operationRepository.delete(operation);
	}
	
	@Override
	public void save(OperationEntity operation){
		operationRepository.insert(operation);
	}
	
	@Override
	public void modifyByPrimaryColumn(OperationEntity operation){
		operationRepository.updateByPrimaryColumn(operation);
	}
}