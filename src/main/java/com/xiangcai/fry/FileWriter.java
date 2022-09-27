package com.xiangcai.fry;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// Java program to demonstrate
// java.nio.file.Files.deleteIfExists() method

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
public class FileWriter implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    void write() {
        try
        {
            Path path = Paths.get("src/main/resources/templates/fullOfBeans.html");
            try {
                Files.deleteIfExists(path);
            }catch (IOException e){
                e.printStackTrace();
            }

            String filename= "src/main/resources/templates/fullOfBeans.html";
            java.io.FileWriter fw = new java.io.FileWriter(filename,true); //the true will append the new data
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
            fw.write(sb.toString());//appends the string to the file
            fw.close();
        }
        catch(IOException e)
        {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
