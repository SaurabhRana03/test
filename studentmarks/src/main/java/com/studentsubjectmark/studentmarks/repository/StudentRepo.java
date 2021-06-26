package com.studentsubjectmark.studentmarks.repository;

import com.studentsubjectmark.studentmarks.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    Student findByStuname(String name);
}
