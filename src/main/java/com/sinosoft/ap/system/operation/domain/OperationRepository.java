package com.sinosoft.ap.system.operation.domain;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;
import com.sinosoft.ap.system.user.domain.UserInfo;

public interface OperationRepository {

	//@Select("select * from t_user where account=#{account}")
	List<OperationEntity> selectList(OperationEntity operation);
	void delete(OperationEntity operation);
	void insert(OperationEntity operation);
	void updateByPrimaryColumn(OperationEntity operation);
}
