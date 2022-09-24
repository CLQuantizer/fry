package com.xiangcai.fry;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class FooBar{

    private String id;
    
    @Autowired
    private Foo foo;
    @Autowired
    private Bar bar;

    public String toString(){
        return "FooBar{"+"id="+id+",foo="+foo+",bar="+bar+"}";
    }
}
