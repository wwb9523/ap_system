package com.sinosoft.ap.system.operation.domain;

import org.apache.ibatis.annotations.Select;

import com.sinosoft.ap.system.user.domain.UserInfo;

public interface OperationRepository {

	//@Select("select * from t_user where account=#{account}")
	OperationEntity findOperationById(String account);
}
