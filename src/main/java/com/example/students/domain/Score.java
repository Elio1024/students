package com.example.students.domain;

import lombok.Data;

@Data
public class Score {
    private Integer scId;
    private Integer chinese;
    private Integer math;
    private Integer english;
    private Student student;
}
