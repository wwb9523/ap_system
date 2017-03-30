package com.sinosoft.ap.system.operation.service;

import java.util.List;
import java.util.Set;

import com.sinosoft.ap.system.operation.domain.OperationVO;
import com.sinosoft.ap.system.user.domain.UserInfo;

public interface OperationService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	List<OperationVO> findList(OperationVO operation);
	int remove(OperationVO operation);
	int save(OperationVO operation);
	int modifyByPrimaryColumn(OperationVO operation);
}