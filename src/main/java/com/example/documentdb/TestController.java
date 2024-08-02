package com.example.documentdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @PostMapping("/insert/many")
    public String insertMany() {
        testService.insertMany(10000000);
        return "redirect:/";
    }

    @PostMapping("/insert")
    public String insert() {
        testService.insertEntity(100);
        return "redirect:/";
    }
    @PostMapping("/select")
    public String select() {
        testService.selectEntity();
        return "redirect:/";
    }
    @PostMapping("/delete")
    public String delete(){
        testService.deleteEntity();
        return "redirect:/";
    }

}

