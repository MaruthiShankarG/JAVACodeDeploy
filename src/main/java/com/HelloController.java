package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		System.out.println("Code is deployed in Code Deploy Again");
		return "Code is deployed in Code Deploy Again";
	}

}
