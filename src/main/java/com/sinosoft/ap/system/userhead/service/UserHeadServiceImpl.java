package com.sinosoft.ap.system.userhead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.userhead.domain.UserHeadRepository;
import com.sinosoft.ap.system.userhead.domain.UserHeadVO;


@Service
public class UserHeadServiceImpl implements UserHeadService{
	@Autowired
	private UserHeadRepository userHeadRepository;

	
	
	
	@Override
	public UserHeadVO findList(String userId) {
		return userHeadRepository.selectList(userId);
	}

	@Override
	public void save(UserHeadVO userHeadVO) {
		userHeadRepository.insert(userHeadVO);
	}

	@Override
	public void remove(String userHeadId) {
		userHeadRepository.delete(userHeadId);
	}

	@Override
	public void modifyByPrimaryColumn(UserHeadVO userHeadVO) {
		userHeadRepository.updateByPrimaryColumn(userHeadVO);
	}
	
}
