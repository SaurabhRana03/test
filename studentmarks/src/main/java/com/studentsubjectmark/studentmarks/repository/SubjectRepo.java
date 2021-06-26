package com.studentsubjectmark.studentmarks.repository;

import com.studentsubjectmark.studentmarks.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject,Integer> {
}
