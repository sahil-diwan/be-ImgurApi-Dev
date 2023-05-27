package com.imgur.s.assessment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImgurApiController {

	@GetMapping("/test")
	public String getHello() {
		return "Hello Welcome to Imgur API";
	}
}
