package com.example.students.domain;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Classes {
    private Integer cId;
    private String cNumber;
    private String cName;
    private String cState;
    private String cCreator;
    private LocalDateTime cCreation;
    private String cOperator;
    private LocalDateTime cOperation;
}
