package com.example.it_overone_backup_project1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/allAdverts" )
public class AllAdvertsController {
    @GetMapping
    public String getAllAdverts(){
        return "allAdverts";
    }
}
