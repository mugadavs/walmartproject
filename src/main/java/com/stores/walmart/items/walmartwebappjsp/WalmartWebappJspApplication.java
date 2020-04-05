package com.stores.walmart.items.walmartwebappjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WalmartWebappJspApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WalmartWebappJspApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(WalmartWebappJspApplication.class, args);
	}

}
