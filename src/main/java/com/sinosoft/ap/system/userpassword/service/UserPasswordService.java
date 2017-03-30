package com.sinosoft.ap.system.userpassword.service;

import java.util.List;

import com.sinosoft.ap.system.userpassword.domain.UserPasswordVO;


public interface UserPasswordService {
	boolean insert(UserPasswordVO userPasswordVO);
	
	boolean delete(UserPasswordVO userPasswordVO);
	
	boolean update(UserPasswordVO userPasswordVO);
	
	UserPasswordVO selectById(UserPasswordVO userPasswordVO);
	
	List<UserPasswordVO> selectAll();
}
