package com.sinosoft.ap.system.library.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sinosoft.ap.system.library.domain.LibraryEntity;
import com.sinosoft.ap.system.library.service.LibraryService;

@Controller
@RequestMapping("/library")
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
		LibraryEntity libraryEntity=libraryService.findLibraryById("1");
//		mav.addObject("libraryEntity", libraryEntity);
		return libraryEntity.getLibraryCode();
	}
}
