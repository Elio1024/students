package com.example.students.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Student {
    private Integer sId;
    private String sNumber;
    private String sName;
    private Sex sex;
    private LocalDate birthday;
    private String address;
    private String phone;
    private Classes classes;
    private String sState;
    private String sCreator;
    private LocalDateTime sCreation;
    private String sOperator;
    private LocalDateTime sOperation;
}
