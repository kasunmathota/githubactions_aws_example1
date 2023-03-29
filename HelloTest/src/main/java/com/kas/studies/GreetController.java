package com.kas.studies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name) {
		return String.format("Hello %s" , name);
	}

}
