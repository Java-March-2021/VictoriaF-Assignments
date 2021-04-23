package com.victoria.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String greeting() {
		return "Hello there, how's it going?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Heyyy, good lookin'. Whhaaat you got cookin'";
	}
}
