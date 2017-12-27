package com.sunp.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resources;

@SpringBootApplication
@ComponentScan(value = "com.sunp")
@ImportResource(value = {"classpath:dubbo-export.xml"})
public class WebApplication{

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
