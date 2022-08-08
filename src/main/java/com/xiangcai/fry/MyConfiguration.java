package com.xiangcai.fry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public MyBean myBean() {
		return new MyBean();
	}
    @Bean
    public Ingredient ingredient() {
        return new Ingredient("Whatever", Ingredient.Type.VEGGIES);
    }
    @Bean
    public Dish myDish() {
        return new Dish("My Dish", new Ingredient[] {
            new Ingredient("G1",Ingredient.Type.VEGGIES),
            new Ingredient("G2",Ingredient.Type.MEAT)
        });
    }
	
}