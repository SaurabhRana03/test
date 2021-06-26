package com.studentsubjectmark.studentmarks.repository;

import com.studentsubjectmark.studentmarks.model.StudentMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepo extends JpaRepository<StudentMarks,Integer> {
}
