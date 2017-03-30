package com.sinosoft.ap.system.organization.web;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.ap.system.organization.domain.OrganizationVO;
import com.sinosoft.ap.system.organization.service.OrganizationService;

@Controller
@RequestMapping("/organization")
public class OrganizationController {
	
	@Autowired
	private OrganizationService organizationService;

	/**
	 * 获取单个的组织信息
	 * @param id
	 * @return
	 */
	@RequestMapping("getInfoById")
	@ResponseBody
	public String getInfoById(String id) {
//		ModelAndView mav=new ModelAndView("library/jumpInfoPage.jsp");
		OrganizationVO organizationVO=organizationService.selectById(id);
//		mav.addObject("libraryEntity", libraryEntity);
		return organizationVO.getOrganDesc();
	}
	
	/**
	 * 根据父组织ID查询全部组织信息
	 * @param id
	 * @return
	 */
	@RequestMapping("getInfos")
	@ResponseBody
	public String getInfos(OrganizationVO organizationVO) {
//		ModelAndView mav=new ModelAndView("library/jumpInfoPage.jsp");
		List<OrganizationVO> list=organizationService.selectList(organizationVO);
//		mav.addObject("libraryEntity", libraryEntity);
		return list.get(0).getOrganCode();
	}
	
	/**
	 * 插入组织信息
	 * @param id
	 * @return
	 */
	@RequestMapping("insertInfo")
	@ResponseBody
	public String insertInfo(OrganizationVO organizationVO) {
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		organizationVO.setOrganId(id);
		boolean boo=organizationService.insert(organizationVO);
		if (boo){
			return "success";
		}
//		mav.addObject("libraryEntity", libraryEntity);
		return "defeat";
	}
	
	/**
	 * 根据ID修改组织信息
	 * @param id
	 * @return
	 */
	@RequestMapping("updateInfo")
	@ResponseBody
	public String updateInfo(OrganizationVO organizationVO) {
		boolean boo=organizationService.updateByPrimaryColumn(organizationVO);
		if (boo){
			return "success";
		}
		return "defeat";
	}
	
	/**
	 * 删除组织信息
	 * @param id
	 * @return
	 */
	@RequestMapping("deleteInfo")
	@ResponseBody
	public String deleteInfo(OrganizationVO organizationVO) {
		boolean boo=organizationService.delete(organizationVO);
		return boo+"";
	}
	
	/**
	 * 组织和用户相关联
	 * @param id
	 * @return
	 */
	@RequestMapping("insertOranizationUser")
	@ResponseBody
	public String insertOranizationUser(String u_id,String o_id) {
		boolean boo=organizationService.insertOranizationUser(u_id, o_id);
		if (boo){
			return "success";
		}
		return "defeat";
	}
	
	/**
	 * 组织和权限相关联
	 * @param id
	 * @return
	 */
	@RequestMapping("insertOranizationPermisson")
	@ResponseBody
	public String insertOranizationPermisson(String p_id,String o_id) {
		boolean boo=organizationService.insertOranizationPermisson(p_id, o_id);
		if (boo){
			return "success";
		}
		return "defeat";
	}
	
	/**
	 * 根据用户ID和组织ID取消用户和组织的关系
	 * @param id
	 * @return
	 */
	@RequestMapping("removeOrganizationUser")
	@ResponseBody
	public String removeOrganizationUser(String u_id,String o_id) {
		boolean boo=organizationService.removeOrganizationUser(u_id, o_id);
		if (boo){
			return "success";
		}
		return "defeat";
	}
	
	/**
	 * 根据用户ID和组织ID取消用户和组织的关系
	 * @param id
	 * @return
	 */
	@RequestMapping("removeOrganizationPermission")
	@ResponseBody
	public String removeOrganizationPermission(String o_id,String p_id) {
		boolean boo=organizationService.removeOrganizationPermission(o_id, p_id);
		if (boo){
			return "success";
		}
		return "defeat";
	}
}
