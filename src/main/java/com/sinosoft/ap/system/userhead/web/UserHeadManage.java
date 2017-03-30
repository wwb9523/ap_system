package com.sinosoft.ap.system.userhead.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinosoft.ap.system.userhead.domain.UserHeadVO;
import com.sinosoft.ap.system.userhead.service.UserHeadService;
@Controller
@RequestMapping("/userHead")
public class UserHeadManage {
	@Autowired
	private UserHeadService userHeadService;
	
	/**
	 * 获取头像信息
	 * @param userId
	 * @return
	 */
	@RequestMapping("/getUserHeadInfo")
	@ResponseBody
	public UserHeadVO getUserHeadByUserId(String userId){
		return userHeadService.findList(userId);
	}
	
	/**
	 * 添加头像
	 * @param userHeadVO
	 */
	@RequestMapping("/addUserHeadInfo")
	@ResponseBody
	public void addUserHead(UserHeadVO userHeadVO){
		userHeadService.save(userHeadVO);
	}
	
	/**
	 * 删除头像
	 * @param userId
	 */
	@RequestMapping("/deleteUserHeadInfo")
	@ResponseBody
	public void deleteUserHead(String userId){
		userHeadService.remove(userId);
	}
	
	/**
	 * 更新头像
	 */
	@RequestMapping("/updategetUserHeadInfo")
	@ResponseBody
	public void updateUserHead(UserHeadVO userHeadVO){
		userHeadService.modifyByPrimaryColumn(userHeadVO);
	}
}
