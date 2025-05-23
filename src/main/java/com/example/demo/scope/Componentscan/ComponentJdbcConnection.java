package com.example.demo.scope.Componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE , proxyMode  = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {
	
	@Autowired
	public ComponentJdbcConnection() {
		System.out.print("JDBC Connection established");
		
	}
}
