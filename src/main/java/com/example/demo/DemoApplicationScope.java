package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.basic.BinarySearchimpl;
import com.example.demo.scope.PersonDAO;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DemoApplicationScope {
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(DemoApplicationScope.class);
	
	public static void main(String[] args) {

		// Aplication Context: maintain beans
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplicationScope.class, args);
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}" , personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}" , personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
		
	}
	
}