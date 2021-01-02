package com.couseware.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/teste")
	public String root (ModelMap model) {
	
		return "index";
	}
}
