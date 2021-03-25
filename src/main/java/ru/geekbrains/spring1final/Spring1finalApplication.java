package ru.geekbrains.spring1final;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Spring1finalApplication {

    @GetMapping("index")
    public String mainPage() {
        return "HELLO MARKET!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Spring1finalApplication.class, args);
    }

}
