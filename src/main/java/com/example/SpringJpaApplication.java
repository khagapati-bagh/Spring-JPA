package com.example;

import java.util.Optional;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringJpaApplication.class, args);
		
		MobileRepository mr = appContext.getBean(MobileRepository.class);
		
		//geting by Id and update
//		Optional<Mobile> optional = mr.findById("1");
//		Mobile mob = optional.get();
//		mob.setBrand("HP");
//		mob = mr.save(mob);
//		System.out.println(mob.toString());
		
		//Delete
		//mr.deleteById("1");
		
		Iterable<Mobile> itr = mr.findAll();
		itr.forEach(mobile -> System.out.println(mobile.toString()));
		
		
		
	}

}
