package com.springboot.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**给容器中添加组件*/
@Configuration
public class MysqlConfig {
	@Value("${mysql.user-name}")
	private String userName;
	@Value("${mysql.password}")
	private String password;
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.driver-name}")
	private String driverName;
	
	/**将方法的返回值添加到容器中，容器中的这个组件默认的ID就是方法名*/
	@Bean(name = "mysqlParam")
	public Map<String, String> mysql(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("userName", userName);
		map.put("password", password);
		map.put("url", url);
		map.put("driverName", driverName);
		return map;
	}
}	
