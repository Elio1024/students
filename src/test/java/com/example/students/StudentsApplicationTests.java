package com.example.students;

import com.example.students.mapper.ClassesMapper;
import com.example.students.mapper.ScoreMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentsApplicationTests {

    @Autowired
    private ClassesMapper classesMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Test
    void contextLoads() {
        Integer id = classesMapper.findClassesId("CL202112001", "Java大数据358");
        System.out.println(scoreMapper.findAvgSumScore(id));
    }

}
