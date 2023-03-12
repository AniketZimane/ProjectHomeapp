package com.example.ProjectHomeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StuController
{
    @GetMapping("/")
    public String show(Module module)
    {
        return "index";
    }
}
