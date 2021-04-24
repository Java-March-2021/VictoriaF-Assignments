package com.victoria.hellohuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model, @RequestParam(value="name", required=false, defaultValue="Human") String name) {
		return "index.jsp";
	}

}
