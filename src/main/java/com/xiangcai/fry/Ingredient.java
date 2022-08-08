package com.xiangcai.fry;

import lombok.Data;

@Data
public class Ingredient {
    private final String name;
    private final Type type;
    public enum Type {
        MEAT, CHILI, SEASONING, VEGGIES, OTHER
    }
}
