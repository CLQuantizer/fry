package com.xiangcai.fry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Dish {
    private final String name;
    private final Ingredient[] ingredients;
}