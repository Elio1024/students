package com.example.students.dto;

import com.example.students.domain.Classes;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentDTO {
    private String sNumber;
    private String sName;
    private String classes;
    private String address;
    private LocalDate birthday;
    private Integer chinese;
    private Integer math;
    private Integer english;
    private Integer sumScore;
    private Double avgScore;

    public Integer getSumScore() {
        return sumScore = chinese + math + english;
    }
    public Double getAvgScore() {
        return getSumScore()/3.0;
    }
}
