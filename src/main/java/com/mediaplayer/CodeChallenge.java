package com.mediaplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CodeChallenge {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CodeChallenge.class, args);
		context.getBean(DummyData.class).loadDataBaseDummyData();
	}
}
