package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.basic.BinarySearchimpl;
import com.example.demo.scope.PersonDAO;

import ch.qos.logback.classic.Logger;
import com.example.demo.scope.Componentscan.*;

@SpringBootApplication
@ComponentScan("com.example.demo.scope.Componentscan")
public class DemoApplicationScan {
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(DemoApplicationScan.class);
	
	public static void main(String[] args) {

		// Aplication Context: maintain beans
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplicationScan.class, args);
		ComponentDAO componentDao2 = applicationContext.getBean(ComponentDAO.class);

		
		
	}
	
}