package com.dubito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {

	@RequestMapping("/helloWorld")
	public String helloWorld(Model model){
		model.addAttribute("message", "SpringMVC大爷你好！");
		return "helloworld";
	}
}
