package com.example.students.cotorller;

import com.example.students.domain.Classes;
import com.example.students.domain.Student;
import com.example.students.dto.ClassDTO;
import com.example.students.dto.ScoreDTO;
import com.example.students.dto.StudentDTO;
import com.example.students.form.ScoreCondition;
import com.example.students.service.ClassService;
import com.example.students.service.ScoreService;
import com.example.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/student")
    public StudentDTO student(String studentNumber, String studentName){
        return studentService.findStudentScore(studentNumber, studentName);
    }

    @Autowired
    private ClassService classService;
    @RequestMapping("/classes")
    public ClassDTO classes(String classesNumber, String classesName){
        return classService.findClassScore(classesNumber, classesName);
    }

    @Autowired
    private ScoreService scoreService;
    @RequestMapping("/score")
    public List<ScoreDTO> score(ScoreCondition scoreCondition){
        return scoreService.findByScoreCondition(scoreCondition);
    }
    @RequestMapping("/allClasses")
    public List<Classes> allClasses(){
        return classService.findAllClass();
    }
    @RequestMapping("/allStudent")
    public List<Student> allStudent(Integer classesId){
        return studentService.findAllStudent(classesId);
    }

}
