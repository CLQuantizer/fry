package com.xiangcai.fry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class FryApplication implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext applicationContext;
	public static void main(String[] args) {
		SpringApplication.run(FryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		fileWriter x = new fileWriter();
		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE html>\n" +
				"<html lang=\"en\">\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    <title>Title</title>\n" +
				"</head>\n" +
				"<body>\n");
		List<String> ls = new ArrayList<>();
		for(String s: applicationContext.getBeanDefinitionNames()){
			ls.add(s);
		}
		Collections.sort(ls, Comparator.comparing(s->s.length()));
		for(String s: ls){
			sb.append("<p>"+s+"</p>\n");
		}
		x.write(sb.toString()+"\n"+"</body>\n" +"</html>");
	}
}
