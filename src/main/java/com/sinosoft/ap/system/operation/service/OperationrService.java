package com.sinosoft.ap.system.operation.service;

import java.util.List;
import java.util.Set;

import com.sinosoft.ap.system.operation.domain.OperationEntity;
import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;
import com.sinosoft.ap.system.user.domain.UserInfo;

public interface OperationrService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	List<OperationEntity> findList(OperationEntity operation);
	void remove(OperationEntity operation);
	void save(OperationEntity operation);
	void modifyByPrimaryColumn(OperationEntity operation);
}