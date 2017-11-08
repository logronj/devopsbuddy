package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
}