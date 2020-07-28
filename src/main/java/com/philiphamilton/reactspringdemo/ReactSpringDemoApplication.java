package com.philiphamilton.reactspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.philiphamilton.reactspringdemo", "com.philiphamilton.reactspringdemo.jobs"} )
public class ReactSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringDemoApplication.class, args);
	}

}
