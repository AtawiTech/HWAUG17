package com.example.school.Repository;


import com.example.school.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    Teacher findTeacherById(Integer id);
    List<Teacher> findBySalaryGreaterThanEqual(Integer salary);


}