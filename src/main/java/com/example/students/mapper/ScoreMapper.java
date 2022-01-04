package com.example.students.mapper;

import com.example.students.domain.Score;
import com.example.students.dto.ScoreDTO;
import com.example.students.form.ScoreCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScoreMapper {
    //通过学生id查对应的成绩
    Score findStudentScore(@Param("studentId") Integer studentId);
    //通过班级id查对应的所有平均成绩
    Double findAvgChinese(@Param("classId") Integer classId);
    Double findAvgMath(@Param("classId") Integer classId);
    Double findAvgEnglish(@Param("classId") Integer classId);
    //通过班级id查对应的平均总成绩
    Double findAvgSumScore(@Param("classId") Integer classId);
    List<ScoreDTO> findByScoreCondition(@Param("scoreCondition") ScoreCondition scoreCondition);
}
