package com.learn.org.springbasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth/rest")
public class NoAuthController {
	
	@GetMapping("/getMSG")
	public String noAuth() {
		return "Hello, from No Auth";
	}

}
