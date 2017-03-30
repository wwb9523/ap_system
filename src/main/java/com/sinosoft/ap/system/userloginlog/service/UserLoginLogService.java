package com.sinosoft.ap.system.userloginlog.service;

import java.util.List;

import com.sinosoft.ap.system.resource.domain.ResourceVO;
import com.sinosoft.ap.system.userloginlog.domain.UserLoginLogVO;

public interface UserLoginLogService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	List<UserLoginLogVO> findList(UserLoginLogVO userLoginLogVO);
	int remove(UserLoginLogVO userLoginLogVO);
	int save(UserLoginLogVO userLoginLogVO);
	int modifyByPrimaryColumn(UserLoginLogVO userLoginLogVO);
}
