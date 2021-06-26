package com.studentsubjectmark.studentmarks.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    private int stuId;
    private String stuname;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "studentMarks")
    private List<Subject> subjects;
}
