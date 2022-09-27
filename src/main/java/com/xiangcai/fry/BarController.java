package com.xiangcai.fry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BarController {
    @Autowired
    private BarRepository barRepo;

    @GetMapping("/bars")
    public String listAll(Model model){
        List<Bar> listBars = barRepo.findAll();
        model.addAttribute("listBars", listBars);
        return "bars";
    }
}