package com.sinosoft.ap.system.userloginlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.userloginlog.domain.UserLoginLogRepository;
import com.sinosoft.ap.system.userloginlog.domain.UserLoginLogVO;


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
	public List<UserLoginLogVO> findList(UserLoginLogVO userLoginLogVO) {
		return userLoginLogRepository.selectList(userLoginLogVO);
	}
	
	@Override
	public  int remove(UserLoginLogVO userLoginLogVO){
		int count=userLoginLogRepository.delete(userLoginLogVO);
		return count;
	}
	
	@Override
	public int save(UserLoginLogVO userLoginLogVO){
		int count=userLoginLogRepository.insert(userLoginLogVO);
		return count;
	}
	
	@Override
	public int modifyByPrimaryColumn(UserLoginLogVO userLoginLogVO){
		int count=userLoginLogRepository.updateByPrimaryColumn(userLoginLogVO);
		return count;
	}
	
}
