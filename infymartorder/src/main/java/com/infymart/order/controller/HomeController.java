package com.infymart.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

	@GetMapping("/")
	public String welcome(){
		
		return "redirect:orderdetails";
	}
}
