package com.example.it_overone_backup_project1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addAdvert")
public class AddAdvertController {
@GetMapping
    public String addAdvert(){
    return "addAdvert";
}
}
