package com.example.students.service.impl;

import com.example.students.domain.Classes;
import com.example.students.dto.ClassDTO;
import com.example.students.mapper.ClassesMapper;
import com.example.students.mapper.ScoreMapper;
import com.example.students.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassesMapper classesMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public ClassDTO findClassScore(String classesNumber, String classesName) {
        Integer id = classesMapper.findClassesId(classesNumber, classesName);
        ClassDTO scoreDTO = new ClassDTO();
        scoreDTO.setCNumber(classesNumber);
        scoreDTO.setCName(classesName);
        scoreDTO.setAvgChinese(scoreMapper.findAvgChinese(id));
        scoreDTO.setAvgMath(scoreMapper.findAvgMath(id));
        scoreDTO.setAvgEnglish(scoreMapper.findAvgEnglish(id));
        scoreDTO.setAvgSumScore(scoreMapper.findAvgSumScore(id));
        return scoreDTO;
    }

    @Override
    public List<Classes> findAllClass() {
        return classesMapper.findAll();
    }
}
