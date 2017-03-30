package com.sinosoft.ap.system.operation.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.sinosoft.ap.system.operation.domain.OperationRepository;
import com.sinosoft.ap.system.operation.domain.OperationVO;

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
	public List<OperationVO> findList(OperationVO operation) {
		return operationRepository.selectList(operation);
	}
	
	@Override
	public  void remove(OperationVO operation){
		operationRepository.delete(operation);
	}
	
	@Override
	public void save(OperationVO operation){
		operationRepository.insert(operation);
	}
	
	@Override
	public void modifyByPrimaryColumn(OperationVO operation){
		operationRepository.updateByPrimaryColumn(operation);
	}
}