package com.sinosoft.ap.system.operation.service;

import java.util.List;
import java.util.Set;

import com.sinosoft.ap.system.operation.domain.OperationEntity;
import com.sinosoft.ap.system.user.domain.UserInfo;

public interface OperationrService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	OperationEntity findOperationById(String id);
}