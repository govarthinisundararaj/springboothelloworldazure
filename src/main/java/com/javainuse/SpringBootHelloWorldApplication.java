package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	
	@Override
5
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
6
        return application.sources(SpringBootHelloWorldApplication.class);
7
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}
