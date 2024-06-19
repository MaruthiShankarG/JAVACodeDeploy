package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basepackages ="com.solution.HelloController" + "com.solution.AwsCodeDeployDemoApplication")
public class AwsCodeDeployDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCodeDeployDemoApplication.class, args);
	}

}
