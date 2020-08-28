package com.springboot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**@PropertySource 加载指定的配置文件，其配置文件以.properties结尾*/
@PropertySource(value = {"classpath:log.properties"})
@ConfigurationProperties(prefix = "log")
@Component
public class LogProperties {
	@Value("${log.file-path}")
	private String filePath;
	@Value("${log.level}")
	private String level;
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "LogProperties [filePath=" + filePath + ", level=" + level + "]";
	}
	
}
