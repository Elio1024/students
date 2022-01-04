package com.example.students.service;

import com.example.students.dto.ScoreDTO;
import com.example.students.form.ScoreCondition;
import java.util.List;

public interface ScoreService {
    List<ScoreDTO> findByScoreCondition(ScoreCondition scoreCondition);
}
