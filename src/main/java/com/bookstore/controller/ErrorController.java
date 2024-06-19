package com.bookstore.controller;


import com.bookstore.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
    @Autowired
    private BookServices productService;
    @GetMapping("/403")
    public String accessDenied(Model model){
        model.addAttribute("books", productService.getALlBooks());
        return "/error/403";
    }
}
