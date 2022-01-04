package com.example.students.service.impl;

import com.example.students.dto.ScoreDTO;
import com.example.students.form.ScoreCondition;
import com.example.students.mapper.ScoreMapper;
import com.example.students.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public List<ScoreDTO> findByScoreCondition(ScoreCondition scoreCondition) {
        return scoreMapper.findByScoreCondition(scoreCondition);
    }
}
