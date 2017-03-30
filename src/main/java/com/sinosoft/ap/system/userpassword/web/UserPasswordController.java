package com.sinosoft.ap.system.userpassword.web;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinosoft.ap.system.userpassword.domain.UserPasswordVO;
import com.sinosoft.ap.system.userpassword.service.UserPasswordService;

@Controller
@RequestMapping("/apuserpassword")
public class UserPasswordController {
	
	@Autowired
	private UserPasswordService userPasswordService;

	/**
	 * 删除登陆密码
	 * @param id
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public String delete(UserPasswordVO userPasswordVO) {
//		ModelAndView mav=new ModelAndView("library/jumpInfoPage.jsp");
		boolean boo=userPasswordService.delete(userPasswordVO);
//		mav.addObject("libraryEntity", libraryEntity);
		return boo+"";
	}
	
	/**
	 * 根据用户ID新增登陆密码
	 * @param id
	 * @return
	 */
	@RequestMapping("insert")
	@ResponseBody
	public String insert(UserPasswordVO userPasswordVO) {
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		userPasswordVO.setUserPasswordId(id);
		boolean boo=userPasswordService.insert(userPasswordVO);
//		mav.addObject("libraryEntity", libraryEntity);
		return boo+"";
	}
	
	/**
	 * 根据用户ID修改登陆密码
	 * @param id
	 * @return
	 */
	@RequestMapping("update")
	@ResponseBody
	public String update(UserPasswordVO userPasswordVO) {
		boolean boo=userPasswordService.update(userPasswordVO);
//		mav.addObject("libraryEntity", libraryEntity);
		return boo+"";
	}
	
	/**
	 * 根据用户ID获取登陆密码
	 * @param id
	 * @return
	 */
	@RequestMapping("selectById")
	@ResponseBody
	public String selectById(UserPasswordVO userPasswordVO) {
		UserPasswordVO userPasswordVO1=userPasswordService.selectById(userPasswordVO);
		return userPasswordVO1.getUserPassword();
	}
	
	/**
	 * 获取所有登陆密码
	 * @param id
	 * @return
	 */
	@RequestMapping("selectAll")
	@ResponseBody
	public String selectAll() {
		List<UserPasswordVO> list=userPasswordService.selectAll();
		return list.get(0).getUserPassword();
	}
}
