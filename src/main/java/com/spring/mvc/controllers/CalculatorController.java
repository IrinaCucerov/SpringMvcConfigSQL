package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping(value = "/calculator")
    public String calculator(@RequestParam("a") int a,
                             @RequestParam("b") int b,
                             @RequestParam("action") String action,
                             Model model){
        double result;

        switch (action){
            case "multiplication" -> result = a * b;
            case "addition" -> result = a + b;
            case "subtraction" -> result = a - b;
            case "division" -> result = a/(double)b;
            default -> {
                result = 0;
            }
        }

        model.addAttribute("result",result );

        return "first/calculator";
    }
}
