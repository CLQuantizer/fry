package com.xiangcai.fry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index() {return "index";}

    @GetMapping("/fullOfBeans")
    public String home(){return "fullOfBeans";}
}
