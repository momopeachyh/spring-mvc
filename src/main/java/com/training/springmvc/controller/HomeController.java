package com.training.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String displayGreeting(ModelMap model) {
		model.addAttribute("message", "hello from homecontroller");
		return "home";
	}
}
