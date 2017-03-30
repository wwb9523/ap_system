package com.sinosoft.ap.system.user.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinosoft.ap.system.user.domain.UserVO;
import com.sinosoft.ap.system.user.service.UserService;

@Controller
@RequestMapping("/apuser")

public class UserManage {
	@Autowired
	private UserService userService;
	
	/**
	 * 查看所有用户信息
	 * @return
	 */
	@RequestMapping("/getAllUserInfo")
	@ResponseBody
	public List<UserVO> findList(){
		List<UserVO> list=userService.findList();
		return list;
	}
	/**
	 * 添加用户
	 * @param userEntity
	 */
	@RequestMapping("/addnewUser")
	@ResponseBody
	public void save(UserVO userEntity){
		userService.save(userEntity);
	}
	
	/**
	 * 删除用户
	 * @param userId
	 */
	@RequestMapping("/deleteAuser")
	@ResponseBody
	public void remove(String userId){
		userService.remove(userId);
	}
	
	/**
	 * 修改用户 
	 * @param userEntity
	 */
	@RequestMapping("/changeUserInfo")
	@ResponseBody
	public void modifyByPrimaryColumn(UserVO userEntity){
		userService.modifyByPrimaryColumn(userEntity);
	}
	
	/**
	 * 查看用户
	 * @param userAccount
	 * @return
	 */
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public UserVO findUserByName(String userAccount){
		return userService.findUserByAccount(userAccount);
	}
	
	/**
	 * 给用户许可
	 * @param userId
	 * @param permissionId
	 */
	@RequestMapping("/saveUserPerm")
	@ResponseBody
	public void saveUserPerm(String userId,String permissionId){
		userService.saveUserPerm(userId, permissionId);
	}
	
	/**
	 * 给用户角色
	 * @param userId
	 * @param roleId
	 */
	@RequestMapping("/saveUserRole")
	@ResponseBody
	public void saveUserRole(String userId,String roleId){
		userService.saveUserRole(userId, roleId);
	}
	
	
}
