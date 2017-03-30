package com.sinosoft.ap.system.userlogin.domain;

public interface UserLoginRepository {
	
	UserLoginVO selectByUserAccount(String account);
}
