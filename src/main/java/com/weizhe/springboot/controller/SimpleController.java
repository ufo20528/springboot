package com.weizhe.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {

	@RequestMapping("/test")
	public String hello(Model model) {
		model.addAttribute("username", "weizhe");
		return "list";
	}
}
