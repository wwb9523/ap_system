package com.sinosoft.ap.system.userhead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.userhead.domain.UserHeadEntity;
import com.sinosoft.ap.system.userhead.domain.UserHeadRepository;


@Service
public class UserHeadServiceImpl implements UserHeadService{
	@Autowired
	private UserHeadRepository userHeadRepository;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	@Override
	public UserHeadEntity findHeadByUserId(String id) {
		return userHeadRepository.findHeadByUserId(id);
	}
}
