package com.example.students.service;

import com.example.students.domain.Classes;
import com.example.students.dto.ClassDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassService {
    ClassDTO findClassScore(@Param("classesNumber") String classesNumber,
                       @Param("classesName") String classesName);
    List<Classes> findAllClass();
}
