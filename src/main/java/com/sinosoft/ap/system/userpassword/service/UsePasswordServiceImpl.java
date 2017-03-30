package com.sinosoft.ap.system.userpassword.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.userpassword.domain.UserPasswordEntity;
import com.sinosoft.ap.system.userpassword.domain.UserPasswordRepository;


@Service
public class UsePasswordServiceImpl implements UserPasswordService{
	@Autowired
	private UserPasswordRepository userPasswordRepository;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	@Override
	public UserPasswordEntity findPasswordById(String id) {
		return userPasswordRepository.findPasswordById(id);
	}
}
