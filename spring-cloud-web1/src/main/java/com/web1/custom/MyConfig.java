package com.web1.custom;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//自定义配置类
@ConfigurationProperties(prefix="com.web1")
@Component
public class MyConfig {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
