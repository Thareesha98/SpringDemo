package com.example.demo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class BinarySearchimpl {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchimpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numberToSearchFor) {
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sorted = bubbleSortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct   helloooooooooooo worlddddddddddd");
	}
	@PreDestroy
	public void preDestroy() {
		logger.info("preConstruct");
	}
	
}
