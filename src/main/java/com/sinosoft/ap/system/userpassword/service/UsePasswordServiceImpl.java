package com.sinosoft.ap.system.userpassword.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.userpassword.domain.UserPasswordRepository;
import com.sinosoft.ap.system.userpassword.domain.UserPasswordVO;


@Service
public class UsePasswordServiceImpl implements UserPasswordService{
	@Autowired
	private UserPasswordRepository userPasswordRepository;

	@Override
	public boolean insert(UserPasswordVO userPasswordVO) {
		int count = userPasswordRepository.insert(userPasswordVO);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(UserPasswordVO userPasswordVO) {
		int count = userPasswordRepository.delete(userPasswordVO);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean update(UserPasswordVO userPasswordVO) {
		int count = userPasswordRepository.update(userPasswordVO);
		if (count>0){
			return true;
		}
		return false;
	}

	@Override
	public UserPasswordVO selectById(UserPasswordVO userPasswordVO) {
		return userPasswordRepository.selectById(userPasswordVO);
	}

	@Override
	public List<UserPasswordVO> selectAll() {
		return userPasswordRepository.selectAll();
	}

}
