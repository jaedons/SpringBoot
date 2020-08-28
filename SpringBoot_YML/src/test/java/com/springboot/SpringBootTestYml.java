package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.entity.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestYml {

	@Autowired
	private Person person;
	@Test
	public void contextLoad() {
		System.out.println(person);
	}
}
