package com.sinosoft.ap.system.userpassword.domain;

import java.util.List;


public interface UserPasswordRepository {
	
	int insert(UserPasswordVO userPasswordVO);
	
	int delete(UserPasswordVO userPasswordVO);
	
	int update(UserPasswordVO userPasswordVO);
	
	UserPasswordVO selectById(UserPasswordVO userPasswordVO);
	
	List<UserPasswordVO> selectAll();
}
