package com.example.demo.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ExampleService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public void serve() {
    	logger.info("✅ Service method executed.");
    }
    
    @PostConstruct
    public void initialize() {
        logger.info("🔧 PostConstruct: Bean initialized.");
    }
    
    @PreDestroy
    public void cleanup() {
        logger.info("🧹 PreDestroy: Bean about to be destroyed.");
    }

}
