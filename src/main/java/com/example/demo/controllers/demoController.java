package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class demoController {

    @GetMapping
    public String firstMethod(){
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String secondMethod(){
        LocalDate date=LocalDate.of(2023,1,5);
        return "Ученик - Денис Кокорин || " +"Рецепты от Дениса Кокорина || "+
                date+" || собраны лучшие рецепты блюд, которые с легкостью приготовит " +
                "даже подросток";
    }


}
