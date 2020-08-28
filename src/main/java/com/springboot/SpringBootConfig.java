package com.springboot;

import org.springframework.context.annotation.Configuration;

import com.springboot.entity.Person;

@Configuration
public class SpringBootConfig {

	public Person person() {
		Person person = new Person();
		System.out.println(person);
		return person;
	}
}
