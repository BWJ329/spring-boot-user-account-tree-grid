package com.codebyjpc.useraccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fanniemae.NuIDApp")
public class NuIdAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(NuIdAppApplication.class, args);
	}
}
