package com.springboot.entity;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**将配置文件中的值映射到当前类中*/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

	private String name;
	private String birthday;
	private Dog dog;
	private List<String> friends;
	private Map<String, String> family;
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getBirthday() {
		return birthday;
	}




	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}




	public Dog getDog() {
		return dog;
	}




	public void setDog(Dog dog) {
		this.dog = dog;
	}




	public List<String> getFriends() {
		return friends;
	}




	public void setFriends(List<String> friends) {
		this.friends = friends;
	}




	public Map<String, String> getFamily() {
		return family;
	}




	public void setFamily(Map<String, String> family) {
		this.family = family;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", dog=" + dog + ", friends=" + friends + ", family="
				+ family + "]";
	}
	
	
	
}
