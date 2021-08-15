package com.oslim.bootstrap.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "alineaciones";
	}
	
	@GetMapping("/row")
	public String pagerow() {
		return "row-columns";
	}
}
