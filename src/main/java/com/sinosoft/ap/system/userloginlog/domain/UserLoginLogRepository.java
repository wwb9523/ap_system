package com.sinosoft.ap.system.userloginlog.domain;

import org.apache.ibatis.annotations.Select;

public interface UserLoginLogRepository {
	
	UserLoginLogEntity findLogById(String id);
}
