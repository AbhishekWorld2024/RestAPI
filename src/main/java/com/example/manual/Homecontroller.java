package com.example.manual;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Homecontroller {

	@GetMapping("/")
	public String greet()
	{
		return"welcome to spring security";
	}
	

}
