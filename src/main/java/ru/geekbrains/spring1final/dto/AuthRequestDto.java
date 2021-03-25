package ru.geekbrains.spring1final.dto;

import lombok.Data;

@Data
public class AuthRequestDto {
    private String login;
    private String password;
}