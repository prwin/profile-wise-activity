package com.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("div")
@Configuration

public class DevConfiguration {
	
	/*
	 * @Value("${message}") private String m;
	 */
	@PostConstruct
	public void dev() {
		System.out.println("loaded devlopment env ");
	}
}
