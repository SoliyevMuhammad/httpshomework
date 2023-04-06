package com.example.lesson_72_3.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
    private Integer id;
    private String name;
    private String surname;
    private String psw;
    private String phone;
    private Integer age;
    private Boolean visible;
}