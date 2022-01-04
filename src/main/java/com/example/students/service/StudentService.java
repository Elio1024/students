package com.example.students.service;

import com.example.students.domain.Student;
import com.example.students.dto.StudentDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    StudentDTO findStudentScore(@Param("studentNumber") String studentNumber,
                                @Param("studentName") String studentName);
    List<Student> findAllStudent(Integer classesId);
}
