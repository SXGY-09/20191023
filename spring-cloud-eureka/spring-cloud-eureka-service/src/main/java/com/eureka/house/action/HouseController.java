package com.eureka.house.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
public class HouseController {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
