package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
