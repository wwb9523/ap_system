package com.sinosoft.ap.system.operation.domain;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sinosoft.ap.system.user.domain.UserInfo;

public interface OperationRepository {

	//@Select("select * from t_user where account=#{account}")
	List<OperationVO> selectList(OperationVO operation);
	int delete(OperationVO operation);
	int insert(OperationVO operation);
	int updateByPrimaryColumn(OperationVO operation);
}
