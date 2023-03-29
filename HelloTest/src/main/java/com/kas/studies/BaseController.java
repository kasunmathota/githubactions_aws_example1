package com.kas.studies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@GetMapping("/")
	public String index() {
		return "Application is running fine .. !";
	}

}
