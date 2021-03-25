package ru.geekbrains.spring1final.dto;

import lombok.Data;

@Data
public class SignUpRequestDto {

    private String login;

    private String password;
}