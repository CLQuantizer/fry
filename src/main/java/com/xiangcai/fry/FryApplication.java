package com.xiangcai.fry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class FryApplication {

	//This is the psvm of the application
	public static void main(String[] args) {
	//	Ingredient i = new Ingredient("Pork",Ingredient.Type.MEAT);
	//	Ingredient[] is = {i};
	//	Dish x = new Dish("yuxiangrousi",is);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(MyConfiguration.class);
		ctx.refresh();
		MyBean mb1 = ctx.getBean(MyBean.class);
		MyBean mb2 = ctx.getBean(MyBean.class);
		ctx.close();
		
		SpringApplication.run(FryApplication.class, args);
	}

}
