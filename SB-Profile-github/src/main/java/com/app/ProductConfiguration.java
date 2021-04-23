package com.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration

public class ProductConfiguration {

	/*
	 * @Value("${message}") private String m1;
	 */
	
	@PostConstruct
	public void prod() {
		
System.out.println("loaded production env  ");

System.out.println(" for git demo  ");
	}
}
