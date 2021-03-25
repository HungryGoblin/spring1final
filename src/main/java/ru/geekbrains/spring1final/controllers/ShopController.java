package ru.geekbrains.spring1final.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/")
public class ShopController {

    // http://localhost:8080/shop/api/v1/auth_page
    @GetMapping("/auth_page")
    public String auth (Principal principal) {
        return String.format("HELLO, %s!", principal.getName());
    }

}
