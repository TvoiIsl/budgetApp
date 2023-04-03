package me.islam.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirsController {
    String name = "Приложения с рецептами";
    String userName = "Ислам";
    String projectFunctions = "Помощь с готовкой";
    String technologies = "Spring";
    String language = "Java";
    @GetMapping
    public String helloWord(){
        return "Приложение запущенно";
    }

    @GetMapping("/info")
    public String info(){
        return "Имя ученика: " + userName  +
                " Название вашего проекта: " + name  +
                " Дата создания проекта: " + "03.04.2023"  +
                " Описание проекта: " + projectFunctions  ;
    }

}