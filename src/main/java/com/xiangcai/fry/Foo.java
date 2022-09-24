package com.xiangcai.fry;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Foo {
    private String FooName="Jake";
    public Foo myFoo() {
        return new Foo();
    }
    public String print(){
        return "hello foo";
    }
}
