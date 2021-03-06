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
public class OperationServiceImpl implements OperationService{
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
	public  int remove(OperationVO operation){
		int count=operationRepository.delete(operation);
		return count;
	}
	
	@Override
	public int save(OperationVO operation){
		int count=operationRepository.insert(operation);
		return count;
	}
	
	@Override
	public int modifyByPrimaryColumn(OperationVO operation){
		int count=operationRepository.updateByPrimaryColumn(operation);
		return count;
	}
}