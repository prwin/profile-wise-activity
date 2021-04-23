package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	
	@Value("${message}")
	private String m;
	
	
	
	@RequestMapping("/")
	 public String view() {
		return m;
		
	}
}
