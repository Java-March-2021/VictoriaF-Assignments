package com.victoria.counter;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(org.springframework.boot.builder.SpringApplicationBuilder application) {
		return application.sources(CounterApplication.class);
	}

}
