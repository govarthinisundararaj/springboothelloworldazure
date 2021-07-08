package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	
	@Override

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(SpringBootHelloWorldApplication.class);

    }
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}
