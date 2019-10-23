package com.eureka.substitution.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping("/substitution")
public class SubstitutionController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private EurekaClient eurekaClient;
	@Autowired
	private DiscoveryClient discoveryClient;

	// 无@LoadBalanced用
	@GetMapping("/callHello1")
	public String callHello() {
		return restTemplate.getForObject("http://localhost:8082/house/hello", String.class);
	}

	// 有@LoadBalanced用
	@GetMapping("/callHello2")
	public String callHello2() {
		return restTemplate.getForObject("http://fsh-house/house/hello", String.class);
	}
	
	@GetMapping("/infos1")
	public Object serviceUrl1() {
		return eurekaClient.getInstancesByVipAddress("fsh-substitution", false);
	}
	@GetMapping("/infos2")
	public Object serviceUrl2() {
		return discoveryClient.getInstances("fsh-substitution");
	}
}
