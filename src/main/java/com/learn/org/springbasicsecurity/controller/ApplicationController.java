package com.learn.org.springbasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {
	
	
	@GetMapping("/getMSG")
	public String getMsg() {
		return "Hello Authentication!.";
	}

}
