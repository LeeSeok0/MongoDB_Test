package com.example.documentdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @PostMapping("/insert")
    public String insert() {
        testService.insertEntity(2909518);
        return "redirect:/";
    }
}
