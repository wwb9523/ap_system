package com.sinosoft.ap.system.userloginlog.domain;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sinosoft.ap.system.resource.domain.ResourceVO;

public interface UserLoginLogRepository {
	
	List<UserLoginLogVO> selectList(UserLoginLogVO userLoginLogVO);
	int delete(UserLoginLogVO userLoginLogVO);
	int insert(UserLoginLogVO userLoginLogVO);
	int updateByPrimaryColumn(UserLoginLogVO userLoginLogVO);
}
