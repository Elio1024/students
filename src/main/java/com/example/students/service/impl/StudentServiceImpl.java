package com.example.students.service.impl;

import com.example.students.domain.Score;
import com.example.students.domain.Student;
import com.example.students.dto.StudentDTO;
import com.example.students.mapper.ClassesMapper;
import com.example.students.mapper.ScoreMapper;
import com.example.students.mapper.StudentMapper;
import com.example.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public StudentDTO findStudentScore(String studentNumber, String studentName) {
        StudentDTO studentDTO = new StudentDTO();
        Student student = studentMapper.findStudentId(studentNumber, studentName);
        Score score = scoreMapper.findStudentScore(student.getSId());

        studentDTO.setSNumber(student.getSNumber());
        studentDTO.setSName(student.getSName());
        studentDTO.setClasses(classesMapper.findClassesName(student.getClasses().getCId()));
        studentDTO.setAddress(student.getAddress());
        studentDTO.setBirthday(student.getBirthday());

        studentDTO.setChinese(score.getChinese());
        studentDTO.setMath(score.getMath());
        studentDTO.setEnglish(score.getEnglish());
        studentDTO.getSumScore();
        studentDTO.getAvgScore();
        return studentDTO;
    }

    @Override
    public List<Student> findAllStudent(Integer classesId) {
        return studentMapper.findStudent(classesId);
    }

}
