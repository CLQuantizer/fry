package com.xiangcai.fry;

import org.springframework.stereotype.Component;

import java.io.*;
// Java program to demonstrate
// java.nio.file.Files.deleteIfExists() method

import java.io.IOException;
import java.nio.file.*;
@Component
public class fileWriter {

    void write(final String s) {
        try
        {
            Path path = Paths.get("src/main/resources/templates/fullOfBeans.html");
            try {
                Files.deleteIfExists(path);
            }catch (IOException e){
                e.printStackTrace();
            }

            String filename= "src/main/resources/templates/fullOfBeans.html";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(s);//appends the string to the file
            fw.close();
        }
        catch(IOException e)
        {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
