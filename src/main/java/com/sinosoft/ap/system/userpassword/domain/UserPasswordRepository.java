package com.sinosoft.ap.system.userpassword.domain;

import org.apache.ibatis.annotations.Select;

import com.sinosoft.ap.system.user.domain.UserInfo;
import com.sinosoft.ap.system.userpassword.domain.UserPasswordEntity;

public interface UserPasswordRepository {
	//@Select("select * from APS_USER_HEAD where USER_HEAD_ID=#{id}")
	UserPasswordEntity findPasswordById(String id);
}
