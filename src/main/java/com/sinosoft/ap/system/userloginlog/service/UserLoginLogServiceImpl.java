package com.sinosoft.ap.system.userloginlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.userloginlog.domain.UserLoginLogEntity;
import com.sinosoft.ap.system.userloginlog.domain.UserLoginLogRepository;


@Service
public class UserLoginLogServiceImpl implements UserLoginLogService{
	@Autowired
	private UserLoginLogRepository userLoginLogRepository;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	@Override
	public UserLoginLogEntity findLogById(String id) {
		return userLoginLogRepository.findLogById(id);
	}
}
