package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.basic.BinarySearchimpl;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	//	BinarySearchimpl binarysearch1 = new BinarySearchimpl(new BubbleSortAlgorithm());
		//System.out.println(result);
		// Aplication Context: maintain beans
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearchimpl binarysearch1 = applicationContext.getBean(BinarySearchimpl.class);
		int result = binarysearch1.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);
		
	}
	
}