package com.example.students.dto;

import lombok.Data;

@Data
public class ClassDTO {
    private String cNumber;
    private String cName;
    private Double avgChinese;
    private Double avgMath;
    private Double avgEnglish;
    private Double avgSumScore;
}
