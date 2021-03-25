package ru.geekbrains.spring1final.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserController {

    @RequestMapping(value = "/")
    public String start() {
        return "start page";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signUp(
            @RequestParam String login,
            @RequestParam String password,
            @RequestParam String name) {
        return String.format("%s %s", login, name);
    }

}
