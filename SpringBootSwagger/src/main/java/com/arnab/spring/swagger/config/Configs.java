package com.arnab.spring.swagger.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Configs {

	@Bean
	public Docket getSwaggerDocket() {
		// We are restricting documentation based on paths and packages.
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/address/**"))
				.apis(RequestHandlerSelectors.basePackage("com.arnab.spring.swagger"))
				.build()
				.apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfo("Arnab's Address Application", 
				"This is the address application made by Arnab", 
				"1.0", 
				"Free to use", 
				new Contact("Arnab Banerjee", "http://idonthaveawebsite.com", "arnab.ban09@gmail.com"), 
				"Free to use License", 
				"https://www.payasyougo.org", 
				Collections.emptyList());
	}
	
}
