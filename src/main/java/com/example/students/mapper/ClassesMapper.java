package com.example.students.mapper;

import com.example.students.domain.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassesMapper {
    //通过班级id查询班级名称
    String findClassesName(@Param("classId") Integer classId);
    // 通过班级编号跟名字查询班级id
    Integer findClassesId(@Param("classesNumber") String classesNumber,
                          @Param("classesName") String classesName);
    // 查询所有班级
    List<Classes> findAll();
}
