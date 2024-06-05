package com.bedu.example1.controller;


import com.bedu.example1.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private ContactoService contactoService;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/addContacto")
    public String addContacto() {
        return "addContacto.html";
    }

    @GetMapping("/edit")
    public String editContacto() {
        return "editContacto.html";
    }


}
