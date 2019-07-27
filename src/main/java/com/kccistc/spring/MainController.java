package com.kccistc.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/main")
	public String index(Model model) {
		
		return "index";
	}
	@RequestMapping("/main.oauth")
	public String indexAuth(Model model) {
		return "main";
	}
}
