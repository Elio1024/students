package com.example.students.mapper;

import com.example.students.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    //通过学生编号在学生表里查出学生信息
    Student findStudentId(@Param("studentNumber") String studentNumber,
                          @Param("studentName") String studentName);
    //通过班级id查出所有学生
    List<Student> findStudent(@Param("classesId") Integer classesId);
}
