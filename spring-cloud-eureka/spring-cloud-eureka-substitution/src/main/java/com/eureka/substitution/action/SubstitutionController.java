package com.eureka.substitution.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/substitution")
public class SubstitutionController {
	@Autowired
	private RestTemplate restTemplate;

	//无@LoadBalanced用
	@GetMapping("/callHello1")
	public String callHello() {
		return restTemplate.getForObject("http://localhost:8082/house/hello", String.class);
	}
	//有@LoadBalanced用
	@GetMapping("/callHello2")
	public String callHello2() {
		return restTemplate.getForObject("http://fsh-house/house/hello", String.class);
	}
}
