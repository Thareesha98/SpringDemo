package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.cdi.SomeCDIBusiness;
import com.example.demo.scope.PersonDAO;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DemoAppCDIApplication {
private static Logger LOGGER = (Logger) LoggerFactory.getLogger(DemoAppCDIApplication.class);
	
	public static void main(String[] args) {

		// Aplication Context: maintain beans
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoAppCDIApplication.class, args);
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dO {}", business,business.getSomeCDIDAo());
	}
}
