package com.sinosoft.ap.system.userloginlog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.ap.system.userloginlog.domain.UserLoginLogVO;
import com.sinosoft.ap.system.userloginlog.service.UserLoginLogService;


@Controller
@RequestMapping("/apuserLoginLog")
public class UserLoginLogManage {
	
	@Autowired
	private UserLoginLogService userLoginLogService;
	
	/**
	 * 根据userLoginLogId查询userLoginLog对象
	 * @param userLoginLog
	 * @return
	 */
	@RequestMapping("find")
	@ResponseBody
	public List<UserLoginLogVO> findList(UserLoginLogVO userLoginLogVO) {
		List<UserLoginLogVO> resourceVO=userLoginLogService.findList(userLoginLogVO);
		return resourceVO;
	}
	
	/**
	 * 根据userLoginLogId删除userLoginLog对象
	 * @param userLoginLog
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public void remove(UserLoginLogVO userLoginLogVO) {
		userLoginLogService.remove(userLoginLogVO);
	}
	
	/**
	 * 新增userLoginLog
	 * @param userLoginLog
	 * @return
	 */
	@RequestMapping("add")
	@ResponseBody
	public void save(UserLoginLogVO userLoginLogVO) {
		userLoginLogService.save(userLoginLogVO);
	}
	
	/**
	 * 根据userLoginLogId修改userLoginLog对象
	 * @param userLoginLog
	 * @return
	 */
	@RequestMapping("modify")
	@ResponseBody
	public void modifyByPrimaryColumn(UserLoginLogVO userLoginLogVO){
		userLoginLogService.modifyByPrimaryColumn(userLoginLogVO);
	}
}
