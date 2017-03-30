package com.sinosoft.ap.system.library.web;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.ap.system.library.domain.LibraryVO;
import com.sinosoft.ap.system.library.service.LibraryService;

@Controller
@RequestMapping("/aplibrary")
public class LibraryController {
	
	@Autowired
	private LibraryService libraryService;

	/**
	 * 前往修改字典信息页面
	 * @param id
	 * @return
	 */
	@RequestMapping("jumpInfoPage")
	@ResponseBody
	public String updateInfoPage(String id) {
//		ModelAndView mav=new ModelAndView("library/jumpInfoPage.jsp");
		LibraryVO libraryVO=libraryService.findLibraryById("1");
//		mav.addObject("libraryEntity", libraryEntity);
		return libraryVO.getLibraryCode();
	}
	
	/**
	 * 前往修改字典信息页面
	 * @param id
	 * @return
	 */
	@RequestMapping("infos")
	@ResponseBody
	public String infos() {
//		ModelAndView mav=new ModelAndView("library/jumpInfoPage.jsp");
		List<LibraryVO> list=libraryService.selectList();
//		mav.addObject("libraryEntity", libraryEntity);
		return list.get(0).getLibraryCode();
	}
	
	/**
	 * 前往修改字典信息页面
	 * @param id
	 * @return
	 */
	@RequestMapping("insertInfo")
	@ResponseBody
	public String insertInfo(LibraryVO libraryVO) {
//		ModelAndView mav=new ModelAndView("library/jumpInfoPage.jsp");
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		libraryVO.setLibraryId(id);
		boolean boo=libraryService.insertLibrary(libraryVO);
		if (boo){
			return "success";
		}
//		mav.addObject("libraryEntity", libraryEntity);
		return "defeat";
	}
}
