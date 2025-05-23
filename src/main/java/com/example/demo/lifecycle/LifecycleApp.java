package com.example.demo.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class LifecycleApp{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LifecycleApp.class, args);
        ExampleService service = context.getBean(ExampleService.class);
        service.serve();
        context.close();
	}
}
