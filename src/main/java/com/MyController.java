package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {
	//http://localhost:8081/api/health
	@RequestMapping("api/health")
	public String sayHello() {
		return "Hello, Health are good for Nkuzu family";
	}
	
}
