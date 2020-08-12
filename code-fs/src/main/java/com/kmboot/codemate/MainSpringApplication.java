package com.kmboot.codemate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan("com.kmboot")
@ComponentScan(value = { "com.kmboot" })
public class MainSpringApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(MainSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// setup environment items
		this.initConfigurations();
	}

	private void initConfigurations() {
		System.out.println("init Configurations");
	}
}