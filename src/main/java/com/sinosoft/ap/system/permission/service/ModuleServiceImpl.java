package com.sinosoft.ap.system.permission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinosoft.ap.system.permission.domain.ModuleInfo;
import com.sinosoft.ap.system.permission.domain.ModuleMapper;


@Service
public class ModuleServiceImpl implements ModuleService{
	@Autowired
	private ModuleMapper moduleMapper;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	@Override
	public List<ModuleInfo> findModuleByUserId(int userId) {
		return moduleMapper.findModuleByUserId(userId);
	}
}
