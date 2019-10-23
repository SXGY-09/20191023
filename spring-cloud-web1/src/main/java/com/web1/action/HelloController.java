package com.web1.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller+@ResponseBody
@RestController
public class HelloController {
	@Autowired
	private Environment env;
	//@RequestMapping(method=RequestMethod.GET)
	@Value("${server.port}")
	private String port;
	@GetMapping("/port")
	public String port1() {
		String port=env.getProperty("server.port");
		return "使用environment方式获得的服务器端口："+
				env.getProperty("server.port")+"<p>"+
				"使用Value方式获得的服务器端口："+port;
	}
}
