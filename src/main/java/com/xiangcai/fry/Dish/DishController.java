package com.xiangcai.fry.Dish;

import com.xiangcai.fry.Bar;
import com.xiangcai.fry.Dish.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DishController {
    @Autowired
    private DishRepository barRepo;

    @GetMapping("/dishes")
    public String listAll(Model model){
        List<Bar> listBars = barRepo.findAll();
        model.addAttribute("listBars", listBars);
        return "bars";
    }
}