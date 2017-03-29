package com.sinosoft.ap.system.user.domain;

import org.apache.ibatis.annotations.Select;

import com.sinosoft.ap.system.user.domain.UserInfo;

public interface UserMapper {

	@Select("select * from t_user where account=#{account}")
	UserInfo findByAccount(String account);
}
