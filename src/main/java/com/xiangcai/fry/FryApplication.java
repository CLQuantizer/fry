package com.xiangcai.fry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FryApplication implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(FryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		FileWriter x = applicationContext.getBean(FileWriter.class);
		x.write();
	}
}
