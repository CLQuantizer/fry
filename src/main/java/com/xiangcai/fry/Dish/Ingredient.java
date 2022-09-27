package com.xiangcai.fry.Dish;

import lombok.Data;

@Data
public class Ingredient {
    public enum Type {
        MEAT, CHILI, SEASONING, VEGGIES, OTHER
    }
    private final String name;
    private final Type type;

}
