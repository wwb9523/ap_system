package com.sinosoft.ap.system.permission.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

	/**
	 * Go Index
	 * @return
	 */
	@RequestMapping(value={"", "/", "index"})
	public String index() {
		return "index.jsp";
	}
	
	/**
	 * unauthor
	 * @return
	 */
	@RequestMapping("unauthor")
	public String unauthor() {
		return "unauthor.jsp";
	}
	
	/**
	 * reports
	 * @return
	 */
	@RequestMapping("reports")
	public String reports() {
		return "reports.jsp";
	}
}
