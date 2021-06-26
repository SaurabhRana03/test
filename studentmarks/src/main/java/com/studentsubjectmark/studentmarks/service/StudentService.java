package com.studentsubjectmark.studentmarks.service;

import com.studentsubjectmark.studentmarks.exception.StudentNotFoundException;
import com.studentsubjectmark.studentmarks.model.StudentMarks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentsubjectmark.studentmarks.repository.MarksRepo;
import com.studentsubjectmark.studentmarks.repository.StudentRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private MarksRepo marksRepo;

    static Logger logger = LoggerFactory.getLogger(StudentService.class);

    Map<String, StudentMarks> myHashmap = new HashMap<>();

    public Map populateMap(){
        if(myHashmap.isEmpty()){
            List<StudentMarks> studentMarks = marksRepo.findAll();
            for(StudentMarks marks:studentMarks){
                myHashmap.put(marks.getStudent().getStuname(),marks);
            }
        }
        return myHashmap;
    }


    public Set<Map.Entry<String, StudentMarks>> getAllStudentdetails(){
        populateMap();
        logger.info("Giving All the Student Details");
        return  myHashmap.entrySet();
    }

    public StudentMarks getDetailsofOneStudent(String name){
       if(myHashmap.get(name)==null){
           logger.error("Student Name Not Found Error Thrown");
           throw new StudentNotFoundException("Student with this name not Found");

       }else{
          StudentMarks studetails = myHashmap.get(name);
       }
       return myHashmap.get(name);
    }


}
